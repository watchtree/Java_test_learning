/**
 * 
 * @author tree
 *
 */
public class TestTypeConvertError {
	public static void main(String[] args) {
		int money = 1000000000;
		int years = 20;
		//����ֵ����int��Χ
		int total = money*years;
		System.out.println("total=" + total);
		//�趨totalΪlong��Ȼ��������Ϊ�������ת��Ϊint���������ݶ�ʧ
		long total1 = money*years;
		System.out.println("total1=" + total1);
		//��ȷ����һ��longֵ���Ƚ�һ�����ӱ�Ϊlong���������ʽ��long������
		long total2 = money*(long)years;
		System.out.println("total2="+total2);
		
		long total3 = 34L*312321*years*23123;
		System.out.println("total3="+total3);
		
		
	}
}
