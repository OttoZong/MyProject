package Day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * �Ʋ��ഫ�����X
 * �Ʋ��ഫ�����X�ݭn�ϥΦh�ժ��u����Arrays
 * ���Ѫ���kasList
 * �ӸӤ�k�u��N�Ʋ��ഫ��List���X
 */
public class ArrayToListDemo {
	public static void main(String[] args) {
		String[] array= {"one","two","three","four"};
		
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		//�קﶰ�X�����N�O�ק��Ʋչ�������
		list.set(1, "2");
		System.out.println(list);
		for(String str : array) {
			System.out.println(str);
		}
		/*
		 * �K�[�s�����|�ߥX���`,�]���K�[�s�����|�ɭP��Ʋ��X�e,
		 * ���O�X�e�N���A�O���ƲդF,�ҥH�����\�o�˪��ާ@.
		 */
//		list.add("five");
		/*
		 * �Ҧ����X������@�Ӻc�y��k
		 * �i�H�ǤJ�t�@�Ӷ��X,�@�άO�b�Ыط�e���X,
		 * �P�ɥ]�t���w���X�����Ҧ�����.
		 */
		List<String> list1 = new ArrayList<String>();
		list1.addAll(list);
		list1.add("five");
		System.out.println(list1);
	}
}
