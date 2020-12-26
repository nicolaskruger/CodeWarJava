import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Kata {
    public boolean check(String sentence){
        //code
        return Arrays.stream(sentence.toLowerCase(Locale.ROOT)
                .split(""))
                .sorted()
                .reduce("",(acc,curr)->{
                    if(Pattern.compile("[a-z]").matcher(curr).find()){
                        if(acc.length()==0||acc.charAt(acc.length()-1)!=curr.charAt(0))
                            return acc+curr;
                    }
                    return acc;
                })
                .equals("abcdefghijklmnopqrstuvwxyz");
    }
    public static void main(String[] args) {
        var val = new Kata().check("The quick brown fox jumps over the lazy dog" );
        val ="-abcdefghijklmnopqrstuvwxyz".equals("-abcdefghijklmnopqrstuvwxyz");
    }


}
