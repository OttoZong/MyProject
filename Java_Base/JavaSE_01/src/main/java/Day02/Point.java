package Day02;
/**
 * �ϥθ����ǲ�Object��������k�����g
 * 
 * ���]Point��ܪ������Шt�����@���I
 * @author Otto
 *
 */
public class Point {
	private int x;
	private int y;
	
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * �q�`�ڭ̻ݭn�ϥΤ@������toString��k��
	 * �N�����g�Ӥ�k,�]��Object���Ѫ���k
	 * ��^��e��H���y�`,�S�������ڷN�q.
	 * JAVA API���Ѫ����򥻳����g�F.�u���ڭ�
	 * �ۤv�w�q�����b�ϥήɶ��n���g�Ӥ�k.
	 * ��^���r�Ŧ�S������榡�n�D,��h�O
	 * ��^���r�Ŧꤤ����]�t��e��H���ݩʰT��.
	 */
	public String toString() {
		//(1,2)
		return "("+x+","+y+")";
	}
	/**
	 * equals��k�����g��h�O�w�q��e��H�P
	 * �Ѽƹ�H���e�O�_�@�P���P�_����
	 */
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj == this) {
			return true;
		}
		/*
		 * instanceof�P�_�Y�@�ӹ�H��X�Y�@������.
		 */
		if(obj instanceof Point) {
			Point p = (Point)obj;
			//���e���
			return this.x==p.x&&this.y==p.y;
		}
		
		return false;
	}
}
