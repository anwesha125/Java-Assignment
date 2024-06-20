import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String line=sc.nextLine();
		String []words = line.split(" ");
		System.out.println("No. of words the sentence has "+words.length);

	}

}
