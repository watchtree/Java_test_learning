package cn.sxt.oo;

import cn.sxt.oo2.Human;

public class TestEncapsulation {
	public static void main(String[] args) {
		Human h = new Human();
//		h.name = "wtt";
//		h.height = 123
	}
}

class girl extends Human{
	void sayGood(){
		System.out.println(height);
	}
}