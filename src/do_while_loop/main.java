package do_while_loop;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x;
		int count = 0;
		
		do
		{
			System.out.print("Type a number:- ");
			x = sc.nextInt();
			System.out.println("You entered:- "+x);
			if(x==10)
			{
				System.out.print("You finally entered '10' ");
			}
			count++;
		}while(x!=10);
		System.out.println("and you tried '"+count+"' times");

	}

}
