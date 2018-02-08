import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetShelterTest {
	@Test
	public void shouldInitiateObject() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet testPet = new VirtualPet("", "");
		underTest.addPet(testPet);
		assertEquals(testPet, testPet);
	}

	@Test
	public void shouldPassNameOfPet() {
		VirtualPetShelter testShelter = new VirtualPetShelter();
		VirtualPet testPet = new VirtualPet("David", "Cat");
		testShelter.addPet(testPet);
		String check = testPet.getName();
		assertEquals("David", check);
	}

	@Test
	public void shouldAddPet() {
		VirtualPetShelter testShelter = new VirtualPetShelter();
		VirtualPet testPet = new VirtualPet("Jason", "Slug");
		testShelter.addPet(testPet);
		boolean check = testShelter.containsPet("Jason");
		assertEquals(true, check);
	}

	@Test
	public void shouldRemovePet() {
		VirtualPetShelter testShelter = new VirtualPetShelter();
		VirtualPet testPet = new VirtualPet("Jason", "Slug");
		testShelter.removePet(testPet);
		boolean check = testShelter.containsPet("Jason");
		assertEquals(false, check);
	}

	@Test
	public void shouldFeedAll() {
		VirtualPetShelter testShelter = new VirtualPetShelter();
		VirtualPet testPet = new VirtualPet("Pokey", "Dog", 0, 0, 0);
		VirtualPet testPet2 = new VirtualPet("Randy", "Cat", 1, 0, 0);
		testShelter.addPet(testPet);
		testShelter.addPet(testPet2);
		testShelter.feedAll();
		int check = testPet.getHunger();
		int check2 = testPet2.getHunger();
		assertEquals(30, check);
		assertEquals(31, check2);
	}

	@Test
	public void shouldWaterAll() {
		VirtualPetShelter testShelter = new VirtualPetShelter();
		VirtualPet testPet = new VirtualPet("Pokey", "Dog", 0, 0, 0);
		VirtualPet testPet2 = new VirtualPet("Randy", "Cat", 0, 1, 0);
		testShelter.addPet(testPet);
		testShelter.addPet(testPet2);
		testShelter.waterAll();
		int check = testPet.getThirst();
		int check2 = testPet2.getThirst();
		assertEquals(30, check);
		assertEquals(31, check2);
	}

	@Test
	public void shouldPlayWithOnePet() {
		VirtualPetShelter testShelter = new VirtualPetShelter();
		VirtualPet testPet = new VirtualPet("Pokey", "Dog", 0, 0, 50);
		VirtualPet testPet2 = new VirtualPet("Randy", "Cat", 0, 0, 50);
		testShelter.addPet(testPet);
		testShelter.addPet(testPet2);
		// testShelter.playWithPet(testPet2);
		int check = testPet.getFun();
		int check2 = testPet2.getFun();
		assertEquals(50, check);
		assertEquals(75, check2);
	}

	@Test
	public void shouldTickAll() {
		VirtualPetShelter testShelter = new VirtualPetShelter();
		VirtualPet testPet = new VirtualPet("Pokey", "Dog", 3, 2, 1);
		testShelter.addPet(testPet);
		testShelter.tick();
		int check = testPet.getHunger();
		int check2 = testPet.getThirst();
		int check3 = testPet.getFun();
		assertEquals(0, check);
		assertEquals(0, check2);
		assertEquals(0, check3);
	}

	@Test
	public void shouldReturnSize() {
		VirtualPetShelter testShelter = new VirtualPetShelter();
		int check = testShelter.getSize();
		assertEquals(0, check);
	}

	@Test
	public void shouldCapAllStatsForAll() {
		VirtualPetShelter testShelter = new VirtualPetShelter();
		VirtualPet testPet = new VirtualPet("", "", 99, 99, 99);
		VirtualPet testPet2 = new VirtualPet("", "", 99, 99, 99);
		testShelter.addPet(testPet);
		testShelter.addPet(testPet2);
		testShelter.feedAll();
		testShelter.capAll();
		int check = testPet.getHunger();
		int check2 = testPet2.getHunger();
		assertEquals(99, check);
		assertEquals(99, check2);
	}
}
