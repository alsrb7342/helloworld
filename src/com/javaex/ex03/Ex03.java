package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			String word = sc.next();
			System.out.println("�Է°�: " + word);
			
			if(word.equals("����")) {
				break;
			}
		}
		
		
		sc.close();
	}

}
