package cn.bjsxt.gen;

/**
 * 
 * @author tree
 *
 */
public class App {
	public static void main(String[] args) {
		Object obj = 80;
		int score = (int) obj;//object--integer--�Զ�װ��
//		int score = (Integer)obj;//���Զ�װ��
		System.out.println(score);
		
		Student stu = new Student(80, 90);//�������Զ�װ��
//		stu.getJavase() //��ȡֵ��Ҫǿ������ת��
		int javaseScore = (int) stu.getJavase();
		String oracleScore = null;
		//�ֶ�����ת���������
		if(stu.getOracle() instanceof String){
			oracleScore = (String)stu.getOracle();
		}
		System.out.println("����Ϊ"+javaseScore+","+oracleScore);

	}
}
