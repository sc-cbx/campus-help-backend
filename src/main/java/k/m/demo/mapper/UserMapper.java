package k.m.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

//import k.m.demo.model.SysUser;
import k.m.demo.model.User;

@Mapper
public interface UserMapper {
//	public List<SysUser> selectAllUsers();
	
	UserMapper findUserByName(String name);//通过用户名查
	public User selectUserByName(String name);//通过用户名查
	public int updatepassword(User user);//更改密码
    public int updatebankcard(User user);//修改银行卡
    public int updateUserCertification(User user);//实名用户信息
    public List<User> selectBasicMessage(User user);//查询基本信息
    public int userdeletebyname(User user);//通过用户名删除，注销
    public int updatephoto(User user);//上传头像
    public int email_bang(User user);//欠缺邮箱绑定
}