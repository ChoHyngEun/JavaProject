package com.example.ex2;

import java.util.Scanner;


//키보드에서 입력한 2개의 정수값 중 작은 값과 큰 값을 표시하는 프로그램을 작성하자.
//두 정수 값이 같으면 " 두값이 같습니다." 라고 표시한다.
//두 정 수 값 중 작은 값과 큰 값을 구해서 표시
public class Ex2_0416_6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("첫번째 정수값 : "); int a = stdIn.nextInt();
        System.out.print("두번째 정수값 : "); int b = stdIn.nextInt();



        if(a>b){
            System.out.println("두 정수 값중 큰 값은"+a+"이고, 작은 값은"+b+"입니다.");
        }else if(a==b){
            System.out.println("두 정수의 값은 같습니다.");
        }else {
            System.out.println("두 정수값중 큰 값은"+b+"이고, 작은 값은"+a+"입니다.");
        }
    }
}
