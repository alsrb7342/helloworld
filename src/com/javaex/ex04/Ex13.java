package com.javaex.ex04;

import java.util.Scanner;

public class Ex13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    float x;
		float a;
		
		System.out.println("���ڸ� �Է��� �ּ���");
		System.out.print("����: ");
		x = sc.nextInt();
		
		if(x<=0) {
			a = (x*x*x)-(9*x)+2;
			System.out.println("������� " + a + " �Դϴ�.");
		}
		else if(x>0) {
			a = (7*x)+2;
			System.out.println("������� " + a + " �Դϴ�.");
		}
		else {
			System.out.println("������� 2.0 �Դϴ�.");
		}
		
		
		sc.close();
	}

}
