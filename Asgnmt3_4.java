import java.util.Scanner;

public class Asgnmt3_4 {
	public static void main(String[] args) {
		Scanner Ip = new Scanner(System.in);
		int No;
		System.out.println("How many students are there?");
		No= Ip.nextInt();
		for(int i =0;i<No;i++)
		{
			int Marks;
			System.out.println("Student" +i+1);
			
			System.out.println("Enter marks:");
			Marks = Ip.nextInt();
			
			if (Marks < 0 || Marks > 100)
				System.out.println("Invalid Marks");
			else {
				if (Marks < 35) {
					System.out.println( "Student is allowed to keep trying");
				}
				if (Marks > 34 && Marks < 66)
					System.out.println("Hurray !Student has passed the exam with Second class");
				if (Marks > 65) {
					System.out.println("Congratulations!Student has passed the exams with First class");
				}
			}
		}
	Ip.close();
	}
}
