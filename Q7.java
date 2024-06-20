import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your DOB(DD/MM/YYYY)");
		String DOB=sc.next();
		String []DayMonthYear=DOB.split("/");
		int month=Integer.parseInt(DayMonthYear[1]);
		String first2=name.substring(0,2);
		if(month==1)
		{
			System.out.println("Your password:"+first2+"january");
		}
		else if(month==2)
		{
			System.out.println("Your password:"+first2+"february");
		}
		else if(month==3)
		{
			System.out.println("Your password:"+first2+"march");
		}
		else if(month==4)
		{
			System.out.println("Your password:"+first2+"april");
		}
		else if(month==5)
		{
			System.out.println("Your password:"+first2+"may");
		}
		else if(month==6)
		{
			System.out.println("Your password:"+first2+"june");
		}
		else if(month==7)
		{
			System.out.println("Your password:"+first2+"july");
		}
		else if(month==8)
		{
			System.out.println("Your password:"+first2+"august");
		}
		else if(month==9)
		{
			System.out.println("Your password:"+first2+"september");
		}
		else if(month==10)
		{
			System.out.println("Your password:"+first2+"october");
		}
		else if(month==11)
		{
			System.out.println(first2+"november");
		}
		else if(month==12)
		{
			System.out.println("Your password:"+first2+"december");
		}
		else {
			System.out.println("Beta tum date galat dale ho ya tum chutiye ho");
		}

	}

}
