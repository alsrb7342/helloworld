package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ĺ� 1����(�ҹ���)�� �Է��ϼ���");
		System.out.print("���ĺ�: ");
		String code = sc.nextLine();
		
		switch(code) {
		case "a":
			System.out.println("�����Դϴ�.");
			break;
		case "e":
			System.out.println("�����Դϴ�.");
			break;
		case "i":
			System.out.println("�����Դϴ�.");
			break;
		case "o":
			System.out.println("�����Դϴ�.");
			break;
		case "u":
			System.out.println("�����Դϴ�.");
			break;
		default:
			System.out.println("�����Դϴ�.");
			break;
		}
		
		
		
		sc.close();
	}

}
