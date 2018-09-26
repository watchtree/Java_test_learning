/**
 * 
 * @author tree
 *
 */
public class TestTypeConvertError {
	public static void main(String[] args) {
		int money = 1000000000;
		int years = 20;
		//返回值超出int范围
		int total = money*years;
		System.out.println("total=" + total);
		//设定total为long依然超出，因为结果首先转化为int发生了数据丢失
		long total1 = money*years;
		System.out.println("total1=" + total1);
		//正确返回一个long值，先将一个因子变为long，整个表达式用long来计算
		long total2 = money*(long)years;
		System.out.println("total2="+total2);
		
		long total3 = 34L*312321*years*23123;
		System.out.println("total3="+total3);
		
		
	}
}
