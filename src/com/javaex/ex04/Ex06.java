package com.javaex.ex04;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.print("ù��° ����: ");
	    num1 = sc.nextInt();
	    System.out.print("�ι�° ����: ");
	    num2 = sc.nextInt();
	    
	    if(num1>num2) {
	    	int a = num1/num2;
	    	System.out.println("��: " + a);
	    	System.out.println("������: " + num1%num2);
	    }
	    else if(num1<num2) {
	    	int a = num2/num1;
	    	System.out.println("��: " + a);
	    	System.out.println("������: " + num2%num1);
	    
	    }
	    else if(num1==num2) {
	    	System.out.println("��: 1");
	    	System.out.println("������: 0");
	    }
		
		
		sc.close();
	}

}
