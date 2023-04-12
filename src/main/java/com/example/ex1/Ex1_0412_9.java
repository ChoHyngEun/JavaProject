package com.example.ex1;


import java.util.Scanner;

/*입력한 정수값이 10의 배수이면 '이값은 10의 배수입니다.'라고 표시하고, 그렇지 않으면 '이 값은 10의 배수가 아닙니다.'라고 표시하는 프로그램을 작성하라
* (음수를 읽은 경우'음의 정수값을 입력했습니다.'라고 표시할 것.*/
//읽은 정수값이 양수이면 10의 배수인지 판정해서 표시
public class Ex1_0412_9 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수값: ");
        int n = stdIn.nextInt();

        if(n>0){
            if(n%10==0){
                System.out.println("이 값은 10의 배수입니다.");
            }else{
                System.out.println("이 값은 10의 배수가 아닙니다.");
            }
        }else if(n<0){
            System.out.println("음의 정수값을 입력했습니다.");
        }else if(n==0){
            System.out.println("0을 입력하셨습니다.");
        }
    }
}
