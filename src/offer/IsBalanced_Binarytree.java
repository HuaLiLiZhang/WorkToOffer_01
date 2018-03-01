package offer;

/**
 * Created by huali on 2018/3/1.
 */
public class IsBalanced_Binarytree {
    public boolean IsBalanced_Solution(BinaryTreeNode root)
    {
        if(root==null)
           return true;
        TreeDepth tree =new TreeDepth();
        int nleft = tree.treeDepth(root.left);
        int nright = tree.treeDepth(root.right);
        int dif= nleft-nright;
        if(dif>1||dif<-1)
            return false;

        return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);

    }
}