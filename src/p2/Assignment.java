package p2;



public class Assignment {

	 public static void main(String args[])
	 {
		 
		 Petrol p= new Petrol();
		 Diesel d = new Diesel();
		 Car c = new Car(4 ,new Engine(100) , p );
		 Bus b = new Bus(8 ,new Engine(80) , d );
		 
		 System.out.println("Power of Car is " +c.getPower());
		 System.out.println("Power of Bus is " +b.getPower());
	 }
}
