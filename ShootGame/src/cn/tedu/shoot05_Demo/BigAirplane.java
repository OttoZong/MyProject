package cn.tedu.shoot05_Demo;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class BigAirplane extends FlyingObject {
	private static BufferedImage[] images;
	static {
		images = new BufferedImage[5];
		for (int i = 0; i < images.length; i++) {
			images[i] = loadImage("bigplane"+i + ".png");
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

	public void step() {
		System.out.println("大戰機y移動了" + step);
	}
}
