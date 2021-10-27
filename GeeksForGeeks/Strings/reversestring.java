package GeeksForGeeks.Strings;

public class reversestring {
    static String revStr(String S) {
        String a= new String();
       
        for (int i = S.length() - 1; i >= 0; i--) {
           
            a+=S.charAt(i);
        }
        return a;
    }
}
