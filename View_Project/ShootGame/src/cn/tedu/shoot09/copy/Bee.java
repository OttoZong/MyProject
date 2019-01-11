package cn.tedu.shoot09.copy;

import java.awt.image.BufferedImage;
import java.util.Random;


public class Bee extends FlyingObject {
	// 小蜜蜂
	private static BufferedImage[] images;
	static {
		images = new BufferedImage[5];
		for (int i = 0; i < images.length; i++) {
			images[i] = loadImage("bee" + i + ".png");
		}
	}

	private int xStep; // X坐標走步
	private int yStep; // y坐標走步
	private int awardType; // 獎勵類型

	// 建構子(構造方法)
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

//	小蜜蜂走步Step()
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
