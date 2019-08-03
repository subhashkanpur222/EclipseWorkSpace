package Javaconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * https://www.geeksforgeeks.org/different-ways-create-objects-java/
 * Ways to create object in java
 * 1. with new keyword
 * 2. using newInstance() with class.farName()
 * 3. using clone() method
 * 4. Using deserialization
 * 5. using newInstance() method of Constructor class
 * 
 */
public class WaystoCreateJavaObject implements Cloneable, Serializable{

	String name;
	public WaystoCreateJavaObject(String name) {
		this.name = name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public static void main(String[] args) {
		WaystoCreateJavaObject obj = new WaystoCreateJavaObject("GeeksForGeeks");
		
	    try {
			WaystoCreateJavaObject obj1 = (WaystoCreateJavaObject)obj.clone();
			System.out.println(obj1.name);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    try {
			FileOutputStream fo = new FileOutputStream("file.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fo);
			oos.writeObject(obj);
			oos.close();
			fo.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    
	    WaystoCreateJavaObject dserializdobj = null;
	    try {
			FileInputStream fi = new FileInputStream("file.txt");
			ObjectInputStream ois = new ObjectInputStream(fi);
			
			dserializdobj = (WaystoCreateJavaObject) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
	    System.out.println("DSerialized value is: "+dserializdobj.name);
	}

}
