package Test;

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MatchRecord {
    public static String path ="C:\\Users\\9004091159\\Desktop\\JankenRecord.csv";
    
    public static void writeRecord(){
        try{
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

            String playerHand = Player.playerHand;
            String cpuHand = Cpu.cpuHand;

            String resultText;
            if(Judge.result == 10){
                resultText = Judge.DRAW;
            }else if(Judge.result == 20){
                resultText = Judge.WIN;
            }else if(Judge.result == 30){
                resultText = Judge.LOSE;
            }else{
                resultText = "無効な結果";
            }

            String record = String.format("%s,%s,%s,%s", formatter.format(now), playerHand, cpuHand, resultText);
            pw.println(record);
            pw.flush();
            pw.close();
        }catch(IOException e){
            System.out.println("ファイルの書き込みに失敗しました。");
            e.printStackTrace();
        }
    }

    
    public static void showMatchRecord(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8")); 
 
            String line;
            // 1行ずつCSVファイルを読み込む
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",", 4); // 行をカンマ区切りで配列に変換
 
                if(data.length == 4){
                    System.out.println("日時：" + data[0] +"、あなた：" + data[1] + "、相手：" + data[2] + "、結果：" + data[3]);
                    System.out.println();
                }
            }
            br.close();
 
        } catch (IOException e) {
            System.out.println("ファイルの読み込みに失敗しました。");
        }
        
    }
}