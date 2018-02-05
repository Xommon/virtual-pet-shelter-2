import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	Map<String, VirtualPet> pets = new HashMap<>();

	public void addPet(VirtualPet testPet) {
		pets.put(testPet.getName(), testPet);
	}

	public boolean containsPet(String testPet) {
		for (VirtualPet name : pets.values()) {
			if (name.getName().equals(testPet)) {
				return true;
			}
		}
		return false;
	}

	public void removePet(VirtualPet testPet) {
		pets.remove(testPet.getName(), testPet);		
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
	}

	public void waterAll() {
		for (VirtualPet name : pets.values()) {
			name.water();
		}
		
	}

	public void playWithPet(VirtualPet nameOfPet) {
		nameOfPet.play();
	}

	public void tick() {
		for (VirtualPet name : pets.values()) {
			name.tick();
		}
	}
	
	Collection<VirtualPet> getValues() {
        return pets.values();
    }

}
