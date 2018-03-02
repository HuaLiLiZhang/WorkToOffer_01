package offer;

import java.util.Arrays;

/**
 * Created by huali on 2018/3/2.
 */
public class isContinuous {
//1、排序
//2、计算所有相邻数字间隔总数
//3、计算0的个数
//4、如果2、3相等，就是顺子
//5、如果出现对子，则不是顺子
    public boolean Iscontinuous(int[]numbers)
    {
        if(numbers==null||numbers.length<1)
            return false;

        //排序
        Arrays.sort(numbers);

        int length = numbers.length;
        int numberOfzero = 0;
        int numberOfLoss = 0;
        //统计数组中0的个数,就是癞子的数量，可以充当任何数
        for(int i=0;i<length;i++)
        {
            if(numbers[i]==0)
                ++numberOfzero;
        }
        //统计数组中的间隔数目
        int small = numberOfzero;
        int big = small+1;
        while (big<length)
        {
            if(numbers[small]==numbers[big])
                return false;
            numberOfLoss+=numbers[big]-(numbers[small]+1);
            small=big;
            ++big;
        }
        return (numberOfLoss>numberOfzero)?false:true;
        //癞子数目小于数组的间隔数组，则不是顺子，否则是顺子。

    }


}