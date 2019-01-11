package cn.tedu.shoot07;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Bullet extends FlyingObject {
	private static BufferedImage image;
	static {
		image = loadImage("bullet.png");
	}

	private int step;

	// �سy��k
	public Bullet(int x, int y) {
		width = 8;
		height = 14;
		this.x = x;
		this.y = y;
		step = 3;
	}

	// �l�u���Bstep();
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
		return this.y>= World02.HEIGHT;
	}
}
