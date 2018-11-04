package cn.bjsxt.testexception;

public class MyException extends Exception{//继承异常包
	
	public MyException(){
		
	}
	
	public MyException(String message){
		super(message);
	}

}

class TestMyException{
	void test() throws MyException{
		///
	}
	
	public static void main(String[] args) {
		try {
			new TestMyException().test();
		} catch (MyException e) {//使用自己创建的异常
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}