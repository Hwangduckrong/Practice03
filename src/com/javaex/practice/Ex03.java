package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		int x,y;
		for(x=0;x<4;x++) {
		 for(y=2;y>=0;y--) {	
			 System.out.print("*");
		 }
		 	System.out.println("");
	     }/*Y=2라는 값이 주어졌고 0이 될때까지 반복하는 반복문을 먼저해결해야한다.
		또한, 연산자가 Y--임으로 2라는 값에서 0이 될때까지 *을 입력하는 행동을 반복한다.
		이를 표현하면  ***(2,1,0)이다.또한, 아래 println으로 인하여 해당 *은 반복을 완료한 후 아래줄로 내려갈 것이다.
		x=0부터 4가 될때까지 해당 부분을 반복할 것이다. 즉 결과는 
		***
		***
		***
		*** 이 될 것이다. */

	}
}
