package exam;

public class CreditCard {
	public long number;
	public String owner;
	private int point;
	private int balance;
	
	public void use(int amount) {
		balance += amount;
	}
	public void payBill(int amount) {
		balance -= amount;
		addPoint(amount);
	}
	private void addPoint(int amount) {
		point += amount / 1000;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		if(number < 1000_0000_0000_0000L) {
			System.out.println("잘못된 카드 번호입니다. ");
			return;
		}
		this.number = number;
	}
	public int getPoint() {
		return point;
	}
	public void setpoint(int point) {
		this.point = point;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}