public class Anagram {
    public static void main(String[] args) {
       System.out.println(isAnagram("1aabbccdd","ddccbbaa")?"YES":"NO");
    }

    private static boolean isAnagram(String s1, String s2) {
            int count[] = new int[256];
            if(s1.length() != s2.length()){
            return false;
            }else{
                for (int i = 0; i < s1.length(); i++) {
                    count[s1.charAt(i)]+= 1;
                    count[s1.charAt(i)]-= 1;
                }
                for (int i = 0; i < count.length; i++) {
                    if(count[i] !=0){
                       return false;     
                    }
                }
            }

            return true;

    }

}