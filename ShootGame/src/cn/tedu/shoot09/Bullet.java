package cn.tedu.shoot09;

import java.awt.image.BufferedImage;


public class Bullet extends FlyingObject {
	private static BufferedImage image;
	static {
		image = loadImage("bullet.png");
	}

	private int step;

	// 建造方法
	public Bullet(int x, int y) {
		super(8,14,x,y);
		step = 3;
//		width = 8;
//		height = 14;
//		this.x = x;
//		this.y = y;
//		step = 3;
	}

	// 子彈走步step();
	public void step() {
		y -=step;
	}

	public BufferedImage getImage() {
		if (isLife()) {
			return image;
		}
		if (isDead()) {
			state = REMOVE;
		}
		return null;
	}
	
	public boolean outOfBounds() {
		return this.y<=-this.height;
	}

}
