import com.sun.nio.sctp.AbstractNotificationHandler;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.function.IntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kata {
    public static String blackOrWhiteKey(int keyPressCount) {
        // your code here
        keyPressCount--;
        List<Integer> piano = Arrays.asList(0,1,0);
        for (int i =0;i<7;i++){
            piano = Stream.concat(piano.stream(),Arrays.asList(0,1,0,1,0,0,1,0,1,0,1,0).stream())
                    .collect(Collectors.toList());
        }
        piano.add(0);
        return piano.get(keyPressCount%piano.size())==0?"white":"black";
    }
    public static void main(String[] args) {
        var val = blackOrWhiteKey(1);
        val = blackOrWhiteKey(5);
        val = blackOrWhiteKey(12);
        val = blackOrWhiteKey(42);
        val = blackOrWhiteKey(88);
        val = blackOrWhiteKey(89);
        val = blackOrWhiteKey(92);
        val = blackOrWhiteKey(100);
        val = blackOrWhiteKey(111);
        val = blackOrWhiteKey(200);
        val = blackOrWhiteKey(2017);
    }


}
