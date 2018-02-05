package offer;

/**
 * Created by huali on 2018/2/5.
 */
//输入整形数组，有整数和负数，数组中一个或连续的多个整数组成的一个子数组。
// 求所有子数组的和的最大值。要求时间复杂度为O(n)
public class FindGreatestSumOfSubArray {
    public int findgreateSumOfSubArray(int []array)
    {
        if(array.length==0||array==null)
        {
            return 0;
        }
        int sumsubarray=array[0];
        int greateSum=array[0];//注意初始值 不能设为0 防止只有负数
        for(int i = 1; i < array.length; i++) //从1开始 因为0的情况在初始化时完成了
        {
            if(greateSum<0)
            {
                greateSum=array[i];
            }else {
                greateSum+=array[i];
            }
            if(greateSum>sumsubarray)
            {
                sumsubarray=greateSum;
            }

        }
        return sumsubarray;
    }

}