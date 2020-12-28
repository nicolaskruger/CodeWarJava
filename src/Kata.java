import com.sun.nio.sctp.AbstractNotificationHandler;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Kata {
    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] queue = new int[n];
        for (int customer : customers) {
            var minVal = Arrays.stream(queue).min().orElse(0);
            final boolean[] find = {false};
            var index = Arrays.stream(queue).reduce(0,(acc,curr)->{
                if(curr==minVal) find[0] =true;
                if(find[0]) return acc;
                return acc+1;
            });
            queue[index]+=customer;
        }
        return Arrays.stream(queue).max().orElse(0);
    }


    public static void main(String[] args) {
        solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2);
    }


}
