import java.lang.reflect.Array;
import java.util.Arrays;

public class Kata {
    public static boolean isSquare(int n) {
        var num = Math.sqrt(n);
        if(Double.isNaN(num)) return false;
        return (num-((int)num))==0;
    }
    public static void main(String[] args) {
        var n = Kata.isSquare(4);
        n=false;
    }
}
