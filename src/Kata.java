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
    private static boolean isPrime(long n){
        if(n<=1) return false;
        for (long i =2 ;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static long[] gap(int g, long m, long n) {
        // your code
        long num0=m;
        long num1;
        while (!isPrime(num0)){
            num0++;
        }
        for (long i = (num0+1);i<n;i++){
            if(isPrime(i)){
                if((i-num0)==g)
                    return new long[]{num0,i};
                num0 = i;
            }
        }
        return null;
    }
    public static void main(String[] args) {

    }


}
