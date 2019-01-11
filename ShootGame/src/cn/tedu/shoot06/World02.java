package cn.tedu.shoot06;

import java.awt.Graphics;
import java.util.Arrays;
import java.util.Random;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.*; //方法1.
//import javax.swing.JFrame;	//方法2.
//import javax.swing.JPanel;

public class World02 extends JPanel {
	public static final int width = 400;
	public static final int height = 700; // 宣告固定寬高

	private Sky sky = new Sky();
	private Hero hero = new Hero();
	private FlyingObject[] enemies = {}; // 敵人數組
	private Bullet[] bullets = {}; // 子彈數組

	public FlyingObject nextOne() {
		Random rand = new Random();
		int type = rand.nextInt(20);
		if (type < 4) {
			return new Bee();
		} else if (type < 13) {
			return new Airplane();
		} else {
			return new BigAirplane();
		}
	}

	int flyEnterIndex = 0;

	public void enterAction() {
		flyEnterIndex++;
		if (flyEnterIndex % 40 == 0) {
			FlyingObject obj = nextOne();
			enemies = Arrays.copyOf(enemies, enemies.length + 1);
			enemies[enemies.length - 1] = obj;
		}
	}

	public void action() { // 啟動執行

		Timer timer = new Timer();
		int intervel = 10;
		timer.schedule(new TimerTask() {
			public void run() {
				enterAction();
				repaint();
			}
		}, intervel, intervel);

//		enemies = new FlyingObject[9];
//		enemies[0] = new Airplane();
//		enemies[1] = new Airplane();
//		enemies[2] = new Airplane();
//		enemies[3] = new BigAirplane();
//		enemies[4] = new BigAirplane();
//		enemies[5] = new BigAirplane();
//		enemies[6] = new Bee();
//		enemies[7] = new Bee();
//		enemies[8] = new Bee();
//
//		bullets = new Bullet[3];
//		bullets[0] = new Bullet(100, 200);
//		bullets[1] = new Bullet(100, 230);
//		bullets[2] = new Bullet(100, 260);
//
//		sky.step();
//		hero.step();
//		hero.moveTo(100, 200);
//
//		for (int i = 0; i < enemies.length; i++) {
//			enemies[i].step();
//		}
//		for (int i = 0; i < bullets.length; i++) {
//			bullets[i].step();
//		}

	}

	public void paint(Graphics g) {
		sky.paint(g);
		hero.paint(g);
		for (int i = 0; i < enemies.length; i++) {
			enemies[i].paint(g);
		}
		for (int i = 0; i < bullets.length; i++) {
			bullets[i].paint(g);
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		World02 world = new World02();
		frame.add(world);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH, HEIGHT); // 代值
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		world.action();

	}
}
