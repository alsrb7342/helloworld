package com.javaex.ex04;

import java.util.Scanner;

public class Ex14 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float a;
		float b;
		
		System.out.println("������ �Է��� �ּ���");
		System.out.print("����: ");
		a = sc.nextInt();
		
		if(a>=0 && a<=1000) {
			b = (float) (0.09*a);
			System.out.println("�ҵ漼�� " + b + " �Դϴ�.");
		}
		else if(a>1000 && a<=4000) {
			b =(float) ((1000*0.09) + 0.18*(a-1000));
			System.out.println("�ҵ漼�� " + b + " �Դϴ�.");
		}
		else if(a>4000 && a<8000) {
			b = (float) (1000*0.09 + 3000*0.18 + 0.27*(a-4000));
			System.out.println("�ҵ漼�� " + b + " �Դϴ�.");
		}
		else if(a>=8000) {
			b = (float) (1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(a-8000));
			System.out.println("�ҵ漼�� " + b + " �Դϴ�.");
		}
		else {
			System.out.println("�߸� �Է��߽��ϴ�.");
		}
		
		
		sc.close();
	}

}
