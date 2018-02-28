package offer;

/**
 * Created by huali on 2018/2/28.
 */
public class GetNumberOfk {
    public int GetNumberOfK(int []array,int k)
    {

        if(array!=null&&array.length>0)
        {
            int length=array.length;
            int first =getFirstK(array,k,0,length-1);
            int last = getlastK(array,k,0,length-1);

            if(first>-1&&last>-1)
                return last-first+1;
        }

        return 0;
    }
    public int getFirstK(int [] array,int k,int start ,int end)
    {
        if(array==null||array.length==0||start>end)
        //考虑边界情况。数组中没有要查找的数字，查找数字只出现一次、多次
        {
            return -1;
        }
        int middleIndex=(start+end)/2;
        int middledata = array[middleIndex];
        if(middledata==k)
        {
            if((middleIndex>0&&array[middleIndex-1]!=k)||middleIndex==0)
            {
                return middleIndex;
            }else
            {
                end=middleIndex-1;
            }
        }
        else if(middledata>k)
        {
            end=middleIndex-1;
        }
        else
            start=middleIndex+1;

        return getFirstK(array,k,start,end);
    }

    public int getlastK(int[]array ,int k ,int start ,int end)
    {
        if(array==null||array.length==0||start>end)
        {
            return -1;
        }
        int middleIndex=(start + end )/2;
        int middledata=array[middleIndex];

        if(middledata==k)
        {
            if((middleIndex<array.length-1&&array[middleIndex+1]!=k)||middleIndex==array.length-1)
                return middleIndex;
            else
                start=middleIndex+1;
        }
        else if(middledata<k)
            start=middleIndex+1;
        else
            end=middleIndex-1;
        return getlastK(array,k,start,end);

    }
}