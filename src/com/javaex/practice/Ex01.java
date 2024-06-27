package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
	System.out.println("while문");
	int index =0;
	while(index<3) {
	System.out.println("index= "+index);
	index++;
	//while문
	//index= 1
	//index= 2
	//index= 3
	/* 틀린 이유: 시작 지점 0.index++는 증가 이전의 값을 대입한다. */
	System.out.println("for문");
	for(int order=0; order<3; order++) {
	System.out.println("order= "+order);
	}
	
	}
	
	}
	
}


