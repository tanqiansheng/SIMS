package domain;

public class Userinfo {
	private  Integer id;
	private  String school;
	private  String academy;
	private  String uname;
	private  String sex;
	private  String sid;
	private  String personid;
	private  String classid;
	private  String classcode;
	private  String major;
	private  String lang;
	public Userinfo(Integer id, String school, String academy, String uname,
			String sex, String sid, String personid, String classid,
			String classcode, String major, String lang) {
		super();
		this.id = id;
		this.school = school;
		this.academy = academy;
		this.uname = uname;
		this.sex = sex;
		this.sid = sid;
		this.personid = personid;
		this.classid = classid;
		this.classcode = classcode;
		this.major = major;
		this.lang = lang;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getAcademy() {
		return academy;
	}
	public void setAcademy(String academy) {
		this.academy = academy;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getPersonid() {
		return personid;
	}
	public void setPersonid(String personid) {
		this.personid = personid;
	}
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
	}
	public String getClasscode() {
		return classcode;
	}
	public void setClasscode(String classcode) {
		this.classcode = classcode;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public Userinfo() {
		super();
	}
	@Override
	public String toString() {
		return "Userinfo [academy=" + academy + ", classcode=" + classcode
				+ ", classid=" + classid + ", id=" + id + ", lang=" + lang
				+ ", major=" + major + ", personid=" + personid + ", school="
				+ school + ", sex=" + sex + ", sid=" + sid + ", uname=" + uname
				+ "]";
	}
	
}
