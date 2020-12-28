import com.sun.nio.sctp.AbstractNotificationHandler;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Kata {
    public static long thirt(long n) {
        // your code
        long[] list ={
                1,10,9,12,3,4
        };
        final int[] cont = {0};
        long res =
        Arrays.stream(Long.toString(n)
                .split(""))
                .sorted((a,b)->-1)
                .map((curr)->{
                    Long val=Long.valueOf(curr)*list[cont[0]];
                    cont[0] =(cont[0] +1)%list.length;
                    return val;
                })
                .reduce(Long.valueOf(0),(acc,curr)->acc+curr);
        if(res==n)
            return res;
        return thirt(res);
    }


    public static void main(String[] args) {
        thirt(1234567);
    }


}
