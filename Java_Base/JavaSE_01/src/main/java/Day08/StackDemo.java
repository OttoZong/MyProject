package Day08;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ��(stack)���c
 * ��(stack)�]�i�H�s���@�դ���,�s������������`���i���X��h.
 * 
 * ��(stack)�i�H�ϥ����ݶ��CDeque��{.
 * Deque����(stack)��W���ѤF�J�̤ΥX�̪���k
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
		 * �u�Xfive����
		 */
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
		/*
		 * �̧Ǽu�X����
		 */
		while(stack.size()>0) {
			str = stack.pop();
			System.out.println(str);
		}
		System.out.println(stack);
	}
}
