package cn.sxt.game;

import java.awt.Graphics;
import java.awt.Image;
/**
 * 
 * @author tree
 *
 */
import java.awt.Rectangle;

public class GameObject {
	Image img;
	double x, y;
	int speed;
	int width, height;
	
	public void drawSelf(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);
	}
	
	//构造器三个，方便重载
	public GameObject(Image img, double x, double y, int speed, int width, int height) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.width = width;
		this.height = height;
	}

	public GameObject(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public GameObject() {
		super();
	}
	
	//用于返回物体所在矩形
	public Rectangle getRect(){
		return new Rectangle((int)x, (int)y, width, height);
		
	}
	
	
}
