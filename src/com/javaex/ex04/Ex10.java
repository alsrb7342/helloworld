package com.javaex.ex04;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int code;
		System.out.println("���(����)�� �Է����ּ���");
		System.out.print("���: ");
		code = sc.nextInt();
		
		if(code%3==0) {
			System.out.println("A���Դϴ�.");
		}
		else if(code%3==1) {
			System.out.println("B���Դϴ�.");
		}
		else if(code<0) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		else {
			System.out.println("C���Դϴ�.");
		}
		
		
		sc.close();
	}

}
