package offer;

/**
 * Created by huali on 2018/3/6.
 */
public class EntryNodeOfLoop {
    public static ListNode meetingNode(ListNode head)
    {
        if(head==null)
            return null;
        ListNode slow = head.next;
        if(slow==null)
            return null;
        ListNode fast = slow.next;
        while (slow!=null&&fast!=null)
        {
            //slow一次走一个，fast一次走两个，总有相遇的时候。
            //相遇即为链表中环的入口结点。
            if(slow==fast)
                return fast;
            slow=slow.next;
            fast= fast.next;
            if(fast!=slow)
                fast =fast.next;
        }
        return null;
    }

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {//知道入口结点一户，计算环中结点个数。
        ListNode meetingnode = meetingNode(pHead);
        if(meetingnode==null)
            return null;
        //得到循环中的节点个数
        int nodeInloop = 1;
        ListNode p1=meetingnode;
        while (p1.next!=meetingnode)
        {
            p1=p1.next;
            ++nodeInloop;
        }
        //移动p1
        p1=pHead;
        for(int i=0;i<nodeInloop;++i)
        {
            p1=p1.next;
        }
        //移动p1,p2
        ListNode p2= pHead;
        while (p1!=p2)
        {
            p1=p1.next;
            p2=p2.next;
        }
        return p1;

    }
}