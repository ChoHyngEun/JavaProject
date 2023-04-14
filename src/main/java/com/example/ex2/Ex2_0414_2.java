package com.example.ex2;

import java.util.Scanner;

//2개의 정수값을 읽어서 두 값의 차를 표시하는 프로그램을 작성하자.
//읽은 두 정수값의 차를 표시(if문)
public class Ex2_0414_2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("A정수값 : "); int a = stdIn.nextInt();
        System.out.print("B정수값 : "); int b = stdIn.nextInt();

        int diff;

        if(a>=b){
            diff=a-b;
        }else{
            diff = b-a;
        }

        System.out.print("두 값의 차는 "+diff+"입니다.");
    }
}
