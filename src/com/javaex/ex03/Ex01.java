package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���");
		int a = sc.nextInt();
		
		
			if(a%3==0 && a>0) {
				System.out.println("3�� ����Դϴ�.");
				}
			else if(a%3!=0 && a>0) {
				System.out.println("3�� ����� �ƴմϴ�.");
			}
			else if(a==0){
				System.out.println("����");
		}
		
		
		
		
		sc.close();
		
		
		
	}

}
