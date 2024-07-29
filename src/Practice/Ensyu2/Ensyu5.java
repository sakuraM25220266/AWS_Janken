package Practice.Ensyu2;
import java.util.Scanner;
/**
 * https://kitako.tokyo/lib/JavaExercise.aspx?id=1
 * 2.入力
 * 2‐5
 */
public class Ensyu5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();
        
        System.out.println((x + y) / 2);
    }
}
