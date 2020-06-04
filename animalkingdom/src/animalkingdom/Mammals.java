package animalkingdom;

public class Mammals extends AbstractAnimal {
	private String name;
	private int year;

	public Mammals(String name, int year) {
		super(name, year);
		this.name = name;
		this.year = year;
	}

	@Override
	public String move() {
		return "walk";
	}

	@Override
	public String breath() {
		return "lungs";
	}

	@Override
	public String reproduce() {
		return "live births";
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Animals{id=" + id + ", name='" + name + "', yearNamed=" + year + "}\n";
	}
}