package cn.tedu.shoot04_03;


public class Bee extends FlyingObject {
	// �p�e��

	int xStep; // X���Ш��B
	int yStep; // y���Ш��B
	int awardType; // ���y����

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
