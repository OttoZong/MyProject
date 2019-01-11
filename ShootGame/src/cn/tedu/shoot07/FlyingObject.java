package cn.tedu.shoot07;

import java.awt.Graphics;
//import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public abstract class FlyingObject {
	protected int width;
	protected int height;
	protected int x;
	protected int y;

	public static final int LIFE = 0;
	public static final int DEAD = 1;
	public static final int REMOVE = 2;
	protected int state = LIFE;

	public static BufferedImage loadImage(String fileName) {
		System.out.println(fileName);
		try {
			BufferedImage img = ImageIO.read(FlyingObject.class.getResource(fileName));
			return img;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public abstract BufferedImage getImage();

	public void paint(Graphics g) {
		g.drawImage(getImage(), x, y, null);
	}

	public boolean isLife() {
		return state == LIFE;
	}

	public boolean isDead() {
		return state == DEAD;
	}

	public abstract void step();

	public boolean outOfBounds() {
		return this.y >= World02.HEIGHT;
	};
}
