package Day11;

public interface Bank {
	final int 계좌번호 = 111;
	final int 예금액  = 9999999;
	
	public void 메뉴();
	public void 계좌등록();
	public void 예금();
	public void 출금();
	public void 이체();
	public void 잔고();

}
