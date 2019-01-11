package Day05;

import java.io.Serializable;
import java.util.Arrays;

/**
 * �ϥη�e������Ҵ��չ�H�y����HŪ�g�ާ@
 * 
 *��e������ҭY�Ʊ�Q��H�yŪ�g,���򥲶���{
 *java.io.Serializable���f,�åB,��e�����Ҧ�
 *�ޥ��������ݩ�,�L�̪����]��������{�ӱ��f.
 *
 *��@������{�FSerializable���f,����b�sĶ
 *���ɭ�,�sĶ���|���t�bclass��󤤲K�[�@�Ӥ�k,
 *�αN��e��H��Ƭ��@�Ӧr�`.
 * @author Otto
 *
 */
public class Object_Person implements Serializable{
	/**
	 * ��@������{�FSerializable���f��
	 * ����w�q�@�ӱ`�q:serialVersionUID
	 * ���O�ǦC�ƪ�����,�Y�����w,�sĶ���|
	 * �b�sĶ��e����,�ھڷ�e�����c�۰ʥͦ��@�Ӫ�����
	 * 
	 * �������M�w�ϧǦC�Ʒ�e����ҬO�_�i�H���\.
	 * �������@�P��,�ϧǦC�Ʀ��\;
	 * ���@�P��,��H��J�y�b�i��ϧǦC�Ʈɷ|�ߥX���`.
	 * 
	 * �Y��e�����c�o���ܤ�,���O�������S�����ܪ��e���U,
	 * ��Ӫ���H�O�i�H�ϧǦC�ƪ�,
	 * �o�O�|�Ĩ��ݮe�Ҧ�,�Y:�٭�즳�ݩ�.
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	private transient String[] otherInfo;
	/*
	 * ��@���ݩʳQtransient�׹���
	 * ������ݩʦb��H�ǦC�Ʈɷ|�Q����
	 */
	
	public Object_Person() {
	}

	public Object_Person(String name, int age, String gender, String[] otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(String[] otherInfo) {
		this.otherInfo = otherInfo;
	}
	@Override
		public String toString() {
			return name+","+age+","+gender+","+Arrays.toString(otherInfo);
		}
	
}
