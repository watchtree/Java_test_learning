package cn.sxt.arrays;

public class Test03 {
	public static void main(String[] args) {
		int[] a = new int[4];
		for(int i=0;i<a.length;i++){
			a[i]= 100*i;	
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		System.out.println("################");
		
		//foreachѭ�����ڶ�ȡ����Ԫ�ص�ֵ�������޸�
		for(int m:a){//ѭ���������齫ÿ��Ԫ��ȡ��֮�����m����
			System.out.println(m);
		}
		
		String[] ss = {"aa", "bbb", "ccc", "ddd"};
		for(String temp:ss){
			System.out.println(temp);
		}
	}
}