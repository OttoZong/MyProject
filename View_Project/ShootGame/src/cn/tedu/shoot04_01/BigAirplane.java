package cn.tedu.shoot04_01;

public class BigAirplane {
	int width;
	int height;
	int x;
	int y;
	int step;

	// �سy��k
	BigAirplane() {
		width = 66;
		height = 99;
		x = (int) (Math.random() * (400 - this.width));
		y = -this.height;
		step = 2;
	}

	void step() {
		System.out.println("�j�Ծ�y���ʤF" + step);
	}
}
