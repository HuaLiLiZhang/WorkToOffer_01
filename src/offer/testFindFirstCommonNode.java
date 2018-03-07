package offer;

import java.util.ArrayList;

/**
 * Created by huali on 2018/2/28.
 */
public class testFindFirstCommonNode {
    public static void testFirst()
    {
        //ListNode n1 = new ListNode ( 1 );
        //ListNode n2 = new ListNode ( 2 );
        //ListNode n3 = new ListNode ( 3 );
        //ListNode n4 = new ListNode ( 4 );
        //ListNode n5 = new ListNode ( 5 );
        //ListNode n6 = new ListNode ( 6 );
        //ListNode n7 = new ListNode ( 7 );
        //n1.next = n2;
        //n2.next = n3;
        //n3.next = n5;
        //n5.next = n6;
        //n6.next = n7;
        //n4.next = n5;
        //n5.next = n6;
        //n6.next = n7;

        //FindFirstCommonNode first =new FindFirstCommonNode();
        //ListNode result =first.FindFirstCommonNode(n1,n4);
        //System.out.println(result.val);
        //ListNode n1 = new ListNode ( 1 );
        //ListNode n2 = new ListNode ( 2 );
        //ListNode n3 = new ListNode ( 3 );
        //ListNode n4 = new ListNode ( 3 );
        //ListNode n5 = new ListNode ( 4);
        //ListNode n6 = new ListNode ( 4);
        //ListNode n7 = new ListNode ( 5 );
        //n1.next = n2;
        //n2.next = n3;
        //n3.next = n4;
        //n4.next = n5;
        //n5.next = n6;
        //n6.next = n7;
        //n7.next = null;
        //DeleteDuplication delete = new DeleteDuplication();
        //ListNode head = delete.deleteDuplication(n1);
        //while (head!=null)
        //{
        //    System.out.print(head.val+",");
        //    head=head.next;
        //}

        //BinaryTreeNode n1 = new BinaryTreeNode ( 1 );
        //BinaryTreeNode n2 = new BinaryTreeNode ( 2 );
        //BinaryTreeNode n3 = new BinaryTreeNode ( 3 );
        //BinaryTreeNode n4 = new BinaryTreeNode ( 4 );
        //BinaryTreeNode n5 = new BinaryTreeNode ( 5);
        //BinaryTreeNode n6 = new BinaryTreeNode ( 6);
        //BinaryTreeNode n7 = new BinaryTreeNode ( 7 );
        //BinaryTreeNode n8 = new BinaryTreeNode ( 8 );
        //BinaryTreeNode n9 = new BinaryTreeNode ( 9);
        //n1.left=n2;
        //n1.right=n3;
        //n3.left=n6;
        //n3.right=n7;
        //
        //GetBinaryTreeNext get = new GetBinaryTreeNext();
        //BinaryTreeNode bi= get.GetNext(n7);
        //if(bi==null)
        //    System.out.println("null");
        //else
        //    System.out.println(bi.val);


        //BinaryTreeNode n1 = new BinaryTreeNode ( 1 );
        //BinaryTreeNode n2 = new BinaryTreeNode ( 2 );
        //BinaryTreeNode n3 = new BinaryTreeNode ( 2 );
        //BinaryTreeNode n4 = new BinaryTreeNode ( 4 );
        //BinaryTreeNode n5 = new BinaryTreeNode ( 5);
        //BinaryTreeNode n6 = new BinaryTreeNode ( 7);
        //BinaryTreeNode n7 = new BinaryTreeNode ( 8 );
        //BinaryTreeNode n8 = new BinaryTreeNode ( 8 );
        //BinaryTreeNode n9 = new BinaryTreeNode ( 7);
        //n1.left=n2;
        //n1.right=n3;
        //n3.left=n6;
        //n3.right=n7;
        //n2.left=n8;
        //n2.right=n9;
        //isSymmetrical is=new isSymmetrical();
        //boolean symmetrical = is.issymmetrical(n1);
        //System.out.println(symmetrical);

        BinaryTreeNode n1 = new BinaryTreeNode ( 1 );
        BinaryTreeNode n2 = new BinaryTreeNode ( 2 );
        BinaryTreeNode n3 = new BinaryTreeNode ( 3 );
        BinaryTreeNode n4 = new BinaryTreeNode ( 4 );
        BinaryTreeNode n5 = new BinaryTreeNode ( 5);
        BinaryTreeNode n6 = new BinaryTreeNode ( 6);
        BinaryTreeNode n7 = new BinaryTreeNode ( 7 );
        BinaryTreeNode n8 = new BinaryTreeNode ( 8 );
        BinaryTreeNode n9 = new BinaryTreeNode ( 9);
        n5.left=n3;
        n5.right=n7;
        n3.left=n2;
        n3.right=n4;
        n7.left=n6;
        n7.right=n8;
        //Print_binaryTree print =new Print_binaryTree();
        //ArrayList<ArrayList<Integer>> ary= print.Print(n1);
        //System.out.println(ary);

        //KthNode_middlesearch kth = new KthNode_middlesearch();
        //BinaryTreeNode node = kth.KthNode(n5,4);
        //System.out.println(node.val);

        KthNode_middlesearch kth = new KthNode_middlesearch();
        BinaryTreeNode node = kth.Kthnode(n5,4);
        System.out.println(node.val);
    }

}