package cn.tedu.shoot04_Demo;

public class Sky extends FlyingObject {

	int step;
	int y1; // �ѪŲ���

//	�غc�l(�غc��k)
	Sky() {
		width = 400;
		height = 700;
		x = 0;
		y = 0;
		step = 1;
		y1 = -this.height;
	}

	void step() {
		System.out.println("�Ѫ�y���ʤF" + step);
	}
}
