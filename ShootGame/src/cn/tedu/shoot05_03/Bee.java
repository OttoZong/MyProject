package cn.tedu.shoot05_03;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

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

	public Bee() {
		width = 60;
		height = 50;
		x = (int) (Math.random() * (World02.WIDTH - this.width));
		y = -this.height;
		xStep = 1;
		yStep = 2;
		awardType = (int) (Math.random() * 2);
	}

//	小蜜蜂走步Step()
	public void step() {
		System.out.println("小蜜蜂x坐標移動了" + xStep);
		System.out.println("小蜜蜂y坐標移動了" + yStep);
	}
}
