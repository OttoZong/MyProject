package Day03;

import java.io.File;

/**
 * java.io.File input output File�Ω��ܾާ@�t�Τ�
 * ���t�θ̪��@�Ӥ��Υؿ� 
 * �ϥ�File�i�H:
 * �d�ݸӤ��Υؿ����ݩʰT��(�W�l,�j�p��) 
 * �ާ@���Υؿ�(�Ы�,�R����) 
 * ���O����ϥ�File�X�ݤ�󪺼ƾ�
 * 
 * �g���|���ɭԡA��ĳ�ϥά۹���|�A
 * �]�����P���ާ@�t�ε����m���@�P�A
 * �|�ɭP�󥭥x�X�{���D�A
 * File����@�ӱ`�qSeparator,
 * ����ܤ@�ӷ�e�t�Τ�����ؿ��h�Ť��j��
 * 
 * @author Otto
 *
 */
public class FileDemo01 {
	public static void main(String[] args) {
		File file = new File("." + File.separator + "demo.txt");
		/*
		 * ��^��eFile��ܪ����Υؿ����W�l
		 */
		String name =  file.getName();
		System.out.println(name);
		/*
		 * ��^��e��󪺤j�p(�r�`�q)
		 */
		long length = file.length();
		System.out.println(length);
		
		boolean canRead = file.canRead();
		boolean canWrite = file.canWrite();
		
		/*
		 * �d�ߤ��ɬO�_�iŪ�B�i�g
		 */
		System.out.println("�O�_�iŪ:"+canRead);
		System.out.println("�O�_�i�g:"+canWrite);
		
		/*
		 * �d�ߤ��ɬO�_����
		 */
		boolean isHidden = file.isHidden();
		System.out.println("�O�_����:"+isHidden);
		/*
		 * �d�ߥؿ�
		 */
		String path = file.getAbsolutePath();
		System.out.println(path);
	
	}
}
