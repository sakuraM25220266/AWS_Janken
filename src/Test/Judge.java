package Test;

public class Judge {
    static final String DRAW = "あいこ";
    static final String WIN = "あなたの勝ち";
    static final String LOSE = "あなたの負け";
    static int result;

    public static void judge(){
        if(Player.input == 0){
            result = judgeRock(Cpu.cpu);
        }else if(Player.input == 1){
            result = judgeScissors(Cpu.cpu);
        }else if(Player.input == 2){
            result = judgePaper(Cpu.cpu);
        }
    }

    /**
     * プレイヤーの出した手がグーのときに、勝敗を判定し結果を表示する。
     * cpu == 0のとき、CPUの手はグー
     * cpu == 1のとき、CPUの手はチョキ
     * cpu == 2のとき、CPUの手はパー
     * 戻り値が10のとき、あいこ
     * 戻り値が20のとき、勝ち
     * 戻り値が30のとき、負け
     * 
     * 
     * @param cpu
     */
    public static int judgeRock(int cpu){
        if(Cpu.cpu == 0){
            return 10;
        }else if(Cpu.cpu == 1){
            return 20;
        }else return 30;
    }

    /**
     * プレイヤーの出した手がチョキのときに、勝敗を判定し結果を表示する。
     * cpu == 0のとき、CPUの手はグー
     * cpu == 1のとき、CPUの手はチョキ
     * cpu == 2のとき、CPUの手はパー
     * 
     * @param cpu
     */
    public static int judgeScissors(int cpu){
        if(Cpu.cpu == 0){
            return 30;
        }else if(Cpu.cpu == 1){
            return 10;
        }else return 20;
    }

    /**
     * プレイヤーの出した手がパーのときに、勝敗を判定し結果を表示する。
     * cpu == 0のとき、CPUの手はグー
     * cpu == 1のとき、CPUの手はチョキ
     * cpu == 2のとき、CPUの手はパー
     * 
     * @param cpu
     */
    public static int judgePaper(int cpu){
        if(Cpu.cpu == 0){
            return 20;
        }else if(Cpu.cpu == 1){
            return 30;
        }else return 10;
    }

    /**
     * じゃんけんの結果を表示する。
     * result == 10のとき、あいこ
     * result == 20のとき、プレイヤーの勝ち
     * result == 30のとき、プレイヤーの負け
     */
    public static void showResult(){
        if(result == 10){
            System.out.println(DRAW + "です！");
        }else if(result == 20){
            System.out.println(WIN + "です！");
        }else if(result == 30){
            System.out.println(LOSE + "あなたの負けです！");
        }
    }
}
