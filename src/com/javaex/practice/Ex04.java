package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		for(int i=1;i<5;i++) {
			System.out.println(i);
	/*i는 1부터 4가 될 때까지 반복한다. 연산자는 i++이기 때문에 1부터 4까지 표기될 것이다.
	 표기는 println으로 인해 아래로 1,2,3,4 가 표기된다.*/
		}
System.out.println("==============");
	for(int i=10;i>0;i=i-2) {
		System.out.println(i);
	/*i=10의 값으로 인해 10부터 0이 될때까지 반복할 것이다. 다만, i는 계속해서 -2가 되기 때문에
	 10,8,6,4,2를 아래로 표기하게 될 것이다. 아래로 표기하는 이유는 위와 같다. 결과적으로 이런 결과가 나올 것이다.
	 1
	 2
	 3
	 4
	 =============
	 10
	 8
	 6
	 4
	 2
	 */
		}
	}

}
