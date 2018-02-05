package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 * Created by huali on 2018/2/5.
 */
public class PrintMinNumber {
    //第一种，利用Collection的sort方法。
    public String PrintMinNumber(int [] numbers)
    {
        if(numbers==null||numbers.length==0)
            return "";
        ArrayList<String> arrayList=new ArrayList<>();
        for(int i=0;i<numbers.length;i++)
        {
            arrayList.add(String.valueOf(numbers[i]));
        }
        Collections.sort ( arrayList, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String tmpA = a+b;
                String tmpB = b+a;
                return tmpA.compareTo ( tmpB );
            }
        } );
        String min="";
        for (String tmp:arrayList)
        {
            min+=tmp;
        }

        return min;
    }

    //第二种，冒泡排序做。
    public String PrintMinNumber_2(int [] numbers)
    {
        if(numbers==null||numbers.length==0)
            return "";

        String [] numStrs= new String[numbers.length];
        for (int i = 0; i<numbers.length; i++)
        {
            numStrs[i]=String.valueOf(numbers[i]);
        }
        String result = minNumber(numStrs);
        return result;
    }

    public String minNumber(String [] numStrs)
    {
        String result = "";
        if (numStrs==null||numStrs.length==0)
            return result;
        boolean flag = true;  //冒泡改进
        for (int i = 0; i<numStrs.length&&flag;i++)
        {
            flag=false;
            for (int j=numStrs.length-1;j>i;j--)
            {
                if(isALessB(numStrs[j],numStrs[i]))
                {
                    swap(numStrs,j,i);
                    flag=true;
                }
            }
        }
        for (int i=0;i<numStrs.length;i++)
        {
            result+=numStrs[i];
        }
        return result;
    }

    public boolean isALessB(String a ,String b)
    {
        String tmpA=a+b;
        String tmpB=b+a;
        boolean isless=false;
        if(tmpA.compareTo(tmpB)<0)
            isless=true;
        return isless;
    }

    public void swap(String [] source ,int j ,int i)
    {
        String tmp=source[j];
        source[j]=source[i];
        source[i]=tmp;
    }

}