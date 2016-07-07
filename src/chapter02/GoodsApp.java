package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName("nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		Goods tv = new Goods("LG", 800000, 50, 90);
		
		System.out.println(camera);
		System.out.println(tv);
		
		int discountPrice = camera.calcDiscountPrice(50);
		System.out.println(discountPrice);
		
		
	}

}
