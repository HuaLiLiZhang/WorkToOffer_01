package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by huali on 2018/3/7.
 */
public class GetNumberMedian {
    private int count = 0;
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(15, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });


    public void Insert(Integer num)
    {
        count++;
        if(count %2 ==0)
        {
//当数据总数为偶数时，新加入的元素，应当进入小根堆
//（注意不是直接进入小根堆，而是经大根堆筛选后取大根堆中最大元素进入小根堆）
//1.新加入的元素先入到大根堆，由大根堆筛选出堆中最大的元素
            if(!maxHeap.isEmpty()&&num<maxHeap.peek())
            {
                maxHeap.offer(num);
                num = maxHeap.poll();
            }
            minHeap.offer(num);
            //2.筛选后的【大根堆中的最大元素】进入小根堆
        }
        else
        {
//当数据总数为奇数时，新加入的元素，应当进入大根堆
//（注意不是直接进入大根堆，而是经小根堆筛选后取小根堆中最大元素进入大根堆）
//1.新加入的元素先入到小根堆，由小根堆筛选出堆中最小的元素
            if(!minHeap.isEmpty()&&num>minHeap.peek())
            {
                minHeap.offer(num);
                num = minHeap.poll();
            }

            maxHeap.offer(num);
        }

    }
    public Double GetMedian()
    {
        if(count%2==0)
            return new Double((minHeap.peek()+maxHeap.peek()))/2;
        else
            return new Double(maxHeap.peek());
    }






    ArrayList<Integer> list =new ArrayList<>();
    public void insert(int num)
    {
        list.add(num);
        count ++;
    }

    public Double getmedium()
    {
        if(list==null||list.size()==0)
            return 0.0;
        //list排序
        quicksort(list,0,list.size()-1);
        //Collections.sort(list);
        System.out.println(count);
        if(count%2==0)
            return (double)(list.get(count/2-1)+list.get(count/2))/2;
        else
            return (double)(list.get(count/2));
    }

    public  void quicksort(ArrayList<Integer> list,int start,int end)
    {
        if(start<end)
        {
            int privot = partition(list,start,end);
            quicksort(list,start,privot-1);
            quicksort(list,privot+1,end);
        }
    }


    public int partition(ArrayList<Integer> list,int start,int end){
        int flag = list.get(start);

        while (start < end) {
            while (start < end && list.get(end) >= flag) {
                end--;
            }
            swap(list, start, end);
            while (start < end && list.get(start) <= flag) {
                start++;
            }
            swap(list, start, end);
        }
        //partition

        return start;
    }

    public void swap(ArrayList<Integer> list, int start, int end) {
        int temp = list.get(start);
        list.set(start,list.get(end));
        list.set(end,temp);
    }

}