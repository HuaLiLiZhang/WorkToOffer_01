package offer;

/**
 * Created by huali on 2018/3/5.
 */
public class duplicate {
    public boolean duplicate_n(int numbers[],int length, int [] duplication)
    {
        if(numbers==null||length<=0)
            return false;
        for(int i=0;i<length;++i)
        {
            if(numbers[i]<0||numbers[i]>length-1)
                return false;
        }
        for(int i=0;i<length;++i)
        {
            while (numbers[i]!=i)
            {
                if (numbers[i] == numbers[numbers[i]])
                {
                    duplication[i] = numbers[i];
                    return true;
                }
                int temp = numbers[i];
                numbers[i]=numbers[temp];
                numbers[temp]=temp;
            }

        }
        return false;
    }

    public boolean duplicate_N(int numbers[],int length, int [] duplication)
    {
        if(numbers==null||length<=0)
            return false;
        for(int i=0;i<numbers.length;++i)
            duplication[i]=0;
        for(int i=0;i<length;++i)
        {
            if(numbers[i]<0||numbers[i]>length-1)
            {
                return false;
            }
            duplication[numbers[i]]++;
        }

        for (int i=0;i<duplication.length;++i)
        {
            if(duplication[i]>1)
                return true;
        }
        return false;
    }

}