package com.example.ex3;

//정수값의 부호를 판정해서 표시하는 Sign 프로그램인 문제3-5를 원하는 만큼 반복해서 입력 및 표시하도록 수정하자.
//읽은 정수값의 부호를 판정해서 표시(원하는 만큼 반복)

import java.util.Scanner;

public class Ex3_0416_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry; // 다시한번?

        //do while 문에 의해 반복되는 루프 바디
        do {
            System.out.print("정수값: ");
            int n = stdIn.nextInt();

            if(n>0)
                System.out.println("이 값은 양수입니다.");
            else if(n<0)
                System.out.println("이 값은 음수입니다.");
            else
                System.out.println("이 값은 0 입니다.");

            System.out.println("다시한번? 1-Yes / 0-No");
            retry = stdIn.nextInt();
        }while(retry == 1);
    }
}
