package p3;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TemplateClass {

	public static void main(String args[])
	{
		
		Test <Integer> t1 = new Test (20);
		System.out.println(t1.getObject());
		
		Test <String> t2 = new Test ("Hello Patidar");
		System.out.println(t2.getObject());
		
	}
	
	
}
