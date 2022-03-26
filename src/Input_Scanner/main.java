package Input_Scanner;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String scanned = sc.next();
		String s= "24";
		int scanned1 = sc.nextInt();
		boolean sc1 = sc.nextBoolean();
		int x = Integer.parseInt(scanned);
		int y = Integer.parseInt(s);
		
		System.out.println(scanned);
		System.out.println(scanned1);
		System.out.println(sc1);
		System.out.println(x);
		System.out.println(y);
		
	}

}
