package Animals;

import java.util.*;

public class Main {

    public static void printAnimals(ArrayList<AbstractAnimals> animals, CheckAnimal tester)
	{

		//for element of 'vehicles' Arraylist (which will be type AbstractVehicle...nicknamed 'v')
		for (AbstractAnimals a : animals)
		{
					//If Lambda expression on line 78 is true...
			if (tester.test(a))
			{	//...print the name & fuel level of each vehicle (from 'v' which refers to <AbstractVehicle>)
				System.out.println(a.getName() + ", named:  " + a.getYear() + " breathes: " + a.breathe() + " reproduces: " + a.reproduce());
			}
		}
	}


    public static void main(String[] args) {
        Mammals panda = new Mammals("Panda",1869);
        Mammals zebra = new Mammals("Zebra",1778);
        Mammals koala = new Mammals("Koala",1816);
        Mammals sloth = new Mammals("Sloth",1804);
        Mammals armadillo = new Mammals("Armadillo",1758);
        Mammals raccoon = new Mammals("Raccoon",1758);
        Mammals bigfoot = new Mammals("Bigfoot",2021);

        Birds pigeon = new Birds("Pigeon",1837);
        Birds peacock = new Birds("Peacock",1821);
        Birds toucan = new Birds("Toucan",1758);
        Birds parrot = new Birds("Parrot",1824);
        Birds swan = new Birds("Swan",1758);

        Fish salmon = new Fish("Salmon",1758);
        Fish catfish = new Fish("Catfish",1817);
        Fish perch = new Fish("Perch",1758);

        ArrayList<AbstractAnimals> newList = new ArrayList<AbstractAnimals>();
        newList.add(panda);
        newList.add(zebra);
        newList.add(koala);
        newList.add(sloth);
        newList.add(armadillo);
        newList.add(raccoon);
        newList.add(bigfoot);
        newList.add(pigeon);
        newList.add(peacock);
        newList.add(toucan);
        newList.add(parrot);
        newList.add(swan);
        newList.add(salmon);
        newList.add(catfish);
        newList.add(perch);
    
        System.out.println("________");
        System.out.println("**List all the animals alphabetically**");
        newList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        newList.forEach((a) -> System.out.println(a.getName()));

        System.out.println("________");
        System.out.println("**List all the animals in descending order by year named**");
        newList.sort((v1, v2) -> v1.getYear() - v2.getYear());
        newList.forEach((a) -> System.out.println(a.getName() + " " + a.getYear()));
        

        System.out.println("________");
        System.out.println("**List all the animals order by how they move**");
        newList.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
        newList.forEach((a) -> System.out.println(a.getName() + " Moves by: " + a.move()));

        System.out.println("________");
        System.out.println("**List only those animals the breath with lungs**");
        printAnimals(newList, a -> a.breathe() == "Lungs");
        
        
        System.out.println("________");
        System.out.println("**List alphabetically only those animals that were named in 1758**");
        printAnimals(newList, a -> (a.getYear() == 1758));
        
        
        System.out.println("________");
        System.out.println("**List only those animals that breath with lungs and were named in 1758**");
        printAnimals(newList, a -> (a.breathe() == "Lungs") && (a.getYear() == 1758));


        System.out.println("________");
        System.out.println("**List only those animals that lay eggs and breath with lungs**");
        printAnimals(newList, a -> (a.breathe() == "Lungs") && (a.reproduce() == "Eggs"));

    }
}