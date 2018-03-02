package offer;



/**
 * Created by huali on 2018/3/2.
 */
public class ReverseSentence {
    public String reverseSentence(String str)
    {
        char[] chars = str.toCharArray();
        if(chars==null)
            return null;

        int length = chars.length;
        int s=0,e=0;
        int i=0;
        reverse(chars,0,length-1);
        while (i<length)
        {
            while (i<length&&chars[i]==' ')//空格跳过
                i++;
            e=s=i; //记录单词的第一个字符的位置。
            while (i<length&&chars[i]!=' ')
            {
                i++;
                e++;
            }
            reverse(chars,s,e-1);
        }
        StringBuilder sb=new StringBuilder();
        for (char c:chars)
        {
            sb.append(c);
        }

        return sb.toString();

    }

    public void reverse(char[]chars, int low ,int high)
    {
        char temp;
        while (low<high)
        {
            temp=chars[low];
            chars[low]=chars[high];
            chars[high]=temp;
            low++;
            high--;
        }
    }

}