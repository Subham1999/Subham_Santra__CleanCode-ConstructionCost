package costOfConstruction;
//import java.io.*;
import java.util.Scanner;
public class ContructionCostCalculation {
	public static void main(String[] args) throws Exception {
		ConstructionCost cost = new ConstructionCost();
		System.out.printf("%s", "Enter area of contruction \n");
		Scanner scan = new Scanner(System.in);
		double area;
		area = scan.nextDouble();
		if( area < 0 ) {
			scan.close();
			throw new Exception("Negative area doesn't exists");
		} else {
			cost.setConstructionArea(area);
		}
		System.out.printf("%s", "choose your standard of material contruction \n");
		System.out.printf("%s", "1. Standard Material"
				+ "\n2. Above Standard Material"
				+ "\n3. High Standard Material"
				+ "\n4. High Standard Material with fully automated home\n...");
		int choice = scan.nextInt();
		if( choice < 0 && choice > 4) {
			scan.close();
			throw new Exception("Not applicable");
		} else {
			cost.setStandardOfMaterial(choice-1);
		}
		System.out.printf("%s %s", "\nHere is your cost of construction ", cost.getContructionCost());
		System.out.println("\nThank you");
		scan.close();
	}

}
