package cn.tedu.shoot05_03;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Sky extends FlyingObject {
	private static BufferedImage image;
	static {
		image = loadImage("background.png");
	}
	private int step;
	private int y1; // �ѪŲ���

//	�غc��k
	public Sky() {
		width = World02.WIDTH;
		height = World02.HEIGHT;
		x = 0;
		y = 0;
		step = 1;
		y1 = -this.height;

	}

	public void step() {
		System.out.println("�Ѫ�y���ʤF" + step);
	}

}
