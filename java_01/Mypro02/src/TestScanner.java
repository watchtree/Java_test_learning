import java.util.Scanner;

/**
 * 
 * @author tree
 *
 */

public class TestScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("������������֣�");
		String name = scanner.nextLine();
		System.out.println("��������İ��ã�");
		String favor = scanner.nextLine();
		System.out.println("�������������:");
		int age = scanner.nextInt();
		
		System.out.println("###########");
		System.out.println(name);
		System.out.println(favor);
		System.out.println(age);
	}
}
