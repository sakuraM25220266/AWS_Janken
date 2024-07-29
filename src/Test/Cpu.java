package Test;
import java.util.Random;

public class Cpu {
    static final String ROCK = "グー";
    static final String SCISSORS = "チョキ";
    static final String PAPER = "パー";
    static int cpu;
    static String cpuHand = null;

    public static String getCpuHand(){
        // 0～2までの乱数を生成する
        Random rand = new Random();
        cpu = rand.nextInt(3);
        //生成した乱数をもとに、CPUの手を表示する
        //0の場合はグー、1の場合はチョキ、2の場合はパー
        if(cpu == 0){
            cpuHand = ROCK;
        }else if(cpu == 1){
            cpuHand = SCISSORS;
        }else if(cpu == 2){
            cpuHand = PAPER;
        }
        return cpuHand;
    }
}
