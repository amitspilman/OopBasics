package OopBasic;

public class Person {
	private String name;
	private String lastName;
	private String adress;
	private int id;
	private int age;
	private Car car;

	//constructors
	public Person() {
		this.name="John";
		this.lastName = "Doe";
		this.adress = "null";
		this.id=00000;
		this.age=0;
		this.car = new Car();
	}	
	public Person(Car c, String name,String lastName,String adress,int id ,int age) {
		this.name=name;
		this.lastName = lastName;
		this.adress = adress;
		this.id=id;
		this.age=age;
		this.car = new Car(c);
	}	
	public Person(Person p) {
		this.name = p.name;
		this.lastName = p.lastName;
		this.adress = p.adress;
		this.id = p.id;
		this.age = p.age;
		this.car = new Car(p.car);
	}
	public Person(Car c, Person p) {
		this.name = p.name;
		this.lastName = p.lastName;
		this.adress = p.adress;
		this.id = p.id;
		this.age = p.age;
		this.car = new Car(c);
	}

	//getters & setters	
	//getters
	public String getName() {
		return this.name;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getAdress() {
		return this.adress;
	}
	public int getId() {
		return this.id;
	}
	public int getAge() {
		return this.age;
	}
	public Car getCar() {
		return new Car(this.car);
	}
	
	//setters
	public void settId(int id) {
		this.id = id;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void settName(String name) {
		this.name = name;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public void SetCar(Car c) {
		this.car=new Car(c);
	}
	
	//functions
	public String toString() {		
		return "name: "+ this.name + " " + this.lastName + "\n" + "id: " + this.id +
				"\n" + "adress: " + this.adress + "\n" + "age: " + this.age +"\n"+
				this.car.toString();
	}


}
