import java.util.Scanner;
public class Q16 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array element");
		int arr[]=new int[5];
		int temp;
		for(int il=0;il<5;il++)
		{
			arr[il]=sc.nextInt();
		}
		System.out.println("Enter rotating index in from 0 to 4");
		int i=sc.nextInt();
		int j=sc.nextInt();
		while(i<j)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		for(int k=0;k<5;k++)
		{
			System.out.print(arr[k]+" ");
		}
	}

}
