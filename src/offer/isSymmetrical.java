package offer;


/**
 * Created by huali on 2018/3/6.
 */
public class isSymmetrical {
    public boolean issymmetrical(BinaryTreeNode pRoot)
    {
        return issymmetrical1(pRoot,pRoot);
    }

    public boolean issymmetrical1(BinaryTreeNode pRoot1,BinaryTreeNode pRoot2)
    {
        if(pRoot1 == null&&pRoot2==null)
            return true;
        if(pRoot1 == null||pRoot2==null)
            return false;
        if(pRoot1.val != pRoot2.val)
            return false;
        return issymmetrical1(pRoot1.left,pRoot2.right)
                &&issymmetrical1(pRoot1.right,pRoot2.left);
    }
}