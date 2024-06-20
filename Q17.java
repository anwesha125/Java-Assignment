import java.util.Scanner;
public class Q17 
{
	public static int[] delete(int a[],int index)
	{
		int k;
		for(k=index;k<a.length-1;k++)
		{
			a[k]=a[k+1];
		}
		a[k]=-1;
		return a;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[] a= new int[5];
		System.out.println("Enter array elements");
		for(int k=0;k<a.length;k++)
		{
			a[k]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j]&&i!=j)
				{
					a=delete(a,j);
				}
			}
		}
		for(int l=0;l<a.length;l++)
		{
			if(a[l]!=-1)
			{
				System.out.print(a[l]+" ");
			}
		}
		
	}

}
