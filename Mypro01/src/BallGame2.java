import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame{
	
	//ͼƬ����
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x=100; //С��ĺ�����
	double y=100; //С���������
	
	double degree = 3.14/3; //����
	
	//�����ڵķ���
	public void paint(Graphics g){
		System.out.println("���ڱ�����һ�Σ�");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		x = x+10*Math.cos(degree);
		y = y+10*Math.sin(degree);
		
		//�������±߽�
		if(y>500-40-30||y<80){ //500�Ǵ��ڸ߶ȣ�40�����ӱ߿�30����ֱ����40�Ǳ�����
			degree=-degree;
		}
		
		//�������ұ߽�
		if(x<40||x>856-40-30){
			degree=3.14-degree;
		}
	
	}

	
	//���ڼ���
	void launchFrame(){
		setSize(856,500);
		setLocation(400,400);
		setVisible(true);
		
		//�ػ�����
		while(true){
			repaint(); //�ظ�����paint
			try{
				Thread.sleep(40);//40ms 1s=1000ms
			}catch(Exception e){
				e.printStackTrace();
			}
			
			
			
		}
	}

	//main����ʱ����ִ�е����
	public static void main(String[] args){
		System.out.println("hello world");
		BallGame2 game = new BallGame2();
		game.launchFrame();
	}
}