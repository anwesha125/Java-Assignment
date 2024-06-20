import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a the spreadsheet column in block letters only");
		String s=sc.next();
		char c;
		int code=0;
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			code=code+(c-64);
		}
		System.out.println(s+" is encode to "+code);

	}

}
