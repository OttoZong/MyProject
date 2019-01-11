package cn.tedu.shoot04_Demo;

public class Bee extends FlyingObject {
	// 小蜜蜂

	int xStep; // x坐標走步
	int yStep; // y坐標走步
	int awardType; // 獎勵類型

	public Bee() {
		width = 60;
		height = 50;
		x = (int) (Math.random() * (400 - this.width));
		y = -this.height;
		xStep = 1;
		yStep = 2;
		awardType = (int) (Math.random() * 2);
	}
	
//	小蜜蜂走步Step()
	void step() {
		System.out.println("小蜜蜂x坐標移動了" + xStep);
		System.out.println("小蜜蜂y坐標移動了" + yStep);
	}
}
