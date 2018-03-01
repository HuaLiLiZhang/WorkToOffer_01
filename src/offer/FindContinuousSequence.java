package offer;

import java.util.ArrayList;

/**
 * Created by huali on 2018/3/1.
 */
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> findContinuousSequence(int sum)
    {
        ArrayList<ArrayList<Integer>> array=new ArrayList<ArrayList<Integer>>();
        if(sum<3)
            return array;
        int small=1;
        int big=2;
        int middle=(1+sum)/2;
        int cursum = small+big;
        while (small<middle)
        {
            if(cursum==sum)
                printContiniousSequence(small,big,array);
            while (cursum>sum&&small<middle)
            {
                cursum -=small;
                small++;
                if(cursum==sum)
                    printContiniousSequence(small,big,array);
            }
            big++;
            cursum+=big;
        }
        return array;
    }

    public void printContiniousSequence(int small,int big,ArrayList<ArrayList<Integer>> array)
    {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=small;i<=big;i++)
        {
            //System.out.println(i+",");
            arr.add(i);
        }
        array.add(arr);
    }
}