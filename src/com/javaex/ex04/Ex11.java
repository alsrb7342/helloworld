package com.javaex.ex04;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��µǴ� ������ �Է��ϼ���");
		System.out.print("��ȣ: ");
		String a = sc.nextLine();
		
		System.out.print("����1: ");
		float num1 = sc.nextInt();
		
		System.out.print("����2: ");
		float num2 = sc.nextInt();
		
		
		switch(a) {
		case"+":
			System.out.println("����� " + ((float)(num1+num2)));
			break;
		case"-":
			System.out.println("����� " + ((float)(num1-num2)));
			break;
		case"*":
			System.out.println("����� " + ((float)(num1*num2)));
			break;
		case"/":
			System.out.println("����� " + ((float)(num1/num2)));
			if(num2==0) {
				System.out.println("����� �� �����ϴ�.");
			}
			break;
		
		default:{
			System.out.println("����� �� ���� ��ȣ�Դϴ�.");
				}
				
			
			}
		
		

		
		sc.close();
	}

}
