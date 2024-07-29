package Test;

public class PlayJanken {
    public static void playJanken(){

        String playerHand = Player.getPlayerHand();
        System.out.println("あなた:" + playerHand );        

        System.out.println("対戦相手:" + Cpu.getCpuHand());

        Judge.judge();

        Judge.showResult();
        
        MatchRecord.writeRecord();
    }
}
