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

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Result {

    public static int designerPdfViewer(List<Integer> h, String word) {
        int b = word.length();
        int l = Integer.MIN_VALUE;
        Map<Character,Integer> map = new HashMap<>();
        char ch = 'a'; 
        
        for(int i=0; i<26; i++){
            map.put(ch,h.get(i));
            ch++;
        }
        
        for(int i=0; i<b; i++){
            if(map.get(word.charAt(i)) > l ){
                l = map.get(word.charAt(i));
            }
        }
    return b * l;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String word = bufferedReader.readLine();

        int result = Result.designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
