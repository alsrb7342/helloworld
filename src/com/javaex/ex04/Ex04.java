package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("���̸� �Է����ּ���");
		System.out.print("����: ");
		age = sc.nextInt();
		
		if(age>=19 && age<65) {
			System.out.println("1���׷� �Դϴ�.");
		}
		else {
			System.out.println("2���׷� �Դϴ�.");
		}
		
		
		
		
		sc.close();
	}

}
