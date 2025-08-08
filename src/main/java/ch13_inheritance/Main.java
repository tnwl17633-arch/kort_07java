package ch13_inheritance;

import java.sql.SQLOutput;
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("나이");
        Animal animal3 = new Animal(1);
        Animal animal4 = new Animal("바둑이", 2);

        System.out.println(animal1.getAnimalName());

        //Tiger 객체 생성
        Tiger tiger1 = new Tiger();
        tiger1.setAnimalName("푸바오");
        tiger1.setAnimalAge(3);
        String tigerName = tiger1.getAnimalName();
        int tigerAge = tiger1.getAnimalAge();
        System.out.println("이 호랑이의 이름은 " + tigerName);
        System.out.println(tigerAge + " 살입니다.");

        tiger1.hunt();
        tiger1.hunt();
        tiger1.move();      // 재정의된 move() 호출
        animal1.move();     // 부모 method 원본 그대로 호출

        Human human1 = new Human();
        
    }
}
// Main에서
//    human1 객체를 생성(기본 생성자 사용)
//        setter를 통해 여러분이름과 여러분나이를 입력, 
//        getter를 활용하여
//                안녕하세요, 제 이름은 여러분이름이고 나이는 몇살입니다.
    /*
        내년에는 몇+1살이 됩니다.
        를 출력하시오
        또한 Human 클래스의 고유 메서드인 read("자바의 기초")를     -> call2() 유형입니다
        정의하여 콘솔에 다음과 같이 출력될 수 있도록 작성하시오.
        
        여러분이름이 자바의 기초를 읽는 중입니다.
        
        실행 예
        사람 객체가 생성되었습니다
        사람이 두 발로 걷습니다
        안녕하세요, 제 이름은 여러분이름이고 나이는 몇살입니다.
        내년에는 몇+1살이 됩니다.
        여러분이름이 자바의 기초를 읽는 중입니다.
     */
    
