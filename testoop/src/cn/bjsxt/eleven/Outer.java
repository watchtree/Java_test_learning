package cn.bjsxt.eleven;

import com.sun.javafx.geom.Shape;

public class Outer {
	 public static void main(String[] args) {
//		Nose n = new Nose();//不能使用内部类
		 Face f = new Face();
		 Face.Nose n = f.new Nose();
		 n.breath();
		 Face.Ear e = new Face.Ear();
		 e.listen();
	}
}

class Face{
	int type =20;
	String shape = "tt";
	static String color = "red";
	
	
	//内部类
	class Nose{ 
		String type;
		/*static*/ void breath(){//不能被定义为静态方法
			System.out.println(type);
			System.out.println(shape);//不同名可以直接调用外部类
			System.out.println(Face.this.type);
			System.out.println("呼吸");
		}
	}
	
	//静态内部类存在不一定存在对应的外部类对象，因此静态内部类的实例方法不能直接访问外部类的实例方法
	static class Ear{
		void listen(){
//			System.out.println(shape);不能使用一般属性
			System.out.println(color);//可以访问静态属性
			System.out.println("我在听");
		}
	}
}