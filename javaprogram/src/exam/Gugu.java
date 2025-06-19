package exam;

public class Gugu {
	private int dan;

	public void setDan(int dan) {
		this.dan = dan;
	}
	public void printGugu() {
        System.out.println(dan + "단 출력:");
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }
	}
}
