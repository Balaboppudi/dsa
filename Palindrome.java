public class Palindrome {

    public static void main(String[] args) {
        // printIsPalindrome("ABCDCBA");
        //         printIsPalindrome("TEST");

printIsPalindrome2("ABCDCBA");
                printIsPalindrome2("TEST");

    }
    private static void printIsPalindrome(String s){
           
        System.out.println(new StringBuffer(s).reverse().toString().equals(s) ? "YES":"NO");
    }

    private static void printIsPalindrome2(String s){
        for(int i=0,j=s.length()-1;i<=j;i++,j--){
            if(s.charAt(i) !=s.charAt(j)){
                System.out.println("NO");
                return;
            }

        }
        System.out.println("YES");

    }
}