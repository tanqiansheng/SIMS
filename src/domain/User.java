package domain;

public class User {
	private Integer id;
	private String  uname;
	private String  passwd;
	private String  account;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "User [account=" + account + ", id=" + id + ", passwd=" + passwd
				+ ", uname=" + uname + "]";
	}
	public User(Integer id, String uname, String passwd, String account) {
		super();
		this.id = id;
		this.uname = uname;
		this.passwd = passwd;
		this.account = account;
	}
	public User() {
		super();
	}
	

	
}
