package OopBasic;

abstract class Vehicle {
	protected String company;
	protected String model;
	protected String color;
	protected int year;
	
	public Vehicle() {
		this.company = "";
		this.model = "";
		this.color = "";
		this.year = 0;
	}
	public Vehicle(Vehicle v) {
		this.company = v.company;
		this.model = v.model;
		this.color = v.color;
		this.year = v.year;
	}
	public Vehicle(String company, String model, String color, int year) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.year = year;
	}

	public String toString() {
		return "company: " + this.company +"\n"+ "model: " + this.model +"\n"+
				"color: " + this.color +"\n"+ "year: " + this.year;
	}
}
