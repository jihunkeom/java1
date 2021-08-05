package Day15;

public class Account {
	
	private int money;

	public int getMoney() {
		return money;
	}

	public synchronized void setMoney(int money) {
		this.money = money;
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
			
		}
		
		System.out.println(Thread.currentThread().getName()+ " : " + this.money);
	} 
	
	

}
