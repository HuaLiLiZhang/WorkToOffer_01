package offer;

/**
 * Created by huali on 2018/2/18.
 */
public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int length1=getListLength(pHead1);
        int length2=getListLength(pHead2);
        int nLengthDif = length1-length2;

        ListNode pListHeadLong = pHead1;
        ListNode pListHeadShort = pHead2;
        if(length1<length2)
        {
            pListHeadLong = pHead2;
            pListHeadShort = pHead1;
            nLengthDif = length2-length1;
        }
        for (int i=0;i<nLengthDif;i++)
        {
            pListHeadLong = pListHeadLong.next;
        }
        while ((pListHeadLong!=null)&&(pListHeadShort!=null) &&(pListHeadLong!=pListHeadShort))
        {
            pListHeadLong=pListHeadLong.next;
            pListHeadShort=pListHeadShort.next;
        }
        ListNode pFirstConmonNode = pListHeadLong;
        return pFirstConmonNode;

    }

    public int getListLength(ListNode PHead)
    {
        int length = 0;
        ListNode pnext=PHead;
        while (pnext!=null)
        {
            ++length;
            pnext=pnext.next;
        }
        return length;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}