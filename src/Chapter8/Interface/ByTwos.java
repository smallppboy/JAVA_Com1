package Chapter8.Interface;

/**
 * Created by ZhuangFang on 2015/8/2.
 */
class ByTwos implements Series {
    int start;
    int val;
    int prev;

    ByTwos(){
        start=0;
        val=0;
        prev = -2;
    }

    public int getNext(){
        prev = val;
        val+=2;
        return val;
    }

    public void reset(){
        val =start;
        prev = start -2;
    }

    public void setStart (int x){
        start = x;
        val = x;
        prev = start -2;
    }

    int getPrev(){
        return prev;
    }

}