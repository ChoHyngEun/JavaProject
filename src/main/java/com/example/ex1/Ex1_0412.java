package com.example.ex1;

import java.util.Scanner;

/*문제
* 키보드로 입력한 정숫 값이 음이면 "이 값은 음의 값입니다." 라고 표시하는 프로그램을 작성하자.
* */
public class Ex1_0412 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값:");
        int n = stdIn.nextInt();

        //if - then 문 : if(조건식) 실행문
        if(n<0)
            //n<0이 true(참) 일 때 실행한다.
            System.out.println("이 값은 음의 값입니다.");
        else
            System.out.println("이 값은 양의 값입니다.");

    }
}
