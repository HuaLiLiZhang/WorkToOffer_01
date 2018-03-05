package offer;


/**
 * Created by huali on 2018/3/5.
 */
public class Match {
    public boolean match(char[] str,char[] pattern)
    {
        if(str==null||pattern==null)
            return false;
        int strIndex = 0;
        int patternIndex= 0;
        return matchCore(str,strIndex,pattern,patternIndex);
    }

    public boolean matchCore(char[]str,int strIndex ,char[]pattern,int patternIndex)
    {
        //有效性检验：str到尾，pattern到尾，匹配成功
        if(strIndex==str.length&&patternIndex==pattern.length)
            return true;
        //pattern先到尾，匹配失败
        if(strIndex!=str.length&&patternIndex==pattern.length)
            return false;
        //模式第2个是*时，切字符中第1个匹配，分3种匹配模式，如不匹配，模式后移2位。
        if(patternIndex+1<pattern.length&&pattern[patternIndex+1]=='*')
        {
            if(strIndex!=str.length&&pattern[patternIndex]==str[strIndex]
                    ||(pattern[patternIndex]=='.'&&strIndex!=str.length))
            {
                return matchCore(str,strIndex,pattern,patternIndex+2)////模式后移2，视为x*匹配0个字符
                        ||matchCore(str,strIndex+1,pattern,patternIndex+2)//视为模式匹配1个字符
                        ||matchCore(str,strIndex+1,pattern,patternIndex);//*匹配1个，再匹配str中的下一个,因为第二个为*，所以前面第一个可以重复很多次，或0次。
            }else {
                return matchCore(str,strIndex,pattern,patternIndex+2);
                //不相等模板直接往后加2
            }
        }
        //模式第2个不是*，且字符串第1个跟模式第1个匹配，或者模式为.，进行匹配，然后则都后移1位，否则直接返回false
        if((strIndex!=str.length&&pattern[patternIndex]==str[strIndex])||(pattern[patternIndex]=='.'&&strIndex!=str.length))
        {
            return matchCore(str,strIndex+1,pattern,patternIndex+1);
        }
        return false;
    }
}