package com.nur.t1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// 주민번호 입력
		// 9	7	1	2	2	2	1	2	3	4	5	6	7(검증용번호)
		// 1. *2	*3	*4	*5	*6	*7	*8	*9	*2	*3	*4	*5	
		// 2. 18	21	4	10	12	14	8	28	6	12	20	30
		// 3. 173 / 11 -- 몫16 ...나머지 7

		// 4. 11- (나머지 7) --- 4		*나머지 범위 : 0~10
		// 4-1. 결과값이 두자리라면 (결과값 / 10) --- 나머지 결과값을 대입
		// 5. 결과값 == 검증용번호

		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요.");
		String joomin = sc.next();
		int [] num = {2,3,4,5,6,7,8,9,2,3,4,5,1};
		int sum =0;
		int [] num2 = new int [joomin.length()]; 

		for(int i=0; i<joomin.length();i++) {
			String ch = joomin.substring(i, i+1);
			int check = Integer.parseInt(ch);
			num2[i] = check;
		}

		for(int i=0; i<joomin.length();i++) {
			sum = sum+(num[i]*num2[i]);
		}
		if(11-(sum-Integer.parseInt(joomin.substring(12)))%11 == Integer.parseInt(joomin.substring(12))) {
			System.out.println("검증완료");
		}else {
			System.out.println("잘못된 주민번호입니다.");
		}
	}
}

/**
	int sum = 0; // 합계를 담을 변수
	int idx = 2; // 곱할 숫자를 담을 변수
	
	1. Split
		String [] joomins = jumin.split("");

	2. subString
		for(int i=0; i<joomin.length;i++){
			if(i==6) {
				continue;
			}
			String n1 = joomin.subString(i,i+1);
			int n = Integer.parseInt(n1);
			System.out.println(n1);
		}
	
	3. charAt
		for(int i=0; i<joomin.length()-1;i++) {
			if(i==6) {
				continue;
			}
			char ch = joomin.charAt(i);
			String n1 = String.valueOf(ch);// char 타입의 숫자를 String 타입으로 바꿔주는 코딩 추가 실행
			
			
			int n = Integer.parseInt(n1);
			sum = sum + (n*idx);
			idx++;
			if(idx==10) {
				idx=2;
			}
		}
		sum = sum%11;
		
		sum = 11-sum;
		
		sum = sum%10;
		
		int result = Integer.parseInt(String.valueOf(joomin.charAt()-1));
		if(sum == result) {
			System.out.println("맞는 주민번호");
		}else {
			System.out.println("틀린 주민번호");
		}
*/













