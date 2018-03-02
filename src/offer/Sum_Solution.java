package offer;

/**
 * Created by huali on 2018/3/2.
 */
public class Sum_Solution {
    public int sum_n(int n)
    {
        if(n==1)
            return 1;
        int sum0 =n + sum_n(n-1);
        return sum0;
    }

    public int sum_N(int n)
    {
        int sum = n;
        boolean flag = (sum>0)&&((sum+=sum_n(--n))>0);
        return sum;
    }


}