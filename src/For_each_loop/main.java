package For_each_loop;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//String s = sc.nextLine();
		int[] arr = {2,4,5,3,5,7};
		int count = 0;
		for(int element:arr)
		{
			System.out.println("Element "+element+" at index "+count );
			count++;
		}
		
		String[] name = new String[6];
		for(int i=0; i<name.length; i++)
		{
			System.out.print("Input: ");
			name[i] = sc.nextLine();
		}
		System.out.println("Input names are:-");
		for(String element:name)
		{
			System.out.print(element+" ");
		}
		System.out.println();
		for(String s:name)
		{
			System.out.print(s+" ");
			if(s.equals("Mayank")) {
				break;
			}
		}
		
		sc.close();
	}

}
