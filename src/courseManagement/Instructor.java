package courseManagement;

public class Instructor {
	private String name;
	private String officeNumber;
	private String rank;
	private String officeHours;

	public Instructor(String name, String officeNumber, String rank, String officeHours) {
		super();
		this.name = name;
		this.officeNumber = officeNumber;
		this.rank = rank;
		this.officeHours = officeHours;
	}
	// deep copy constructor
	public Instructor(Instructor i) {
		this.name = i.name;
		this.officeNumber = i.officeNumber;
		this.rank = i.rank;
		this.officeHours = i.officeHours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", officeNumber=" + officeNumber + ", rank=" + rank + ", officeHours="
				+ officeHours + "]";
	}

}
