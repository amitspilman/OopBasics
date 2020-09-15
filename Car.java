package OopBasic;

public class Car extends Vehicle{
	private int seats;

	public Car() {
		super();
		this.seats = 0;
	}
	public Car(Car c) {
		super(c);
		this.seats = c.seats;
	}
	public Car(Car c,int seats) {
		super(c);
		this.seats = seats;
	}
	public Car(String company ,String model ,String color,int year,int seats) {
		super(company,model,color,year);
		this.seats = seats;
	}

	public String toString() {
		return  super.toString() +"\n"+ "seats: " + this.seats;
	}
}
