package cn.tedu.shoot04_03;


public class Hero extends FlyingObject {
	int width;
	int height;
	int x;
	int y;
	int life;
	int Fire;
	
	
	//�غc�l(�غc��k)
	public Hero(){
		width = 97;
		height = 124;
		x = 140;
		y = 400;
		life = 3;
		Fire = 0;
	}
	
	public void step() {
		System.out.println("�^���������Ϥ��աI");
	}
	
	
//	�^�����H�۷ƹ��� X:�ƹ�X�b�y�� Y:�ƹ�Y�b�y��
	public void moveTo(int x,int y) {
		System.out.println("�^�����H���ƹ���");
	}
	
	
}
