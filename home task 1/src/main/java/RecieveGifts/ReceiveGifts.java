package RecieveGifts;
import java.util.Scanner;
import GiftPackage.*;
import java.io.*;
public class ReceiveGifts {
	public static void main(String[] args) 
	throws IOException{
		Gift g = new Gift();
//		Scanner scan = new Scanner(System.in);
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Wanna Send Gifts to child ? [y/n]\n");
		char choice = bfr.readLine().charAt(0);
		if(choice == 'y' || choice == 'Y') {			
			while(true) {
				System.out.println("Press 1 for Chocolate"
						+ "\n 2 for Candies"
						+ "\n 3 for Sweets"
						+ "\n 4 for stop sending gifts\n");
				int option = Integer.parseInt(bfr.readLine());
				if( option == 1) {
					String name;
					double price;
					double weight;
					System.out.print("\nEnter name of Chocolate \n");
					name = bfr.readLine();
					System.out.print("\nEnter price ? \n");
					price = Double.parseDouble(bfr.readLine());
					System.out.print("\nEnter weight ? \n");
					weight = Double.parseDouble(bfr.readLine());
					g.recieveChoco(new Chocolate(name, price, weight));
				} else if( option == 2) {
					String color;
					double price;
					String taste;
					System.out.println("Enter color of Candies \n");
					color = bfr.readLine();
					System.out.println("Enter price ? \n");
					price = Double.parseDouble(bfr.readLine());
					System.out.println("Enter taste ? \n");
					taste = bfr.readLine();
					g.recieveCandies(new Candies(color, price, taste));
				} else if( option == 3) {
					String name;
					double price;
					double weight;
					System.out.println("Enter color of Sweets \n");
					name = bfr.readLine();
					System.out.println("Enter price ? \n");
					price = Double.parseDouble(bfr.readLine());
					System.out.println("Enter weight ? \n");
					weight = Double.parseDouble(bfr.readLine());
					g.recieveSweets(new Sweets(name, price, weight));
				} else if(option == 4){
					System.out.println("Thanks!!\n");
					break;
				} else {
					System.out.println("Not a valid option!!");
				}
			}
			
			System.out.println("You've sent the gifts for child !!");
			System.out.println("Wanna sort the gifts ? [y/n]\n");
			
			char choice2 = bfr.readLine().charAt(0);
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
		
//		scan.close();
	}
}
