import com.sun.nio.sctp.AbstractNotificationHandler;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Kata {
    public static String order(String words) {
        return Arrays.stream(words.split(" "))
                .sorted((a,b)->{
                    Pattern pat = Pattern.compile("([0-9])");
                    Matcher m1 = pat.matcher(a);
                    Matcher m2 = pat.matcher(b);
                    var v1 = "";
                    if(m1.find()){
                        v1 =(m1.group(0));
                    }
                    var v2 = "";
                    if(m2.find()){
                        v2 =(m2.group(0));
                    }
                    if (v1.charAt(0)<v2.charAt(0))
                        return -1;
                    if (v1.charAt(0)>v2.charAt(0))
                        return +1;
                    return 0;
                }).collect(Collectors.joining(" "));
    }


    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }


}
