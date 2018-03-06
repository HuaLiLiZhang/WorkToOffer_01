package offer;

/**
 * Created by huali on 2018/3/6.
 */
public class GetBinaryTreeNext {
    public BinaryTreeNode GetNext(BinaryTreeNode pNode)
    {
        if(pNode==null)
            return null;
        BinaryTreeNode pNext = null;
        if(pNode.right!=null)
        { //节点右孩子存在，则设置一个指针从该节点的右孩子出发，
            // 一直沿着指向左子结点的指针找到的叶子节点即为下一个节点；
            //此时包括根节点。
            BinaryTreeNode pRight = pNode.right;
            while (pRight.left!=null)
            {
                pRight=pRight.left;
            }
            pNext=pRight;
        }else if(pNode.parent!=null)
        {
            //没有右子树，如果是父节点的右孩纸，继续向上遍历其父节点的父节点，重复之前的判断，返回结果
            BinaryTreeNode pCurrent = pNode;
            BinaryTreeNode pParent = pNode.parent;
            while (pParent!=null&&pCurrent==pParent.right)
            {
                pCurrent = pParent;
                pParent = pParent.parent;
                //此情况没有考虑，根节点的右子树结点中，结点没有右子树的情况，应该此时返回null.
            }
            if(pParent!=null&&pCurrent==pParent.left)//如果该节点是其父节点的左孩子，则返回父节点
            {
                pNext = pParent;
                return pNext;
            }
            pNext=pParent;
            while (pParent.right!=null)
            {
                if(pParent.right==pNode)
                    return null;
                pParent=pParent.right;
            }

        }
        return pNext;

    }
}