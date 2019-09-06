package p3;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main( String args[])
	{
		ArrayList<Account> al = new ArrayList<Account> ();
		
		al.add(new Account(1 , "A" , 10));
		al.add(new Account(2 , "B" , 10));
		al.add(new Account(3 , "C" , 10));

		System.out.println(al.contains(new Account(1 , "A" , 10))) ;
		
	}
}
