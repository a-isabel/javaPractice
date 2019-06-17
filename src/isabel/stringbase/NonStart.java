package isabel.stringbase;

public class NonStart {

    public String nonStart(String a, String b) {

        if (a.length() > 0 && b.length()> 0) {

            a = a.substring(1);
            b = b.substring(1);
            return a + b;
        }

        return a + b;
    }
}
