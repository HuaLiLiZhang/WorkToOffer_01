package offer;

/**
 * Created by huali on 2018/3/1.
 */
public class FindNumbersWIthSum {
    public boolean findnumberwithsum(int[]array,int sum,int[]num1,int[]num2)
    {
        boolean found= false;
        int length=array.length;
        if(array==null||length<=1||num1.length==0||num2.length==0)
            return found;

        int start=0;
        int end = length-1;
        while (start<end)
        {
            int foundsum=array[start]+array[end];
            if(foundsum==sum)
            {
                num1[0] = array[start];
                num2[0] = array[end];
                found=true;
                return found;
            }else if(foundsum>sum)
            {
                end--;
            }else
                start++;
        }
        return found;
    }
}