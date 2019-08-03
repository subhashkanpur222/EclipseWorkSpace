package Javaconcept;
/*
 * This is for to have functions as objects. This is an anonymous implementation of single method interface.
 */

import java.util.*;

public class LambdaDemo {

	public static void main(String[] args) {
		//anonymous implementation of comprator interface
		Comparator<String> stringcomparator = new Comparator<String>()
		{
			@Override
			public int compare(String s1, String s2)
			{
				return s1.compareTo(s2);
			}
		};

		int comparision = stringcomparator.compare("hello", "world");
		System.out.println(comparision);

		Comparator<String> stringcomparatorlambda = (s1,  s2) ->  s1.compareTo(s2);
		int comparisionLambda = stringcomparatorlambda.compare("hello", "world");
		System.out.println(comparisionLambda);
		
		
		//Runnable annonymous class
		Runnable obj = new Thread()
				{
				@Override
				public void run()
				{
					System.out.println("From run");
				}
				};
				
		//Runnable lambda exp.				
		Runnable obj1 = () -> System.out.println("I am from run");		
	}
}
