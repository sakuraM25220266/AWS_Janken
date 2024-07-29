package Practice.Ensyu2;
import java.util.Scanner;
/**
 * https://kitako.tokyo/lib/JavaExercise.aspx?id=1
 * 2.入力
 * 2‐3
 */
public class Ensyu3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        System.out.println(x);
        System.out.println(x * x);
        System.out.println(x * x * x);
    }
}
