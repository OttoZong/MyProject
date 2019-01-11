package cn.tedu.shoot04_Demo;

import javax.swing.*;

import cn.tedu.shoot04_03.Airplane;
import cn.tedu.shoot04_03.Bee;
import cn.tedu.shoot04_03.BigAirplane;
import cn.tedu.shoot04_03.Bullet;
import cn.tedu.shoot04_03.FlyingObject;
import cn.tedu.shoot04_03.Hero;
import cn.tedu.shoot04_03.Sky;

public class World extends JPanel {
	Sky sky;
	Hero hero;
	FlyingObject[] enemies = {};
	Bullet[] bullets = {};

	void action() { // ´ú¸Õ¤èªk
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
		World world = new World();
		frame.add(world);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 700);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		world.action();
	}

}
