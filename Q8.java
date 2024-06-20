import java.util.Scanner;
public class Q8 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two no.:");
		String x=sc.next();
		String y=sc.next();
		String sum="";
		int i,j,a,b,s,carry=0;
		for(i=x.length()-1,j=y.length()-1;(i>=0)&&(j>=0);i--,j--)
		{
			a=Integer.parseInt(x.substring(i,i+1));
			b=Integer.parseInt(y.substring(j,j+1));
			s=a+b+carry;
			if(s<10)
			{
				carry=0;
			}
			else
			{
				carry=s/10;
				s=s%10;
			}
			sum=Integer.toString(s)+sum;
		}
		if((i==-1)&&(j==-1))
		{
		}
		else if(i==-1)
		{
			b=Integer.parseInt(y.substring(j,j+1));
			s=b+carry;
			sum=Integer.toString(s)+sum;
			sum=y.substring(0,j)+sum;
		}
		else
		{
			a=Integer.parseInt(x.substring(i,i+1));
			s=a+carry;
			sum=Integer.toString(s)+sum;
			sum=x.substring(0,i)+sum;
		}
		System.out.println(sum);
	}

}
