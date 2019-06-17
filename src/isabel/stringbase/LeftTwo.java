package isabel.stringbase;

public class LeftTwo {
    public String left2(String str) {

        if (str.length() > 1) {
            return str.substring(2) + str.substring(0,2);

        }

        return str;
    }
}
