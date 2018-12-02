package cn.sort.reftype;

public class Goods {
	private String name;
	private double price;
	private int fav;
	
	
	
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Goods(String name, double price, int fav) {
		super();
		this.name = name;
		this.price = price;
		this.fav = fav;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getFav() {
		return fav;
	}



	public void setFav(int fav) {
		this.fav = fav;
	}



	public String toString(){
		return "商品名"+name+"收藏量"+this.fav+"价格"+price+"\n";
		
	}
}
