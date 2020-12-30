import com.sun.nio.sctp.AbstractNotificationHandler;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Kata {
    static String encode(String word){
        word = word.toLowerCase(Locale.ROOT);
        Map<String,Integer> map = new HashMap();
        for (String s : word.split("")) {
            if(!map.containsKey(s)){
                map.put(s,0);
            }
            map.put(s,1+map.get(s));
        }
        return Arrays.stream(word.split(""))
                .map(s->map.get(s)==1?"(":")")
                .collect(Collectors.joining());
    }


    public static void main(String[] args) {

    }


}
