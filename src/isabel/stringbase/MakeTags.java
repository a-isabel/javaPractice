package isabel.stringbase;

public class MakeTags {

    public String makeTags(String tag, String word) {

        String tagBegin = "<" + tag + ">";
        String tagEnd = "</" + tag + ">";

        return tagBegin + word +tagEnd;

    }
}
