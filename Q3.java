import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a binary no.");
		long n=sc.nextLong();
		System.out.println("Enter ith bit");
		int i=sc.nextInt();
		System.out.println("Enter jth bit");
		int j=sc.nextInt();
		int ibit=0;
		int jbit=0;
		int k=0;
		int totalbit=0,bitcounter;
		long dup=n;
		long result=0;
		while(dup!=0)
		{
			totalbit++;
			dup=dup/10;
		}
		bitcounter=totalbit;
		dup=n;
		while(dup!=0)
		{

			if(bitcounter==i) 
			{
				ibit=(int)dup%10;
			}
			else if(bitcounter==j)
			{
				jbit=(int)dup%10;
			}

			dup=dup/10;
			bitcounter--;
		}
		bitcounter=totalbit;
		dup=n;
		while(dup!=0)
		{
			if(bitcounter==i)
			{
				result= jbit*((long)Math.pow(10,k))+result;
			}
			else if(bitcounter==j)
			{
				result=ibit*((long)Math.pow(10,k))+result;
			}
			else
			{
				result=(dup%10)*((long)Math.pow(10,k))+result;
			}
			k++;
			dup=dup/10;
			bitcounter--;
		}
		System.out.println(result);
	}

}
