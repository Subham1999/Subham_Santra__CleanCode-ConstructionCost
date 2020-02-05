package GiftPackage;

import java.util.Comparator;

public class SortTheSweets {
	class sortUsingPrice implements Comparator<Sweets>{
		public int compare(Sweets o1, Sweets o2) {
			return (int)(o1.price - o2.price);
		}
	}
	class sortUsingWeight implements Comparator<Sweets>{
		public int compare(Sweets o1, Sweets o2) {
			return (int)(o1.weight - o2.weight);
		}
	}
}
