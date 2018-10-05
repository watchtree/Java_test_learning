class Point{
	double x, y;
	
	//构造方法和类名必须保持一致
	public Point(double _x, double _y){
		x = _x;
		y = _y;
		//_下划线用来区别
		
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
