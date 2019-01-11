package cn.tedu.shoot_02;

public class World {
	Sky sky;
	Hero hero;
	Airplane airplane;
	BigAirplane bigAirplane;
	Bee bee;
	Bullet bullet;
	
	void action() {
		sky =new Sky();
		hero = new Hero();
		airplane = new Airplane();
		bee = new Bee();
		bullet = new Bullet(100,200);
		
		sky.step();
		hero.step();
		hero.moveTo(100, 200);
		airplane.step();
		bigAirplane.step();
		bee.step();
		bullet.step();
		
	}
	public static void main(String[] args) {
		World world = new World();
		world.action();
	}
}
