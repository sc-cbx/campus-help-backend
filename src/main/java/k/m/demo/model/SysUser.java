package k.m.demo.model;

public class SysUser {
	private int UID;
	private String username;
	private String password;
	private String name;
	private int age;
	private String s_id;
	public String getS_id() {
		return s_id;
	}

	public void setS_id(String s_id) {
		this.s_id = s_id;
	}

	public int getUID() {
		return UID;
	}

	public void setUID(int uID) {
		UID = uID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "SysUser [UID=" + UID + ", username=" + username + ", password=" + password + ", name=" + name + ", age="
				+ age + ",s_id="+s_id+ "]";
	}
}
