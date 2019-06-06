package isabel.warmup;

public class OzStart {

    public String startOz(String str) {
        String ozStr  ="";
        if ((str.length() > 0) && (str.charAt(0)=='o')){
            ozStr = ozStr + str.charAt(0);
        }
        if ((str.length() >1) && (str.charAt(1) == 'z')){
            ozStr = ozStr + str.charAt(1);
        }
        return ozStr;
    }
}
