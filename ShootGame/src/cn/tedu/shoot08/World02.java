package cn.tedu.shoot08;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*; //方法1.
//import javax.swing.JFrame;	//方法2.
//import javax.swing.JPanel;

public class World02 extends JPanel {
	public static final int WIDTH = 400;
	public static final int HEIGHT = 700; // 宣告固定寬高

	private Sky sky = new Sky();
	private Hero hero = new Hero();
	private FlyingObject[] enemies = {}; // 敵人數組
	private Bullet[] bullets = {}; // 子彈數組

	public FlyingObject nextOne() {
		Random rand = new Random();
		int type = rand.nextInt(20);
		if (type < 4) {
			return new Bee();
		} else if (type < 15) {
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

	public void stepAction() {
		sky.step();
		for (int i = 0; i < enemies.length; i++) {
			enemies[i].step();
		}
		for (int i = 0; i < bullets.length; i++) {
			bullets[i].step();
		}
	}

	int shootIndex = 0;

	public void shootAction() {
		shootIndex++;
		if (shootIndex % 30 == 0) {
			Bullet[] bs = hero.shoot();
			bullets = Arrays.copyOf(bullets, bullets.length + bs.length);
			System.arraycopy(bs, 0, bullets, bullets.length - bs.length, bs.length);
		}
	}

	public void outOfBoundsAction() {
		int index = 0;
		FlyingObject[] enemyLives = new FlyingObject[enemies.length];
		for (int i = 0; i < enemies.length; i++) {
			FlyingObject e = enemies[i];
			if (!e.outOfBounds() && !e.isRemove()) {
				enemyLives[index++] = e;
			}
		}
		enemies = Arrays.copyOf(enemyLives, index);

		index = 0;
		Bullet[] bulletLives = new Bullet[bullets.length];
		for (int i = 0; i < bullets.length; i++) {
			Bullet b = bullets[i];
			if (!b.outOfBounds() && !b.isRemove()) {
				bulletLives[index++] = b;
			}
		}
		bullets = Arrays.copyOf(bulletLives, index);
	}

	int score = 0;

	public void bangAction() {
		for (int i = 0; i < bullets.length; i++) {
			Bullet b = bullets[i];
			for (int j = 0; j < enemies.length; j++) {
				FlyingObject f = enemies[j];
				if (b.isLife() && f.isLife() && b.hit(f)) {
					b.goDead();
					f.goDead();
					if (f instanceof Enemy) {
						Enemy e = (Enemy) f;
						score += e.getScore();
					}
					if (f instanceof Award) {
						Award a = (Award) f;
						int type = a.getType();
						switch (type) {
						case Award.FIRE:
							hero.addFire();
							break;
						case Award.LIFE:
							hero.addLife();
							break;
						}
					}
				}
			}
		}
	}

	public void action() { // 啟動執行
		MouseAdapter l = new MouseAdapter() {
			public void mouseMoved(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				hero.moveTo(x, y);
			}
		};
		this.addMouseListener(l);
		this.addMouseMotionListener(l);

		Timer timer = new Timer();
		int intervel = 10;
		timer.schedule(new TimerTask() {
			public void run() {
				enterAction();
				stepAction();
				shootAction();
				outOfBoundsAction();
				bangAction();
				repaint();
			}
		}, intervel, intervel);
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

		g.drawString("SCORE:" + score, 10, 25);
		g.drawString("LIFE:" + hero.getLife(), 10, 45);
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
