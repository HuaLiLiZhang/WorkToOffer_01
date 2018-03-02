package offer;

/**
 * Created by huali on 2018/3/2.
 */
public class PrintProbability {
    int g_maxvalue=6;
    public void printProbability(int number)
    {
        if(number<1)
            return;
        int maxSum = number * g_maxvalue;
        int []pProbablity = new int[maxSum-number+1];
        for(int i=number;i<=maxSum;i++)
        {
            pProbablity[i-number]=0;
        }
        Probability(number,pProbablity);

        double total = Math.pow(g_maxvalue,(double)number);
        for(int i=number;i<=maxSum;++i)
        {
            double radio=(double) pProbablity[i-number]/total;
            System.out.println("radio:"+radio);
        }

    }

    public void Probability(int number,int[]pProbablity)
    {
        for(int i=1;i<=g_maxvalue;++i)
        {
            Probability(number,number,i,pProbablity);
        }
    }
    public void Probability(int original,int current,int sum,int[]pProbablity)
    {
        if(current==1)
            pProbablity[sum-original]++;
        else
            {
            for (int i=1;i<=g_maxvalue;++i)
                Probability(original,current-1,i+sum,pProbablity);
        }
    }











    public void printprobability(int number)
    {
        if(number<1)
            return;
        int [] []pProbability = new int[g_maxvalue*number+1][g_maxvalue*number+1];

        for(int i=0;i<g_maxvalue*number+1;++i)
        {
            pProbability[0][i]=0;
            pProbability[1][i]=0;
        }
        int flag = 0;
        for(int i=0;i<=g_maxvalue;++i)
            pProbability[flag][i]=1;

        for(int k=2;k<=number;++k)
        {
            for (int i=0;i<k;++i)
            {
                pProbability[1-flag][i]=0;
            }

            for(int i=k;i<=g_maxvalue*k;++i)
            {
                pProbability[1-flag][i]=0;
                for(int j=1;j<=i&&j<=g_maxvalue;++j)
                    pProbability[1-flag][i]+=pProbability[flag][i-j];
            }
            flag=1-flag;
        }

        double total = Math.pow(g_maxvalue,(double)number);
        for(int i=number;i<=g_maxvalue*number;++i)
        {
            double ratio = (double) pProbability[flag][i]/total;
            System.out.println("ratio:"+ratio);
        }

    }
}