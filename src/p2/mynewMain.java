package p2;



public class mynewMain {

	public static void main(String[] args) {
		
		Vehicle arr[] = new Vehicle[5];
		
		arr[0] = new Bus(8 , new Engine(50) , new Petrol()) ;
		arr[1] = new Bus(8 , new Engine(60) , new Petrol());
		arr[2] = new Bus(8 , new Engine(50) , new Diesel()) ;
		arr[3] = new Car(4 , new Engine(50) , new Petrol());
		arr[4] = new Car(4 , new Engine(50) , new Petrol());
		
		for (Vehicle v : arr) {
		  if(v.getPower()>21000)
		  { 
			  if(v instanceof Bus )
				  System.out.println(" BUS "  + v.getPower());
			  else
				  System.out.println(" Car " + v.getPower()); 
			  
		  }
		  
		 
		}
	
	}
}
