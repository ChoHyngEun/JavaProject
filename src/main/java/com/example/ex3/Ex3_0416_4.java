package com.example.ex3;
//2개의 정수값을 읽어서 두 정수 사이에 있는 모든 정수값 작은 것부터 큰 순으로 표시하는 프로그램을 작성하자.
//두 정수 사이의 정수를 작은 것부터 순서대로 표시

import java.util.Scanner;

public class Ex3_0416_4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수 A: "); int a = stdIn.nextInt();
        System.out.print("정수 B: "); int b = stdIn.nextInt();

        if(a>b){ //a가 b보다 크면
            int t = a;
            a = b;
            b = t;
        }
        do {
            System.out.print(a+"");
            a = a + 1;
        }while(a<=b);
        System.out.println();
    }
}
