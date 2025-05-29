package Week13;

public class GoodsStock {
	private String product;
	private int stock;
	public void setProduct(String product) {
		this.product = product;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getStockNumber() {
        return stock;
    }
	@Override
	public String toString() {
		return "GoodsStock [product=" + product + ", stock=" + stock + "]";
	}
	public void releaseStock(int r) {
		if (r > 0 && stock >= r) {
			stock -= r;
		}
	}
	
}
