package offer;


/**
 * Created by huali on 2018/2/6.
 */
//数组中的逆序对的个数。
public class InversePairs {
    //在数组中两个数字如果前面一个数字大于后面一个数字，称这两个数字组成一个逆序对。
    //在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
    // 输入一个数组,求出这个数组中的逆序对的总数P。
    // 并将P对1000000007取模的结果输出。 即输出P%1000000007
    public int InversePairs_1(int [] array)
    {
        if(array==null||array.length==0)
        {
            return 0;
        }
        int length=array.length;
        int [] copy = new int [length];
        for (int i=0;i<length;i++)
        {
            copy[i]=array[i];
        }
        int count = InversePairsCore(array,copy,0,length-1)%1000000007;
        return count;
    }

    public  int InversePairsCore(int [] array, int [] copy,int start, int end)
    {
        if(start==end)
        {
            copy[start]=array[start];
            return 0;
        }
        int middle=(end-start)/2;
        int left =InversePairsCore(copy,array,start,start+middle)%1000000007;
        int right=InversePairsCore(copy,array,start+middle+1,end)%1000000007;
        //i初始化为前半段最后一个数字的下标
        int i=start+middle;
        //j初始化为后半段最后一个数字的下标。
        int j=end;
        int indexCopy=end;
        int count=0;
        while (i>=start && j>=start+middle+1)
        {
            if(array[i]>array[j])
            {
                copy[indexCopy--]=array[i--];
                count+=j-start-middle;
                count = count %1000000007;
            }else
            {
                copy[indexCopy--]=array[j--];
            }
        }
        for(;i>=start;--i)
        {
            copy[indexCopy--]=array[i];
        }
        for (;j>=start+middle+1;--j)
        {
            copy[indexCopy--]=array[j];
        }

        return (left+right+count)%1000000007;
    }


    //public
}