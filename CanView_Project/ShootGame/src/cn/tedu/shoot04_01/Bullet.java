package cn.tedu.shoot04_01;

public class Bullet {
	int width;
	int height;
	int x;
	int y;
	int step;
	
	//	�سy��k
	Bullet(int x, int y) {
		width = 8;
		height = 14;
		this.x = x;
		this.y = y;
		step = 3;
	}

	//	�l�u���Bstep();
	void step() {
		System.out.println("�l�uy���ʤF"+step);
	}
}
