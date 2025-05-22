package Week12;

public class Week12_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	coord crd1 = new coord();
	crd1.setPos_x(10);
	crd1.setPos_y(20);
	
	System.out.println(crd1.toString());
	
	crd1.moveXY(20, 30);
	System.out.println(crd1);
	System.out.println("X : " + crd1.getPos_x() + "Y :" + crd1.getPos_y());
	}
}
