package cn.tedu.shoot05_01;

public class Sky extends FlyingObject {
//	int width;
//	int height;
//	int x;
//	int y;
	private int step;
	private int y1; // 天空移動

//	建構方法
	public Sky() {
		width = 400;
		height = 700;
		x = 0;
		y = 0;
		step = 1;
		y1 = -this.height;

	}

	public void step() {
		System.out.println("天空y移動了" + step);
	}

}
