package cn.tedu.shoot_01;

public class Bee {
	//小蜜蜂
	
	int width;
	int height;
	int x;
	int y;
	int xStep;		//X坐標走步
	int yStep;		//y坐標走步
	int awardType;	//獎勵類型
	
//	小蜜蜂走步Step()
	void step() {
		System.out.println("小蜜蜂x坐標移動了"+xStep);
		System.out.println("小蜜蜂y坐標移動了"+yStep);
	}
}
