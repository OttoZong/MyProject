import java.util.ArrayList;
import java.util.TreeSet;

/*
 * 题目描述
 *	输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 *	例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。 
 *	输入描述:
 *	输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 * */
public class Permutation {
	   /**
     * 求字符数组的排列
     *
     * @param chars 待排列的字符串
     * @param begin 当前处理的位置
     */
    public static void permutation(char[] chars, int begin) {
        // 如果是最后一个元素了，就输出排列结果
        if (chars.length - 1 == begin) {
            System.out.print(new String(chars) + " ");
        } else {
            char tmp;
            // 对当前还未处理的字符串进行处理，每个字符都可以作为当前处理位置的元素
            for (int i = begin; i < chars.length; i++) {
                // 下面是交换元素的位置
                tmp = chars[begin];
                chars[begin] = chars[i];
                chars[i] = tmp;

                // 处理下一个位置
                permutation(chars, begin + 1);
            }
        }
    }

    public static void main(String[] args) {
//        char[] c1 = {'a', 'b', 'c'};
//        permutation(c1, 0);
//        System.out.println();

        char[] c = {'a', 'b', 'c', 'd'};
        permutation(c, 0);
    }
}
