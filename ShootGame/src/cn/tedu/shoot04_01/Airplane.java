package cn.tedu.shoot04_01;

//***�p�ľ�***
public class Airplane {
	int width;
	int height;
	int x;
	int y;
	int step;

	Airplane() {
		width = 49;
		height = 36;
		x = (int) (Math.random() * (400 - this.width));
		y = -this.height;
		step = 2;
	}

//	�p�ľ����Bstep()
	void step() {
		System.out.println("�p�ľ�Y�y�в��ʤF" + step);
	}
}
