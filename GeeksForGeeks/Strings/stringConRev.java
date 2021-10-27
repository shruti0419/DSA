package GeeksForGeeks.Strings;
public class stringConRev {
    static String conRevstr(String S1, String S2) {
         String a= new String();
         String b= new String();
         b=S1+S2;
         for (int i = b.length() - 1; i >= 0; i--) {
           
            a+=b.charAt(i);
        }
         return a;
    }
}
