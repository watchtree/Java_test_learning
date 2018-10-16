package cn.sxt.oo2;
/**
 * 
 * @author tree
 *
 */


/*final 加入自类不可继承*/
class Aniaml{
	public void shout(){
		System.out.println("叫了一声");
	}
}

class Dog extends Aniaml{
	public /*final方法不能重写*/void shout(){
		System.out.println("汪汪汪");
	}
	public void seeDoor(){
		System.out.println("看门中");
	}
}

class Cat extends Aniaml{
	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("喵喵喵");
	}
}
public class TestPolym {
	public static void main(String[] args) {
		
		animalCry(new Aniaml());
		animalCry(new Dog());
		animalCry(new Cat());
		System.out.println();
		
		
		Cat a1 = new Cat(); 
		//自上而下可以转型,生成cat转化成animal
		//传的具体是哪一类就调用哪一类的方法，大大提高了程序的可扩展性
		//编译时认为a1是animal实际是cat所以下一步还是cat输出
		animalCry(a1);
		
		System.out.println();
		
		Aniaml a2 = new Dog();
		animalCry(a2);
		//强制转型
		Dog dog = (Dog)a2;
		dog.seeDoor();
		
		System.out.println();
		
		Aniaml c = new Cat();
		animalCry(c);
		//强行转型成功通过编译，但是运行出错java.lang.ClassCastException:cn.sxt.oo2.Cat cannot be cast to cn.sxt.oo2.Dog
		//at cn.sxt.oo2.TestPolym.main(TestPolym.java:57)
//		Dog d3 = (Dog)c;
//		d3.seeDoor();
		
	}
	//多态
	static void animalCry(Aniaml a){
		a.shout();
	}
}
