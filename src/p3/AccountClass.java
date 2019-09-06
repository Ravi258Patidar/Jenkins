package p3;


import java.util.TreeSet;
import java.util.Set;

public class AccountClass  {
	Set < Account> treeSet = new TreeSet<Account> ();
		
	public static void main(String args[])
	{
		AccountClass obj = new AccountClass();
	   
	   
	   obj.treeSet.add(new Account(1,"a",10));
	   obj.treeSet.add(new Account(2,"b",108));
	   obj.treeSet.add(new Account(3,"c",100));
	   obj.treeSet.add(new Account(4,"d",109));
	   
	   obj.treeSet.add(new Account(5,"e",1000));
	   
	  
	    Account x  = new Account(6 , "f" , 10000 );
	    obj.treeSet.add(x);
	   System.out.println( obj.treeSet);
	   
	   
	}  
	
	}


