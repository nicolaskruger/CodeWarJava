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
    public static boolean makeChange(Map<Integer,Integer> change,int price){
        int troco= price - 25;
        change.put(price,change.get(price)+1);
        if(troco==0) return true;
        if(troco == 25){
            if (change.get(troco)>=1){
                change.put(troco,change.get(troco)-1);
                return true;
            }
        }
        if(troco == 75){
            if(change.get(25)>=1&&change.get(50)>=1){
                change.put(25,change.get(25)-1);
                change.put(50,change.get(50)-1);
                return true;
            }
            else if(change.get(25)>=3){
                change.put(25,change.get(25)-3);
                return true;
            }
        }
        return false;
    }
    public static String Tickets(int[] peopleInLine)
    {
        //Your code is here...
        Map<Integer,Integer> change = new HashMap<>();
        change.put(25,0);
        change.put(50,0);
        change.put(100,0);
        for (int i : peopleInLine) {
            System.out.println(i);
            if(!makeChange(change,i))
                return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {

    }


}
