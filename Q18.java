import java.util.*;
public class Q18 
{
	public static int[] bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }
         return arr;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter 1st array element");
		int[] a1=new int[5];
		for(int j=0;j<a1.length;j++)
		{
			a1[j]=sc.nextInt();
		}
		System.out.println("Enter 2nd array element");
		int[] a2=new int[5];
		for(int j=0;j<a2.length;j++)
		{
			a2[j]=sc.nextInt();
		}
		int[] a=new int[a1.length+a2.length];
		for(int i=0;i<(a1.length+a2.length);i++)
		{
			if(i<5)
			{
				a[i]=a1[i];
			}
			else
			{
				a[i]=a2[i-5];
			}
		}
		a=bubbleSort(a);
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}
	}

}
