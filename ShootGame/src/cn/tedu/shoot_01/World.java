package cn.tedu.shoot_01;

public class World {
	Sky sky;
	Hero hero;
	Airplane a1;
	Airplane a2;
	BigAirplane ba1;
	BigAirplane ba2;
	Bee b1;
	Bee b2;
	Bullet bt1;
	Bullet bt2;

	void action() {
		sky = new Sky();
		sky.width=400;
		sky.height=700;
		sky.x = 0;
		sky.y = 0;
		sky.step = 1;
		sky.y1 = -sky.height;
		
		hero = new Hero();
		hero.width = 97;
		hero.height = 124;
		hero.x = 140;
		hero.y = 400;
		hero.life = 3;
		hero.Fire = 0;
		
		a1 = new Airplane();
		a1.width = 49;
		a1.height = 36;
		a1.x = (int)(Math.random()*(400-a1.width));
		a1.step = 2;
		a2 = new Airplane();
		a2.width = 49;
		a2.height = 36;
		a2.x = (int)(Math.random()*(400-a2.width));
		a2.y = -a2.height;
		a2.step = 2;
		
		ba1 = new BigAirplane();
		ba1.width = 66;
		ba1.height = 99;
		ba1.x =(int)(Math.random()*(400-ba1.width));
		ba1.y = -ba1.height;
		ba1.step = 2;
		ba2 = new BigAirplane();
		ba2.width = 66;
		ba2.height = 99;
		ba2.x = (int)(Math.random()*(400-ba2.width));
		ba2.y = -ba2.height;
		ba2.step = 2;
		
		b1 = new Bee();
		b1.width = 60;
		b1.height = 50;
		b1.x = (int)(Math.random()*(400-b1.width));
		b1.y = -b1.height;
		b1.xStep= 1;
		b1.yStep= 2;
		b1.awardType=(int)(Math.random()*2);
		b2 = new Bee();
		b2.width = 60;
		b2.height= 50;
		b2.x = (int)(Math.random()*(400-b2.width));
		b2.y = -b2.height;
		b2.xStep = 1;
		b2.yStep = 2;
		b2.awardType = (int)(Math.random()*2);
		
		bt1 = new Bullet();
		bt1.width = 8;
		bt1.height = 14;
		bt1.x = 100;
		bt1.y = 200;
		bt1.step = 3;
		bt2 = new Bullet();
		bt2.width = 8;
		bt2.height = 14;
		bt2.x = 100;
		bt2.y = 240;
		bt2.step = 3;
		
		sky.step();
		hero.step();
		hero.moveTo(100,200);
		a1.step();
		a2.step();
		ba1.step();
		ba2.step();
		b1.step();
		b2.step();
		bt1.step();
		
	}
}