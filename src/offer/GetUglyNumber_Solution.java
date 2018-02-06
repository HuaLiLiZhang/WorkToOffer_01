package offer;

/**
 * Created by huali on 2018/2/5.
 */

//判断某个数是不是丑数。
public class GetUglyNumber_Solution {
    //第一种，时间复杂度比较高的，直观但是不高效。

    public int GetUglyNumber_1(int index)
    {
        if(index<=0)
            return 0;
        int number=0;
        int uglyFound=0;
        while (uglyFound<index)
        {
            ++number;
            if(isUgly(number))
                ++uglyFound;
        }
        return number;
    }
    public boolean isUgly(int number)
    {
        while (number%2==0)
            number/=2;
        while (number%3==0)
            number/=3;
        while (number%5==0)
            number/=5;

        return (number==1)? true:false;
    }


    //第二种方法：创建数组保存已经找到的丑数，用空间换时间。
    /**
     * 根据index计算丑数
     *
     * @param
     * @return丑数
     */
    public int GetUglyNumber_2(int index)
    {
        if(index<=0)
            return 0;
        // 为了便于存储，可以建立数组保存中间结果
        int []tmp=new int [index];
        tmp[0]=1;
        // 记录三组数的位置
        int multi2 = 0;
        int multi3 = 0;
        int multi5 = 0;
        int nextUglyNum = 1;
        while (nextUglyNum < index) {
            int min = findMin(tmp[multi2] * 2, tmp[multi3] * 3, tmp[multi5] * 5);
            tmp[nextUglyNum] = min;

            // 重新计算multi2,multi3,multi5
            while (tmp[multi2] * 2 <= min) {
                multi2++;
            }
            while (tmp[multi3] * 3 <= min) {
                multi3++;
            }
            while (tmp[multi5] * 5 <= min) {
                multi5++;
            }
            nextUglyNum++;
        }
        return tmp[index - 1];
    }

    /**
     * 计算三个数的最小值
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public int findMin(int a, int b, int c) {
        int minTmp = (a < b ? a : b);
        return (minTmp < c ? minTmp : c);
    }


}