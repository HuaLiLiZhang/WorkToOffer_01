package offer;

import java.util.HashMap;

/**
 * Created by huali on 2018/2/6.
 */
//第一次出现的字符.HashMap
public class FirstNotRepeatingChar {
    //使用数据容器存储每个元素出现的次数，key, value ,
    // 然后根据字符查找他出现的次数。把字符串映射为一个数字。即是HashMap。
    //key :是字符，value是字符出现的次数。
    public int FirstNotRepeatingChar(String str)
    {
        if(str.length()==0||str==null)
            return -1;
        HashMap<Character,Integer> charMap=new HashMap<>();
        char[]charArray=str.toCharArray();
        for (char ch:charArray)
        {
            if(charMap.containsKey(ch))
            {
                int tmp=charMap.get(ch);
                tmp++;
                charMap.put(ch,tmp);
            }else
            {
                charMap.put(ch, 1);
            }
        }
        for (int i=0;i<charArray.length;i++)
        {
            if(charMap.containsKey(charArray[i]) &&charMap.get(charArray[i])==1)
            {
                return i;
            }
        }
        return 0;

    }
}