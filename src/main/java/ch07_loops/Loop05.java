package ch07_loops;

import java.util.Scanner;

/*
    중첩 for문도 가능합니다.
    for (int i = 0 ; i < 100 ; i++) {
        반복실행문 1-a
        for(int j = 0 ; j < 100 ; j++) {
            반복실행문2
         }
         반복실행문1-b
     }
     for문을 활용하여 1일차 1교시입니다. ~ 5일차 3교시입니다. 까지 출력하시오.
 */
public class Loop05 {
    public static void main(String[] args) {
//        for (int i = 1; i < 6; i++) {
//            for (int j = 1; j < 4; j++) {
//                sum5 += i++;
//                System.out.println(i + " 일차 " + j + "교시입니다.");
//            }
//        }
//
//        for(int i = 2 ; i < 10 ; i++) {
//            for(int j = 1 ; j < 10 ; j ++) {
//                System.out.println(i + " x " + j + " = " = (i*j));
//            }

        /*
            1 2 3 4 5 ... 10
            11 ... 20
            91 ... 100
         */

//        for(int j = 1; j < 101; j+= 10)
//       System.out.println(j + " " + (j+1) + " " + (j+2) + " " + (j+3) + " " +  (j+4) +
//            (j+5) + " "+ (j+6) + " " +(j+7) + " " + (j+8) + " " + (j+9));
//        }

//        for (int < 1 ; i < 101 ; i++) {
//            System.out.println(++i + " ");
//            if (i % 10 == 0 ; i+) {
//                System.out.println();

        /*
            숫자를 입력 받아서 n까지 더하는 반복문을 for문으로 작성하시오.
            실행 예
            1부터 몇 까지 더하시겠습니까? >>> 10
            1부터 10까지의 합은 55입니다.

            위에거 다 하신 분들은
            1부터 10까지의 숫자 중 짝수의 합도 도출하시오.
          */
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("1부터 몇 까지 더하시겠습니까? >>> ");
        int n = scanner.nextInt();
        for(int i = 1 ; i < n+1 ; i++) {
            sum += i;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");


    }
}