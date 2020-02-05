package GiftPackage;

import java.util.Comparator;

public class SortTheChocolates{
	class sortUsingPrice implements Comparator<Chocolate>{
		public int compare(Chocolate o1, Chocolate o2) {
			return (int)(o1.price - o2.price);
		}
	}
	class sortUsingWeight implements Comparator<Chocolate>{
		public int compare(Chocolate o1, Chocolate o2) {
			return (int)(o1.weight - o2.weight);
		}
	}
}
