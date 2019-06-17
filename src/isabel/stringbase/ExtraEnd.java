package isabel.stringbase;

public class ExtraEnd {
    public String extraEnd(String str) {

        str = str.substring(str.length() - 2);

        return str + str + str;

    }

}
