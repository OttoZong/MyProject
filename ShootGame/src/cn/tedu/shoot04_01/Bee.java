package cn.tedu.shoot04_01;

public class Bee {
	// �p�e��

	int width;
	int height;
	int x;
	int y;
	int xStep; // X���Ш��B
	int yStep; // y���Ш��B
	int awardType; // ���y����

	Bee() {
		width = 60;
		height = 50;
		x = (int) (Math.random() * (400 - this.width));
		y = -this.height;
		xStep = 1;
		yStep = 2;
		awardType = (int) (Math.random() * 2);
	}

//	�p�e�����BStep()
	void step() {
		System.out.println("�p�e��x���в��ʤF" + xStep);
		System.out.println("�p�e��y���в��ʤF" + yStep);
	}
}
