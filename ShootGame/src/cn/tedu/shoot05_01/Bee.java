package cn.tedu.shoot05_01;

public class Bee extends FlyingObject {
	// �p�e��

//	int width;
//	int height;
//	int x;
//	int y;
	private int xStep; // X���Ш��B
	private int yStep; // y���Ш��B
	private int awardType; // ���y����

	public Bee() {
		width = 60;
		height = 50;
		x = (int) (Math.random() * (400 - this.width));
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
