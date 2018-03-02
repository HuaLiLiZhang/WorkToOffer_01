package offer;

/**
 * Created by huali on 2018/3/2.
 */
public class LeftRotateString {
    public String leftRotatestring(String str,int n)
    {
        char[] chars= str.toCharArray();
        System.out.println(chars[0]);
        if(chars.length<n)
            return "";
        reverse(chars,0,n-1);
        reverse(chars,n,chars.length-1);
        reverse(chars,0,chars.length-1);

        StringBuilder stringBuilder = new StringBuilder();
        for (char c:chars)
        {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();


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


    public String leftrotateString(String str,int n)
    {
        //保证旋转的位数大于字符串的长度，否则返回空字符串
        if(n>str.length())
            return "";
        //把原字符串截取成俩字符串，然后拼接
        String s1 = str.substring(0, n);
        String s2 = str.substring(n,str.length());
        return s2 + s1;
    }
}