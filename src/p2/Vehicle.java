package p2;



public class Vehicle {

	
  public Engine e;
  public int wheels ;
  public Fuel f;
  
  public Vehicle(int wheels , Engine e , Fuel f)
  {
	  this.wheels = wheels;
	  this.f = f;
	  this.e = e;
  }
  
  public int getPower()
  {
	  if(f instanceof Petrol)
	  return wheels*e.power*50 ;
	  else
		  return wheels*e.power*30;
  }
  
 
}
