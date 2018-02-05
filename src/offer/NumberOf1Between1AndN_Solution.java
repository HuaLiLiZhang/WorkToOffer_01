package offer;

/**
 * Created by huali on 2018/2/5.
 */
//从1到n的整数中1出现的次数。
public class NumberOf1Between1AndN_Solution {

    ///解法1：经典解法，容易想到，时间复杂度O(n*logn)
    public int NumberOf1Between1AndN_1(int n) {
        if (n<=0)
            return 0;

        int number=0;
        for (int i=1;i<=n;i++)
            number+=countNumber1(i);

        return number;
    }

    public int countNumber1(int m){
        int number =0;
        while (m!=0){
            if (m%10 ==1)
                number++;

            m=m/10;
        }

        return number;
    }


    ///解法2：O(logn)的解法，从数字规律着手

    /**
     * 1. 取第 i 位左边（高位）的数字，乘以 10^(i−1)，得到基础值 a。
     * 2. 取第 i 位数字，计算修正值：
     *      1.如果大于 X，则结果为 a+10^(i−1)。
     *      2.如果小于 X，则结果为 a。
     *      3.如果等 X，则取第 i 位右边（低位）数字，设为 b，最后结果为 a+b+1。
     */
    public int NumberOf1Between1AndN_2(int n) {
        if (n <= 0)
            return 0;
        int i = 1;
        int high = n, cur, low, result = 0;
        int base = 0, modify = 0;
        while (high != 0) {
            //i代表目前第几位。
            high = n / (int) Math.pow(10, i);
            cur = (n % (int) Math.pow(10, i)) / (int) Math.pow(10, i - 1);
            low = n % (int) Math.pow(10, i - 1);

            base = high * (int) Math.pow(10, i - 1);
            if (cur == 0) {
                modify = 0;
            } else if (cur == 1) {
                modify = low + 1;
            } else {
                modify = (int) Math.pow(10, i - 1);
            }
            result += base + modify;
            i++;
        }
        return result;
    }


}