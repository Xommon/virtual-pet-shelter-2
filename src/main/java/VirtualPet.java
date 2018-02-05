
public class VirtualPet {
	private String name = "";
	private String description = "";
	private int hunger = 50;
	private int thirst = 50;
	private int fun = 50;

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
		this.hunger = 50;
		this.thirst = 50;
		this.fun = 50;
	}

	public VirtualPet(String name, String description, int hunger, int thirst, int fun) {
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.fun = fun;
	}

	public void feed() {
		hunger += 30;
		thirst -= 10;
		fun -= 5;
	}

	public int getHunger() {
		return hunger;
	}

	public void water() {
		hunger -= 5;
		thirst += 30;
		fun -= 10;
	}

	public int getThirst() {
		return thirst;
	}

	public void play() {
		hunger -= 10;
		thirst -= 10;
		fun += 25;
	}

	public int getFun() {
		return fun;
	}

	public void tick() {
		hunger -= 3;
		thirst -= 2;
		fun -= 1;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void capStats() {
		if (hunger > 99) {
			hunger = 99;
		}
		if (thirst > 99) {
			thirst = 99;
		}
		if (fun > 99) {
			fun = 99;
		}
	}

}
