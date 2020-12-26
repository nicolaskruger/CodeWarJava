import com.sun.nio.sctp.AbstractNotificationHandler;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Kata {
    public static int evaporator(double content, double evap_per_day, double threshold) {
        // your code
        return (int)(Math.log(threshold/100)/Math.log(1-evap_per_day/100))+1;
    }


    public static void main(String[] args) {

    }


}
