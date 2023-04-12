package com.example.ex1;

import java.util.Scanner;

//입력한 정수값이 5로 나누어 떨어지면 " 이 값은 5로 나누어집니다."
//라고 표시하고 그렇지 않으면 " 이값은 5로 나누어 지지 않습니다." 라고 표시하는 프로그램을 작성하자.
// 읽은 정수값이 양의 정수이면 5로 나누어 떨어지는지 여부를 표시
public class Ex1_0412_8 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수값 : ");

        int n = stdIn.nextInt();
        if(n%5==0){
            System.out.println("정수가 5로 나누어 집니다.");
        }else{
            System.out.println("정수가 5로 나누어 지지 않습니다.");
        }
    }
}
