package com.example.ex1;


import java.util.Scanner;

//정숫값을 읽어서 절댓값을 표시하는 방법2
public class Ex1_0412_3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정숫값: ");

        int n = stdIn.nextInt();
        int abs;

       if(n>=0){
           abs = n;
       }else {
           abs = -n;

       }System.out.print("절댓값은"+abs+"입니다.");
    }
}
