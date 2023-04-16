package com.example.ex3;

import java.util.Scanner;

//3자리의 양의 정수값(100~999)을 읽는 프로그램을 작성하라(입력한 값이 3자리 양의 정수값이 아니면 다시 입력하게 할것).
//3자리의 양의 정수값 읽기
public class Ex3_0416_2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int x;

        do {
            System.out.print("세자리의 정수값 : ");
            x = stdIn.nextInt();

        }while(x<100||x>999);

        System.out.println("입력한 값은 "+x+"입니다.");

    }
}
