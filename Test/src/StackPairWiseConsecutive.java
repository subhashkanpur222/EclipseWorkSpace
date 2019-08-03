import java.util.Stack;

public class StackPairWiseConsecutive {
	static Stack<Integer> st;
	static boolean StackPairWiseCons(int size)
	{
		int temp1,temp2;
		if(size%2!=0)
			st.pop();
		
		while(st.isEmpty()!=true)
		{
			temp1=st.pop();
			temp2=st.pop();
			if(Math.abs(temp1-temp2)>1)
				return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		st=new Stack<Integer>();
		st.push(4);
		st.push(6);
		st.push(-2);
		st.push(-3);
		st.push(11);
		st.push(10);
		st.push(5);
		st.push(6);
		st.push(20);
		int size=st.size();
		System.out.println("StackPairWiseConsecutive is: "+StackPairWiseCons(size));
	}

}
