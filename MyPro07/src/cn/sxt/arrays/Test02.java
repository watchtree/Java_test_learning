package cn.sxt.arrays;

public class Test02 {
	public static void main(String[] args) {
		
		//��̬��ʼ��
		int[] a = {2,3,4,5};
		User[] b = {new User(1001, "wtt"), 
					new User(1002, "wtt1"), 
					new User(1003, "wtt3")};
		
		//Ĭ�ϳ�ʼ��
//		int[] b = new int[3];//Ĭ�ϸ�����Ԫ�ؽ��и�ֵ����ֵ�Ĺ���ͳ�Ա����Ĭ�ϸ�ֵ����һ��
		
		//��̬��ʼ���� ֱ��ͨ���±���и�ֵ
		int[] c = new int[2];
		c[0] = 1;
		c[1] = 2;
	}
}
