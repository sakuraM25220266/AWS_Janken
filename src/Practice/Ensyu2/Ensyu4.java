package Practice.Ensyu2;
import java.util.Scanner;
/**
 * https://kitako.tokyo/lib/JavaExercise.aspx?id=1
 * 2.入力
 * 2‐4
 */
public class Ensyu4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();
        
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println((x / y) + "余り" + x % y);
    }
}
