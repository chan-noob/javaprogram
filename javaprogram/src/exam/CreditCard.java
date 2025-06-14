package exam;

class CreditCard {
	public long cardNumber;
	public String owner;
	private int point;
	private int balance;
	
	public void use(int amount) {
		balance += amount;
		System.out.println("현재까지 카드 사용액: " + balance);
		addPoint(amount);
	}
	private void payBill(int amount) {
		balance -= amount;
		System.out.println("지불액: " + amount + " 지불잔액: " + balance);
		addPoint(amount);
	}
	private void addPoint(int amount) {
		point += amount / 1000;
		System.out.println("보너스포인트: " + point);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard cc = new CreditCard();
		cc.cardNumber = 1234_5678_9012_3456L;
		cc.owner = "kim";
		System.out.println("카드번호: " + cc.cardNumber);
		System.out.println("카드소유자: " + cc.owner);
		cc.use(30000);
		cc.payBill(20000);
	}

}
