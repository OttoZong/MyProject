package cn.tedu.shoot04_03;


public class BigAirplane extends FlyingObject {

	int step;

	// �غc�l(�غc��k)
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
