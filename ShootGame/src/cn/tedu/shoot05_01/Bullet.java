package cn.tedu.shoot05_01;

public class Bullet extends FlyingObject {
//	int width;
//	int height;
//	int x;
//	int y;
	private int step;

	// �سy��k
	public Bullet(int x, int y) {
		width = 8;
		height = 14;
		this.x = x;
		this.y = y;
		step = 3;
	}

	// �l�u���Bstep();
	public void step() {
		System.out.println("�l�uy���ʤF" + step);
	}
}
