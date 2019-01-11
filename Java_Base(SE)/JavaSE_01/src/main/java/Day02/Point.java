package Day02;
/**
 * 使用該類學習Object的相關方法的重寫
 * 
 * 假設Point表示直角坐標系中的一個點
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
	 * 通常我們需要使用一個類的toString方法時
	 * 就應當重寫該方法,因為Object提供的方法
	 * 返回當前對象的句柄,沒有什麼實際意義.
	 * JAVA API提供的類基本都重寫了.只有我們
	 * 自己定義的類在使用時須要重寫該方法.
	 * 返回的字符串沒有具體格式要求,原則是
	 * 返回的字符串中應當包含當前對象的屬性訊息.
	 */
	public String toString() {
		//(1,2)
		return "("+x+","+y+")";
	}
	/**
	 * equals方法的重寫原則是定義當前對象與
	 * 參數對象內容是否一致的判斷條件
	 */
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj == this) {
			return true;
		}
		/*
		 * instanceof判斷某一個對象輸出某一個類型.
		 */
		if(obj instanceof Point) {
			Point p = (Point)obj;
			//內容比較
			return this.x==p.x&&this.y==p.y;
		}
		
		return false;
	}
}
