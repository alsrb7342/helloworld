package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ﰢ���� ���̸� �Է����ּ���");
		int height = sc.nextInt();
		
		for(int i=1; i<=height; i++) {
			for(int j=1; j<=height-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=1; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		sc.close();
	}

}
