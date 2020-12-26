import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Kata {
    public static int sortDesc(final int num) {
        //Your code
        Arrays.stream(Integer.toString(num)
                .split(""))
                .sorted()
    }
    public static void main(String[] args) {

    }


}
