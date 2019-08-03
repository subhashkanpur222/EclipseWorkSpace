package Collections;

import java.util.Comparator;
import java.util.TreeSet;

class Mycomparator implements Comparator
{
public int compare(Object obj1, Object obj2)
{
	Integer i1 = (Integer)obj1;
	Integer i2 = (Integer)obj2;
	if (i1 < i2)
		return 1;
	else if(i1 > i2)
		return -1;
	else
		return 0;
	
}
}
public class ComparatorDemoUsingTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet(new Mycomparator());
		//TreeSet<Integer> ts = new TreeSet();
		ts.add(10);
		ts.add(5);
		ts.add(15);
		ts.add(25);
		ts.add(1);
		System.out.println(ts);
	}

}
