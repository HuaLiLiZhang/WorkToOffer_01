package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by huali on 2018/2/4.
 */
//时间复杂度为：O(nlogk)
    //没有修改输入数据
    //适合海量数据的输入，不可能把全部数据放入内存，只能放入K个，
// 然后最大值与待插入的数字比较，小于此最大值，则交换。
public class GetLeastNumbers_OlogK {
    public ArrayList<Integer> GetLeastNumbers(int [] input , int k)
    {
        ArrayList<Integer> output=new ArrayList<>();


        //自定义Comparator对象，自定义排序
        Comparator c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                if((int)o1<(int)o2)
                    return 1;
                    //注意！！返回值必须是一对相反数，否则无效。jdk1.7以后就是这样。
                    //      else return 0; //无效
                else return -1;
            }
        };

        if(k<1||input.length<k||input.length<=0||input==null)
        {
            return output;
        }

        for(int i=0;i<k;i++)
        {
            output.add(input[i]);
        }

        Collections.sort(output);

        for(int j=k;j<input.length;j++)
        {
            if(output.get(k-1)>input[j])
            {
                output.set(k-1,input[j]);
                Collections.sort(output);
            }

        }
        return output;


    }
}