package Basic;
import java.util.Scanner;
public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S1= new Scanner(System.in);
		System.out.println("Enter y/n:");
		char resp = S1.nextLine().charAt(0);
		if(resp=='y'){
			System.out.println("you enteres yes");
			
		}
		else {
			System.out.println("you enteres no");
		}
S1.close();
	}

}
