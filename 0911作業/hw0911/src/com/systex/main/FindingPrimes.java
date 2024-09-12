package com.systex.main;

public class FindingPrimes {
	public  static void main(String[] args) {
		int primeNumber = Integer.parseInt(args[0]);
//		int primeNumber = 1000;
		showPrimeNumber(primeNumber);
	}
	public static void showPrimeNumber(int primeNumber) {
		if(primeNumber<2 || primeNumber>Integer.MAX_VALUE) {
			System.out.println("invalid input number");
		}

		for(int i=2;i<primeNumber;i++) {
			int lastNumberValueHalf =i<=3?i:(int) (i /2);
			for(int j=2;j<=lastNumberValueHalf;j++) {
				if(i%j==0 && i!=j)break;
				if(j==lastNumberValueHalf)System.out.print(i+" ");
			}
		}
	}
}
