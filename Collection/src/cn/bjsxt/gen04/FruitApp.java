package cn.bjsxt.gen04;

public class FruitApp {
	public static void main(String[] args) {
		Ftuit f2 = new Ftuit();
		Ftuit f = new Apple();
	}
	
	//形参 使用多态
	public static void test(Ftuit f){
		
	}
	//返回类型使用多态
	public static Ftuit test2(){
		return new Apple();
	}
}
