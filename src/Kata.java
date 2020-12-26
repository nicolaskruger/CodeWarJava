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
        return sentence.chars()
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .distinct()
                .count() == 26;
    }
    public static void main(String[] args) {
        var val = new Kata().check("The quick brown fox jumps over the lazy dog" );
        val ="-abcdefghijklmnopqrstuvwxyz".equals("-abcdefghijklmnopqrstuvwxyz");
    }


}
