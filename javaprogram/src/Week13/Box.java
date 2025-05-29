package Week13;

public class Box {
	private int width;
	private int length;
	private int height;
	
	public int getWidth() {
		return width;
	}
	public int getLength() {
		return length;
	}
	public int getHeight() {
		return height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getVolume() {
		return (width*height*length);
	}
	@Override
	public String toString() {
		return "Box [너비는" + width + ", 깊이는" + length + ", 높이는" + height + ", 부피는" + (width*length*height)+"]";
	}
	
}
