package JankenTest;
import java.util.Scanner;
import java.util.Random;

/**
 * じゃんけんを行うクラス
 */
class JankenPlay {
    public static void main(String[] args) {
        final String GU = "グー";
        
        System.out.println("コンピュータとじゃんけんしよう！");
        System.out.println("0～2で出したい手を入力してください。0:" + GU + "、1:チョキ、2:パー");
        //0～2までの標準入力を受け付ける
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        scan.close();
        //入力された数値をもとに、プレイヤーの手を表示する
        //0の場合はグー、1の場合はチョキ、2の場合はパー
        String hand = null;
        if(input == 0){
            hand = GU;
        }else if(input == 1){
            hand = "チョキ";
        }else if(input == 2){
            hand = "パー";
        }
        System.out.println("あなた:" + hand);

        // 0～2までの乱数を生成する
        Random rand = new Random();
        int cpu = rand.nextInt(3);
        //生成した乱数をもとに、CPUの手を表示する
        //0の場合はグー、1の場合はチョキ、2の場合はパー
        String cpuHand = null;
        if(cpu == 0){
            cpuHand = GU;
        }else if(cpu == 1){
            cpuHand = "チョキ";
        }else if(cpu == 2){
            cpuHand = "パー";
        }
        System.out.println("相手:" + cpuHand);
        
        

        //判定
        // if(input == 0 && cpu == 0){
        //     System.out.println("あいこです！");
        // }else if(input == 0 && cpu == 1){
        //     System.out.println("あなたの勝ちです！");
        // }else if(input == 0 && cpu == 2){
        //     System.out.println("あなたの負けです！");
        // }else if(input == 1 && cpu == 1){
        //     System.out.println("あいこです！");
        // }else if(input == 1 && cpu == 2){
        //     System.out.println("あなたの勝ちです！");
        // }else if(input == 1 && cpu == 0){
        //     System.out.println("あなたの負けです！");
        // }else if(input == 2 && cpu == 2){
        //     System.out.println("あいこです！");
        // }else if(input == 2 && cpu == 0){
        //     System.out.println("あなたの勝ちです！");
        // }else if(input == 2 && cpu == 1){
        //     System.out.println("あなたの負けです！");
        // }

        //勝敗の判定を行う
        int result;
        if(input == 0){
            result = judge1(cpu);
        }else if(input == 1){
            judge2(cpu);
        }else if(input == 2){
            judge3(cpu);
        }

    
        //結果を表示する
        final String DRAW = "あいこ";
        final String WIN = "勝ち";
        final String LOSE = "負け";
    }

    /**
     * プレイヤーの出した手がグーのときに、勝敗を判定し結果を表示する。
     * cpu == 0のとき、CPUの手はグー
     * cpu == 1のとき、CPUの手はチョキ
     * cpu == 2のとき、CPUの手はパー
     * 
     * @param cpu
     */
    private static int judge1(int cpu){
        if(cpu == 0){
            return 10;
            //System.out.println("あいこです！");
        }else if(cpu == 1){
            return 20;
           // System.out.println("あなたの勝ちです！");
        }else if(cpu == 2){
            return 30;
            //System.out.println("あなたの負けです！");
        }
        return 99;
    }

    /**
     * プレイヤーの出した手がチョキのときに、勝敗を判定し結果を表示する。
     * cpu == 0のとき、CPUの手はグー
     * cpu == 1のとき、CPUの手はチョキ
     * cpu == 2のとき、CPUの手はパー
     * 
     * @param cpu
     */
    private static void judge2(int cpu){
        if(cpu == 0){
            System.out.println("あなたの負けです！");
        }else if(cpu == 1){
            System.out.println("あいこです！");
        }else if(cpu == 2){
            System.out.println("あなたの勝ちです！");
        }
    }

    /**
     * プレイヤーの出した手がパーのときに、勝敗を判定し結果を表示する。
     * cpu == 0のとき、CPUの手はグー
     * cpu == 1のとき、CPUの手はチョキ
     * cpu == 2のとき、CPUの手はパー
     * 
     * @param cpu
     */
    private static void judge3(int cpu){
        if(cpu == 0){
            System.out.println("あなたの勝ちです！");
        }else if(cpu == 1){
            System.out.println("あなたの負けです！");
        }else if(cpu == 2){
            System.out.println("あいこです！");
        }
    }
}