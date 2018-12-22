package cn.tedu.shoot04_03;

import javax.swing.*; //��k1.
//import javax.swing.JFrame;	//��k2.
//import javax.swing.JPanel;

public class World02 extends JPanel {
	Sky sky;
	Hero hero;
	FlyingObject[] enemies = {};
	Bullet[] bullets = {};

	void action() { // ���դ�k
		sky = new Sky();
		hero = new Hero();
		enemies = new FlyingObject[9];
		enemies[0] = new Airplane();
		enemies[1] = new Airplane();
		enemies[2] = new Airplane();
		enemies[3] = new BigAirplane();
		enemies[4] = new BigAirplane();
		enemies[5] = new BigAirplane();
		enemies[6] = new Bee();
		enemies[7] = new Bee();
		enemies[8] = new Bee();

		bullets = new Bullet[3];
		bullets[0] = new Bullet(100, 200);
		bullets[1] = new Bullet(100, 230);
		bullets[2] = new Bullet(100, 260);

		sky.step();
		hero.step();
		hero.moveTo(100, 200);

		for (int i = 0; i < enemies.length; i++) {
			enemies[i].step();
		}
		for (int i = 0; i < bullets.length; i++) {
			bullets[i].step();
		}

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		World02 world = new World02();
		frame.add(world);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 700);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		world.action();

	}
}
