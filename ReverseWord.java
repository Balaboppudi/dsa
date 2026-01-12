public class ReverseWord {
    public static void main(String[] args) {
        char[] cs = "this is my word".toCharArray();
//        char[] cs1="this".toCharArray();
//        reverseWord(cs1, 0,cs1.length-1);
//        System.out.println(cs1);
    reverseLine(cs);
        System.out.println(cs);
    }

    private static void reverseLine(char[] cs) {
       int start =0;
        for (int end = 0; end < cs.length; end++) {
            if(cs[end] == ' '){
                reverseWord(cs, start, end-1);
                start = end+1;
            }
        }
        reverseWord(cs, start, cs.length-1);
        reverseWord(cs, 0, cs.length-1);

    }

    private static void reverseWord(char[] cs, int start, int end){
        // "abcd" cba
        for (int si = start,ei= end; si <ei; si++,ei--) {
                char te=cs[si];
                cs[si] = cs[ei];
                cs[ei] = te;
        }
    }
}
