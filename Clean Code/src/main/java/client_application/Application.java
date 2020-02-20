package client_application;
import java.util.Scanner;
import java.io.*;
import interest.*;
public class Application {
	public static void main(String...args) throws Exception {
		Interest interestCalculation;
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello");
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		out.write("Hello\n");
		out.flush();
//		out.write("subham");
//		
		System.out.printf("%s", "Enter 1. to calculate Simple Interest\n     2. to calculate Compound Interest\n....");
		int choice = scan.nextInt();
//		USER DATA INPUT SECTION
		double amount, roi;
		int n, t;
		System.out.printf("%s", "Enter amount -");
		amount = scan.nextDouble();
		System.out.printf("%s", "Enter rate of interest per period(%) - ");
		roi = scan.nextDouble();
		System.out.printf("%s", "Enter number of periods per year - ");
		n = scan.nextInt();
		System.out.printf("%s", "Enter number of year - ");
		t = scan.nextInt();
//		CALCULATION BASED ON USER'S CHOICE
		if(choice == 1) {
			interestCalculation = new SimpleInterest(amount, roi, n, t);
			System.out.printf("%s %s", "Your total money = ", interestCalculation.getTotalAmount());
		} else if( choice == 2 ){
			interestCalculation = new CompoundInterest(amount, roi, n, t);
			System.out.printf("%s %s","Your total money = "+interestCalculation.getTotalAmount());
		} else {
			scan.close();
			throw new Exception("Invalid Option");
		}
		System.out.printf("\n\nThank you");
		scan.close();
	}
}
