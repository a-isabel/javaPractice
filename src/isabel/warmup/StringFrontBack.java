package isabel.warmup;

/*Given a string, return a new string where the first and last chars have been exchanged.

        frontBack("code") → "eodc"
        frontBack("a") → "a"
        frontBack("ab") → "ba"*/

public class StringFrontBack {

    public String frontBack(String str) {

        if (str.length() < 2){
            return str;
        }

        char first = str.charAt(0);
        String mid = str.substring(1,str.length() -1);
        char last = str.charAt(str.length()-1);

        return last+mid+first;
    }
}
