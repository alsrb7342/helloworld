package com.javaex.ex01;

public class Ex09 {
	public static void main(String[] args) {
		
		int a = 5, b = 7;
		
		//논리연산자
		
		//&&
	    System.out.println("&&연산자");
	    System.out.println(true&&true);  // T&&T --> T
	    System.out.println(true&&false);  // T&&F --> F
	    System.out.println(false&&true);  // F&&T --> F
	    System.out.println(false&&false);  // F&&F --> F
	    
	    System.out.println("||연산자");
	    System.out.println(true||true);  // T||T --> T
	    System.out.println(true||false); // T||F --> T
	    System.out.println(false||true); // F||T --> T
	    System.out.println(false||false); // F||F --> F
	    
	    //응용
	    System.out.println("응용");
	    System.out.println( (a>b) || (a<b) );  //5>7 -->F  5<7 -->T F||T --> T 
	    System.out.println( (a>=b) && (a<=b)); //5>=7 -->F  5<=7 -->T F&&T --> F
	    System.out.println( (a==b) || (a!=b) ); //5==7 -->F  5!=7 --> T F||T --> T
	    
	    System.out.println("!연산자");
	    System.out.println( (a>b) );  //5>7 --> F
	    System.out.println( !(a>b) ); //!5>7 --> T
	    System.out.println( !(a<b) );  //!5<7 --> F
	    
	    double result = (double) (5*6)+(5/8); 
	    System.out.println(result);
	    
	}

}
