import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame{
	
	//ͼƬ����
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x=100; //С��ĺ�����
	double y=100; //С���������
	boolean right=true;//���� ����ֵ
	
	
	//�����ڵķ���
	public void paint(Graphics g){
		System.out.println("���ڱ�����һ�Σ�");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		
		if(right){
			x=x+10;
		}else{
			x=x-10;
		}
		if(x>856-40-30){ //856�Ǵ��ڿ��ȣ�40�����ӱ߿�Ŀ��ȣ�30��С���ֱ��
			right=false;
		}
		if(x<40){
			right=true;
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
		BallGame game = new BallGame();
		game.launchFrame();
	}
}