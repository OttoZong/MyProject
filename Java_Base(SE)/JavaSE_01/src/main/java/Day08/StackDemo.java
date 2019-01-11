package Day08;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 棧(stack)結構
 * 棧(stack)也可以存取一組元素,存取元素必須遵循先進先出原則.
 * 
 * 棧(stack)可以使用雙端隊列Deque實現.
 * Deque為棧(stack)單獨提供了入棧及出棧的方法
 * @author Otto
 *
 */
public class StackDemo {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<String>();
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		stack.push("five");
		System.out.println(stack);
		/*
		 * 彈出five元素
		 */
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
		/*
		 * 依序彈出元素
		 */
		while(stack.size()>0) {
			str = stack.pop();
			System.out.println(str);
		}
		System.out.println(stack);
	}
}
