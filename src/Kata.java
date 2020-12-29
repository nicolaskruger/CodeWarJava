import com.sun.nio.sctp.AbstractNotificationHandler;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Kata {
    public static int[] twoSum(int[] numbers, int target)
    {
        for (int i =0 ;i<numbers.length;i++)
            for (int j= i+1;j<numbers.length;j++){
                int sum = numbers[i]+numbers[j];
                if(sum==target)
                    return new int[]{
                      i,j
                    };
            }
        return null; // Do your magic!
    }


    public static void main(String[] args) {

    }


}
