package cn.bjsxt.gen;

/**
 * 
 * @author tree
 *
 */
public class App {
	public static void main(String[] args) {
		Object obj = 80;
		int score = (int) obj;//object--integer--自动装箱
//		int score = (Integer)obj;//非自动装箱
		System.out.println(score);
		
		Student stu = new Student(80, 90);//发生了自动装箱
//		stu.getJavase() //获取值需要强制类型转化
		int javaseScore = (int) stu.getJavase();
		String oracleScore = null;
		//手动类型转化避免错误
		if(stu.getOracle() instanceof String){
			oracleScore = (String)stu.getOracle();
		}
		System.out.println("分数为"+javaseScore+","+oracleScore);

	}
}
