package Practice.CSVinout;

//ファイルやディレクトリの作成・削除、ファイルの読み込み・書き込み、ファイルのチェック処理、実行権の確認など。
// import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedReader;
//ある程度データをまとめて（溜めて）から、一度に出力（書き込み）をおこなうためのクラス。
import java.io.BufferedWriter;
//FileWriterクラス:新しいテキストファイルの作成、すでにあるテキストファイルに文字を書き込む
import java.io.FileWriter;
//書き込みに特化したクラスで、出力文字列の整形など、テキスト出力に特化した機能を持つ。
import java.io.PrintWriter;
// import java.nio.file.Path;
// import java.nio.file.Paths;
import java.io.IOException;
import java.io.InputStreamReader;

public class csv {
    static String path ="C:\\Users\\9004091159\\Desktop\\JankenRecord.csv";
    public static void main(String[] args) {

        try{
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
            pw.println("1,2,3");
            pw.println("4,5,6");
            pw.println("7,8,9");
            pw.flush();
            System.out.println("ファイルに書き込みました。");
            pw.close();
        }catch(IOException e){
            System.out.println("ファイルの書き込みに失敗しました。");
            e.printStackTrace();
        }
        
   
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8")); 
 
            String line;
            // 1行ずつCSVファイルを読み込む
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",", 0); // 行をカンマ区切りで配列に変換
 
                for (String elem : data) {
                System.out.println(elem);
                }
            }
            br.close();
 
            } catch (IOException e) {
            System.out.println(e);
            }
        }
}
