package offer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by huali on 2018/3/6.
 */
public class FirstAppearingOnce {
    int [] hashtable = new int[256];
    StringBuffer s =new StringBuffer();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        s.append(ch);
        if(hashtable[ch]==0)
            hashtable[ch]=1;
        else
            hashtable[ch]+=1;
    }
    //return the first appearence once char in current stringstream
    public char firstAppearingOnce()
    {
        char[] str=s.toString().toCharArray();
        for(char ch:str)
        {
            if(hashtable[ch]==1)
                return ch;
        }
        return '#';
    }
}