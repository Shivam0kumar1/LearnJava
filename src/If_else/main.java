package If_else;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if(s.equals("tim")) {
			System.out.println("You printed tim");			
		}
		else if(s.equals("hi")) {
			System.out.println("You printed hi");
		}
		else if(s.equals("hello")) {
			System.out.println("You printed hello");
		}
		else {
			System.out.println("You printed a String");
		}
		
	}

}
