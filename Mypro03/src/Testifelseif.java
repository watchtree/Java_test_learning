
public class Testifelseif {
	public static void main(String[] args) {
		double d = Math.random();
		System.out.println(d);//返回【0，1）
		System.out.println((int)(6*Math.random()+1));
		
		int i = (int)(6*Math.random()+1);
		System.out.println(i);
		if(i<3){
			System.out.println("小");
		}else{
			System.out.println("大");
		}
		
		System.out.println("#####");
		double r = 4*Math.random();
		double area = Math.PI*Math.pow(r, 2);
		double cicle = 2*Math.PI*r;
		System.out.println("半径为"+r);
		System.out.println("面积为"+area);
		System.out.println("周长为"+cicle);
		if(area>cicle){
			System.out.println("面积大于周长");
		}else if(area==cicle){
			System.out.println("周长大于面积");
		}else{
			System.out.println("周长小于面积");
		}
		
		
	}
}
