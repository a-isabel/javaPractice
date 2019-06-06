package isabel.warmup;

public class OrTeen {

    public boolean loneTeen(int a, int b) {

        boolean aTeen = (a > 12 && a < 20 );
        boolean bTeen = (b > 12 && b < 20 );

        return ((aTeen && !bTeen)||( !aTeen && bTeen));
    }
}


 /*   public boolean loneTeen(int a, int b) {

        return ((a > 12 && a < 20 ) && ! (b > 12 && b < 20 ) || (b > 12 && b < 20 ) && ! (a > 12 && a < 20 ));
    }*/