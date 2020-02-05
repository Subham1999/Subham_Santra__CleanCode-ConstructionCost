package GiftPackage;

import java.util.Comparator;

public class SortTheCandies {
	class sortUsingPrice implements Comparator<Candies>{
		public int compare(Candies o1, Candies o2) {
			return (int)(o1.price - o2.price);
		}
	}
	class sortUsingColor implements Comparator<Candies>{
		public int compare(Candies o1, Candies o2) {
			boolean x = o1.color.equals(o2.color);
			if( x == true ) {
				return 1;
			} else {
				return -1;
			}
		}
	}
}
