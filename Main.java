package OopBasic;

public class Main {
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("Honda","Civic","Blue",2020,5 );
		Car c3 = new Car("Fors","Focus","Black",2015,4 );


		Person p1 = new Person();
		Person p2 = new Person(c2,"Amit","Spilman","Elkana",111,30);
		Person p3 = new Person(c3,"Dor","Spilman","Eilat",222,22);
		Person p4 = new Person(c1, p2);

		System.out.println("person 1" +"\n"+ p1.toString() +"\n");
		System.out.println("person 2" +"\n"+ p2.toString() +"\n");
		System.out.println("person 3" +"\n"+ p3.toString() +"\n");
		System.out.println("person 4" +"\n"+ p4.toString() +"\n");

	}


}