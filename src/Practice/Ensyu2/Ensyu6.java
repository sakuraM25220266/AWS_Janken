package Practice.Ensyu2;
import java.util.Scanner;
/**
 * https://kitako.tokyo/lib/JavaExercise.aspx?id=1
 * 2.入力
 * 2‐6
 */
public class Ensyu6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("何歳ですか？:");
        int age = scanner.nextInt();
        scanner.close();
        
        System.out.println("あなたが生まれてから" + age * 365 + "日経ちました。");
    }
}
