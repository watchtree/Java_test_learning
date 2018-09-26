import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame{
	
	//图片加载
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x=100; //小球的横坐标
	double y=100; //小球的纵坐标
	
	double degree = 3.14/3; //弧度
	
	//画窗口的方法
	public void paint(Graphics g){
		System.out.println("窗口被画了一次！");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		x = x+10*Math.cos(degree);
		y = y+10*Math.sin(degree);
		
		//碰到上下边界
		if(y>500-40-30||y<80){ //500是窗口高度，40是桌子边框，30是球直径，40是标题栏
			degree=-degree;
		}
		
		//碰到左右边界
		if(x<40||x>856-40-30){
			degree=3.14-degree;
		}
	
	}

	
	//窗口加载
	void launchFrame(){
		setSize(856,500);
		setLocation(400,400);
		setVisible(true);
		
		//重画窗口
		while(true){
			repaint(); //重复调用paint
			try{
				Thread.sleep(40);//40ms 1s=1000ms
			}catch(Exception e){
				e.printStackTrace();
			}
			
			
			
		}
	}

	//main方法时程序执行的入口
	public static void main(String[] args){
		System.out.println("hello world");
		BallGame2 game = new BallGame2();
		game.launchFrame();
	}
}
