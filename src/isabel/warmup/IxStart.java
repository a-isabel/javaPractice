package isabel.warmup;

public class IxStart {
    public boolean mixStart(String str) {
        return (str.length() > 2 && str.substring(1,3).equalsIgnoreCase("ix"));
    }
}
