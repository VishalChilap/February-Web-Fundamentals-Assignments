package AssignementMar14;
class Vehical{;
	int type;
	int fueltype;
	public void Class() {
		System.out.println("In Vehical class");
	}	
}

class Bike{
	int tyre;
	String type;
	String fuel;
	Bike(){
		tyre=2;
		type="Two weeler";
		fuel="Petrol";
	}
	public void BikeClass() {
		System.out.println("In bike class");
	}	
}

class Car{
	int tyre;
	String type;
	String fuel;
	int seat;
	Car(int tyre, String type, String fuel, int seat){
		this.tyre=tyre;
		this.type=type;
		this.fuel=fuel;
		this.seat=seat;
	}
	public void CarClass() {
		System.out.println("In car class");
	}
}

class Truck{
	int tyre;
	String type;
	String fuel;
	String load;
	
	public void TruckClass() {
		System.out.println("In truck class");
	}
	public int getTyre() {
		return tyre;
	}
	public void setTyre(int tyre) {
		this.tyre = tyre;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getLoad() {
		return load;
	}
	public void setLoad(String load) {
		this.load = load;
	}	
	
}

public class MyClass {
	public static void main(String [] args) {
		Vehical v1 = new Vehical();
		v1.Class();
		v1.fueltype=4;
		v1.type=3;
		System.out.println("Vehical has basically "+v1.fueltype+" fuel type");
		System.out.println("Vehical has basically "+v1.type+" type");
		System.out.println();
	
		
		Bike b1 = new Bike();
		b1.BikeClass();
		System.out.println("Bike has "+b1.tyre+" tyre");
		System.out.println("Bike has "+b1.fuel+" fuel type");
		System.out.println("Bike is "+b1.type+" type");
		System.out.println();

		
		Car c1 = new Car(4, "Four wheeler", "Petrol,Diesel,CNG", 5);
		c1.CarClass();
		System.out.println("Car has "+c1.tyre+" tyre");
		System.out.println("Car has "+c1.fuel+" fuel type");
		System.out.println("Car is "+c1.type+" type");
		System.out.println("Car has seating capacity "+c1.seat);
		System.out.println();
	
		
		Truck t1 = new Truck();
		t1.TruckClass();
		t1.setFuel("Diesel");
		t1.setLoad("5 ton");
		t1.setType("Transport vehicle");
		t1.setTyre(6);	
		System.out.println("Truck has "+t1.getTyre()+" tyre");
		System.out.println("Truck has "+t1.getFuel()+" fuel type");
		System.out.println("Truck is "+t1.getType()+" type");
		System.out.println("Truck has load carring capacity "+t1.getLoad());
		
	}
	
}
