package com.example.ex1;

import java.util.Scanner;

/*입력한 점수에 따라 수/우/미/양/가를 판정하는 프로그램을 작성하자.*/
public class Ex1_0412_11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("점수를 입력해주세요 : ");

        int n = stdIn.nextInt();

        if(n >=0 && n <= 49){
            System.out.print("가");
        }else if(n>=50 && n <= 59){
            System.out.print("양");
        }else if(n>=60 && n <=69){
            System.out.print("미");
        }else if(n>=70 && n <=79){
            System.out.print("우");
        }else if(n>=80 && n <=100){
            System.out.print("수");
        }else{
            System.out.print("잘못된 점수입니다.");
        }
    }
}
