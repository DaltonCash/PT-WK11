package week11CodingAssignment;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Optionals {

	public static void main(String[] args) {
		
		methodB();
	}
	
	public static Cheese methodA(Optional<Cheese> optionalCheese) {
		return optionalCheese.orElseThrow(() -> new NoSuchElementException("It seems " + optionalCheese + " is empty."));		
	}

	public static void methodB() {
		Optional<Cheese> cheese = Optional.of(new Cheese("Smoked Gouda"));
		methodA(cheese);
		System.out.println(cheese);
		Optional<Cheese> emptyCheese = Optional.empty();
		try {
			methodA(emptyCheese);
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}	
	}
}	