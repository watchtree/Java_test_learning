/**
 * 
 * @author tree
 *
 */
public class TestThis {
	int a, b, c;
	
	TestThis() {
		System.out.println("���ڳ�ʼ��һ������");
	}
	
	TestThis(int a, int b){
		//TestThis();//�����޷����ù��췽����
		this();//�����޲εĹ��췽�����ұ���λ�ڵ�һ��
		this.a = a;
		this.b = b;
	}
	
	TestThis(int a, int b, int c){
//		this.a = a;
//		this.b = b;
		this(a, b);//���ô������Ĺ��������ұ�����ڹ��췽���ĵ�һ��
		//this��������static������
		this.c = c;
	}
	
	void sing(){
		
	}
	
	void eat(){
		this.sing();
		System.out.println("test wttree");
	}
	
	public static void main(String[] args) {
		TestThis hi = new TestThis(2, 3);
		hi.eat();
		//this�����ڴ˴�ʹ�ã���Ϊû�ж���
	}
}
