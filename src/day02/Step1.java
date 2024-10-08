// 주석 : 코드의 설명이나 메모 를 작성할때 사용 , 프로그램 실행에 영향을 주지 않는다.
//  한줄주석
/*
    여러줄 주석
*/
/**
 * 코드의 설명의 문서화 주석
 * @version 1.0
 */
package day02; // 해당 클래스가 위치한 패키지/폴더 명
// 패키지란 ? 프로젝트내 폴더의 역할 , 클래스의 식별용

public class Step1 { // 자바의 모든 코드는 클래스 안에서 작성한다.
    // 왜? 자바 코드 는 컴파일(번역) 단위가 클래스단위 이다. 즉] 클래스 밖에 코드는 컴파일(번역)이 안된다.

    // main함수 : 스레드 포함된 함수
        // 스레드 : 번역된 코드를 읽어드리는 실행 흐름 단위
        // main + 엔터 : 자동완성
        // 모든 실행 코드는 main함수 { } 중괄호 안에 작성하자.!
    public static void main(String[] args) { // main start
        // 리터럴 : 프로그램 코드에서 직접 표현한 값 , 고정값
            // 정수 : 10  , 실수:3.14 , 문자 : 'A' , 문자열 : "ABC" , 불리언 : true

        // ; 세미콜론 : [키보드 엔터 에서 왼쪽 2번째 키]
            // 주로 코드 문장의 끝을 나타내는 역할 , 문장의 끝마침.
        System.out.println(); // ; 코드문장의 마침으로써 컴퓨터에게 문장 실행 단위의 뜻

    } // main end
} // class end

