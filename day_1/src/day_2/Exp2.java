package day_2;

public class Exp2 {

	long sid, graduation_year, mobile_no;
	String sname;
	String sdeg;
	String sstream;
	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	public long getGraduation_year() {
		return graduation_year;
	}
	public void setGraduation_year(long graduation_year) {
		this.graduation_year = graduation_year;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSdeg() {
		return sdeg;
	}
	public void setSdeg(String sdeg) {
		this.sdeg = sdeg;
	}
	public String getSstream() {
		return sstream;
	}
	public void setSstream(String sstream) {
		this.sstream = sstream;
	}
	public String toString() {
		return "Student Name: "+sname+
				" \n Student Id: "+sid+ 
				" \n Student Degree: "+sdeg+
				" \n Student Stream: "+sstream+
		     	"\n Student Mobile.No: "+mobile_no+
				"\n Student Graduation Year: "+graduation_year;
	}

}
