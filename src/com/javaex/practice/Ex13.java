package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("숫자를 입력하세요: ");
	int a = sc.nextInt();
	int score = 0;
	for(int i=1;i<=a;i++) {
		score = score+ i;
	}
		for(int b=1; b<=a;b++) { 
	     if(b<=a) {
	    System.out.print(b+"+");
	     }
	     System.out.println("합계: "+ score);
	sc.close();
	
		}//end of method
}//end of class
}