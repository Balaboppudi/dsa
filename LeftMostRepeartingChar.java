import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LeftMostRepeartingChar {

    public static void main(String[] args) {
        Map<Character, Integer> counts = new HashMap<>();
        String s ="aabcdjkdmmm";
          for (int i = 0; i < s.length(); i++) {
           counts.put(s.charAt(i), counts.getOrDefault(s.charAt(i), 0)+1);
          }
          int max=-1;
          Character repeatedChar =null;
          for (Character c : counts.keySet()) {
            if(counts.get(c)>max){
                max = counts.get(c);
                repeatedChar = c;
            }
          }
          System.out.println(max+ "  "+repeatedChar  );

    }
}