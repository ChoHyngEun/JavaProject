package com.example.ex2;
//3개의 정수값을 오름차순으로 정렬


import java.util.Scanner;

public class Ex2_0416_8 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 a: "); int a = stdIn.nextInt();
        System.out.print("정수 b: "); int b = stdIn.nextInt();
        System.out.print("정수 c: "); int c = stdIn.nextInt();

        if(a>b){
            int t = a; a= b; b= t;
        }
        if(b > c){
            int t = b;
            b= c;
            c= t;
        }
        if(a>b){
            int t = a;
            a= b;
            b= t;
        }

        System.out.println("a<=b<=c가 되도록 정렬했습니다.");
        System.out.println("변수 a는 "+a+"입니다.");
        System.out.println("변수 a는 "+b+"입니다.");
        System.out.println("변수 a는 "+c+"입니다.");
    }
}
