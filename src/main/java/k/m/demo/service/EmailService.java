package k.m.demo.service;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.mail.internet.InternetAddress;

import org.apache.tomcat.util.security.MD5Encoder;
import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.cache.CacheProperties.Redis;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.mail.MailSendException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.datatype.jsr310.deser.InstantDeserializer.FromDecimalArguments;
import com.sun.mail.handlers.message_rfc822;

import ch.qos.logback.classic.Logger;

@Service
public class EmailService {
	  @Autowired
	    JavaMailSender mailSender;
	//从配置文件中获取发件人
	@Value("${spring.mail.username}")
	private String sender;
   @Autowired
   private RedisTemplate<String, String> RedisTemplate;
//   private static int captchaExpires=3*60;
//   private static int captchaW=200;
//   private static int captchaH=60;
	
    /**
     * 邮件发送
     * @param receiver 收件人
     * @param verCode 验证码
     * @throws MailSendException 邮件发送错误
     */
	
	
	@Async
	 public void sendEmailVerCode(String receiver, String verCode) throws MailSendException {
//		Session session = Session.getInstance(pro);
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("校园帮");
		message.setSentDate(new Date());
		message.setSubject("验证码");//设置邮箱标题
		message.setText("尊敬的校园帮用户，您好：\n"
				+ "\n本次请求的邮件验证码为:" + verCode + ",本验证码5分钟内有效，请及时输入。（请勿泄露此验证码）\n"
                + "\n如非本人操作，请忽略该邮件。\n(这是一封自动发送的邮件，请不要直接回复）");	//设置邮件正文
	    message.setTo(receiver);	//设置收件人
        message.setFrom(sender);	//设置发件人
        mailSender.send(message);   //发送邮件
      
		
	}
	public void checkEmail(String message,String vercode) {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
