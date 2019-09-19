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


