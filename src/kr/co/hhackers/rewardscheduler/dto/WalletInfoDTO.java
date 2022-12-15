package kr.co.hhackers.rewardscheduler.dto;

public class WalletInfoDTO {
	private int 	no;
	private int 	usr_no;
	private String 	addr;
	private String 	v_amount;
	private String 	t_amount;
	private String 	i_amount;
	private String 	createtime;
	private String 	outtxid;
	private String 	intxid;
	private String 	untxid;
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getUsr_no() {
		return usr_no;
	}

	public void setUsr_no(int usr_no) {
		this.usr_no = usr_no;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getV_amount() {
		return v_amount;
	}

	public void setV_amount(String v_amount) {
		this.v_amount = v_amount;
	}

	public String getT_amount() {
		return t_amount;
	}

	public void setT_amount(String t_amount) {
		this.t_amount = t_amount;
	}

	public String getI_amount() {
		return i_amount;
	}

	public void setI_amount(String i_amount) {
		this.i_amount = i_amount;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	
	public String getOuttxid() {
		return outtxid;
	}

	public void setOuttxid(String outtxid) {
		this.outtxid = outtxid;
	}

	public String getIntxid() {
		return intxid;
	}

	public void setIntxid(String intxid) {
		this.intxid = intxid;
	}

	public String getUntxid() {
		return untxid;
	}

	public void setUntxid(String untxid) {
		this.untxid = untxid;
	}

	@Override
	public String toString() {
		return "WalletInfoDTO [no=" + no + ", usr_no=" + usr_no + ", addr=" + addr + ", v_amount=" + v_amount
				+ ", t_amount=" + t_amount + ", i_amount=" + i_amount + ", createtime=" + createtime + ", outtxid=" + outtxid + ", intxid=" + intxid + ", untxid=" + untxid + "]";
	}

	public WalletInfoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
