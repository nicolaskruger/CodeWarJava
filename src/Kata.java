import com.sun.nio.sctp.AbstractNotificationHandler;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Kata {
    public static int[] race(int v1, int v2, int g) {
        // your code
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(g);
        if(v1>=v2) return  null;
        double time = ((double)g/(v2-v1));
        int hour = (int)time;
        time = (time-hour)*60.0;
        int min = (Math.round(time)-time)<0.001?(int)Math.round(time):(int)time;
        int sec =(int)((time-min)*60);
        int [] n = {
                hour,
                min,
                sec
        };
        return n;
    }


    public static void main(String[] args) {
        race(820,850,550);

    }


}
