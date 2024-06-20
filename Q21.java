import java.util.Scanner;
class Num
{
	int a[];
	Num()
	{
		a=new int[5];
	}
	void setNum(int a[])
	{
		this.a=a;
	}
	int[] getNum()
	{
		return a;
	}
	int[] reverse()
	{
		int []rev=new int[5];
		for(int i=0;i<a.length;i++)
		{
			rev[4-i]=a[i];
		}
		return rev;
	}
}
public class Q21 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Num ob = new Num();
		System.out.println("Enter array elements");
		int []a=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		ob.setNum(a);
		System.out.println("Reverse:-");
		a=ob.reverse();
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
