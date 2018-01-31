/**
 * Created by Dhanesh Veedu on Jan.2018.
 */
public class N_LargestFromAnArray {

    int[] num = {56,9,3,1,1,5,7,20,11,8,12};
    public static void main(String a[]) {


        N_LargestFromAnArray obj = new N_LargestFromAnArray();
        obj.largestElement();
    }

    private static void topNElements(int n) {

    }

    private  void largestElement() {
        int t=0;
        for (int i=0;i<num.length-1; i++) {
            t = (t < num[i])?  num[i] : t ;
        }
        System.out.println(t);
    }
}
