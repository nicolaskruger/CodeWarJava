import com.sun.nio.sctp.AbstractNotificationHandler;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Kata {
    public static List<String> number(List<String> lines) {
        // TODO
        final Integer[] cont = {1};
        return lines.stream().map(s-> cont[0]++ + ": " + s)
                    .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println(number(Arrays.asList("a","b")));
    }


}
