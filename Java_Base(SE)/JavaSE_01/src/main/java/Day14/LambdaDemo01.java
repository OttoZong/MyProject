package Day14;
/**
 * # Java API
 *
 *##Lambda ��F��
 *
 *	1. Java 8 (Java 1.8) ���Ѫ��s�y�k.
 *	2.�۷���@��²�ƪ��� �ΦW������,���H�]�٬��ΦW��k.
 *	3.Java ���X���ѤF Lambda��F���\��.
 *	4.Lambda�O�\�౵�f��²���{.
 *
 *### �\��ʱ��f
 *
 *�u���@�Ӥ�k�����f,�٬��\��ʱ��f.
 *
 *##  ����B�z
 *
 *
 * @author Otto
 *
 */
public class LambdaDemo01 {
	public static void main(String[] args) {
		/*
		 * Lambda ��F���t��.
		 */
		//�Q�ΰΦW������"�ֱ�"��{���f.
		Foo foo = new Foo(){
			public double test(int a,double b){
				return a+b;
			}
		};
		System.out.println(foo.test(4, 5.6));
		//�ϥ�Lambda��F����{�\�౵�f.
		Foo foo1 = (int a,double b)->{return a+b;};
		//��y�y���u���@��ɭ�,�i�H�ٲ�{}.
		Foo foo2 = (a,b)->a+b;
		
		//����.
		System.out.println(foo1.test(5, 6.7));
		System.out.println(foo2.test(5, 6.7));
		
		//�bLambda��F�����ϥΦh��y�y.
		Foo foo3 = (a, b)->{a++;b++;return a+b;};
		System.out.println(foo3.test(5, 6.7));
		
		//�ϥ�Lambda ��{Goo���f
		Goo goo = b->{System.out.println(b);};
		//�ե�
		goo.test(5.5);
		
		//���k�ѼƬO�@�ӱ��f�����ɭ�,Lambda �i�H�@����k�ѼƭȨϥ�.
		Goo goo1 = b->System.out.println(b);
		demo(goo1);
		demo(b->System.out.println(b));//²��.
	}
	
	public static void demo(Goo goo){
		goo.test(5.5);
	}
}

/**
 * �\��ʱ��f: �u���@�Ӥ�k�����f
 * @author Otto
 *
 */
interface Foo{
	double test(int a,double b);
}
interface Goo{
	void test(double b);
}
