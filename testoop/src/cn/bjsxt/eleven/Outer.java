package cn.bjsxt.eleven;

import com.sun.javafx.geom.Shape;

public class Outer {
	 public static void main(String[] args) {
//		Nose n = new Nose();//����ʹ���ڲ���
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
	
	
	//�ڲ���
	class Nose{ 
		String type;
		/*static*/ void breath(){//���ܱ�����Ϊ��̬����
			System.out.println(type);
			System.out.println(shape);//��ͬ������ֱ�ӵ����ⲿ��
			System.out.println(Face.this.type);
			System.out.println("����");
		}
	}
	
	//��̬�ڲ�����ڲ�һ�����ڶ�Ӧ���ⲿ�������˾�̬�ڲ����ʵ����������ֱ�ӷ����ⲿ���ʵ������
	static class Ear{
		void listen(){
//			System.out.println(shape);����ʹ��һ������
			System.out.println(color);//���Է��ʾ�̬����
			System.out.println("������");
		}
	}
}