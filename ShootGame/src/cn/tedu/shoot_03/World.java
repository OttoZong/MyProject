package cn.tedu.shoot_03;

public class World {
	Sky sky;
	Hero hero;
	Airplane[] as = {};
	BigAirplane[] bas= {};
	Bee[] bs= {};
	Bullet[] bullets = {};
	
	void action() {  //´ú¸Õ¤èªk
		sky =new Sky();
		hero = new Hero();
		Airplane airplane = new Airplane();
		BigAirplane bigAirplane = new BigAirplane();
		Bee bee = new Bee();
		Bullet bullet = new Bullet(100,200);
		
		System.out.println(sky.width+","+sky.height+","+sky.x+","+sky.step+","+sky.y1);
		System.out.println(hero.width+","+hero.height+","+airplane.x+","+airplane.y+","+bigAirplane.step);
		System.out.println(airplane.width+","+airplane.height+","+bigAirplane.x+","+bigAirplane.y+","+bigAirplane.step);
		System.out.println(bee.width+","+bee.height+","+bee.x+","+bee.y+","+bee.xStep+","+bee.yStep+","+bee.awardType);
		System.out.println(bullet.width+","+bullet.height+","+bullet.x+","+bullet.y+","+bullet.step);
	}
	public static void main(String[] args) {
		World world = new World();
		world.action();
	}
}
