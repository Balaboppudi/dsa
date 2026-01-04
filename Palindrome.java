public class Palindrome {

    public static void main(String[] args) {
        printIsPalindrome("ABCDCBA");
                printIsPalindrome("TEST");

    }
    private static void printIsPalindrome(String s){
           
        System.out.println(new StringBuffer(s).reverse().toString().equals(s) ? "YES":"NO");
    }
}