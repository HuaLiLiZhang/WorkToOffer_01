package offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by huali on 2018/3/6.
 */
public class PrintBinaryTree_colums {
    public ArrayList<ArrayList<Integer>> Print(BinaryTreeNode pRoot)
    {
        int layer = 1;
        //s1 存奇数层结点
        Stack<BinaryTreeNode> s1=new Stack<BinaryTreeNode>();
        s1.push(pRoot);
        //s2存偶数层结点
        Stack<BinaryTreeNode> s2=new Stack<BinaryTreeNode>();
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();

        while (!s1.empty()||!s2.empty())
        {
            if(layer%2!=0)
            {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!s1.empty())
                {
                    BinaryTreeNode node = s1.pop();
                    if(node!=null)
                    {
                        temp.add(node.val);
                        System.out.print(node.val+" ");
                        s2.push(node.left);
                        s2.push(node.right);
                    }
                }
                if(!temp.isEmpty())
                {
                    list.add(temp);
                    layer++;
                    System.out.println();

                }
            }else
            {
               ArrayList<Integer> temp = new ArrayList<>() ;
               while (!s2.empty())
               {
                   BinaryTreeNode node = s2.pop();
                   if(node!=null)
                   {
                       temp.add(node.val);
                       System.out.print(node.val+" ");
                       s1.push(node.right);
                       s1.push(node.left);
                   }
               }
               if(!temp.isEmpty())
               {
                   list.add(temp);
                   layer++;
                   System.out.println();
               }
            }
        }
        return list;
    }
}