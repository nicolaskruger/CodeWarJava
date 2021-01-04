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
    public static String encrypt(final String text, final int n) {
        // Your code here
        final int[] i = {0};
        final int[] j = {0};
        int m =n;
        String txt = text;
        while (m-->0){
            txt =
                Arrays.stream(txt.split(""))
                        .filter(s-> i[0]++%2==1)
                        .collect(Collectors.joining())
                        +
                        Arrays.stream(txt.split(""))
                        .filter(s->j[0]++%2==0)
                        .collect(Collectors.joining());
            i[0]=0;
            j[0]=0;
        }
        return txt;
    }

    public static String decrypt(final String encryptedText, final int n) {
        // Your code here
        if(n<=0)
            return encryptedText;
        String tx1 = encryptedText.substring(encryptedText.length()/2);
        String tx2 = encryptedText.substring(0,encryptedText.length()/2);

        String tx = "";
        for (int i = 0;i<tx1.length();i++){
            try {
                tx+=tx1.charAt(i);
                tx+=tx2.charAt(i);
            }catch (Exception e){

            }
        }
        return decrypt(tx,n-1);
    }

    public static void main(String[] args) {
        System.out.println(decrypt("hsi  etTi sats!", 1));
    }


}
