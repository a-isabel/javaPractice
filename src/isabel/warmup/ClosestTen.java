package isabel.warmup;

public class ClosestTen {

    public int close10(int a, int b) {

        int diffA = Math.abs(10-a);
        int diffB = Math.abs(10-b);

        if (diffA == diffB){
            return 0;
        }
        if (diffA < diffB){
            return a;
        }
        return b;
    }
}
