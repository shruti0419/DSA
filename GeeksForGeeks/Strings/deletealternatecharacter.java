package GeeksForGeeks.Strings
public class deletealternatecharacter {

static String delAlternate(String S) {
    String a = new String();
    for (int i = 0; i < S.length(); i++) {
        if (i % 2 == 0) {
          a += S.charAt(i);
        }
    }
    return a;
}
}