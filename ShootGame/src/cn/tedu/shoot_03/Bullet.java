package cn.tedu.shoot_03;

public class Bullet {
	int width;
	int height;
	int x;
	int y;
	int step;
	
	//	�سy��k
	Bullet(int i, int j) {
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
