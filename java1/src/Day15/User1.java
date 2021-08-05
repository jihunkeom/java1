package Day15;


public class User1 extends Thread {
	
	private Account account;
	
	public void setAccount(Account account) {
		this.setName("User1"); // thread이름 설정 
		this.account = account;
	}
	
	
	@Override
	public void run() {
		account.setMoney(100);
	}

}
