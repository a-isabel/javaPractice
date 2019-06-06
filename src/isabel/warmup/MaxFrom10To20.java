package isabel.warmup;

public class MaxFrom10To20 {

    public int max1020(int a, int b) {
        int temp;

        if (a < b){
            temp = a;
            a = b;
            b = temp;
        }

        if (a >= 10 && a <= 20){
            return a;
        }
        if (b >= 10 && b <= 20){
            return b;
        }
        return 0;

    }

}
