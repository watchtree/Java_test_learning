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
 * 飞机游戏主窗口
 * @author tree
 *
 */
public class MygameFrame extends JFrame{
	
	Image ball = GameUtil.getImage("images/ball.png");
	
	//paint方法用于窗口绘制，自动被调用，g相当于一只画笔
	@Override
	public void paint(Graphics g) {
		Color c = g.getColor();
		Font f = g.getFont();
		
		g.drawLine(100, 100, 300, 300);
		g.drawRect(100, 100, 300, 300);
		g.drawOval(100, 100, 300, 300);
		g.fillRect(100, 100, 40, 40);
		g.setColor(Color.blue);
		g.setFont(new Font("宋体", Font.BOLD, 50));
		g.drawString("wtt", 200, 200);
		
		g.drawImage(ball, 250, 250, null);
		
		g.setColor(c);
		g.setFont(f);
	}
	
	//初始化窗口
	public void launchFrame(){
		this.setTitle("wtt");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(300, 300);
		
		//关闭窗口
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				System.exit(0);//0正常结束
			}
		});
	}
	
	public static void main(String[] args) {
		MygameFrame f = new MygameFrame();
		f.launchFrame();
	}
}
