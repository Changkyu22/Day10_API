package com.nur.t1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// 스캐너 사용
		// 주민등록번호 입력 941101-1000000
		// 나이, 계절, 성별

		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요.");
		String id = sc.next();

		String age = id.substring(0, 2);
		int year = 1900+Integer.parseInt(age);
		System.out.println(2019-year);

		
		String season = id.substring(2, 4);
		int s = Integer.valueOf(season);
		if(s<4) {
			System.out.println("봄에 태어났습니다.");
		}else if(s<7){
			System.out.println("여름에 태어났습니다.");
		}else if(s<10){
			System.out.println("가을에 태어났습니다.");
		}else if(s<13){
			System.out.println("겨울에 태어났습니다.");
		}

		
		int x = id.charAt(7);
		// int x = Integer.valueOf(sex);
		// int x = Integer.valueOf(sex);
		if(x=='1' || x=='3' || x=='5') {
			System.out.println("남성입니다.");
		}else if(x=='2' || x=='4' || x=='6') {
			System.out.println("여성입니다.");
		}
		
		
	}
}
