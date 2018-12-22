package cn.tedu.shoot04_01;

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
		as = new Airplane[3];
		as[0]= new Airplane();
		as[1]= new Airplane();
		as[2]= new Airplane();
		
		bas = new BigAirplane[3];
		bas[0]= new BigAirplane();
		bas[1]= new BigAirplane();
		bas[2]= new BigAirplane();
		
		bs = new Bee[3];
		bs[0]= new Bee();
		bs[1]= new Bee();
		bs[2]= new Bee();
		
		bullets = new Bullet[3];
		bullets[0]= new Bullet(100,200);
		bullets[1]= new Bullet(100,230);
		bullets[2]= new Bullet(100,260);
		
		sky.step();
		hero.step();
		hero.moveTo(100, 200);
		
		for(int i=0;i<as.length;i++) {
			as[i].step();
		}
		for(int i=0;i<bas.length;i++) {
			bas[i].step();
		}
		for(int i=0;i<bs.length;i++) {
			bs[i].step();
		}
		for(int i=0;i<bullets.length;i++) {
			bullets[i].step();
		}
		
	}
	public static void main(String[] args) {
		World world = new World();
		world.action();
	}
}
