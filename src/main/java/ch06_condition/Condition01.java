package ch06_condition;

import java.util.Scanner;/*
    조건문
    1. if문 : if 다음에 있는 () 내의 조건식이 true일 때 {} 내의 실행문이 실행됨.
            false면 실행 x

            형식 :
            if(조건식) {    조건식 : true /false로 결론이 날 수 있는 식 또는 문장
            실행문
     }
 */
public class Condition01 {
    public static void main(String[] args) {
        //변수 선언 및 초기화
        int num1 = 10;

        // 조건문 적용
        if (num1 > 0) {
            System.out.println("num1은 양수입니다.");
        }

        if (num1 > 15) {
            System.out.println("num1은 15 초과입니다");
        }

        // Scanner import
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 >>> ");
        int num2 = scanner.nextInt();  // 그러면 실행하기 전까지 num2의 값을 모르겠네요

        if (num2 > 0) {
            System.out.println("num2는 양수입니다.");
        }
        System.out.println("프로그램 종료");

        // Condition02 생성하고 main 적용
    }
}
