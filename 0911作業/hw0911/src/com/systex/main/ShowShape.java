package com.systex.main;

public class ShowShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = Integer.valueOf(args[0]);
		//loop 1
		System.out.println("============loop 1============");
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//loop 2
		System.out.println("============loop 2============");
		for(int i=1;i<=number;i++) {
			for(int j=number;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		//loop 3
		System.out.println("============loop 3============");
		for(int i=1;i<=number;i++) {
			for(int j=number;j>=1;j--) {
				if(j>i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		//loop 4
		System.out.println("============loop 4============");
		int upStair=1;
		for(int i=1;i<=number;i++) {
			for(int j=number;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<upStair;j++) {
				System.out.print("*");
			}
			upStair+=2;
			System.out.println();
		}		
		//loop 5
		System.out.println("============loop 5============");
		for(int i=1;i<=number;i++) {
			for(int j=number;j>number-i;j--) {
				System.out.print(" ");
			}
			for(int j=number;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		//loop 6
		System.out.println("============loop 6============");
		int downStair=number*2-1;
		for(int i=1;i<=number;i++) {
			for(int j=number;j>number-i;j--) {
				System.out.print(" ");
			}
			for(int j=downStair;j>=1;j--) {
				System.out.print("*");
			}
			downStair-=2;
			System.out.println();
		}
		//loop 7
		downStair=number*2-1;
		upStair=1;
		System.out.println("============loop 7============");

		for(int i=1;i<=number;i++) {
			for(int j=number;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<upStair;j++) {
				System.out.print("*");
			}
			upStair+=2;
			System.out.println();
		}
		
		for(int i=1;i<=number;i++) {
			for(int j=number;j>number-i;j--) {
				System.out.print(" ");
			}
			for(int j=downStair;j>=1;j--) {
				System.out.print("*");
			}
			downStair-=2;
			System.out.println();
		}
	}

}
