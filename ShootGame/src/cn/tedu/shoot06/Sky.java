package cn.tedu.shoot06;

import java.awt.Graphics;
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

//	�ѪŨ��Bstep()
	public void step() {
		System.out.println("�Ѫ�y���ʤF" + step);
	}

	public BufferedImage getImage() {
		return image;
	}

	public void paint(Graphics g) {
		g.drawImage(getImage(), x, y, null);
		g.drawImage(getImage(), x, y1, null);
	}

}
