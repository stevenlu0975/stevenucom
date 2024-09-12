package com.systex.main;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int maxValue = Integer.parseInt(args[0]);
		int maxValue = 100;
		generateFibonacci(maxValue);
	}
	public static void generateFibonacci(int maxValue) {
		int first=0;
		int second=1;
		int temp=0;
		if(maxValue<0 || maxValue > Integer.MAX_VALUE) {
			System.out.println("invalid input number");
			return;
		}
		else if(maxValue==0) {
			System.out.println(0);
			return;
		}
		
		System.out.print("0 1 ");
		while(temp<maxValue) {
			temp = first+second;
			if(temp<=maxValue) {
				System.out.print(temp+" ");
				first = second;
				second =temp;
			}
		}
	}

}
