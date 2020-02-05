package GiftPackage;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Gift {
	public Gift gift = null;
	private ArrayList<Chocolate> chocos;
	private ArrayList<Candies> candies;
	private ArrayList<Sweets> sweets;
	public Gift(){
		if( gift == null) {
			chocos = new ArrayList<Chocolate>();
			sweets = new ArrayList<Sweets>();
			candies = new ArrayList<Candies>();
		}
	}
	public void recieveChoco(Chocolate o1) {
		chocos.add(o1);
	}
	public void recieveSweets(Sweets o1) {
		sweets.add(o1);
	}
	public void recieveCandies(Candies o1) {
		candies.add(o1);
	}
	public void sortTheGifts() {
		Scanner scan = new Scanner(System.in);
		if( chocos.size() > 0) {
			System.out.println("How to sort chocolates ? 1. Using Price   2. Using Weight ? \n");
			int x = scan.nextInt();
			if( x == 1) {
				Collections.sort(chocos, new SortTheChocolates().new sortUsingPrice());
			}
			else if( x == 2 ) {
				Collections.sort(chocos, new SortTheChocolates().new sortUsingWeight());
			} else {
				System.out.println("No Option!!");
			}
		}
		if( sweets.size() > 0) {
			System.out.println("How to sort sweets 1. Using Price   2. Using Weight ? \n");
			int x = scan.nextInt();
			if( x == 1) {
				Collections.sort(sweets, new SortTheSweets().new sortUsingPrice());
			} else if( x == 2) {
				Collections.sort(sweets, new SortTheSweets().new sortUsingWeight());
			} else {
				System.out.println("No options");
			}
		} 
		if( candies.size() > 0) {
			System.out.println("How to sort candies ? 1. Using Price   2. Using Color ? ");
			int x = scan.nextInt();
			if( x == 1) {
				Collections.sort(candies, new SortTheCandies().new sortUsingPrice());
			} else if( x == 2) {
				Collections.sort(candies, new SortTheCandies().new sortUsingColor());
			}
		} 
		scan.close();
	}
	public void printAllGifts() {
		if( candies.size() == 0) {
			System.out.println("No candies");
		} else {
			System.out.println("........CANDIES......");
			Iterator<Candies> it0 = candies.iterator();
			while( it0.hasNext() ) {
				Candies temp = it0.next();
				System.out.println("Color := "+temp.color+", price := "+temp.price+", taste :="+temp.taste);
			}
		}
		System.out.println(".........CHOCOLATES..........");
		if( chocos.size() == 0) {
			System.out.println("No Chocolates");
		} else {
			Iterator<Chocolate> it1 = chocos.iterator();
			while( it1.hasNext() ) {
				Chocolate temp = it1.next();
				System.out.println("name := "+temp.name+", price := "+temp.price+", weight := "+temp.weight);
			}
		}
		System.out.println(".........SWEETS............");
		if( sweets.size() == 0) {
			System.out.println("No Sweets");
		} else {
			Iterator<Sweets> it = sweets.iterator();
			while( it.hasNext() ) {
				Sweets temp = it.next();
				System.out.println("name := "+temp.name+", price := "+temp.price+", weight := "+temp.weight);
			}
		}
	}
}
