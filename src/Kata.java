import com.sun.nio.sctp.AbstractNotificationHandler;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.function.IntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kata {
    public static String meeting(String s) {
        // your code
        return
        Arrays.stream(s.split(";"))
                .map(ss->{
                    String[] arr = Arrays.stream(ss.split(":")).toArray(String[]::new);
                    return "("+arr[1].toUpperCase(Locale.ROOT)+", "+arr[0].toUpperCase(Locale.ROOT)+")";
                }).sorted()
                .collect(Collectors.joining());
    }
    public static void main(String[] args) {

    }


}
