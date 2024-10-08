package day10.step1;

// 클래스의 사용처:[2] main함수 가진 실행 클래스
public class Step1 {
    public static void main(String[] args) {

        // (1) 객체 : 클래스(설계도) 기반으로 만들어진 실체물(메모리공간)

        // (1-1) User 객체 1개 생성
        // 기본생성자를 이용한 객체 생성
        User u1 = new User(); // u1.name=null , u1.age = 0

        // (1-2) User 객체 1개 생성
        // "유재석" 값을 전달한다--> 매개변수 가 1개인 생성자에게 전달된다.
        User u2 = new User( "유재석" ); // u2.name="유재석" , u2.age = 0
            // -- !!! : 객체를 이용한 메소드 호출
            u2.생일이벤트(); // ??? 몇살인지 예측 // 0 +1 => 1살
        System.out.println( u2 ); // @58372a00 : 객체가 위치한 메모리 주소 // 컴퓨터마다 다르게 표현될수 있습니다.
            // 예시 : 핸드폰 전화번호 등록할때 , 아버지 : 010-1234-1234
                // ---> 전화걸때 010-1234-1234 대신 아버지 텍스트를 클릭
            // 객체를 호출할때 객체의 주소를 외우지말고.. 객체의 주소를 저장하고 있는 변수를 활용하자.
            // .(접근/도트) 연산자 : 객체주소.[필드명/메소드명]  :  각 객체내 필드 와 메소드를 호출할수 있다.
            // 해석 :u2'의 변수가 가지고 있는 객체주소의 접근해서 '생일이벤트()' 메소드를 호출한다.

        // (1-3) User 객체 1개 생성
        // "강호동" 과 35 값을 전달한다 --> 매개변수 가 2개인 생성자에게 전달한다.
        User u3 = new User( "강호동" , 35 ); // u3.name="강호동" , u3.age = 35
            // -- !!! : 객체를 이용한 메소드 호출
            u3.생일이벤트(); // ??? 몇살인지 예측 // 35 + 1 => 36살

            u3.생일이벤트(); // ??? 몇살인지 예측 // 36 + 1 => 37살

    } // class end
}
