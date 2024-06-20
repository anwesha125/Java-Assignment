import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x and y");
		int x=sc.nextInt();
		int y=sc.nextInt()
;		int ans = 0, count = 0;
	    while (y>0)
	    {
	        if (y % 2 == 1)     
	        {
	            ans += x << count;
	        }
	        count++;
	        y /= 2;
	    }
		System.out.println(ans);

	}

}
