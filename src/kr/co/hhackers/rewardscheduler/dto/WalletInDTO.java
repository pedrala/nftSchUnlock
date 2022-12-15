package kr.co.hhackers.rewardscheduler.dto;

public class WalletInDTO {
	private int 	no;
	private String 	c_tm;
	private String 	from;
	private String 	to;
	private String 	amount;
	private String 	confirm_num;
	private String 	nonce;
	private String 	txid;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getC_tm() {
		return c_tm;
	}
	public void setC_tm(String c_tm) {
		this.c_tm = c_tm;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getConfirm_num() {
		return confirm_num;
	}
	public void setConfirm_num(String confirm_num) {
		this.confirm_num = confirm_num;
	}
	public String getNonce() {
		return nonce;
	}
	public void setNonce(String nonce) {
		this.nonce = nonce;
	}
	public String getTxid() {
		return txid;
	}
	public void setTxid(String txid) {
		this.txid = txid;
	}
	@Override
	public String toString() {
		return "WalletInDTO [no=" + no + ", c_tm=" + c_tm + ", from=" + from + ", to=" + to + ", amount=" + amount
				+ ", confirm_num=" + confirm_num + ", nonce=" + nonce + ", txid=" + txid + "]";
	}
	public WalletInDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
}
