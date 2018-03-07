package offer;


/**
 * Created by huali on 2018/3/7.
 */
public class KthNode_middlesearch {
    private int index = 0;
    public BinaryTreeNode KthNode(BinaryTreeNode pRoot,int k)
    {
        if(pRoot==null||k==0)
            return null;
        return KthNodeCore(pRoot,k);
    }
    public BinaryTreeNode KthNodeCore(BinaryTreeNode pRoot ,int k)
    {
        BinaryTreeNode node = null;
        if(pRoot.left!=null)
            node = KthNodeCore(pRoot.left,k);
        if(node!=null)
            return node;
        index ++;
        if(index == k)
            return pRoot;
        if(node ==null&&pRoot.right!=null)
            node = KthNodeCore(pRoot.right,k);
        if(node!=null)
            return node;

        return null;
    }




    //这种方法更容易理解。
    int count = 0;
    public BinaryTreeNode Kthnode(BinaryTreeNode pRoot, int k)
    {
        if(pRoot!=null)
        {
            //因为线索二叉树的根节点值大于左结点小于右结点。
            BinaryTreeNode ret = Kthnode(pRoot.left,k);//遍历根节点的左结点，从最小的开始
            if(ret!=null)
                return ret;
            if(++count ==k)
                return pRoot;
            ret =Kthnode(pRoot.right,k);
            if(ret!=null)
                return ret;
        }
        return null;//pRoot==null，则返回null
    }
}