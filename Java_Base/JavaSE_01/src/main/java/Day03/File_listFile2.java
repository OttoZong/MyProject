package Day03;

import java.io.File;
import java.io.FileFilter;
/**
 * �L�o��
 * @author Otto
 *
 */

public class File_listFile2 {
	public static void main(String[] args) {
		/*
		 * �����e�ؿ����Ҧ��W�l�H"."�}�Y���l��
		 */
		File dir = new File(".");
		FileFilter filter = new FileFilter() {
			/**
			 * �K�[�L�o����,�u�n�{���ѼƵ��w��file
			 * �����n�D,�h��^true�Y�i
			 */
			public boolean accept(File file) {
				String name = file.getName();
				System.out.println("���b�L�o:"+name);
				return name.startsWith(".");
			}
		};
		File[] subs = dir.listFiles(filter);
		for(int i=0;i<subs.length;i++) {
			System.out.println(subs[i].getName());
		}
	}

}
