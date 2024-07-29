package Janken;
import java.util.Random;

/**
 * CPUがじゃんけんの手を出すクラス
 */
public class Cpu {
    public static void main(String[] args) {
        final String ROCK = "グー";
        final String SCISSORS = "チョキ";
        final String PAPER = "パー";

        // 0～2までの乱数を生成する
        Random rand = new Random();
        int cpu = rand.nextInt(3);
        //生成した乱数をもとに、CPUの手を表示する
        //0の場合はグー、1の場合はチョキ、2の場合はパー
        String cpuHand = null;
        if(cpu == 0){
            cpuHand = ROCK;
        }else if(cpu == 1){
            cpuHand = SCISSORS;
        }else if(cpu == 2){
            cpuHand = PAPER;
        }
    }

    public static void displayCpuHand(String cpuHand){
        System.out.println("対戦相手:" + cpuHand);
    }
}
