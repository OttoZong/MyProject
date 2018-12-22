package cn.tedu.shoot05_03;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

//***�p�ľ�***
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
		x = (int) (Math.random() * (World02.WIDTH - this.width)); // �N��
		y = -this.height;
		step = 2;
	}

//	�p�ľ����Bstep()
	public void step() {
		System.out.println("�p�ľ�Y�y�в��ʤF" + step);
	}
}
