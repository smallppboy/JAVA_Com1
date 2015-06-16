package Chapter6;

/**
 * Created by ZhuangFang on 2015/6/15.
 */
public class LocalClassDemo {
    public static void main(String[] args) {

        //An inner class
        class ShowBits {
            int numbits;

            ShowBits(int n) {
                numbits = n;
            }

            void show(long val) {
                long mask =1;

                mask <<= numbits -1;

                int spacer = 0;
                for(; mask!=0; mask >>>=1){
                    if ((val & mask)  !=0) System.out.print("1");
                    else System.out.print("0");
                    spacer++;
                    if((spacer % 8)==0) {
                        System.out.print(" ");
                        spacer =0;
                    }
                }
                System.out.println();
            }
        }

        for (int b=0; b < 1000; b++) {
            ShowBits byteval = new ShowBits(16);
            System.out.print(b + " in binary: ");
            byteval.show(b);
        }
    }
}
