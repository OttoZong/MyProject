package cn.tedu.shoot05_01;

public class BigAirplane extends FlyingObject {
//	int width;
//	int height;
//	int x;
//	int y;
	private int step;

	// �سy��k
	public BigAirplane() {
		width = 66;
		height = 99;
		x = (int) (Math.random() * (400 - this.width));
		y = -this.height;
		step = 2;
	}

	public void step() {
		System.out.println("�j�Ծ�y���ʤF" + step);
	}
}
