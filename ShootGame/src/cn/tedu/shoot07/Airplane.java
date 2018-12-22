package cn.tedu.shoot07;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

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
		width = 49;
		height = 36;
		x = (int) (Math.random() * (World02.WIDTH - this.width)); // 代值
		y = -this.height;
		step = 2;
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
}
