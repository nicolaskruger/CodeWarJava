import com.sun.nio.sctp.AbstractNotificationHandler;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.function.IntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Kata {
    static Pattern upper = Pattern.compile("[A-Z]");
    static Pattern lower = Pattern.compile("[a-z]");
    public static List<String>  movingShift(String s, int shift) {
        final int[] cont = {shift-1};
		s = Arrays.stream(s.split(""))
                .map(w->{
                    cont[0]++;
                    if (upper.matcher(w).find()){
                        return String.valueOf((char) ((w.charAt(0)-'A'+cont[0])%('Z'-'A'+1)+'A'));
                    }
                    else if(lower.matcher(w).find()){
                        return String.valueOf((char) ((w.charAt(0)-'a'+cont[0])%('z'-'a'+1)+'a'));
                    }
                   return w;
                }).collect(Collectors.joining());
		int div = (int) Math.ceil((double) s.length()/5.0);
		String ss = "";
		List<String> lis = new LinkedList<>();
		for (int i =0;i<s.length();i++){
		        ss+=s.charAt(i);
		        if(ss.length()==div){
		            lis.add(ss);
		            ss="";
                }
        }
		while (lis.size()<5){
		    lis.add(ss);
		    ss="";
        }
        return lis;
    }

    public static String  demovingShift(List<String> s, int shift) {
        final int[] cont = {shift-1};
        return Arrays.stream(s.stream().reduce("",(acc,curr)->acc+curr)
                .split(""))
                .map(w->{
                        cont[0]++;
                    if (upper.matcher(w).find()){
                        return String.valueOf((char) ((w.charAt(0)-'A'-cont[0]+('Z'-'A'+1)*100)%('Z'-'A'+1)+'A'));
                    }
                    else if(lower.matcher(w).find()){
                        return String.valueOf((char) ((w.charAt(0)-'a'-cont[0]+('z'-'a'+1)*100)%('z'-'a'+1)+'a'));
                    }
                    return w;
                })
                .collect(Collectors.joining());
    }


    public static void main(String[] args) {
        movingShift("I should have known that you would have a perfect answer for me!!!",1);
        String word = demovingShift(Arrays.asList("J vltasl rlhr ", "zdfog odxr ypw", " atasl rlhr p ", "gwkzzyq zntyhv", " lvz wp!!!"),1);
        System.out.println();
    }


}
