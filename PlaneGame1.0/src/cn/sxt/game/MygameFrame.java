package cn.sxt.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
/**
 * �ɻ���Ϸ������
 * @author tree
 *
 */
public class MygameFrame extends Frame{
	

	Image planeimg = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	Plane plane = new Plane(planeimg, 250,250);
	Shell shell = new Shell();
	Shell[] shells = new Shell[50];
	Explode bao;
	
	//paint�������ڴ��ڻ��ƣ��Զ������ã�g�൱��һֻ����
	@Override
	public void paint(Graphics g) {

		
		g.drawImage(bg, 0, 0, null);
		plane.drawSelf(g);//���ɻ�
		shell.draw(g);
		
		//�ɻ����ڵ�����ײ���
		for(int i=0; i<shells.length; i++){
			shells[i].draw(g);
			boolean peng = shells[i].getRect().intersects(plane.getRect());
			
			if(peng){
				System.out.println("��ײ��");
				plane.live = false;
				if(bao == null){
					bao = new Explode(plane.x, plane.y);
					
				}
				bao.draw(g);
			}
			
		}


	}
	
	//�����ڲ��࣬����ֱ��ʹ���ⲿ����
	//���������ػ�����
	class PaintThread extends Thread{
		@Override
		public void run() {
			while(true){
				repaint();//�ػ�
//				System.out.println("���ڻ�һ��");
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
	
	//������̼������ڲ���
	class KeyMonitor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			
			plane.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println(e.getKeyCode());
			plane.minusDirection(e);
			
		}
		
		
	}
	
	//��ʼ������
	public void launchFrame(){
		this.setTitle("wtt");
		this.setVisible(true);
		this.setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		this.setLocation(300, 300);
		
		//�رմ���
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				System.exit(0);//0��������
			}
		});
		
		new PaintThread().start();//�����ػ����ڵ��߳�
		addKeyListener(new KeyMonitor());//���������Ӽ��̼���
		
		//��ʼ��50���ڵ�
		for(int i=0; i<shells.length; i++){
			shells[i]= new Shell();
		}
	}
	

	public static void main(String[] args) {
		MygameFrame f = new MygameFrame();
		f.launchFrame();
	}
	
	private Image offScreenImage = null;
	 
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//������Ϸ���ڵĿ�Ⱥ͸߶�
	     
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	}   
}
