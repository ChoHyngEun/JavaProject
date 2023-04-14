package com.example.ex2;

//2개의 실수값 중 큰 값을 표시하는 프로그램을 작성하자.
//읽은 2개의 실수값 중에서 큰쪽을 표시(방법1:if문)

import java.util.Scanner;

public class Ex2_0414_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("실수 A: "); int a = stdIn.nextInt();
        System.out.print("실수 B: "); int b = stdIn.nextInt();

        if(a>b){
            System.out.println("실수 A가 더 큽니다.");
        }else if(b>a){
            System.out.println("실수 B가 더 큽니다.");
        }else{
            System.out.println("실수 A와 B는 같습니다.");
        }

    }
}
