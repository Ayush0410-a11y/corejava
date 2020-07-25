package Basic;
import java.util.Scanner;

public class stringtoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter some value: ");
		Scanner s1 =new Scanner(System.in);
		String input =s1.nextLine();
		
		float i= Float.parseFloat(input);
		System.out.println("converted int to string:"+i);
		s1.close();

	}

}
