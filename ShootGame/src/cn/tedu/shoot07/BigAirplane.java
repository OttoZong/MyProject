package cn.tedu.shoot07;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class BigAirplane extends FlyingObject {
	private static BufferedImage[] images;
	static {
		images = new BufferedImage[5];
		for (int i = 0; i < images.length; i++) {
			images[i] = loadImage("bigplane" + i + ".png");
		}

	}
	private int step;

	// 建造方法
	public BigAirplane() {
		width = 66;
		height = 99;
		x = (int) (Math.random() * (World02.WIDTH - this.width));
		y = -this.height;
		step = 2;
	}

	// 大戰機走步step()
	public void step() {
		y+=step;
	}

	int deadIndex = 1;

	public BufferedImage getImage() {
		if (isLife()) {
			return images[0];
		} else if (isDead()) {
			BufferedImage img = images[deadIndex++];
			if (deadIndex == images.length) {
				state = REMOVE;
			}
			return img;
		}
		return null;
	}
	
	public boolean outOfBounds() {
		return this.y >=World02.HEIGHT;
	}
}
