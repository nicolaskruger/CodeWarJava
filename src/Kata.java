import java.lang.reflect.Array;
import java.util.Arrays;

public class Kata {
    public int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }

    public int mim(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }
    public static void main(String[] args) {
        var kata = new Kata();
        var min = kata.min(new int[]{-52, 56, 30, 29, -54, 0, -110});
        kata = new Kata();
    }
}
