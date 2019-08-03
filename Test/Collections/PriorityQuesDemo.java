package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

import javax.swing.text.html.HTMLDocument.Iterator;

/*
 * https://www.geeksforgeeks.org/implement-priorityqueue-comparator-java/
 */
class Student
{
	String Name;
	Double CGPA;
	public Student(String Name, Double CGPA)
	{
		this.Name = Name;
		this.CGPA = CGPA;
	}
	public String getName()
	{
		return this.Name;
	}
}
class StudentComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.CGPA < o2.CGPA)
			return 1;
		else if(o1.CGPA > o2.CGPA)
			return -1;
		else
		return 0;
	}
	
}
public class PriorityQuesDemo {

	public static void main(String[] args) {
		PriorityQueue<Student> pq = new PriorityQueue<Student>(3, new StudentComparator());
		//PriorityQueue<Student> pq = new PriorityQueue<Student>(3);
		Student st1 = new Student("Subhash", 8.25);
		pq.add(st1);
		Student st2 = new Student("Namit", 7.25);
		pq.add(st2);
		Student st3 = new Student("Sandeep", 9.25);
		pq.add(st3);
		
		while(!pq.isEmpty())
			System.out.println(pq.poll().getName());

	}
}
