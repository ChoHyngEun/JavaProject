package com.example.ex1;


import java.util.Scanner;

/*입력한 정수값을 3으로 나눈다. 그리고 그결과에 따라 "이값은 3으로 나누어집니다.","이 값을 3으로 나눈 나머지는 1입니다."
* "이 값을 3으로 나눈 나머지는 2입니다." 중 하나를 표시하는 프로그램을 작성하자(단, 양수가 아닌경우" 양수가 아닌 값을 입력했습니다." 라고 표시할것).*/
// 읽은 정수값이 양수이면 3으로 나눈 결과를 표시
public class Ex1_0412_10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수값: ");

        int n = stdIn.nextInt();

        if(n>0){
            if(n%3==0){
                System.out.println("정수값이 3으로 나누어집니다.");
            }else if(n%3==1){
                System.out.println("정수값이 3으로 나눈 나머지는 1입니다..");
            }else /*if(n%3==2)*/{
                System.out.println("정수값이 3으로 나눈 나머지는 2입니다.");
            }
        }else{
            System.out.println("양수가 아닌 값을 입력했습니다.");
        }
    }
}
