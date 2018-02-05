package offer;

/**
 * Created by huali on 2018/2/5.
 */

//使用动态规划
//F（i）：以array[i]为末尾元素的子数组的和的最大值，子数组的元素的相对位置不变
//F（i）=max（F（i-1）+array[i] ， array[i]）
//res：所有子数组的和的最大值
//res=max（res，F（i））
//
//如数组[6, -3, -2, 7, -15, 1, 2, 2]
//初始状态：
//    F（0）=6
//    res=6
//i=1：
//    F（1）=max（F（0）-3，-3）=max（6-3，3）=3
//    res=max（F（1），res）=max（3，6）=6
//i=2：
//    F（2）=max（F（1）-2，-2）=max（3-2，-2）=1
//    res=max（F（2），res）=max（1，6）=6
//i=3：
//    F（3）=max（F（2）+7，7）=max（1+7，7）=8
//    res=max（F（2），res）=max（8，6）=8
//i=4：
//    F（4）=max（F（3）-15，-15）=max（8-15，-15）=-7
//    res=max（F（4），res）=max（-7，8）=8
//以此类推
//最终res的值为8
public class FindGreatestSumOfSubArray_fn {
    public int findgreatsumsubarray(int []array)
    {
        if(array==null||array.length==0)
        {
            return 0;
        }
        int sumarray=array[0];
        int res=array[0];
        for (int i=1;i<array.length;++i)
        {
            res=Math.max(res+array[i],array[i]);//思路其实与另外一个一样，只不过这里是动态规划
            //计算到当前元素的所有元素的和，判断是否小于当前元素，如果小于，则从当前元素开始计数。
            //最大值得子数组从此元素开始计算。
            sumarray=Math.max(sumarray,res);
            //判断当前最大值和历史最大值，比较取最大值。
        }
        return sumarray;
    }
}