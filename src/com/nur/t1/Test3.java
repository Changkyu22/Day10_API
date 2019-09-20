package com.nur.t1;

public class Test3 {
	
	public static void main(String[] args) {
		
		double d = Math.ceil(6.22); // 올림
		System.out.println(d);
		
		d = 6.12;
		d = Math.floor(d); // 내림
		System.out.println(d);
		
		d = 6.48;
		d = Math.round(d); // 반올림
		System.out.println(d); 
		
		d = Math.random();
		System.out.println(d*10); // 랜덤한 숫자를 출력
		
	
	}

}
