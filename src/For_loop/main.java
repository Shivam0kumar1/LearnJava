package For_loop;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub - Complete by 31/03
		
		int[] arr  = {1,3,2,4,5,2};
		int i;
		for(i=0; i<=arr.length-1; i++)
		{
			System.out.println(arr[i]);
			if(arr[i]==2)
			{
				System.out.println("Found a 2 at index" + i);
			}
		}
	}

}
