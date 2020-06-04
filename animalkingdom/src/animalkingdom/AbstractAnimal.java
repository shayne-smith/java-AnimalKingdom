package animalkingdom;

abstract class AbstractAnimal {
	protected static int maxId = 0;
	protected int id;
	protected int food;
	protected String name;
	protected int year;

	public AbstractAnimal(String name, int year) {
		id = maxId;
		maxId++;
		food = 1;
		this.name = name;
		this.year = year;
	}

	abstract String move();
	abstract String breath();
	abstract String reproduce();

	void eat() {
		food--;
	}

	void eat(int i) {
		food += i;
	}

	int getFoodLevel() {
		return food;
	}
}