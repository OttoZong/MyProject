package cn.tedu.shoot09.copy;

import java.awt.image.BufferedImage;


//***小敵機***
public class Airplane extends FlyingObject {
	private static BufferedImage[] images;
	static {
		images = new BufferedImage[5];
		for (int i = 0; i < images.length; i++) {
			images[i] = loadImage("airplane" + i + ".png");
		}

	}
	private int step;

	public Airplane() {
		super(49,36);
		step = 4;
//		width = 49;
//		height = 36;
//		x = (int) (Math.random() * (World02.WIDTH - this.width)); // 代值
//		y = -this.height;
//		step = 2;
	}

//	小敵機走步step()
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
		return 1;
	}
}
