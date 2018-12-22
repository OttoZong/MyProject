package cn.tedu.shoot_03;

public class BigAirplane {
	int width;
	int height;
	int x;
	int y;
	int step;

	// 建造方法
	BigAirplane() {
		width = 66;
		height = 99;
		x = (int) (Math.random() * (400 - this.width));
		y = -this.height;
		step = 2;
	}

	void step() {
		System.out.println("大戰機y移動了" + step);
	}
}
