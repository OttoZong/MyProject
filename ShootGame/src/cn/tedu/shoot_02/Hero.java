package cn.tedu.shoot_02;

public class Hero {
	int width;
	int height;
	int x;
	int y;
	int life;
	int Fire;
	
	void step() {
		System.out.println("英雄機切換圖片啦!");
	}
	
//	英雄機隨著滑鼠動 X:滑鼠X軸座標 Y:滑鼠Y軸座標
	void moveTo(int x,int y) {
		System.out.println("英雄機隨機滑鼠動");
	}
	
	
}
