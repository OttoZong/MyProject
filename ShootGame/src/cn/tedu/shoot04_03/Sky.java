package cn.tedu.shoot04_03;


public class Sky extends FlyingObject {

	int step;
	int y1; //天空移動
	
//	建構子(建構方法)
	public Sky(){
		width = 400;
		height = 700;
		x= 0;
		y= 0;
		step= 1;
		y1= -this.height;
	
	}
	
	public void step() {
		System.out.println("天空y移動了"+step);
	}
	
}
