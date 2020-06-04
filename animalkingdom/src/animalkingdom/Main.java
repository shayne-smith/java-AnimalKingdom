package animalkingdom;

import java.util.*;

public class Main {
	private static List<AbstractAnimal> filteredList = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Welcome to the Animal Kingdom!!");
		System.out.println("\n*** MVP ***");
		
		// Mammals
		Mammals panda = new Mammals("Panda", 1869);
		Mammals zebra = new Mammals("Zebra", 1778);
		Mammals koala = new Mammals("Koala", 1816);
		Mammals sloth = new Mammals("Sloth", 1804);
		Mammals armadillo = new Mammals("Armadillo", 1758);
		Mammals raccoon = new Mammals("Raccoon", 1758);
		Mammals bigfoot = new Mammals("Bigfoot", 2021);

		// Birds
		Birds pigeon = new Birds("Pigeon", 1837);
		Birds peacock = new Birds("Peacock", 1821);
		Birds toucan = new Birds("Toucan", 1758);
		Birds parrot = new Birds("Parrot", 1824);
		Birds swan = new Birds("Swan", 1758);

		// Fish
		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);


		List<AbstractAnimal> myList = new ArrayList<>();
		myList.add(panda);
        myList.add(zebra);
        myList.add(koala);
        myList.add(sloth);
        myList.add(armadillo);
        myList.add(raccoon);
        myList.add(bigfoot);

        myList.add(pigeon);
        myList.add(peacock);
        myList.add(toucan);
        myList.add(parrot);
        myList.add(swan);

        myList.add(salmon);
        myList.add(catfish);
        myList.add(perch);

        System.out.println("\n*** List all the animals in descending order by year named ***");
       	myList.sort((a1, a2) -> (a2.getYear() - a1.getYear()));
        System.out.println(myList.toString() + "\n");

        System.out.println("\n*** List all the animals alphabetically ***");
       	myList.sort((a1, a2) -> (a1.getName().compareToIgnoreCase(a2.getName())));
        System.out.println(myList.toString() + "\n");

        System.out.println("\n*** List all the animals order by how they move ***");
       	myList.sort((a1, a2) -> (a1.move().compareToIgnoreCase(a2.move())));
        System.out.println(myList.toString() + "\n");

        // System.out.println("\n*** List only those animals that breath with lungs ***");
       	// myList.sort((a1, a2) -> (a1.move().compareToIgnoreCase(a2.move())));
        // System.out.println(myList.toString() + "\n");

	}
}