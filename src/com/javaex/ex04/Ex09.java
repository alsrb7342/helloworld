package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.print("ù��° ����: ");
		num1 = sc.nextInt();
		
		System.out.print("�ι�° ����: ");
		num2 = sc.nextInt();
		
		if(num1>num2 && num1%num2==0) {
			System.out.println(num2 + " ��(��) " + num1 + " �� ����Դϴ�.");
		}
		else if(num1<num2 && num2%num1==0) {
			System.out.println(num1 + " ��(��) " + num2 + " �� ����Դϴ�.");
		}
		else if(num1>num2 && num1%num2!=0){
			System.out.println(num2 + " ��(��) " + num1 + " �� ����� �ƴմϴ�.");
			
		}
		else {
			System.out.println(num1 + " ��(��) " + num2 + " �� ����� �ƴմϴ�.");
		}
		
		
		sc.close();
	}

}
