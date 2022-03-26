package While_loop;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type a number:- ");
		int x = sc.nextInt();
		int count = 0;
		
		while(x!=10)
		{
			System.out.println("You entered:- "+x);
			System.out.print("Type a number:- ");
			x = sc.nextInt();
			if(x==10)
			{
				System.out.print("You finally entered '10' ");
			}
			count++;
		}
		System.out.println("and you tried '"+count+"' times");

	}

}
