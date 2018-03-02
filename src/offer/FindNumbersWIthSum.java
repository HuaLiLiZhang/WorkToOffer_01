package offer;

import java.util.ArrayList;

/**
 * Created by huali on 2018/3/1.
 */
public class FindNumbersWIthSum {
    public ArrayList<Integer> findnumberWithSum(int []array,int sum)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        int length=array.length;
        if(array==null||length<=1)
            return arr;
        int start = 0;
        int end = length-1;
        while (start<end)
        {
            if(array[start]+array[end]==sum)
            {
                if(array[start]>array[end])
                {
                    int temp =array[end];
                    array[end]=array[start];
                    array[start]=temp;
                }
                arr.add(array[start]);
                arr.add(array[end]);
                return arr;
            }else if(array[start]+array[end]>sum)
                end--;
            else
                start++;
        }
        return arr;
    }




    public ArrayList<Integer> findnumberwithsum(int[]array, int sum)
    {
        //boolean found= false;
        int length=array.length;
        int num1=0,num2=0;
        ArrayList<Integer> arr=new ArrayList<>();
        if(array==null||length<=1)
            return arr;

        int start=0;
        int xsum=0;
        int end = length-1;
        while (start<end)
        {
            int foundsum=array[start]+array[end];
            if(foundsum==sum)
            {
                num1 = array[start];
                num2 = array[end];
                //found=true;
                if(arr.isEmpty())
                {arr.add(num1);
                arr.add(num2);
                xsum=num1*num2;
                }
                if(xsum>num1*num2)
                {
                    arr.clear();
                    if(num1>num2) {
                        int temp =num1;
                        num1=num2;
                        num2=temp;
                    }
                    arr.add(num1);
                    arr.add(num2);
                }
                start++;
                end--;
            }else if(foundsum>sum)
            {
                end--;
            }else
                start++;
        }
        return arr;
    }




}