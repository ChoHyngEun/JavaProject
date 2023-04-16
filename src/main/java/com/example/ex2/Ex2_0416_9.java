package com.example.ex2;

import java.util.Random;

//0,1,2 중 하나의 난수를 생성해서 0이면 " 가위", 1이면 "바위", 2이면 "보"를 표시하는 프로그램을 작성하자.
//생성된 난수에 따라 가위바위보 중 하나를 표시
public class Ex2_0416_9 {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("컴퓨터가 낸 것:");
        int hand = rand.nextInt(3); // 0~2사이의 난수

        switch(hand){
            case 0: System.out.println("가위"); break;
            case 1: System.out.println("바위"); break;
            case 2: System.out.println("보"); break;
        }
    }
}
