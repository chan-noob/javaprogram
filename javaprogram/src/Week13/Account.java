package Week13;

public class Account {
	private String AccountNo;
    private String owner;
    private int balance;
    
	public String toString() {
		return "Account [AccountNo=" + AccountNo + ", owner=" + owner + ", balance=" + balance + "]";
	}

	public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String accountNo) {
        this.AccountNo = accountNo;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int d) {
        if (d > 0) {
            balance += d;
        }
        else {
        	balance = balance;
        }
    }

    public void withdraw(int w) {
        if (w > 0 && balance >= w) {
            balance -= w;
        }
        else {
        	if(w>balance) {
        		balance = balance;
        	}
        }
    }
}