package offer;

/**
 * Created by huali on 2018/2/28.
 */
public class testFindFirstCommonNode {
    public static void testFirst()
    {
        ListNode n1 = new ListNode ( 1 );
        ListNode n2 = new ListNode ( 2 );
        ListNode n3 = new ListNode ( 3 );
        ListNode n4 = new ListNode ( 4 );
        ListNode n5 = new ListNode ( 5 );
        ListNode n6 = new ListNode ( 6 );
        ListNode n7 = new ListNode ( 7 );
        n1.next = n2;
        n2.next = n3;
        n3.next = n5;
        n5.next = n6;
        n6.next = n7;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        FindFirstCommonNode first =new FindFirstCommonNode();
        ListNode result =first.FindFirstCommonNode(n1,n4);
        System.out.println(result.val);
    }

}