package com.example.ex1;

//2개의 변수 a,b에 값을 읽어서 a,b의 대소 관계를 다음과 같이 표시하는 프로그램을 작성하자.
//"a가 크다.","b가 크다","a와 b가 같다."
//읽은 정수값의 대소 관계를 표시

import java.util.Scanner;

public class Ex1_0412_7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("변수 A: "); int a = stdIn.nextInt();
        System.out.print("변수 B: "); int b = stdIn.nextInt();

        if(a>b){
            System.out.println("변수 A가 B보다 큽니다.");
        }else{
            System.out.println("변수 B가 A보다 큽니다.");
        }

    }
}
