package com.example.ex2;
//두 정수값의 차가 10이하인 경우" 두값의 차는 10이하입니다." 라고 표시하고, 그렇지않으면 " 두값의 차는 11이상입니다." 라고 표시하는 프로그램을 작성하자.
//읽은 두 값의 차가 10이하인지를 표시

import java.util.Scanner;

public class Ex2_0414_3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수 A : "); int a = stdIn.nextInt();
        System.out.print("정수 B : "); int b = stdIn.nextInt();

        int diff = a>=b ? a-b:b-a;

        if(diff<=10){
            System.out.println("두 값의 차는 10 이하입니다.");
        }else {
            System.out.println("두 값의 차는 11이상입니다.");
        }



    }
}
