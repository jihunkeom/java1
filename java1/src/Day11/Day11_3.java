package Day11;

public class Day11_3 {
	
	public static void main(String[] args) {
		Bank bank = null;
		
		bank = new Kbank();
		bank.계좌등록();
		
		bank = new Sbank();
		bank.계좌등록();
	}

}
