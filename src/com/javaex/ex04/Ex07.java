package com.javaex.ex04;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("����2���� �Է����ּ���.");
		System.out.print("����1: ");
		num1 = sc.nextInt();
		System.out.print("����2: ");
		num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.print("ū��: " + num1 + "       " + "������: " + num2);
		}
		else if(num1<num2) {
			System.out.print("ū��: " + num2 + "       " + "������: " + num1);
		}
		System.out.println("�Դϴ�.");
		
		sc.close();
	}

}
