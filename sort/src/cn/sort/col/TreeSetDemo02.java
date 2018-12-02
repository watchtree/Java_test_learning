package cn.sort.col;
/**
 * 实体类实现Comparable接口的应用
 */
import java.util.TreeSet;

public class TreeSetDemo02 {
	public static void main(String[] args) {
		Worker w1 = new Worker("w1",12000);
		Worker w2 = new Worker("w2",8000);
		Worker w3 = new Worker("w3",5000);
		
		TreeSet<Worker> employees = new TreeSet<Worker>();
		employees.add(w1);
		employees.add(w2);
		employees.add(w3);
		System.out.println(employees );
	}
}
