
public class Testifelseif {
	public static void main(String[] args) {
		double d = Math.random();
		System.out.println(d);//���ء�0��1��
		System.out.println((int)(6*Math.random()+1));
		
		int i = (int)(6*Math.random()+1);
		System.out.println(i);
		if(i<3){
			System.out.println("С");
		}else{
			System.out.println("��");
		}
		
		System.out.println("#####");
		double r = 4*Math.random();
		double area = Math.PI*Math.pow(r, 2);
		double cicle = 2*Math.PI*r;
		System.out.println("�뾶Ϊ"+r);
		System.out.println("���Ϊ"+area);
		System.out.println("�ܳ�Ϊ"+cicle);
		if(area>cicle){
			System.out.println("��������ܳ�");
		}else if(area==cicle){
			System.out.println("�ܳ��������");
		}else{
			System.out.println("�ܳ�С�����");
		}
		
		
	}
}