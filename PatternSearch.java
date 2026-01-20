public class PatternSearch {
    public static void main(String[] args) {
        String text ="this is an issue";
        String pattern = "is";
        int inIndex =0;
        for (int i = 0; i < text.length()-pattern.length(); i++) {
           if(text.charAt(i) == pattern.charAt(0)){
               inIndex = i;
               boolean found = true;
               for (int j = 0; j < pattern.length(); j++) {
                   if (text.charAt(i) == pattern.charAt(j)){
                       j++;i++;
                   }else {
                       found = false;
                       break;
                   }

               }
               if (found) {
                   System.out.println("Found at " + inIndex);
               }
           }
        }
         }

}
