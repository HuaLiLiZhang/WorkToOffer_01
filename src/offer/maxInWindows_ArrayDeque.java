package offer;


import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Created by huali on 2018/3/7.
 */
public class maxInWindows_ArrayDeque {
    /**
      * 题目：滑动窗口的最大值
      * 思路：滑动窗口应当是队列，但为了得到滑动窗口的最大值，队列序可以从两端删除元素，因此使用双端队列。
      *     原则：
      *     对新来的元素k，将其与双端队列中的元素相比较
      *     1）前面比k小的，直接移出队列（因为不再可能成为后面滑动窗口的最大值了!）,
      *     2）前面比k大的X，比较两者下标，判断X是否已不在窗口之内，不在了，直接移出队列
      *     队列的第一个元素是滑动窗口中的最大值
      */
    public ArrayList<Integer> maxInWindows(int[]num,int size)
    {
        ArrayList<Integer> list =new ArrayList<>();
        if(num==null)
            return list;
        if(num.length<size||size<1)
            return list;
        int begin;
        ArrayDeque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<num.length;++i)
        {
            begin=i-size+1;
            if(q.isEmpty())
                q.add(i);
            else if (begin>q.peekFirst())
                q.pollFirst();  //1.判断当前最大值是否过期

            while ((!q.isEmpty())&&num[q.peekLast()]<=num[i])
                q.pollLast();//2.新增加的值从队尾开始比较，把所有比他小的值丢掉
            q.add(i);
            if(begin>=0)
                list.add(num[q.peekFirst()]);

        }
        return list;
    }



    public ArrayList<Integer> maxInWindow(int[]num,int size)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(num==null||num.length==0||size<=0)
            return list;
        if(num.length<size)
            return list;
        getMaxList(list,num,size);
        return list;
    }
    public void getMaxList(ArrayList<Integer> list,int[]num,int size)
    {
        //保存此时窗口可能的最大值的下标
        ArrayDeque<Integer> max = new ArrayDeque<>();
        for(int i =0;i<size;++i)
        {
            while (!max.isEmpty()&&num[i]>num[max.getLast()])
            {
                max.removeLast();
            }
            max.add(i);
        }
        for(int i=size;i<num.length;++i)
        {
            list.add(num[max.getFirst()]);
            while (!max.isEmpty()&&num[i]>num[max.getLast()])
                max.removeLast();
            if(!max.isEmpty()&&max.getFirst()<=(i-size))
                max.removeFirst();
            max.add(i);
        }
        list.add(num[max.getFirst()]);
    }

}