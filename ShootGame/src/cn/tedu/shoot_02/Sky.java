package cn.tedu.shoot_02;

public class Sky {
	int width;
	int height;
	int x;
	int y;
	int step;
	int y1; //�ѪŲ���
	
	Sky(){
		width = 400;
		height = 700;
		x = 0;
		y = 0;
		step = 1;
		y1 = -this.height;
	}
	
	// �ѪŨ��Bstep()
	void step() {
		System.out.println("�Ѫ�y���ʤF"+step);
	}
}
