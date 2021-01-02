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
    static class Points{
        int doub;
        int trip;
        int doubW;

        public Points(int doub, int trip, int doubW) {
            this.doub = doub;
            this.trip = trip;
            this.doubW = doubW;
        }
    }
    static Map<String,Points> map = new HashMap<>();
    static
    {
        String[] word = new String[]{
                "Jack","Queen","King","Bar",
                "Cherry","Seven","Shell","Bell",
                "Star"
        };
        for(int i =0 ;i<word.length;i++){
            map.put(word[i],new Points(i+1,10*(i+1),2*(i+1)));
        }
        map.put("Wild",new Points(10,100,10));
    }
    private static String [] result(final String[][] reels, final int[] spins){
        String [] res = new String[3];
        for(int i =0;i< reels.length;i++){
            int len = reels[i].length;
            res[i]=reels[i][spins[i]%len];
        }
        return res;
    }
    public static int equal2(String[] res){
        if(res[0]==res[1]||res[0]==res[2])
            return 0;
        if(res[1]==res[2])
            return 1;
        return -1;
    }
    public static boolean hasWild(String[] res){
        for (String re : res) {
            if(re=="Wild") return true;
        }
        return false;
    }
    public static int fruit(final String[][] reels, final int[] spins) {
        var res = result(reels,spins);
        int pos = equal2(res);
        if(res[0]==res[1]&&res[1]==res[2]){
            return map.get(res[0]).trip;
        }
        else if(pos!=-1){
            if(hasWild(res))
                return map.get(res[pos]).doubW;
            return map.get(res[pos]).doub;
        }
        return 0; // Code here
    }
    public static void main(String[] args) {
        var val = fruit(new String[][]{new String[]{"Seven", "King", "Shell", "Bell", "Cherry", "Jack", "Star", "Wild", "Bar", "Queen"},
                        new String[]{"Cherry", "Jack", "King", "Shell", "Star", "Seven", "Queen", "Bar", "Wild", "Bell"},
                        new String[]{"Shell", "Wild", "Star", "Queen", "Bar", "Jack", "Cherry", "Seven", "King", "Bell"}},
                new int[]{7, 3, 1});
        System.out.println();
    }


}
