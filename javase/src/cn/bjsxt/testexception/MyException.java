package cn.bjsxt.testexception;

public class MyException extends Exception{//�̳��쳣��
	
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
		} catch (MyException e) {//ʹ���Լ��������쳣
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}