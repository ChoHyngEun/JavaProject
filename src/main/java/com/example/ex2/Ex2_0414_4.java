package com.example.ex2;

import java.util.Scanner;

//키보드에서 입력한 3개의 정수 중 최소값을 구하는 프로그램을 작성하자.
// 3개의 정수 중 최소값 구하기
public class Ex2_0414_4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수값 A: "); int a = stdIn.nextInt();
        System.out.print("정수값 B: "); int b = stdIn.nextInt();
        System.out.print("정수값 C: "); int c = stdIn.nextInt();

        int min = a;

        if (b<min) min = b;
        if (c<min) min = c;

        System.out.print("최솟값은"+min+"입니다.");
    }
}
