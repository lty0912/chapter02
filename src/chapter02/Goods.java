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
		return "��ǰ�� �̸��� " + this.name + ", ������ " + this.price + "��, ������� " + this.countStock + "��, �ȸ������� " + this.countSold + "�� �Դϴ�.";
	}
	
	public int calcDiscountPrice (int percentage) {
		return price * percentage / 100;
	}

}
