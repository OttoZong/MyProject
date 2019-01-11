package cn.tedu.shoot05_Demo;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Hero extends FlyingObject {
	private static BufferedImage[] images;
	static {
		images = new BufferedImage[6];
		for (int i = 0; i < images.length; i++) {
			images[i] = loadImage("hero" + i + ".png");
		}
	}

	private int life; // 生命值
	private int Fire; // 火力值

	// 建構子(建構方法)
	public Hero() {
		width = 97;
		height = 124;
		x = 140;
		y = 400;
		life = 3;
		Fire = 0;
	}

	public void step() {
		System.out.println("英雄機切換圖片啦！");
	}

//	英雄機隨著滑鼠動 X:滑鼠X軸座標 Y:滑鼠Y軸座標
	public void moveTo(int x, int y) {
		System.out.println("英雄機隨機滑鼠動");
	}

}
