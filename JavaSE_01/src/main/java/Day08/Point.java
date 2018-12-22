package Day08;
/**
 * 作為自定義類型元素測試Collections對List集合的排序.
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
	 * 當實現了Comparable接口,就要求必須重寫compareTo方法.
	 * 該方法的作用是定義當前對象(this)與參數對象(o).
	 * 之間的比較大小規則.
	 * 返回值為一個int值,該值不關注具體取值,
	 * 關注的是取值範圍:
	 * 當返回值>0時,表示當前對象大於參數對象(this>o).
	 * 當返回值<0時,表示當前對象小於參數對象(this<o).
	 * 當返回值=0時,兩個對象相等.
	 */
	public int compareTo(Point o) {
		int len = this.x*this.x+this.y*this.y;
		int olen = o.x*o.x+o.y+o.y;
		//求出長度,比較大小.
		return len-olen;
	}
	
}


