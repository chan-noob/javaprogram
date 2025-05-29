package Week13;

public class GoodsStockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodsStock gs1 = new GoodsStock();
        gs1.setProduct("과자");
        gs1.setStock(30);

        GoodsStock gs2 = new GoodsStock();
        gs2.setProduct("아이스크림");
        gs2.setStock(50);

        System.out.println(gs1.toString());
        System.out.println(gs2.toString());
        System.out.println();

        System.out.println("재고가 더 많은 제품정보: ");
        if (gs1.getStockNumber() > gs2.getStockNumber()) {
            System.out.println(gs1.toString());
        } else if (gs1.getStockNumber() < gs2.getStockNumber()) {
            System.out.println(gs2.toString());
        } else {
            System.out.println("두 상품의 재고가 같습니다.");
        }
        System.out.println();
        gs2.releaseStock(10); 
        
        System.out.println("출고 후 제품정보: ");
        System.out.println(gs2.toString());
	}

}
