package cn.tedu.shoot05_03;

//import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;


public class FlyingObject {
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	
	public static final int LIFE=0;
	public static final int DEAD=1;
	public static final int REMOVE=2;
	protected int state = LIFE;
	
	public static BufferedImage loadImage(String fileName)
	{
		System.out.println(fileName);
		try {
			BufferedImage img= ImageIO.read(FlyingObject.class.getResource(fileName));
			return img;
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public void step() {
		System.out.println("飛行物移動了");
	}
}
