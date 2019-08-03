package Collections;

import java.util.*;
import java.util.Collections;

import javax.swing.text.html.HTMLDocument.Iterator;

/*
 * https://www.javatpoint.com/difference-between-comparable-and-comparator
 * 
 * Comparable:  Comparable provides a single sorting sequence. In other words, we can sort the collection on the basis 
 * of a single element such as id, name, and price. Comparable affects the original class, i.e., the actual class is modified.
 * Comparable provides compareTo() method to sort elements.
 * 
 * Comparator: The Comparator provides multiple sorting sequences. In other words, we can sort the collection on the basis of 
 * multiple elements such as id, name, and price etc. Comparator doesn't affect the original class, i.e., the actual class is not
 * modified. * Comparator provides compare() method to sort elements.
 */

class Student1 implements Comparable<Student1>
{
	int rollno;
	String name;
	int age;

	public Student1(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student1 o) {
		if(this.rollno >= o.rollno)
			return 1;
		if(this.rollno == o.rollno)
			return 0;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}	
}


class Student2
{
	int rollno;
	String name;
	int age;
	public Student2(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student2 [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
}

class  RollNoComparator implements Comparator<Student2>
{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		if(o1.rollno > o2.rollno)
			return 1;
		else if(o1.rollno < o2.rollno)
			return -1;
		else			
		return 0;
	}
	
}

class Agecomparator implements Comparator<Student2>
{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		if(o1.age > o2.age)
			return 1;
		
		else if(o1.age < o2.age)
			return -1;
		else
		return 0;
	}
	
}

public class ComparableCompratorDemo {

	public static void main(String[] args) {
		//comparable demo
		ArrayList<Student1> al1 = new ArrayList<>();
		al1.add(new Student1(1,"abc",20));
		al1.add(new Student1(5,"adc",20));
		al1.add(new Student1(2,"xyz",22));
		al1.add(new Student1(3,"ijk",23));
		al1.add(new Student1(4,"klm",24));
		
		// call the comparable sort method to sor the values
		Collections.sort(al1);		
		//System.out.println(al1);
		
		
		//Create array list for student2 and this will be sorted based on comparator
		ArrayList<Student2> al2 = new ArrayList<Student2>();
		al2.add(new Student2(1,"abc",29));
		al2.add(new Student2(5,"abc",28));
		al2.add(new Student2(2,"xyz",22));
		al2.add(new Student2(3,"ijk",23));
		al2.add(new Student2(4,"klm",24));
		
		Collections.sort(al2, new RollNoComparator());
		System.out.println(al2);
		
		Collections.sort(al2, new Agecomparator());
		System.out.println(al2);
	}
}
