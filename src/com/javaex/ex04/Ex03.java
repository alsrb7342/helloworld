package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է����ּ���");
		System.out.print("����: ");
		age = sc.nextInt();
		
		if(age<20 && age>0) {
			System.out.println("\"1���׷�\"");
		}
		else{
			System.out.println("\"2���׷�\"");
		}
		System.out.println("�Դϴ�.");
		
		
		
		sc.close();
	}

}
