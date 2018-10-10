package cn.sxt.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
/**
 * �ɻ���Ϸ������
 * @author tree
 *
 */
public class MygameFrame extends JFrame{
	

	Image plane = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	int planeX = 250, planeY = 250;
	
	//paint�������ڴ��ڻ��ƣ��Զ������ã�g�൱��һֻ����
	@Override
	public void paint(Graphics g) {

		
		g.drawImage(bg, 0, 0, null);
		g.drawImage(plane, planeX, planeY, null);
		
		planeX++;

	}
	
	//�����ڲ��࣬����ֱ��ʹ���ⲿ����
	//���������ػ�����
	class PaintThread extends Thread{
		@Override
		public void run() {
			while(true){
				repaint();//�ػ�
				System.out.println("���ڻ�һ��");
				//�Զ������쳣
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	//��ʼ������
	public void launchFrame(){
		this.setTitle("wtt");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(300, 300);
		
		//�رմ���
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				System.exit(0);//0��������
			}
		});
		
		new PaintThread().start();//�����ػ����ڵ��߳�
	}
	

	public static void main(String[] args) {
		MygameFrame f = new MygameFrame();
		f.launchFrame();
	}
}