/**
 * 
 * @author tree
 *
 */
public class TestOverload {
	public static void main(String[] args) {
		System.out.println(add(1, 2));
		System.out.println(add(1, 23, 3));
		System.out.println(add(3.2, 1));
		System.out.println(add(1, 3.3));
	}
	
	public static int add(int n1, int n2){
		int sum = n1+n2;
		return sum;
	}
	//����������ͬ����
	public static int add(int n1, int n2, int n3){
		int sum = n1+n2+n3;
		return sum;
	}
	//�������Ͳ�ͬ����
	public static double add(double n1, int n2){
		double sum = n1+n2;
		return sum;
	}
	//����˳��ͬ����
	public static double add(int n1, double n2){
		double sum = n1+n2;
		return sum;
	}
	//int add(int n2, int n1)���������أ���Ϊֻ�в������Ʋ�ͬ
	//double add(int n1, int n2)���������أ�ֻ�з���ֵ���Ͳ�ͬ
}
