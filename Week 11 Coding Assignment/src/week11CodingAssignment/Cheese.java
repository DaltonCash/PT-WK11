package week11CodingAssignment;

import java.util.ArrayList;
import java.util.List;



public class Cheese {
	
	
	private String cheeseName;
	
	public Cheese(String cheeseName) {
		this.cheeseName = cheeseName;
	}
	
	@Override
	public String toString() {
		return cheeseName;
	}
	
	public static int compare(Cheese cheese1, Cheese cheese2) {
		
		return cheese1.cheeseName.compareTo(cheese2.cheeseName);
	}

	private static List<Cheese> cheeses = new ArrayList<>(List.of(new Cheese("Blue"), new Cheese("Gorgonzola"), new Cheese("Feta"),
			new Cheese("Muenster"), new Cheese("Swiss"), new Cheese("Cottage"), new Cheese("Cream"),
			new Cheese("American"), new Cheese("Mozzarella"), new Cheese("Gouda"), new Cheese("Brie")));

	public String getCheeseName() {
		return cheeseName;
	}

	public void setCheeseName(String cheeseName) {
		this.cheeseName = cheeseName;
	}


	public static List<Cheese> getCheeses() {
		
		return cheeses;
	}


	public void setCheeses(List<Cheese> cheeses) {
		Cheese.cheeses = cheeses;
	}
}