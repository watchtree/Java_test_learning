/**
 * 
 * @author tree
 *
 */
public class TestRecursion01 {
	public static void main(String[] args) {
		long d1 = System.currentTimeMillis();
		System.out.printf("%d�׳˵Ľ��Ϊ%s%n", 10, factorial(10));
		long d2 = System.currentTimeMillis();
		System.out.printf("�ݹ��ʱ��%s%n", d2-d1);
		//printf ��ʽ����������ڽ�ָ����������ָ��λ��
		
		
		factorialLoop(10);
	}
	
	static long factorial(int n){
		if(n==1){
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	
	static long factorialLoop(int a){
		long d3 = System.currentTimeMillis();
		long result = 1;
		while(a>1){
			result *= a*(a-1);
			a -= 2;
		}
		long d4 = System.currentTimeMillis();
		System.out.println(result);
		System.out.printf("��ͨѭ������ʱ�䣺%s%n", d4-d3);
		return result;
	}
	
}
