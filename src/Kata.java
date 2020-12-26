import com.sun.nio.sctp.AbstractNotificationHandler;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Kata {
    public static boolean check(Object[] a, Object x) {
        return Arrays.stream(a).filter(s->s.equals(x)).toArray().length>=1;
    }
    public static void main(String[] args) {

    }


}
