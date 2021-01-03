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
    public static String print(int n) {
        // TODO your code here
        if(n<0||n%2==0) return null;
        String str = "";
        for (int i = 1;i<n;i+=2){
            str+=" ".repeat(n/2-i/2);
            str+="*".repeat(i);
            str+="\n";
        }
        str+="*".repeat(n)+"\n";
        for (int i=n-2;i>=1;i-=2){
            str+=" ".repeat(n/2-i/2);
            str+="*".repeat(i);
            str+="\n";
        }
        return str;
    }
    public static void main(String[] args) {

        System.out.println(print(7));
    }


}
