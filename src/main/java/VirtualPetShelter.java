import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	Map<String, VirtualPet> pets = new HashMap<>();

	public void addPet(VirtualPet pet1) {
		pets.put(pet1.getName(), pet1);
	}

	public boolean containsPet(String testPet) {
		for (VirtualPet name : pets.values()) {
			if (name.getName().equals(testPet)) {
				return true;
			}
		}
		return false;
	}

	public VirtualPet getName(String petName) {
		for (VirtualPet name : pets.values()) {
			if (name.getName().equals(petName)) {
				return name;
			}
		}
		return null;
	}

	public int getSize() {
		return pets.size();
	}

	public void feedAll() {
		for (VirtualPet name : pets.values()) {
			name.feed();
		}
		capAll();
	}

	public void waterAll() {
		for (VirtualPet name : pets.values()) {
			name.water();
		}
		capAll();
	}

	public void playWithPet(String choosePet) {
		for (VirtualPet name : pets.values()) {
			if (name.getName().equals(choosePet)) {
				name.play();
			}
		}
		capAll();
	}
	
	public void removePet(VirtualPet choosePet) {
			pets.remove(choosePet.getName(), choosePet);
	}

	public void tick() {
		for (VirtualPet name : pets.values()) {
			name.tick();
		}
	}

	Collection<VirtualPet> getValues() {
		return pets.values();
	}

	public void capAll() {
		for (VirtualPet name : pets.values()) {
			name.capStats();
		}
	}
}
