package com.nur.t1;

import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		// 스캐너 사용
		// 주민등록번호 입력 941101-1000000
		// 나이, 계절, 성별

		Scanner sc = new Scanner(System.in);
		
		
		// 나이
		String joomin = "990722-1234567";
		String a = joomin.substring(0, 2);
		int year = 1900+Integer.parseInt(a);
		System.out.println(2019-year);
		
		// 계절
		a = joomin.substring(2, 4);
		int season = Integer.parseInt(a);
		if(season>=3 && season<=5) {
			System.out.println("봄");
		}else if(season>=6 && season<=8) {
			System.out.println("여름");
		}else if(season>=9 && season<=11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
		// 성별
		char ch = joomin.charAt(7);
		if(ch =='1' || ch=='3') {
			System.out.println("남성");
		}else if(ch=='2' || ch=='4') {
			System.out.println("여성");
		}

		
		// System.out.println("주민번호를 입력하세요.");
		// String id = sc.next();

		


	}
}