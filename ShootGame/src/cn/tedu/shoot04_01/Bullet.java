package cn.tedu.shoot04_01;

public class Bullet {
	int width;
	int height;
	int x;
	int y;
	int step;
	
	//	建造方法
	Bullet(int x, int y) {
		width = 8;
		height = 14;
		this.x = x;
		this.y = y;
		step = 3;
	}

	//	子彈走步step();
	void step() {
		System.out.println("子彈y移動了"+step);
	}
}
