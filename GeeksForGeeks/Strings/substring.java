package GeeksForGeeks.Strings;

public class substring {
    static String javaSub(String S, int L, int R) {
        String a = new String();
        for (int i = L; i <= R; i++) {
            a += String.valueOf(S.charAt(i));
        }
        return a;
    }  
}
