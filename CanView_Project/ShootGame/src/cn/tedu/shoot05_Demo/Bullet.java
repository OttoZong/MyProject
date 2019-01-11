package cn.tedu.shoot05_Demo;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Bullet extends FlyingObject {
	private static BufferedImage image;
	static {
		image = loadImage("bullet.png");
	}
	
	private int step;

	// �سy��k
	public Bullet(int x, int y) {
		width = 8;
		height = 14;
		this.x = x;
		this.y = y;
		step = 3;
	}

	// �l�u���Bstep();
	public void step() {
		System.out.println("�l�uy���ʤF" + step);
	}
}
