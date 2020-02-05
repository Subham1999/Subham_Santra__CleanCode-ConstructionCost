package RecieveGifts;
import java.util.Scanner;
import GiftPackage.*;
public class ReceiveGifts {
	public static void main(String[] args) {
		Gift g = new Gift();
		Scanner scan = new Scanner(System.in);
		System.out.println("Wanna Send Gifts to child ? [y/n]\n");
		char choice = scan.next().charAt(0);
		if(choice == 'y' || choice == 'Y') {			
//			while(true) {
//				System.out.println("Press 1 for Chocolate"
//						+ "\n 2 for Candies"
//						+ "\n 3 for Sweets"
//						+ "\n 4 for stop sending gifts\n");
//				int option = scan.nextInt();
//				if( option == 1) {
//					String name;
//					double price;
//					double weight;
//					System.out.print("\nEnter name of Chocolate \n");
//					name = scan.next();
//					System.out.print("\nEnter price ? \n");
//					price = scan.nextDouble();
//					System.out.print("\nEnter weight ? \n");
//					weight = scan.nextDouble();
//					g.recieveChoco(new Chocolate(name, price, weight));
//				} else if( option == 2) {
//					String color;
//					double price;
//					String taste;
//					System.out.println("Enter color of Candies \n");
//					color = scan.next();
//					System.out.println("Enter price ? \n");
//					price = scan.nextDouble();
//					System.out.println("Enter taste ? \n");
//					taste = scan.next();
//					g.recieveCandies(new Candies(color, price, taste));
//				} else if( option == 3) {
//					String name;
//					double price;
//					double weight;
//					System.out.println("Enter color of Sweets \n");
//					name = scan.next();
//					System.out.println("Enter price ? \n");
//					price = scan.nextDouble();
//					System.out.println("Enter weight ? \n");
//					weight = scan.nextDouble();
//					g.recieveSweets(new Sweets(name, price, weight));
//				} else if(option == 4){
//					System.out.println("Thanks!!");
//					break;
//				} else {
//					System.out.println("Not a valid option!!");
//				}
//			}
			
			g.recieveCandies(new Candies("RED", 10.00, "sweet"));
			g.recieveCandies(new Candies("GREEN", 5.00, "sweet"));
			g.recieveCandies(new Candies("ORANGE", 2.00, "orange"));
			
			g.recieveChoco(new Chocolate("dairy milk", 60.00, 150));
			g.recieveChoco(new Chocolate("eclairs", 10.00, 50));
			g.recieveChoco(new Chocolate("milkybar", 20.00, 30));
			
			g.recieveSweets(new Sweets("Rosogolla", 10.00, 50));
			g.recieveSweets(new Sweets("Kheer", 150.00, 70));
			
			System.out.println("You've sent the gifts for child !!");
			System.out.println("Wanna sort the gifts ? [y/n]\n");
			char choice2 = scan.next().charAt(0);
			if( choice2 == 'y' || choice == 'Y') {
				g.sortTheGifts();
			} else if( choice2 == 'n' || choice2 == 'N'){
				System.out.println("OK! No Problem!!");
			}
			System.out.println("Your Sent Gifts are below ::: ");
			g.printAllGifts();
		} else {
			System.out.println("Happy New Year to you!");
		}
		
		scan.close();
	}
}
