package cn.tedu.shoot05_Demo;

import javax.swing.*; //方法1.
//import javax.swing.JFrame;	//方法2.
//import javax.swing.JPanel;

public class World02 extends JPanel {
	public static final int width = 400;		
	public static final int height = 700;	//宣告固定寬高
	
	private Sky sky = new Sky();
	private Hero hero = new Hero();
	private FlyingObject[] enemies = {};
	private Bullet[] bullets = {};

	public void action() { // 啟動執行

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
		frame.setSize(WIDTH, HEIGHT);		//代值
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		world.action();

	}
}
