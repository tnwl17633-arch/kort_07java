package students;


public class StudentMain {
    public static void main(String[] args) {

        Student Student1 = new Student();
        Student1.studentCode = 2025001;
        Student1.name = "김일";
        Student1.score = 4.5;

        Student Student2 = new Student(100);
        Student2.studentCode = 2025002;
        Student2.name = "김이";
        Student2.score = 100;

        Student Student3 =  new Student("김이");
        Student3.studentCode = 2025003;
        Student3.name = "김삼";
        Student3.score = 95.8;

        Student Student4 = new Student(2, "김삼");
        Student4.studentCode = 2025004;
        Student4.name = "김사";
        Student4.score = 4.9;

        Student Student5 = new Student(2,"김사",8);
        Student5.studentCode = 2025005;
        Student5.name = "김오";
        Student5.score = 80.7;

        System.out.println();
        Student1.showInfo();
        Student2.showInfo();
        Student3.showInfo();
        Student4.showInfo();
        Student5.showInfo();


        // 객체의 필드에 값을 대입하는 방법

        //두 번째 객체 어떤 생성자 쓸지, 속성
//        System.out.println("기본 생성자로 객체를 생성했습니다. >>> ");
//        String title = "김일";
//        Student(int student);
//        Student(String student)
//        student(int StudentCode);
//        System.out.println("int 매개변수 생성자로 객체를 생성했습니다.");

    }
}
