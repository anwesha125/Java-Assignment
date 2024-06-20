import java.util.Scanner;
public class Q19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter array elements");
		for(int i=0;i<=8;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter a element to insert");
		int e=sc.nextInt();
		System.out.println("Enter position");
		int pos=sc.nextInt();
		int temp=a[pos],temp1;
		a[pos]=e;
		for(int j=pos+1;j<a.length;j++)
		{
			temp1=a[j];
			a[j]=temp;
			temp=temp1;
		}
		for(int l=0;l<=9;l++)
		{
			System.out.print(a[l]+" ");
		}
	}

}
