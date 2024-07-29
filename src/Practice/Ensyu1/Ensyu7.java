package Practice.Ensyu1;
/**
 * https://kitako.tokyo/lib/JavaExercise.aspx?id=1
 * 1.表示、変数、演算
 * 1‐7
 */
public class Ensyu7 {
    public static void main(String[] args) {
        int x = 3;
        int y = 7;
        int t;

        t = x;
        x = y;
        y = t;

        System.out.println("x=" + x + ",y=" + y);
    }
}
