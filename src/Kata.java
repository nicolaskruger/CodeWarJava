import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code
        final int[] p = {binary.size() - 1};
        return  binary.stream().map(s->s*Math.pow(2, p[0]--)).reduce(0.0,(acc,curr)->acc+curr).intValue();
    }
    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));
    }


}
