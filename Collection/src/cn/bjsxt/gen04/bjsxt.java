package cn.bjsxt.gen04;


public class bjsxt<T> {
	T stu;
	public static void main(String[] args) {
		//���͵�Ƕ��
		bjsxt<Student<String>> room = new bjsxt<Student<String>>();
		//���⵽��һ�����
		room.stu = new Student<String>();
		Student<String> stu = room.stu;
		String score = stu.score;
		System.out.println(score);
	}

}

