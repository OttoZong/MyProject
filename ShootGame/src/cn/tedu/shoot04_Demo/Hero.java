package cn.tedu.shoot04_Demo;

public class Hero extends FlyingObject {

	int width;
	int height;
	int x;
	int y;
	int life;
	int Fire;

	// �غc�l(�غc��k)
	Hero() {
		width = 97;
		height = 124;
		x = 140;
		y = 400;
		life = 3;
		Fire = 0;
	}

	void step() {
		System.out.println("�^���������Ϥ��աI");
	}

//	�^�����H�۷ƹ��� X:�ƹ�X�b�y�� Y:�ƹ�Y�b�y��
	void moveTo(int x, int y) {
		System.out.println("�^�����H���ƹ���");
	}

}
