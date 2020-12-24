import java.lang.reflect.Array;
import java.util.Arrays;

public class Kata {
    public static int squareSum(int[] n)
    {
        return Arrays.stream(n).reduce(0,(acc,cur)->acc+cur*cur);
    }

    public static void main(String[] args) {
        var n = Kata.squareSum(new int[]{1,2,3});
        n++;
    }
}
