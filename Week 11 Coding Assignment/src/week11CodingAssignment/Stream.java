package week11CodingAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		
		List<Cheese> cheeses = new ArrayList<>(List.of(new Cheese("Blue"), new Cheese("Gorgonzola"), new Cheese("Feta"),
				new Cheese("Muenster"), new Cheese("Swiss"), new Cheese("Cottage"), new Cheese("Cream"),
				new Cheese("American"), new Cheese("Mozzarella"), new Cheese("Gouda"), new Cheese("Brie")));
		
		String newCheeses = cheeses.stream().map(cheese -> cheese.getCheeseName()).sorted().collect(Collectors.joining(", "));
		System.out.println(newCheeses);

	}
}