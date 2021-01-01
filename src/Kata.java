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
    public static String iterPi2String(Double epsilon) {
        // your code
        double pi =0;
        int x = 0;
        while (Math.abs(4*pi-Math.PI)>=epsilon){
            pi+= Math.pow(-1,x)/(2*x+1);
            x++;
        }
        DecimalFormat num = new DecimalFormat("#.0000000000");
        return "["+x+", "+num.format(4*pi)+"]";
    }
    public static void main(String[] args) {

    }


}
