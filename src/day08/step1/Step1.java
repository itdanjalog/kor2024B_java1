package day08.step1;

public class Step1 {

    public static void main(String[] args) {
        // 번역된 코드들을 읽어드리는 행위/ 일
        // 1. 클래스 기반으로 객체 만드는 방법
        Car 유재석카 = new Car();
        System.out.println( 유재석카 );     // 객체가 위치하는 메모리 주소 출력 확인
            // 1. Car : 우리 만든 객체 설계도/클래스 이름
            // 2. 변수명 : 아무거나
            // 3. = 대입
                // ======= 객체 생성 하는 방법 ======
            // 4. new : 객체 만드는 행위(인스턴스화)
            // 5. Car() : 생성자
        Car 강호동카 = new Car(); // 두 변수에 저장된 객체는 같다 vs 다르다.(o)
        System.out.println( 강호동카 );     // 객체가 위치하는 메모리 주소 출력 확인

        // 객체가 위치하는 메모리 주소가 생성되었지만 변수에 저장 안함.
        new Car();

        int 정수1 = 3;
        int 정수2 = 3; // 두 변수에 저장된 3의 값은 같다 ( o ) vs 다르다.

        // 3; 자료/데이터  , 분류(타입) 정수(int) 기본 타입
        // 3.15; 자료/데이터 , 분류(타입) 실수(double) 기본 타입
        // new Car(); 자료/데이터 , 분류(타입)  Car 참조 타입
        // 변수 선언하는 방법
        // 1. 타입 : 1.기본(8개,미리만든설계도)타입 2.참조(클래스명) 타입
        // 2. 변수명 : 아무거나
        // 3. = 대입
        // 4. 자료/데이터 : 리터럴 , 객체가위치한 주소값

        // 실습1 : 카페 에서 키오스크 만들예정 입니다.
            // '아메리카노' 설계 해서 속성( 원두 , 사이즈 , 샷 ) 을 정의한다.
            // '아메리카노' 클래스 정의하는 코드 작성하시오.
            // 3개의 아메리카노 객체를 생성하는 코드 작성하시오.

    }
}
















