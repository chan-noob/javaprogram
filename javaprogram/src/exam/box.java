package exam;

public class box {
	private int width;
	private int length;
	private int height;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getVolume() {
		return width * length * height;
	}
	@Override
	public String toString() {
		return "box [width=" + width + ", length=" + length + ", height=" + height + "]";
	}
	
	
}
