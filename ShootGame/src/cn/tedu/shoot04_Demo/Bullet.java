package cn.tedu.shoot04_Demo;

public class Bullet extends FlyingObject{
	
	int step;
	
//	�غc�l(�غc��k)
	Bullet(int x,int y){
		width=8;
		height=14;
		this.x=x;
		this.y=y;
		step=3;
	}
	
//	�l�u���Bstep();
	void step() {
		System.out.println("�l�uy���ʤF"+step);
	}

}
