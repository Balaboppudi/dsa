import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // getCharCountMap();
        getCount2();
    }

    private static void getCharCountMap() {
        String message = "geeksforgeeks";
        Map<Character, Integer> charCountMap = new java.util.HashMap<>();
    for (int i = 0; i < message.length(); i++) {
        charCountMap.put(message.charAt(i), charCountMap.getOrDefault(message.charAt(i), 0)+1);
    }    
    System.out.println(charCountMap);
    }

    private static void getCount2(){
        int[] con = new int[26];
        String message = "geeksforgeeks";
        for (int i = 0; i < message.length(); i++) {
            con[message.charAt(i)-'a'] +=1; 
        }
        for(int i=0;i<26;i++){
            if (con[i]>0) {
                System.out.println((char)(i+'a')+"  "+ con[i]);
            }
        }
    }
}
