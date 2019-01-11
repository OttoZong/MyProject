package cn.tedu.shoot09;

import java.awt.image.BufferedImage;


public class BigAirplane extends FlyingObject implements Enemy {
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
		super(69,99);
		step = 6;
		
//		width = 66;
//		height = 99;
//		x = (int) (Math.random() * (World02.WIDTH - this.width));
//		y = -this.height;
//		step = 2;
	}

	// �j�Ծ����Bstep()
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
	
	public int getScore(){
		return 3;
	}
}
