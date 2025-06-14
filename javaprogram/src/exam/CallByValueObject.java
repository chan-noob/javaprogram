package exam;

class MyInt {
	int val;
	MyInt(int i) {
		val = i;
	}
}
public class CallByValueObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person aPerson = new Person("홍길동");
		MyInt a = new MyInt(33);
		
		aPerson.setAge(a);
		
		System.out.println(a.val);
		
	}

}
