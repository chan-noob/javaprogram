package Week13;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1 = new Box();
		Box box2 = new Box();
		
		box1.setWidth(10);
        box1.setLength(10);
        box1.setHeight(10);

        box2.setWidth(5);
        box2.setLength(5);
        box2.setHeight(5);

        System.out.println("box1의 부피: " + box1.getVolume());
        System.out.println("box2의 부피: " + box2.getVolume());

        System.out.println(box1.toString());
        System.out.println(box2.toString());
    }
}