package Day11;

public interface 키오스크 {
	
	public void 메뉴();
	public void 장바구니();
	public void 결제();
	
	public default void 종료() {
		System.out.println("키오스크 종료");
	}

}
