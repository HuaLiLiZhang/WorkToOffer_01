package offer;

/**
 * Created by huali on 2018/3/1.
 */
public class IsBalanced_Binarytree {
    //方法一：递归方法
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



//方法二：后序遍历方法。
    public boolean IsBalanced(BinaryTreeNode root,int []depth)
    {
        if(root==null)
            return true;
        boolean left=IsBalanced(root.left,depth);
        int leftdepth=depth[0];
        boolean right=IsBalanced(root.right,depth);
        int rightdepth=depth[0];
        depth[0]=Math.max(leftdepth+1,rightdepth+1);
        if(left&&right&&Math.abs(leftdepth-rightdepth)<=1)
            return true;
        return false;
    }

    public boolean isBalanced_(BinaryTreeNode root)
    {
        return IsBalanced(root,new int[1]);
    }
}