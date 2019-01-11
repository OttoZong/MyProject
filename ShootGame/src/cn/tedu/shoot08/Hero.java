package cn.tedu.shoot08;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Hero extends FlyingObject {
	private static BufferedImage[] images;
	static {
		images = new BufferedImage[6];
		for (int i = 0; i < images.length; i++) {
			images[i] = loadImage("hero" + i + ".png");
		}
	}

	private int life; // 生命值
	private int Fire; // 火力值

	// 建構子(建構方法)
	public Hero() {
		width = 97;
		height = 124;
		x = 140;
		y = 400;
		life = 3;
		Fire = 0;
	}

	public void step() {

	}

//	英雄機隨著滑鼠動 X:滑鼠X軸座標 Y:滑鼠Y軸座標
	public void moveTo(int x, int y) {
		this.x = x - this.width / 2;
		this.y = y - this.height / 2;
	}

	int index = 0;
	int deadIndex = 2;

	public BufferedImage getImage() {
		if (isLife()) {
			return images[index++ % 2];
		} else if (isDead()) {
			BufferedImage img = images[deadIndex++];
			if (deadIndex == images.length) {
				state = REMOVE;
			}
			return img;
		}
		return null;
	}

	public Bullet[] shoot() {
		int xStep = this.width / 4;
		int yStep = 20;
		if (Fire > 0) {
			Bullet[] bs = new Bullet[2];
			bs[0] = new Bullet(this.x + 1 * xStep, this.y - yStep);
			bs[1] = new Bullet(this.x + 3 * xStep, this.y - yStep);
			Fire -= 2;
			return bs;
		} else {
			Bullet[] bs = new Bullet[1];
			bs[0] = new Bullet(this.x + 2 * xStep, this.y - yStep);
			return bs;
		}
	}

	public boolean outOfBounds() {
		return false;
	}
	
	public void addLife() {
		life++;
	}

	public void addFire() {
		Fire += 40;
	}
	public int getLife() {
		return life;
	}

}
