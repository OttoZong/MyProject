package cn.tedu.shoot05_03;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Hero extends FlyingObject {
	private static BufferedImage[] images;
	static {
		images = new BufferedImage[6];
		for (int i = 0; i < images.length; i++) {
			images[i] = loadImage("hero" + i + ".png");
		}
	}

	private int life; // �ͩR��
	private int Fire; // ���O��

	// �غc�l(�غc��k)
	public Hero() {
		width = 97;
		height = 124;
		x = 140;
		y = 400;
		life = 3;
		Fire = 0;
	}

	public void step() {
		System.out.println("�^���������Ϥ��աI");
	}

//	�^�����H�۷ƹ��� X:�ƹ�X�b�y�� Y:�ƹ�Y�b�y��
	public void moveTo(int x, int y) {
		System.out.println("�^�����H���ƹ���");
	}

}
