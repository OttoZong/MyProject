package cn.tedu.shoot05_03;

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
		System.out.println("�p�e��x���в��ʤF" + xStep);
		System.out.println("�p�e��y���в��ʤF" + yStep);
	}
}
