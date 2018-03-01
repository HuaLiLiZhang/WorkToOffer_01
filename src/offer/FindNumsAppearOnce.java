package offer;

/**
 * Created by huali on 2018/3/1.
 */
public class FindNumsAppearOnce {
    public void findNumsAppearOnce(int []array, int []num1,int[]num2)
    {
        if(array==null||array.length<2)
            return ;
        int length = array.length;
        int resultExclusiveOR=0;
        for(int i=0;i<length;i++)
        {
            resultExclusiveOR ^=array[i];
        }

        //num1,num2分别为长度为1的数组。传出参数
       //将num1[0],num2[0]设置为返回结果
        int indexof1 = findFirstBitTs1(resultExclusiveOR);
        num1[0]=num2[0]=0;
        for(int j=0;j<length;j++)
        {
            if(IsBit1(array[j],indexof1))
                num1[0]^=array[j];
            else
                num2[0]^=array[j];
        }
        System.out.println(num1[0]+","+num2[0]);



    }

    public int findFirstBitTs1(int num)
    {
        int indexBits=0;
        while (((num&1)==0)&&(indexBits<32))
        {
            num = num>>1;
            ++indexBits;
        }
        return indexBits;
    }

    public boolean IsBit1(int num, int indexBits)
    {
        num=num>>indexBits;
        if((num&1)==0)
        {
            return false;
        }
        return true;
    }
}