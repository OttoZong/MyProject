package cn.tedu.shoot05_01;

//***小敵機***
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

//	小敵機走步step()
	public void step() {
		System.out.println("小敵機Y座標移動了" + step);
	}
}
