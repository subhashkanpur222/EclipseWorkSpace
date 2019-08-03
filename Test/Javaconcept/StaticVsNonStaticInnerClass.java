package Javaconcept;

import Javaconcept.AA.BB;
/*
1. Static inner class cannot access non-static members of enclosing class. 
 It can directly access static members (instance field and methods) of enclosing 
 class same like the procedural style of getting value without creating object.

2. Static inner class can declare both static and non-static members. 
The static methods have access to static members of main class. 
However, it cannot access non-static inner class members. 
To access members of non-static inner class, it has to create object of non-static inner class.

3. Non-static inner class cannot declare static field and static methods. 
It has to be declared in either static or top level types. 
You will get this error on doing so saying "static fields only be declared in static or top level types".

4. Non-static inner class can access both static and non-static members of enclosing class in procedural style of getting value, 
but it cannot access members of static inner class.

5. The enclosing class cannot access members of inner classes until it creates an object of inner classes.
 IF main class in accessing members of non-static class it can create object of non-static inner class.

6. If main class in accessing members of static inner class it has two cases:
Case 1: For static members, it can use class name of static inner class
Case 2: For non-static members, it can create instance of static inner class.

7. A nested class has access to the members, including private members, of the class in which it is nested. 
However, reverse is not true i.e. the enclosing class does not have access to the members of the nested class.
 */
class AA
{
    class BB
    {
        // static int x; not allowed here
    }

    static class CC
    {
        static int x; // allowed here
    }

	
}
public class StaticVsNonStaticInnerClass {

	public static void main(String[] args) {
		  AA a = new AA();

	        // Non-Static Inner Class
	        // Requires enclosing instance
	        AA.BB obj1 = a.new BB(); 

	        // Static Inner Class
	        // No need for reference of object to the outer class
	        AA.CC obj2 = new AA.CC(); 
	}

}
