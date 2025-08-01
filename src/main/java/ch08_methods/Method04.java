package ch08_methods;

import java.util.Scanner;

public class Method04 {

    public static String getStar() {
        String result = "";



        return result;
    }

    public static void main(String[] args) {
        System.out.println(getStar());
        Scanner scanner = new Scanner(System.in);
        // Method02에서 main 단계에 써둔 부분을 여기에 다 가지고 오면
        // getStar() 메서드를 호출하는 것만으로도 동일한 결과없이 나오지 않을까요

        int rows = 0;
        int option = 0;
        System.out.println(" 몇 줄 짜리 별을 생성하시겠습니까? >>> ");
        rows = scanner.nextInt();
        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 증가하는 별");
        System.out.println("4. 오른쪽으로 치우친 증가하는 별");
        System.out.println("선택하세요 >>> ");
        option = scanner.nextInt();

        //switch로 작성하시오.





    }

    }
