package Week13;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account();
        acc1.setAccountNo("123-456-789");
        acc1.setOwner("홍길동");
        acc1.setBalance(1000000);

        Account acc2 = new Account();
        acc2.setAccountNo("111-222-333");
        acc2.setOwner("지현찬");
        acc2.setBalance(5000000);
        
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println();
        
        acc1.deposit(5000);
        acc2.deposit(2000000);
        
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println();
        
        acc1.withdraw(50);
        acc2.withdraw(500000);
        
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println();
	}

}
