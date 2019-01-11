package cn.tedu.shoot04_Demo;

//小敵機
public class Airplane extends FlyingObject{

	int step;
	
	public Airplane(){
		width=49;
		height=36;
		x= (int)(Math.random()*(400-this.width));
		y= -this.height;
		step = 2;
	}
	
	
//	小敵機走步step()
	void step() {
		System.out.println("小敵機Y座標移動了" + step);
	}
}
