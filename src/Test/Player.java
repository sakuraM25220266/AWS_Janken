package Test;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Player {
    static final String ROCK = "グー";
    static final String SCISSORS = "チョキ";
    static final String PAPER = "パー";
    static int input;
    static String playerHand = null;

    public static String getPlayerHand(){
        Scanner scan = new Scanner(System.in);

        while (true){
            try{
                System.out.println("出したい手を0～2の中から半角で入力してください(0:グー、1:チョキ、2:パー)");
                input = scan.nextInt();
    
                if(input == 0){
                    playerHand = ROCK;
                    break;
                }else if(input == 1){
                    playerHand = SCISSORS;
                    break;
                }else if(input == 2){
                    playerHand = PAPER;
                    break;
                }else{
                    System.out.println("入力できるのは0~2までの範囲です。もう一度入力してください。");  
                }
            }catch(InputMismatchException e){
                System.out.println("文字は入力できません。もう一度入力してください。");
                scan.next();
            } 
                        
         }
        return playerHand;  
    }
}