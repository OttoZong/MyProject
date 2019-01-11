package Day11;


/**
 * Map�O�d�߳t�׳̧֪��ƾڵ��c,�����ϥμƲզs�񤸯�.
 * ���OHashMap�O�ھ�key�o�Ӥ�����hashcode��,
 * �M�w�o����ȹ�b�Ʋդ�����l�öi��O�s,
 * �����ɭԴN�i�H�����Nkey������hashcode��,
 * �p���m�q�Ʋդ����X,�٥h�F�����ϥμƲջݭn�M���d�䤸�����B�J.
 * 
 * �ѩ�@��key��������hashcode�M�w��bHashMap�����Ʋզ�m,
 * ��equals�M�wkey�O�_����,����o��Ӥ�k�����M�w�FHashMap��,
 * �O�_�|�X�{������p.
 * ����key��hashcode�ȬۦP��,���̸g�L���C��k�p���,
 * �b�Ʋդ�����m�@�w�O�@�˪�,���O�Yequals�������true,
 * ����HashMap�{���o�O��Ӥ��P��key,�h�|�b�ƲոӦ�m��������c�O�s�o������.
 * 
 * �M�����|���CHashMap���d�ߩʯ�.�ҥH�n�ɶq�קK.
 * 
 * Object���bAPI��U�W��o��Ӥ�k�����g���һ���.
 * ����API���Ѫ����o��Ӥ�k�������������g.
 * ����ڭ̦ۤv�w�q����,�Y�@��HashMap����key�ϥή�,
 * ���equals�Mhashcode��k�����g�ݭn����H�U�X�I:
 * 1.���ﭫ�g,�Y:�Y���gequals��k�N�n�s�P���ghashcode��k.
 * 2.�@�P��,�Y:��ӹ�H�Yequals�����true,
 * ����hashcode��k��^���Ʀr�����۵�.
 * �ϹL�����M���O���ݪ�,���O�ɶq�O�ҷ��ӹ�Hhashcode�۵���,
 * equals����]��true,�_�h�|�bHashMap���X�{���.
 * 3.í�w��,�Y:��h���ե�hashcode��k,��^���Ʀr������.
 * ���O�Y��e��H�ѻPequals������ݩʭȵo�ͤF����,
 * hashcode��k��^���Ʀr�i�H����.
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
