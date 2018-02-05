package offer;

import java.util.ArrayList;

/**
 * Created by huali on 2018/2/4.
 */
//输出数组中最小的K个数。
    //这种方法会修改数组，因为会重新排序。
    //时间复杂度为：O(n)
public class GetLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k)
    {
        ArrayList<Integer> output=new ArrayList<>();
        if(input==null||input.length==0 ||k>input.length||k<=0)
        {
            return output;
        }
        Partition p = new Partition();
        int n = input.length;
        int start=0;
        int end = n-1;
        int index=p.Partition_1(input,start,end);
        while (index!=k-1)
        {
            if(index>k-1)
            {
                end=index-1;
                index=p.Partition_1(input,start,end);
            }
            else
            {
                start=index+1;
                index=p.Partition_1(input,start,end);
            }
        }
        for(int i=0;i<k;i++)
        {
            output.add(input[i]);
        }
        return output;


    }
}