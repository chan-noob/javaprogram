package exam;

public class Accout {
	private String AccountNo;
	private String owner;
	private int balance;
	public String getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		if (amount <= 0) {
            System.out.println("입금 실패: 0 이하 금액은 입금할 수 없습니다.");
            return;
        }
        balance += amount;
        System.out.println(amount + "원 입금 완료.");
	}
	public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("출금 실패: 0 이하 금액은 출금할 수 없습니다.");
            return;
        }
        if (amount > balance) {
            System.out.println("출금 실패: 잔액 부족.");
            return;
        }
        balance -= amount;
        System.out.println(amount + "원 출금 완료.");
    }
	@Override
	public String toString() {
		return "Accout [AccountNo=" + AccountNo + ", owner=" + owner + ", balance=" + balance + "]";
	}
	
}
