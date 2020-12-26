import com.sun.nio.sctp.AbstractNotificationHandler;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Kata {
    public static boolean comp(int[] a, int[] b) {

        if(a==null||
                b==null)
            return false;
        if(a.length==0&&b.length==0)
            return true;
        if(a.length==0||
           b.length==0)
            return false;

        try {
            a = Arrays.stream(a).map(s->Math.abs(s)).sorted().toArray();
            b = Arrays.stream(b).sorted().toArray();
            final int[] i={0};
            int[] finalB = b;
            return Arrays.stream(a).reduce(1,(acc, curr)->(acc)&((curr*curr)==finalB[i[0]++]?1:0))==1;
        }catch (Exception ex){
            return false;
        }

    }
    public static void main(String[] args) {

    }


}
