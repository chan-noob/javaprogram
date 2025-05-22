package Week12;

public class coord {
	private int pos_x;
	private int pos_y;
	
	public int getPos_x() {
		return pos_x;
	}
	public int getPos_y() {
		return pos_y;
	}
	public void setPos_x(int pos_x) {
		this.pos_x = pos_x;
	}
	public void setPos_y(int pos_y) {
		this.pos_y = pos_y;
	}
	@Override
	public String toString() {
		return "coord [pos_x=" + pos_x + ", pos_y=" + pos_y + ", toString()=" + super.toString() + "]";
	}
	public void moveXY(int x, int y) {
		pos_x += x;
		pos_y += y;
	}
}
