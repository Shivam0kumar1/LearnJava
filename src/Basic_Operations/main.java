package Basic_Operations;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		x=5;
		int y=7 , z=56, num1=3;
		int sum = x+y+z;
		int dif = x-y-z;
		int mul = x*y*z;
		double div = 13/5, rem = 13%5;
		
		y=0;
		
		System.out.println(sum);
		System.out.println(dif);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(rem);
		System.out.println(y);
		
		double num2=8, div2=num1/num2, rem2=num1%num2;
		float num3=6, num4=7,  div3=num3/num4, rem3=num3%num4;
		
		System.out.println(div2);
		System.out.println(rem2);
		System.out.println(div3);
		System.out.println(rem3);
		
		double d = Math.pow(num2, rem3);
		
		System.out.println(d);
	}

}
