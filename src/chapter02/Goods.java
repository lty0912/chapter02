package chapter02;

public class Goods {	
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;	
	
	public Goods() {
		super();
	}

	public Goods(String name, int price, int countStock, int countSold) {
		super();
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price < 0) {
			price = 0;
		}
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		if(countStock < 0) {
			countStock = 0;
		}
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		if(countSold < 0) {
			countSold = 0;
		}
		this.countSold = countSold;
	}
	
	public String toString() {
		return "상품의 이름은 " + this.name + ", 가격은 " + this.price + "원, 재고개수는 " + this.countStock + "개, 팔린개수는 " + this.countSold + "개 입니다.";
	}
	
	public int calcDiscountPrice (int percentage) {
		return price * percentage / 100;
	}

}
