package cn.tedu.shoot08;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Bee extends FlyingObject {
	// �p�e��
	private static BufferedImage[] images;
	static {
		images = new BufferedImage[5];
		for (int i = 0; i < images.length; i++) {
			images[i] = loadImage("bee" + i + ".png");
		}
	}

	private int xStep; // X���Ш��B
	private int yStep; // y���Ш��B
	private int awardType; // ���y����

	// �غc�l(�c�y��k)
	public Bee() {
		width = 60;
		height = 50;
		x = (int) (Math.random() * (World02.WIDTH - this.width));
		y = -this.height;
		xStep = 1;
		yStep = 2;
		awardType = (int) (Math.random() * 2);
	}

//	�p�e�����BStep()
	public void step() {
		x += xStep;
		y += yStep;
		if (x >= World02.WIDTH - this.width || x <= 0) {
			xStep *= -1;
		}
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
		return this.y >= World02.HEIGHT;
	}
}
