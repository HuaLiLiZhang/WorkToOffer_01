package offer;

import java.util.ArrayList;

/**
 * Created by huali on 2018/3/2.
 */
public class LastRemaining_Solution {
    //递归的思路，时间复杂度是O(n)，空间复杂度是O(1).
     public int LastRemaining(int n,int m)
     {
         if(n<1||m<1)
             return -1;
         int last = 0;
         for(int i=2;i<=n;++i)
         {
             last=(last+m)%i;
         }
         return last;
     }

     public int lastremaining(int n,int m)
     {
         if(n<1||m<1)
             return -1;
         ArrayList<Integer> array=new ArrayList<>();
         for(int i=0;i<n;++i)
             array.add(i);
         int tempIndex = (m-1)%array.size();//用于记录最初需清除的数字索引
         while (array.size()!=1)
         {
             array.remove(tempIndex);
             tempIndex=(tempIndex+m-1)%array.size();//记录当前索引。
         }
         return array.get(0);


     }
}