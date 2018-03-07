package offer;

/**
 * Created by huali on 2018/3/7.
 */
public class Serialize_Deserialize {
    public int index = -1;

    public String Serialize(BinaryTreeNode root)
    {
        StringBuffer sb = new StringBuffer();
        if(root ==null)
        {
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val+",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }

    public BinaryTreeNode Deserialize(String str)
    {
        index++;
        int len = str.length();
        if(index >=len)
            return null;
        String[] strings = str.split(",");
        BinaryTreeNode node = null;
        if(!strings[index].equals("#"))
        {
            node = new BinaryTreeNode(Integer.valueOf(strings[index]));
            node.left = Deserialize(str);
            node.right =Deserialize(str);
        }
        return node;
    }
}