package offer;

/**
 * Created by huali on 2018/2/4.
 */
//第二种方法，根据数组特点找出O(n)算法
    //不能修改数据的一种算法。
public class MoreThanHalfNum_2 {
    public int morethanHalfNum(int []array)
    {
        if(array==null||array.length<=0)
        {
            return 0;
        }
        int length=array.length;
        int result =array[0];
        int flag=1;
        for(int i=1;i< length;++i) {
            if (flag == 0) {
                result = array[i];
                flag = 1;
            } else if (array[i] == result) {
                flag++;
            } else {
                flag--;
            }
        }

        //前面找到比其他元素都要多的数字，不一定数目超过数组一半，也不一定是最多的一个数字，
        // 而且不一定找到，下面确认是否找到，个数大于数组一半。

            int time = 0;
            for (int j = 0; j < length; ++j) {
                if (array[j] == result) {
                    time++;
                }
            }
            System.out.println(time);
            if (time * 2 <= length) {
                return 0;
            }
            //if(flag<=0)
            //{
            //    return 0;
            //}
        // 错误，并不能判断，flag>1不代表找到，只是找到相对对的数字，
        // 相对于其他数字多，并不一定超过数组一半。


        return result;

    }
}