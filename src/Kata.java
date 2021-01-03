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
    public static int[] beggars(int[] values, int n) {
        // show me the code!
        if(n==0||values.length==0){
            return new int[n];
        }
        int [] ret = new int[n];
        try {
            for (int i = 0;i<values.length;i+=n){
                for (int j =0;j<ret.length;j++){
                    ret[j]+=values[i+j];
                }
            }
        }catch (Exception e){
            return ret;
        }
        return ret;
    }
    public static void main(String[] args) {

    }


}
