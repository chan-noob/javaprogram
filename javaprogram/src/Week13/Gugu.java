package Week13;

public class Gugu {
	private int dan;

	public void setDan(int dan) {
		this.dan = dan;
	}
	public void printGugu() {
		for(int i=1;i<=9;i++) {
			System.out.println(dan + "*"+i+"="+dan*i);
		}
		System.out.println();
	}
	
}
