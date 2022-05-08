package week11CodingAssignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class SortCheese implements Comparator<Cheese>{
	
	@Override
	public int compare(Cheese c1, Cheese c2) {	
		return Cheese.compare(c1, c2);
	}
	
	static List<Cheese> cheeses = new ArrayList<>(Cheese.getCheeses());
	Comparator<Cheese> comparator = null;
	
	public Comparator<Cheese> cheeseLambda(List<Cheese> cheese){
	
		comparator = (c1, c2) -> Cheese.compare(c1, c2);
		cheese.sort(comparator);
		return comparator; 	
	}
	
	public Comparator<Cheese> cheeseMethodReference(List<Cheese> cheese){
		comparator = Cheese::compare;
		cheese.sort(comparator);
		return comparator;
	}
}
