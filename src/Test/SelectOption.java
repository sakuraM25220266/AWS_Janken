package Test;

import java.util.Scanner;

public class SelectOption {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("オプションを選んで数字を入力してください。");
            System.out.println("0:じゃんけんをする。");
            System.out.println("1:じゃんけんの対戦履歴を表示する。");
            System.out.println("2:終了する。");
            System.out.print("選択:");

            int option = scan.nextInt();
            
            switch (option) {
                case 0:
                    PlayJanken.playJanken();
                    break;
                case 1:
                    MatchRecord.showMatchRecord();
                    break;
                case 2:
                    System.out.println("プログラムを終了します");
                    scan.close();
                    return;
                default:
                    System.out.println("無効な値が入力されました。もう一度選択してください。");
                    break;
            }
            
        }
    }
}
