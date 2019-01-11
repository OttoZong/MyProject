package cn.tedu.shoot09;

import java.awt.image.BufferedImage;
import java.util.Random;


public class Bee extends FlyingObject implements Award {
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
		super(60,50);
		xStep = 1;
		yStep = 2;
		Random rand = new Random();
		awardType = rand.nextInt(2);
//		width = 60;
//		height = 50;
//		x = (int) (Math.random() * (World02.WIDTH - this.width));
//		y = -this.height;
//		xStep = 1;
//		yStep = 2;
//		awardType = (int) (Math.random() * 2);
	}

//	�p�e�����BStep()
	public void step() {
		x += xStep;
		y += yStep;
		if (x <= 0 || x >= World02.WIDTH - this.width) {
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
	
	public int getType(){
		return awardType;
	}
}
