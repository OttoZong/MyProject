package Day08;
/**
 * �@���۩w�q������������Collections��List���X���Ƨ�.
 * @author Otto
 *
 */
public class Point implements Comparable<Point>{
	private int x;
	private int y;

	public Point() {
		
	}

	public Point(int i, int j) {
		
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

	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
	/**
	 * ���{�FComparable���f,�N�n�D�������gcompareTo��k.
	 * �Ӥ�k���@�άO�w�q��e��H(this)�P�Ѽƹ�H(o).
	 * ����������j�p�W�h.
	 * ��^�Ȭ��@��int��,�ӭȤ����`�������,
	 * ���`���O���Ƚd��:
	 * ���^��>0��,��ܷ�e��H�j��Ѽƹ�H(this>o).
	 * ���^��<0��,��ܷ�e��H�p��Ѽƹ�H(this<o).
	 * ���^��=0��,��ӹ�H�۵�.
	 */
	public int compareTo(Point o) {
		int len = this.x*this.x+this.y*this.y;
		int olen = o.x*o.x+o.y+o.y;
		//�D�X����,����j�p.
		return len-olen;
	}
	
}


