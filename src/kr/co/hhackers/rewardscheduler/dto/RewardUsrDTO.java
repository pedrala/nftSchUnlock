package kr.co.hhackers.rewardscheduler.dto;

public class RewardUsrDTO {
	private int 	idx;
	private String 	uid;
	private String 	parent;
	private String 	c_tm;
	private String 	u_tm;
	private String 	d_tm;
	private String	reason;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public String getC_tm() {
		return c_tm;
	}
	public void setC_tm(String c_tm) {
		this.c_tm = c_tm;
	}
	public String getU_tm() {
		return u_tm;
	}
	public void setU_tm(String u_tm) {
		this.u_tm = u_tm;
	}
	public String getD_tm() {
		return d_tm;
	}
	public void setD_tm(String d_tm) {
		this.d_tm = d_tm;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "RewardUsrDTO [idx=" + idx + ", uid=" + uid + ", parent=" + parent + ", c_tm=" + c_tm + ", u_tm=" + u_tm
				+ ", d_tm=" + d_tm + ", reason=" + reason + "]";
	}
	public RewardUsrDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
}
