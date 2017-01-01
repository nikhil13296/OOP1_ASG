import java.util.Scanner;

public class Asgmnt3_2 {

	public static void main(String[] args) {
		String s1, s2;
		Scanner Ip = new Scanner(System.in);

		System.out.println("Enter String 1:");
		s1 = Ip.nextLine();

		System.out.println("Enter Srting 2:");
		s2 = Ip.nextLine();

		System.out.println("Same =" + s1.equals(s2));

		Ip.close();
	}

}
