package Day11;


/**
 * Map是查詢速度最快的數據結構,內部使用數組存放元素.
 * 但是HashMap是根據key這個元素的hashcode值,
 * 決定這組鍵值對在數組中的位子並進行保存,
 * 取的時候就可以直接將key元素的hashcode值,
 * 計算位置從數組中取出,省去了直接使用數組需要遍歷查找元素的步驟.
 * 
 * 由於作為key的元素的hashcode決定其在HashMap內部數組位置,
 * 而equals決定key是否重複,那麼這兩個方法直接決定了HashMap中,
 * 是否會出現鏈表的情況.
 * 當兩個key的hashcode值相同時,它們經過散列算法計算後,
 * 在數組中的位置一定是一樣的,但是若equals比較不為true,
 * 那麼HashMap認為這是兩個不同的key,則會在數組該位置用鏈表的結構保存這兩組鍵值.
 * 
 * 遍歷鏈表會降低HashMap的查詢性能.所以要盡量避免.
 * 
 * Object類在API手冊上對這兩個方法的重寫有所說明.
 * 本身API提供的類這兩個方法都有妥善的重寫.
 * 但當我們自己定義的類,若作為HashMap中的key使用時,
 * 對於equals和hashcode方法的重寫需要做到以下幾點:
 * 1.成對重寫,即:若重寫equals方法就要連同重寫hashcode方法.
 * 2.一致性,即:兩個對象若equals比較為true,
 * 那麼hashcode方法返回的數字必須相等.
 * 反過來雖然不是必需的,但是盡量保證當兩個對象hashcode相等時,
 * equals比較也為true,否則會在HashMap中出現鏈表.
 * 3.穩定性,即:當多次調用hashcode方法,返回的數字應當不變.
 * 但是若當前對象參與equals比較的屬性值發生了改變,
 * hashcode方法返回的數字可以改變.
 * 
 * @author Otto
 *
 */
public class key {
	private int x;
	private int y;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		key other = (key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	

}
