package Janken;
import java.util.Scanner;

/**
 * プレイヤーがじゃんけんの手を出すクラス
 */
public class Player {
    public static void main(String[] args) {
        final String ROCK = "グー";
        final String SCISSORS = "チョキ";
        final String PAPER = "パー";

         //0～2までの標準入力を受け付ける
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        scan.close();
        //入力された数値をもとに、プレイヤーの手を表示する
        //0の場合はグー、1の場合はチョキ、2の場合はパー
        String hand = null;
        if(input == 0){
            hand = ROCK;
        }else if(input == 1){
            hand = SCISSORS;
        }else if(input == 2){
            hand = PAPER;
        }
    }

    public static void displayHand(String hand){
        System.out.println("あなた:" + hand);
    }
}

