import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		long n=sc.nextLong();
		long count=0;
		long dup=n;
		while (dup!=0)
	    {
			if((dup&1)==1)
			{
				count++;
			}
	        dup=dup>>1;
	    }
		if(count%2!=0)
		{
			System.out.println("T parity of "+n+" is 1");
		}
		else
		{
			System.out.println("T parity of "+n+" is 0");
		}
	}

}
