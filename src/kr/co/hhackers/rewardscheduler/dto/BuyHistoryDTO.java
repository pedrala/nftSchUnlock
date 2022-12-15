package kr.co.hhackers.rewardscheduler.dto;

public class BuyHistoryDTO {
	private int 	idx;
	private int 	nidx;
	private int 	status;
	private String 	tid;
	private String 	wid;
	private String 	addr;
	private String 	naddr;
	private String 	nftid;
	private String 	hash;
	private String 	price;
	private String 	maxp;
	private String 	reward;
	private int 	startday;
	private int 	lastday;
	private String 	c_tm;
	private String 	u_tm;
	private String 	d_tm;
	private String 	reason;
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getNidx() {
		return nidx;
	}

	public void setNidx(int nidx) {
		this.nidx = nidx;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getWid() {
		return wid;
	}

	public void setWid(String wid) {
		this.wid = wid;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getNaddr() {
		return naddr;
	}

	public void setNaddr(String naddr) {
		this.naddr = naddr;
	}

	public String getNftid() {
		return nftid;
	}

	public void setNftid(String nftid) {
		this.nftid = nftid;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getMaxp() {
		return maxp;
	}

	public void setMaxp(String maxp) {
		this.maxp = maxp;
	}

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	public int getStartday() {
		return startday;
	}

	public void setStartday(int startday) {
		this.startday = startday;
	}

	public int getLastday() {
		return lastday;
	}

	public void setLastday(int lastday) {
		this.lastday = lastday;
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
		return "BuyHistoryDTO [idx=" + idx + ", nidx=" + nidx + ", status=" + status + ", tid=" + tid + ", wid=" + wid
				+ ", addr=" + addr + ", naddr=" + naddr + ", nftid=" + nftid + ", hash=" + hash + ", price=" + price
				+ ", maxp=" + maxp + ", reward=" + reward + ", startday=" + startday + ", lastday=" + lastday
				+ ", c_tm=" + c_tm + ", u_tm=" + u_tm + ", d_tm=" + d_tm + ", reason=" + reason + "]";
	}

	public BuyHistoryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
}
