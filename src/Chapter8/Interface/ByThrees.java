package Chapter8.Interface;

/**
 * Created by ZhuangFang on 2015/8/2.
 */
class ByThrees implements Series {
    int start;
    int val;

    ByThrees(){
        start=0;
        val=0;
    }

    public int getNext(){
        val+=3;
        return val;
    }

    public void reset(){
        val =start;
    }

    public void setStart (int x){
        start = x;
        val = x;
    }

}
