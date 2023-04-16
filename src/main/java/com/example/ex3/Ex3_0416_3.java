package com.example.ex3;
//2자리의 정수값을(10~99)을 맞추는 '숫자 맞추기 게임'을 만들자. 난수생성과 if문 그리고 do문을 사용할 것.
//숫자 맞추기 게임

import java.util.Random;
import java.util.Scanner;

public class Ex3_0416_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        int no = 10 + rand.nextInt(90); //맞춰야 하는 숫자 : 10~99의 난수 생성
        System.out.println("숫자 맞추기 게임 시작!");
        System.out.println("10부터 99사이의 숫자를 맞추세요.");

        int x; //읽는값
        do{
            System.out.println("어떤 숫자일까? : ");
            x=stdIn.nextInt();

            if(x>no)
                System.out.println("더 작은 숫자입니다.");
            else if(x<no)
                System.out.println("더 큰 숫자입니다.");
            //정답이 아니면 반복한다.
        }while(x != no);
        System.out.println("정답 입니다.");

    }

}
