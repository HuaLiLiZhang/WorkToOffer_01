/**
 * Created by huali on 2018/3/5.
 */
public class StrToInt {
    public static boolean flag;
    public int StrtoInt(String str)
    {
        flag=false;
        //判断是否是合法输入
        //String.trim():返回字符串的副本，忽略前导空白和尾部空白。
        if(str==null||str.trim().equals(""))
        {
            flag=true;
            return 0;
        }
        // symbol=0,说明该数为正数;symbol=1，该数为负数;start用来区分第一位是否为符号位
        //是符号位，start都为1.不是为0.
        int symbol = 0;
        int start = 0;
        char [] chars = str.trim().toCharArray();
        if(chars[0]=='+')
            start=1;
        else if(chars[0]=='-')
        {
            start=1;
            symbol=1;
        }
        //result存储结果
        int result = 0;
        for(int i=start;i<chars.length;++i) //从符号位开始遍历。
        {
            if(chars[i]>'9'||chars[i]<'0')
            {//如果遇到0-9以外的字符，返回0，
                flag=true;
                return 0;
            }
            /*
             * 本人认为java热门第一判断是否溢出是错误的，举个反例
             * 当输入为value=2147483648时，在计算机内部的表示应该是-2147483648
             * 显然value>Integer.MAX_VALUE是不成立的
            */
            int sum = result*10 +(int)(chars[i]-'0');
            if((sum-(int)(chars[i]-'0'))/10!=result)
            {  //对于溢出的处理。
                flag=true;
                return 0;
            }
            //System.out.println(sum-(int)(chars[i]-'0'));
            result=result*10+(int)(chars[i]-'0');
        }
        result = (int)Math.pow(-1,symbol)*result;
        return  result;
    }
}