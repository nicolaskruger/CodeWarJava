import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Kata {
    public static int sortDesc(final int num) {
        //Your code
        return
        Integer.parseInt(
        Arrays.stream(Integer.toString(num)
                .split(""))
                .sorted()
                .sorted(Collections.reverseOrder())
                .reduce("",(acc,curr)->acc+curr)
        );

    }
    public static void main(String[] args) {

    }


}
