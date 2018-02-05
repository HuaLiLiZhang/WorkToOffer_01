package offer;


/**
 * Created by huali on 2018/2/4.
 */

/*
找出数组中出现的次数超过数组一半长度的那个数字。
//是否可以修改数据和增加内存。！！！！！！！！！！

1。考虑特殊情况，数组空，或长度<=0
2.没有那个出现次数超过数组长度一半的那个数。
*/

public class MoreThanHalfNum_On {
    public int morethanhalfnum(int[] array) {
        int length = array.length;
        if (array == null || length <= 0) {
            return 0;
        }
        int mid = length >> 1;
        int start = 0;
        int end = length - 1;

        Partition p=new Partition();

        int index = p.Partition_1(array, start, end);

        while (index != mid) {
            if (index > mid) {
                end = index - 1;
                index =p.Partition_1(array, start, end);
            } else {
                start = index + 1;
                index = p.Partition_1(array, start, end);
            }
        }
        int result = array[mid];
        //考虑如果数组中没有出现超过一半的某个数。
        //if(!checkMoreThanHalf(array,length,result))
        //{
        //    return 0;
        //}
        int time = 0;
        for (int i = 0; i < length; ++i) {
            if (array[i] == result) {
                time++;
            }
        }
        if (time * 2 <= length) {
            return 0;
        }
        return result;



    }

    //public int Partition(int[] array, int start, int end) {
    //    int flag = array[start];
    //
    //    while (start < end) {
    //        while (start < end && array[end] >= flag) {
    //            end--;
    //        }
    //        swap(array, start, end);
    //        while (start < end && array[start] <= flag) {
    //            start++;
    //        }
    //        swap(array, start, end);
    //    }
    //    return start;
    //}

    public void swap(int[] array, int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }

    public boolean checkMoreThanHalf(int []array,int length,int result) {
        int time = 0;
        for (int i = 0; i < length; ++i) {
            if (array[i] == result) {
                time++;
            }
        }
        boolean ismorethahalf = true;
        if (time * 2 <= length) {
            //System.out.println(time);
            ismorethahalf = false;

        }
        return ismorethahalf;
    }
}