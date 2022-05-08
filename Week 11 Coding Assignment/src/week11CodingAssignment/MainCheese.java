package week11CodingAssignment;

import java.util.ArrayList;
import java.util.List;

public class MainCheese {

	public static void main(String[] args) {
		SortCheese sortcheese = new SortCheese();
		
		List<Cheese> cheeses = new ArrayList<>(Cheese.getCheeses());
		
		System.out.println("Lambda: \n");
		List<Cheese> cheesesLambda = cheeses;
		sortcheese.cheeseLambda(cheesesLambda);
		
		cheesesLambda.forEach(cheese -> System.out.println(cheese.getCheeseName()));
		
		System.out.println("\nMethod Reference: \n");
		List<Cheese> cheesesMethodReference = cheeses;
		sortcheese.cheeseMethodReference(cheesesMethodReference);
		
		cheesesMethodReference.forEach(System.out::println);
	}
}