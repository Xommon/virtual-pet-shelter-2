import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {
	@Test
	public void shouldFeedPet() {
		VirtualPet underTest = new VirtualPet("", "");
		underTest.feed();
		int check = underTest.getHunger();
		assertEquals(80, check);
	}

	@Test
	public void shouldWaterPet() {
		VirtualPet underTest = new VirtualPet("", "");
		underTest.water();
		int check = underTest.getThirst();
		assertEquals(80, check);
	}

	@Test
	public void shouldPlayPet() {
		VirtualPet underTest = new VirtualPet("", "");
		underTest.play();
		int check = underTest.getFun();
		assertEquals(75, check);
	}

	@Test
	public void shouldTick() {
		VirtualPet underTest = new VirtualPet("", "");
		underTest.tick();
		int check = underTest.getHunger();
		assertEquals(47, check);
	}

	@Test
	public void shouldGetName() {
		VirtualPet underTest = new VirtualPet("Jason", "Squirrel");
		String check = underTest.getName();
		assertEquals("Jason", check);
	}

	@Test
	public void shouldGetDescription() {
		VirtualPet underTest = new VirtualPet("Jason", "Squirrel");
		String check = underTest.getDescription();
		assertEquals("Squirrel", check);
	}
	
	@Test
	public void shouldCapStats() {
		VirtualPet testPet = new VirtualPet("","",100,100,100);
		testPet.capStats();
		int check = testPet.getHunger();
		assertEquals(99,check);
	}

}
