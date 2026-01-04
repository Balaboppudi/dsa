public class SubSequence {
    
    public static void main(String[] args) {
        String s1="TESTFORSUB";
        String s2 ="SATF";
        for (int i = 0,j=0; i < s1.length() && j<s2.length();) {
            if(s1.charAt(i) == s2.charAt(j)){
                if(j== s2.length()-1){
                    System.out.println("YES");
                }
                i++;
                j++;
            }else{
                i++;
            }

        }
    }
}
