/**
 * 
 * @author tree
 *
 */
public class SxtStu {
	//���ԣ���Ա���� 
	int id;
	String name;
	int age;
	
	Computer comp;
	
	void study(){
		System.out.println("study" + comp.brand);
	}
	
	void play(){
		System.out.println("play");
		
	}
	
	//ϵͳ�Զ�����������Ķ��󣬹��췽�����޲����Ĺ��췽������ʡ��
	SxtStu(){
		
	}
	
	public static void main(String[] args) {
		SxtStu stu = new SxtStu();//����һ������
		stu.id=1001;

		stu.name="wtt";
		stu.age=18;
		
		Computer c1 = new Computer();
		c1.brand = "����";
		stu.comp = c1;
		
		
		stu.study();
		stu.play();
	}
}

class Computer {
	String brand;
	
}