package Day01_ex;

public class Test_Main {

	public static void main(String[] args) {

//		AO01 s1 = new AO01();
//		getMethod(s1);
//		//FU f = new AO01();
//		getMethod(new AO02());
//		System.out.println(new AO02());
		
		getMethod(new AO01());
//		getMethod(new AO02());
//		getMethod(new AO03());
		
		//is a
//		FU f = new AO01();
//		AO01 g = (AO01)f;
//		g.getS01();
		
	}

	public static void getMethod(FU f) {
		if(f instanceof AO01) {
			f.getHaha();
			AO01 g = (AO01)f;
			g.getS01();
			

		}else if(f instanceof AO02) {
			f.getHaha();

		}else {
			f.getHaha();

		}
	}
	
}
