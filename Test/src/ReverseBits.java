package com.luv2code.array;

public class ReverseBits {
	public static void ReverseTheBits(int n)
	{
		 int mask = 1 << 31;
	        int count = 0;
	        while(mask != 0) {
	            if(count%4 == 0)
	                System.out.print(" ");

	            if((mask&n) == 0) 

	                System.out.print("0");
	            else 
	                System.out.print("1");
	            count++;
	            mask = mask >>> 1;
	        }
	        System.out.println();		 
	}
	public static void main(String[] args) {
		/*
		 unsigned int 0 to 2^32 -1
		 signed int -2^31 to 2^31 -1
		 int mask = 1 << 31;
		 System.out.println(Integer.toBinaryString(mask));*/
		
		 int data = 7;
		 ReverseTheBits(data);
		 int Ret = 0;

	}

}
