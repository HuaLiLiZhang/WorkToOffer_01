import offer.*;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by huali on 2018/2/5.
 */
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //数组中出现次数超过一半的数字。
        //int []array={1,2,3,2,2,2,2,5,4,2};
        //int []array={4,2,1,4,2,4};
        //int[]array={1,2,3,2,4,2,5,2,3};
        //MoreThanHalfNum_On more=new MoreThanHalfNum_On();
        //int result = more.morethanhalfnum(array);
        //System.out.println(result);

        //int []array={1,2,3,2,2,2,2,5,4,2};
        //int []array={4,2,1,4,2,4};
        //int[]array={1,2,3,2,4,2,5,2,3};
        //MoreThanHalfNum_2 more=new MoreThanHalfNum_2();
        //int result=more.morethanHalfNum(array);
        //System.out.println(result);

        //int []array={4,5,1,6,2,7,3,8};
        //ArrayList<Integer> output= new GetLeastNumbers().GetLeastNumbers_Solution(array,6);
        //if(output!=null) {
        //    for (int j = 0; j < output.size(); j++) {
        //        System.out.println(output.get(j));
        //    }
        //}
        //int []array={4,5,1,6,2,7,3,8};
        //ArrayList<Integer> output= new GetLeastNumbers_OlogK().GetLeastNumbers(array,6);
        //if(output!=null) {
        //    for (int j = 0; j < output.size(); j++) {
        //        System.out.println(output.get(j));
        //    }
        //}

        //int []array={4,5,1,6,2,7,3,8};
        //TreeSet<Integer> output= new GetLeastNumbers_OlogKTreeSet().GetLeastNumbers(array,4);
        //if(output!=null) {
        //    while (!output.isEmpty()){
        //        System.out.println(output.last());
        //        output.pollLast();
        //    }
        //}


        //int []arr={1,-2,3,10,-4,7,2,-5};
        ////int[]arr={-2,-8,-1,-5,-9};
        //FindGreatestSumOfSubArray find= new FindGreatestSumOfSubArray();
        //int sumsubarraymax=find.findgreateSumOfSubArray(arr);
        //System.out.println(sumsubarraymax);

        //int []arr={1,-2,3,10,-4,7,2,-5};
        //int[]arr={-2,-8,-1,-5,-9};
        int[]arr={2,8,1,5,9};
        FindGreatestSumOfSubArray_fn find= new FindGreatestSumOfSubArray_fn();
        int sumsubarraymax=find.findgreatsumsubarray(arr);
        System.out.println(sumsubarraymax);

    }

}