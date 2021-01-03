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
    private static String secondsTo(int seconds){
        int hours = (int) seconds / 3600;
        int remainder = (int) seconds - hours * 3600;
        int mins = remainder / 60;
        remainder = remainder - mins * 60;
        int secs = remainder;
        return ""+String.format("%02d",hours)+"|"+String.format("%02d",mins)+"|"+String.format("%02d",secs);
    }
    private static String range(Integer[] time){
        return secondsTo(time[time.length-1]-time[0]);
    }
    private static String average(Integer[] time){
        return secondsTo(Arrays.stream(time).reduce(0,(acc,curr)->acc+curr)/time.length);
    }
    private static String median(Integer[] time){
        return secondsTo(time.length%2==0?(time[time.length/2]+time[time.length/2-1])/2:
                time[time.length/2]);
    }
    public static String stat(String strg) {
        // your code
        Integer[] vet =
        Arrays.stream(strg.split("(, )|(\n)"))
                .map(s->{
                    String [] ss = s.split("\\|");
                    return Integer.valueOf(ss[0])*3600+
                            Integer.valueOf(ss[1])*60+
                            Integer.valueOf(ss[2]);
                }).sorted()
                .toArray(Integer[]::new);
        return "Range: "+range(vet)+" Average: "+average(vet)+" Median: "+median(vet);
    }
    public static void main(String[] args) {
        System.out.println(stat("01|15|59, 1|47|16, 01|17|20, 1|32|34, 2|17|17\n" +
                "02|15|59, 2|47|16, 02|17|20, 2|32|34, 2|17|17, 2|22|00, 2|31|41\n" +
                "02|15|59, 2|47|16, 02|17|20, 2|32|34, 2|32|34, 2|17|17"));
    }


}
