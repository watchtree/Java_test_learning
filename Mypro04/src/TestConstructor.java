class Point{
	double x, y;
	
	//���췽�����������뱣��һ��
	public Point(double _x, double _y){
		x = _x;
		y = _y;
		//_�»�����������
		
	}
	
	public double getDistance(Point p){
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
	}
}
public class TestConstructor {
	public static void main(String[] args) {
		Point p = new Point(3.0, 4.0);
		Point orign = new Point(0.0, 0.0);
		
		System.out.println(p.getDistance(orign));
	}
}
