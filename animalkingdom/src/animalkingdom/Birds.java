package animalkingdom;

public class Birds extends AbstractAnimal {
	private String name;
	private int year;

	public Birds(String name, int year) {
		super(name, year);
		this.name = name;
		this.year = year;
	}

	@Override
	public String move() {
		return "fly";
	}

	@Override
	public String breath() {
		return "lungs";
	}

	@Override
	public String reproduce() {
		return "eggs";
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