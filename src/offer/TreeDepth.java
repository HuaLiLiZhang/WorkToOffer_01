package offer;


/**
 * Created by huali on 2018/2/28.
 */
public class TreeDepth {
    public int treeDepth(BinaryTreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int nleft=treeDepth(root.left);
        int nright=treeDepth(root.right);

        return  (nleft>nright)?(nleft+1):(nright+1);
    }


}
class BinaryTreeNode
{
    int val=0;
    BinaryTreeNode left=null;
    BinaryTreeNode right=null;
    BinaryTreeNode parent = null;
    BinaryTreeNode(int x)
    {
        this.val=x;
    }
}