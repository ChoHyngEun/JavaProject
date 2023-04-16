package com.example.ex2;

//2개의 정수값을 내림차순(큰순)으로 정렬하느 프로그램을 작성하자.
//두 정수값을 읽어서 내림차순(큰순)으로 정렬

import java.util.Scanner;

public class Ex2_0416_7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 a: "); int a = stdIn.nextInt();
        System.out.print("정수 b: "); int b = stdIn.nextInt();

        if(a<b){
            int t = a; //a가 b보다 작으면
            a=b;       //순서를 교환
            b=t;
        }
        System.out.print("a>=b가 되도록 정렬했습니다.");
        System.out.print("변수 a는"+a+"입니다.");
        System.out.print("변수 b는"+b+"입니다.");
    }
}
