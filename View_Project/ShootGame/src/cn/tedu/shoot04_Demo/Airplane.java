package cn.tedu.shoot04_Demo;

//�p�ľ�
public class Airplane extends FlyingObject{

	int step;
	
	public Airplane(){
		width=49;
		height=36;
		x= (int)(Math.random()*(400-this.width));
		y= -this.height;
		step = 2;
	}
	
	
//	�p�ľ����Bstep()
	void step() {
		System.out.println("�p�ľ�Y�y�в��ʤF" + step);
	}
}
