import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter shelter = new VirtualPetShelter();
		VirtualPet pet1 = new VirtualPet("Ghengis Khan", "Weasel");
		VirtualPet pet2 = new VirtualPet("Boop", "Unicorn");
		VirtualPet pet3 = new VirtualPet("Apostle Paul", "Oppossum");
		VirtualPet pet4 = new VirtualPet("Theodore", "Dragon");

		System.out.println("Thank you for volunteering at Big Al's Virtual Pet Shelter and Delicatessen!\n");

//		while (shelter.getSize() > 0) {
			System.out.println("This is the status of your pets:");
			System.out.println("Name	|Hunger	|Thirst	|Boredom");
			System.out.println("--------|-------|-------|-------");
			for (VirtualPet pet : shelter.getValues()) {
				System.out.println(pet.getName() + "|" + pet.getHunger() + "|" + pet.getThirst() + "|" + pet.getFun());
			}
			System.out.println("\nWhat would you like to do next?");
			System.out.println("1. Feed the pets\r\n2. Water the pets\r\n3. Play with a pet\r\n4. Adopt a pet\r\n5. Admit a pet\r\n6. Quit");
			int entry = input.nextInt();
			
			if (entry == 1) {
				System.out.println("You feed all of the pets.");
				shelter.feedAll();
			} else if (entry == 2) {
				System.out.println("You give water to all of the pets.");
				shelter.waterAll();
			} else if (entry == 3) {
				System.out.println("Which pet would you like to play with?");
				String choosePet = input.nextLine();
				//shelter.playWithPet(VirtualPet choosePet);
			} else if (entry == 4) {
				System.out.println("Which pet is being adopted?");
				String choosePet = input.next();
				//shelter.addPet(choosePet);
			}
			
//		}
	}

}
