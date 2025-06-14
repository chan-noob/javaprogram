package exam;

public class Point {
	public int x;
	public int y;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point 좌표1 = new Point();
		Point 좌표2 = new Point();
		
		좌표1.x = 10;
		좌표1.y = 10;
		좌표2.x = 50;
		좌표2.y = 30;
		
		System.out.println("좌표 1: " + 좌표1.x +" , " + 좌표1.y);
		System.out.println("좌표 2: " + 좌표2.x +" , " + 좌표2.y);
	}

}
