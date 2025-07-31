package ch07_loops;

import java.util.Scanner;

/*
    Scanner을 이용한 별찍기

    몇 줄의 별을 생성하시겠습니까? >>> 3

    *
    **
    ***
    로 만들어질 수 있도록 작성하시오.
    다 하신 분들은

    ***
    **
    *
 */
public class Loop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 0;
        System.out.print("몇 줄의 별을 생성하시겠습니까? >>> ");
        row = scanner.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("😊");
            }
            System.out.println();
        }

        System.out.println();
        // row를 활용한 반복문 작성
        Scanner scanner2 = new Scanner(System.in);
        int column = 0;
        System.out.print("몇 줄의 별을 생성하시겠습니까? >>> ");
        column = scanner2.nextInt();
        for (int i = 0; i < column; i++) {
            for (int j = column; j > i; j--) {
                System.out.print("😊");
            }
            System.out.println();


        }
    }
}