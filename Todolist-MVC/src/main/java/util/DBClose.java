package util;

public class DBClose {
	/**
	 * 釋放資源.
	 * @param obj 需要關閉的對象,可以是Connection、statement、ResultSet對象.
	 */
	public static void close(
			AutoCloseable...obj){
		for(int i =0;i<obj.length;i++){
			if(obj[i] != null){
				try{
					obj[i].close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
}
