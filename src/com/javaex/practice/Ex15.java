package com.javaex.practice;

public class Ex15 {

	public static void main(String[] args) {
	
		int[]leftArray = new int[] {10,20,30};
		int[]rightArray= new int[] {10,20,30};
		//갯수가 같아야한다.
		//각각의 방번호와 값이 같아야한다.
		if(leftArray.length==rightArray.length) {
			//방의 갯수가 같으면
		System.out.println("방의 갯수가 같습니다.");
		//계속 검사
		for(int i=0;i<leftArray.length;i++) {
			if(leftArray[i]==rightArray[i]) {
				System.out.println(i+"번째 값이 같습니다.");
				}
			else {
			System.out.println("방의 개수가 다릅니");	
		}
		
		}

	}

}
	}
