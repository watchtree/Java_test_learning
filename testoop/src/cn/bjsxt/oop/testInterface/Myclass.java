package cn.bjsxt.oop.testInterface;

public class Myclass implements MyInterface{

	@Override
	public void test01() {
		// TODO Auto-generated method stub
//		MyInterface.MAX_GREAD;
		System.out.println("test01");
	}

	@Override
	public int test02(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Myclass.test02()");
		return a+b;
	} //实现相对应的接口
	
}
