package cn.sort.col;

public class Person {
	private final String name;
	private final int handsome;
	public Person() {
		// TODO Auto-generated constructor stub
		name = null;
		handsome = 0;
	}
	public Person(String name, int handsome) {
		super();
		this.name = name;
		this.handsome = handsome;
	}
	public String getName() {
		return name;
	}

	public int getHandsome() {
		return handsome;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ÐÕÃû"+this.name+"Ö¸Êý"+ this.handsome;
	}
}
