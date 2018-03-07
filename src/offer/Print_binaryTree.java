package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by huali on 2018/3/6.
 */
public class Print_binaryTree {
    public ArrayList<ArrayList<Integer>> Print(BinaryTreeNode pRoot) {

        Queue<BinaryTreeNode> queue = new LinkedList<>();

        ArrayList<ArrayList<Integer>> list =new ArrayList<>();

        ArrayList<Integer> temp = new ArrayList<>();
        queue.add(pRoot);
        int nextLevel = 0;
        int toBePrinted = 1;

        while (!queue.isEmpty())
        {
            BinaryTreeNode node = queue.poll();
            if(node.left!=null)
            {
                queue.add(node.left);
                ++nextLevel;
            }
            if(node.right!=null)
            {
                queue.add(node.right);
                ++nextLevel;
            }
            temp.add(node.val);
            System.out.print(node.val+" ");
            --toBePrinted;
            if(toBePrinted==0)
            {
                list.add(temp);
                //每次添加之后，需要清空一下temp的值，所以直接赋值给temp为一个新的ArrayList，不重新定义。
                temp = new ArrayList<>();
                System.out.println();
                toBePrinted=nextLevel;
                nextLevel=0;
            }

        }
        return list;

    }
}