package day_2;

public class Exp1 {

	private int cid;
	private String cname;
	private String caddress;
	private String ccity;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getCcity() {
		return ccity;
	}
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}
	public String toString() {
		return "Customer Detail: Id - "+cid+"\n Name - "+cname+"\n Address - "+caddress+"\n City - "+ccity;
	}
}
