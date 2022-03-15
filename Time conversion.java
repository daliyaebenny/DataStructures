import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Result {

    //Convert 12 hour time to 24 hour time 

    public static String timeConversion(String s) {
    // Write your code here
    
    String s1[]=s.split(":");
    if(s1[2].matches("[0-9]*[pP][Mm]")){
      int n = Integer.parseInt(s1[0])+ 12;
      s1[0]=Integer.toString(n);   
    }
    String x = s1[2].replaceAll("[aApP][mM]","");
    return s1[0]+":"+s1[1]+":"+x;
    
    }    

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
