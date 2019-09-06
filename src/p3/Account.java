package p3;

public class Account implements Comparable{
 
	public int Accountno ;
	public String name;
	public int salary;
	
	public  Account( int Accountno , String name , int salary)
	{
	  this.Accountno = Accountno ;
	  this.name = name ;
	  this.salary = salary ;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
   public boolean equals(Object o) {
		Account a = (Account)o ;
	   		
        			if(this.Accountno == a.Accountno && this.name== a.name && this.salary == a.salary)
        				return true;
        		
        		return false;
	}
	
	@Override
	public int  compareTo( Object o)
	{
		Account a = (Account)o ;
		if(this.salary > a.salary)
			return 1 ;
		else
			return -1;
		
	}
	
	@Override 
	public String toString()
	{
		return " salary = "+ this.salary + " Accountno = " + this.Accountno;
	}
	
}