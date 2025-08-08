//package ch09_classes;
//
//import java.util.Scanner;
//
///*
//
// */
//public class ClassMain {
//    public static void main(String[] args) {
//        // 객체 생성
//        ClassA classA1 = new ClassA();
//        Scanner scanner = new Scanner(System.in);
//
//        // 그리고 우리는 객체의 메서드(기능)를 호출했었습니다.
////        scanner.nextLine();
//        //ClassA에 선언된 변수들에 값을 대입하겠습니다.
//        // 객체명.속성명 = 데이터;
//        classA1.num = 1;
//        classA1.name = "김일";
//        classA1.score = 4.2;
//
//        System.out.println(classA1.name + " 학생의 " +
//                "학번은 " + classA1.num + "번 이고, 점수는 "
//                + classA1.score + "점입니다");
//
//
//        //메서드 호출 방법
//        //객체명. 메서드명();
//        classA1.callName(); // scanner.next();와 같은 방식이죠.
//    /*
//      Car의 인스턴스인 myCar라는 객체를 생성하시오
//      color에 빨강 대입, speed에 160 대입
//      yourCar 객체 생성하시오
//      color에 노랑 대입, speed 180 대입
//      myCar는 drive() 메서드 호출
//      yourCar는 brake()  메서드 호출
//      myCar, yourCar에 각각 displayInfo()  메서드 호출하시오
//       */
//    }
//
//    // 객체 생성
//    Car myCar = new Car();
//    // 필드에 값 대입
//    myCar.color = "빨강";
//    myCar.speed = 160;
//    // 객체 생성 2
//    Car yourCar = new Car();
//    yourCar.color = "노랑"
//
//    public Car getYourCar() {
//        // 메서드 호출
//        myCar.drive();
//        yourCar.drive();
//        myCar.brake()
//        yourCar.brake();
//        myCar.displayInfo();
//        yourCar.displayInfo();
//
//        //Constructor 클래스 생성
//        //ConstructorMain 클래스 생성
//
//    }
//}
