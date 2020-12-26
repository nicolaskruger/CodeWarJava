import com.sun.nio.sctp.AbstractNotificationHandler;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Kata {
    public static String oddOrEven (int[] array) {
        // your code
        return Arrays.stream(array).sum()%2==0?"even":"odd";
    }
    public static void main(String[] args) {

    }


}
