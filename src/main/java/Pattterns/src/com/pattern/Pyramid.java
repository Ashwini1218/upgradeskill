package com.pattern;

public class Pyramid {

	public static void main(String[] args) {
		for(int i = 1;i<=5;i++) {
			for (int k =5-i; k>=1; k--) {
				System.out.println(" k ");			}
		}
		for( int j = 1; j>=i; j++ ){
			System.out.println(" * ");
		}
		System.out.println();

	}

}
