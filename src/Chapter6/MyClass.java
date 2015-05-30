package Chapter6;

/**
 * Created by ZhuangFang on 2015/5/30.
 */
class MyClass {
    private int alpha; //   private access
    public int beta; // this is
    int gamma;  // default access

    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}
