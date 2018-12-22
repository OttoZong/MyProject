package cn.tedu.shoot04_Demo;

public class BigAirplane extends FlyingObject {
	
	int step;
	
	//建構子(建構方法)
	BigAirplane(){
		width = 66;
		height = 99;
		x = (int)(Math.random()*(400-this.width));
		y = -this.height;
		step = 2;
	}
	
	void step() {
		System.out.println("大戰機y移動了" + step);
	}
}
