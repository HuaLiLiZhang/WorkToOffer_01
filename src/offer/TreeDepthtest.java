package offer;

/**
 * Created by huali on 2018/3/1.
 */
public class TreeDepthtest {
    public void test()
    {
        BinaryTreeNode r0=new BinaryTreeNode(1);
        BinaryTreeNode r1=new BinaryTreeNode(2);
        BinaryTreeNode r2=new BinaryTreeNode(3);
        BinaryTreeNode r3=new BinaryTreeNode(4);
        BinaryTreeNode r4=new BinaryTreeNode(5);
        BinaryTreeNode r5=new BinaryTreeNode(6);
        BinaryTreeNode r6=new BinaryTreeNode(7);
        BinaryTreeNode r7=new BinaryTreeNode(8);

        r0.left=r1;
        r1.left=r3;
        r1.right=r4;
        r4.left=r6;
        r0.right=r2;
        r2.right=r6;
        r6.right=r7;

        TreeDepth tree=new TreeDepth();
        int depth=tree.treeDepth(r0);
        System.out.println(depth);

        IsBalanced_Binarytree is=new IsBalanced_Binarytree();
        boolean result = is.IsBalanced_Solution(r0);
        System.out.println(result);

    }
}