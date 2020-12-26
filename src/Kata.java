import com.sun.nio.sctp.AbstractNotificationHandler;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Kata {
    public int squareDigits(int n) {
        // TODO Implement me
        return
        Integer.valueOf(Arrays.stream(Integer.toString(n)
                .split(""))
                .map(s->String.valueOf(Integer.valueOf(s)*Integer.valueOf(s)))
                .collect(Collectors.joining()));
    }
    public static void main(String[] args) {
        System.out.println(new Kata().squareDigits(9119));
    }


}
