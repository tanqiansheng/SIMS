package domain;

public class department {
	private Integer id;
	private String  academy;
	private String  academycode;
	private String  schoolcode;
	private String  compuscode;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAcademy() {
		return academy;
	}
	public void setAcademy(String academy) {
		this.academy = academy;
	}
	public String getAcademycode() {
		return academycode;
	}
	public void setAcademycode(String academycode) {
		this.academycode = academycode;
	}
	public String getSchoolcode() {
		return schoolcode;
	}
	public void setSchoolcode(String schoolcode) {
		this.schoolcode = schoolcode;
	}
	public String getCompuscode() {
		return compuscode;
	}
	public void setCompuscode(String compuscode) {
		this.compuscode = compuscode;
	}
	public department(Integer id, String academy, String academycode,
			String schoolcode, String compuscode) {
		super();
		this.id = id;
		this.academy = academy;
		this.academycode = academycode;
		this.schoolcode = schoolcode;
		this.compuscode = compuscode;
	}
	public department() {
		super();
	}
	@Override
	public String toString() {
		return "department [academy=" + academy + ", academycode="
				+ academycode + ", compuscode=" + compuscode + ", id=" + id
				+ ", schoolcode=" + schoolcode + "]";
	}
	

}
