package cn.tedu.shoot05_01;

//***�p�ľ�***
public class Airplane extends FlyingObject {
	private int step;
//	int step;

	public Airplane() {
		width = 49;
		height = 36;
		x = (int) (Math.random() * (400 - this.width));
		y = -this.height;
		step = 2;
	}

//	�p�ľ����Bstep()
	public void step() {
		System.out.println("�p�ľ�Y�y�в��ʤF" + step);
	}
}