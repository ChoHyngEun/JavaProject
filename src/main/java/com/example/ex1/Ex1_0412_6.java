package com.example.ex1;


import java.util.Scanner;

//정숫값을 읽어 부호(양수/음수/0)을 판정하는 프로그램을 작성하자.
//읽은 정수값의 부호(양수/음수/0)을 판정해서 표시
public class Ex1_0412_6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수값 : ");

        int n = stdIn.nextInt();

        if(n>0){
            System.out.println("입력하신 숫자는 양수입니다.");
        }else if(n<0){
            System.out.println("입력하신 숫자는 음수입니다.");
        }else{
            System.out.println("입력하신 숫자는 0입니다.");
        }

    }
}
