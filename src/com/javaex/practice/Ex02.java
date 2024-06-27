package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		int x,y;
		for(x=0; x<4; x++) {//큰 회전, 아래가 끝나면 이 회전이 실행된다.
			for(y=2;y>=0;y--) {//이게 먼저 회전을 한
				System.out.print("*");
				
			}
			System.out.println("");
			//아래로 위 프린트를 내리는 역할을 한다.
		}

	}
 
} 

