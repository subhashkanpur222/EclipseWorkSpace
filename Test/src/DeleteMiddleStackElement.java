import java.util.Stack;

public class DeleteMiddleStackElement {
	static void DelMidSElement(Stack<Integer> st,int size, int current)
	{
		if(st.empty() || size==current)
			return;
		int temp=st.peek();
		st.pop();
		DelMidSElement(st,size,current+1);
		if(current!=size/2)
			st.push(temp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
		DelMidSElement(st,st.size(),0);
		 while (!st.empty())
	        {
	            int p=st.pop();
	            System.out.print(p + " ");
	        }
	}

}
