package com.javaex.ex04;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cm;
		int kg;
		
		
		System.out.println("Ű�� �����Ը� �Է����ּ���.");
		System.out.print("Ű: ");
		cm = sc.nextInt();
		
		System.out.print("������: ");
		kg = sc.nextInt();
		
		
		
		
		if((cm-100)*0.9<72) {
			int a = (int) ((cm-100)*0.9);
			System.out.println("��ü���Դϴ�.");
			System.out.println("ǥ��ü��: " + a);
		}
		else if((cm-100)*0.9==72) {
			int a = (int) ((cm-100)*0.9);
			System.out.println("ǥ���Դϴ�.");
			System.out.println("ǥ��ü��: " + a);
		}
		else if((cm-100)*0.9>72) {
			int a = (int) ((cm-100)*0.9);
			System.out.println("��ü���Դϴ�.");
			System.out.println("ǥ��ü��: " + a);
		}
		
		
		
		sc.close();
	}

}
