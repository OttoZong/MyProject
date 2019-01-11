package Print;

public class PrintPoint {
	public static void main(String[] args) {
	    for (int i = 1; i <= 5; i++) {
	      for (int j = 5; j > i; j--) {
	        System.out.print(" ");
	      }
	      for (int k = 1; k < i * 1; k++) {
	        System.out.print("* ");
	      }
	      System.out.println();
	    }
	    for (int i = 4; i > 0; i--) {
	      for (int j = 5; j > i; j--) {
	        System.out.print(" ");
	      }
	      for (int k = 1; k < i * 1; k++) {
	        System.out.print("* ");
	      }
	      System.out.println();
	    }
	  }
}
