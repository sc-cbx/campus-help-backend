package k.m.demo.controller;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import k.m.demo.mapper.EmailMapper;
import k.m.demo.model.User;
import k.m.demo.service.EmailService;

@RestController
public class EmailController {
	private static final String SYMBOLS="0123456789";
	private static final Random RANDOM=new SecureRandom();
    @Autowired
    EmailService emailService;
    EmailMapper emailMapper;
    HttpServletRequest request ;
    HttpServletResponse response;
    HttpSession session;

//	private RedisUtils redisUtils;
//
//	private Logger logger = LoggerFactory.getLogger(LoginUserServiceImpl.class);
//	/**
//	 * 验证码过期时间60s
//	 */
//	private Integer redisExpire = 60 * 1000;
	
    
    @PostMapping("/email")
    public Object sendEmail(@RequestBody User user,HttpSession session) {
    	String code=generateVerCode();
		session.setAttribute("vercode", code);
		session.setAttribute("codetime",LocalDateTime.now());
		System.out.println(code);
		System.out.println("sdmkg"+code);
//		emailService.sendEmailVerCode(user.getEmail(),code);
    	try {
//    		   String username=(String) session.getAttribute("username");
               emailService.sendEmailVerCode(user.getEmail(),code);
    		    System.out.println(user.getEmail());
//    			System.out.println(code);
//			System.out.println(user.getEmail());
//			System.out.println(code);
//			System.out.println("sdmkg"+code);
			return "邮件发送成功";
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("bbbbbb"+generateVerCode());
//			System.out.println(session.getAttribute("vercode"));
			return "邮件发送失败";
		}
    }
	


	private String generateVerCode() {
		// TODO Auto-generated method stub
		char[] nonceChar=new char[6];
		for (int index=0;index<nonceChar.length;++index) {
			nonceChar[index]=SYMBOLS.charAt(RANDOM.nextInt(SYMBOLS.length()));
		}
	
	    
//		request.getSession().setAttribute("vercode", nonceChar);
		
		return new String(nonceChar);
	}
	
	@PostMapping("/emailcheckvode")
	public Object checkcode( HttpServletRequest request,HttpSession session,@RequestBody User user) {
//		String codeString=request.getParameter(user.getCheckvode());
//		System.out.println("codeString"+codeString);
		String vercode=(String) session.getAttribute("vercode");
//		String vercode=(String) session.getAttribute("vercode");
//		System.out.println(vercode);
		if(vercode==null) {
			request.setAttribute("aaa", "验证码失效");
		
			return "验证码失效";
		}
//		System.out.println(vercode);
		String vercodestr=vercode.toString();
		System.out.println(vercode);
		LocalDateTime localDateTime=(LocalDateTime)session.getAttribute("codetime");
		long past=localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
		long now =LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
//		System.out.println("bbbo"+user.getCheckvode());
//		System.out.println(user.getCheckvode()==null);
//		System.out.println(!user.getCheckvode().equals(vercode) );
		System.out.println("储存的验证码："+vercode);
		System.out.println("前端传入的验证码："+user.getCheckvode());
		if(user.getCheckvode()==null){
//			System.out.println("得到的"+user.getCheckvode());
			request.setAttribute("aaa", "验证码错误");
			return "验证码错误";
		}else if(!user.getCheckvode().equals(vercode) ){
			request.setAttribute("aaa", "验证码错误");
			return "验证码错误";
		}
		else if((now-past)/1000/60>5){
			request.setAttribute("aaa", "验证码已过期，请重新获取");
//			System.out.println(now);
//			System.out.println(past);
//			System.out.println(now-past);
//			System.out.println(now-past/1000/60);
//			System.out.println(now-past/1000/60>5);
			return "验证码已过期，请重新获取";
			
		}
		else {
			session.removeAttribute("vercode");
			return "验证码正确";
		}

		
	}
	}
