package com.example.ex1;

import java.util.Scanner;

//2개의 양의 정숫값을 읽어서, 후자가 전자의 약수이면 "b는 a의 약수이다."라고 표시하고, 그렇지 않으면 " b는 a의 약수가 아니다." 라고 표시하는 프로그램을 작성하자.
public class Ex1_0412_4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수값 A: "); int a = stdIn.nextInt();
        System.out.print("정수값 B: "); int b = stdIn.nextInt();

        if(a%b==0){
            System.out.println("B는 A의 약수입니다.");
        }else{
            System.out.println("B는 A의 약수가 아닙니다.");
        }
    }

}
