import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter shelter = new VirtualPetShelter();
		VirtualPet pet1 = new VirtualPet("Ghengis Khan", "Weasel");
		VirtualPet pet2 = new VirtualPet("Boop", "Unicorn");
		VirtualPet pet3 = new VirtualPet("Apostle Paul", "Oppossum");
		VirtualPet pet4 = new VirtualPet("Theodore", "Dragon");
		shelter.addPet(pet1);
		shelter.addPet(pet2);
		shelter.addPet(pet3);
		shelter.addPet(pet4);

		System.out.println("Thank you for volunteering at Big Al's Virtual Pet Shelter and Delicatessen!\n");

		while (shelter.getSize() > 0) {
			System.out.println("This is the status of your pets:");
			System.out.println("Name	|Hunger	|Thirst	|Fun");
			System.out.println("--------|-------|-------|-------");
			for (VirtualPet pet : shelter.getValues()) {
				System.out.println(pet.getName() + "|" + pet.getHunger() + "|" + pet.getThirst() + "|" + pet.getFun());
			}
			System.out.println("\nWhat would you like to do next?");
			System.out.println(
					"1. Feed the pets\r\n2. Water the pets\r\n3. Play with a pet\r\n4. Adopt a pet\r\n5. Admit a pet\r\n6. Quit");
			int entry = input.nextInt();

			if (entry == 1) {
				System.out.println("You feed all of the pets.");
				shelter.feedAll();
				continue;
			} else if (entry == 2) {
				System.out.println("You give water to all of the pets.");
				shelter.waterAll();
				continue;
			} else if (entry == 3) {
				System.out.println("Which pet would you like to play with?");
				System.out.println("");
				String choosePet = input.nextLine();
				shelter.playWithPet(choosePet);
				System.out.println("You play with " + choosePet);
				input.nextLine();
				continue;
			} else if (entry == 4) {
				System.out.println("Which pet is being adopted?");
				String choosePet = input.nextLine();
				VirtualPet adopted = shelter.getName(choosePet);
				shelter.removePet(adopted);
				continue;
			} else if (entry == 5) {
				System.out.println("What is the name of the pet that you're intaking?");
				System.out.println("");
				String newName = input.nextLine();
				System.out.println("What kind of animal is " + newName + "?");
				System.out.println("");
				String newAnimal = input.nextLine();
				VirtualPet newPet = new VirtualPet(newName, newAnimal, 25, 25, 25);
				shelter.addPet(newPet);
				continue;
			} else if (entry == 6) {
				System.out.println("Are you sure you want to quit? (Y/N)");
				System.out.println("");
				String entry2 = input.nextLine();
				System.out.println("Goodbye!");
				System.exit(0);
			}
		}
		System.out.println("There are no more pets in your shelter!");
		System.exit(0);
	}
}
