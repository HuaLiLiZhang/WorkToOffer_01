package offer;

/**
 * Created by huali on 2018/3/2.
 */
public class Add {
    public int add_number(int num1,int num2)
    {
        int sum ,carry;
        while (num2!=0)
        {
            sum=num1^num2;//异或
            carry=(num1 & num2)<<1;
            num1=sum;
            num2=carry;
        }
        return num1;
    }
}