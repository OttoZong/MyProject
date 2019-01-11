package cn.tedu.shoot06;

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

	// �سy��k
	public BigAirplane() {
		width = 66;
		height = 99;
		x = (int) (Math.random() * (World02.WIDTH - this.width));
		y = -this.height;
		step = 2;
	}

	// �j�Ծ����Bstep()
	public void step() {
		System.out.println("�j�Ծ�y���ʤF" + step);
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
}
