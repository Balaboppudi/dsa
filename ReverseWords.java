public class ReverseWords {
    public static void main(String[] args) {
        String s ="this is to reverse the words";
        String[] ss= s.split(" ");
        StringBuffer sb= new StringBuffer();
        for (int i = ss.length-1; i >=0; i--) {
            sb.append(ss[i] +" ");
        }
        System.out.println(sb.toString().trim());
    }
}
