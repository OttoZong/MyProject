package cn.tedu.shoot05_01;

public class Bullet extends FlyingObject {
//	int width;
//	int height;
//	int x;
//	int y;
	private int step;

	// 建造方法
	public Bullet(int x, int y) {
		width = 8;
		height = 14;
		this.x = x;
		this.y = y;
		step = 3;
	}

	// 子彈走步step();
	public void step() {
		System.out.println("子彈y移動了" + step);
	}
}
