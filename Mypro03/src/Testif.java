
public class Testif {
	public static void main(String[] args) {
		double d = Math.random();
		System.out.println(d);//返回【0，1）
		System.out.println((int)(6*Math.random()+1));
		
//		int i = (int)(6*Math.random()+1);
//		System.out.println(i);
//		if(i<3){
//			System.out.println("小");
//		}
//		
		System.out.println("#######");
		int i = (int)(6*Math.random()+1);
		int j = (int)(6*Math.random()+1);
		int k = (int)(6*Math.random()+1);
		
		int count = i + j + k;
		if(count>15){
			System.out.println("运气好");
		}
		if(count>10&&count<=15){
			System.out.println("运气一般");
		}
		if(count<=10){
			System.out.println("运气差");
		}
		System.out.println("输出"+count);
	}
}
