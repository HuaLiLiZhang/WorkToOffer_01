package offer;

import java.util.ArrayList;

/**
 * Created by huali on 2018/3/2.
 */
public class LastRemaining_Solution {
    //递归的思路，时间复杂度是O(n)，空间复杂度是O(1).
    public int LastRemaining(int n, int m) {
        if (n < 1 || m < 1)
            return -1;
        int last = 0;
        for (int i = 2; i <= n; ++i) {
            last = (last + m) % i;
        }
        return last;
    }

    public int lastremaining(int n, int m) {
        if (n < 1 || m < 1)
            return -1;
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; ++i)
            array.add(i);
        int tempIndex = (m - 1) % array.size();//用于记录最初需清除的数字索引
        while (array.size() != 1) {
            array.remove(tempIndex);
            tempIndex = (tempIndex + m - 1) % array.size();//记录当前索引。
        }
        return array.get(0);


    }

    public int LastRemaining_Solution2(int n, int m) {

        if (m <= 0 || n <= 0) {
            return -1;
        }
//先构造循环链表
        ListNode head = new ListNode(0); //头结点, 值为0
        ListNode pre = head;
        ListNode temp = null;
        for (int i = 1; i < n; i++) {
            temp = new ListNode(i);
            pre.next = temp;
            pre = temp;
        }
        temp.next = head;//将第n-1个结点(也就是尾结点)指向头结点

        ListNode temp2 = null;
        while (n != 1) {
            temp2 = head;
//先找到第m个结点的前驱
            for (int i = 1; i < m - 1; i++) {
                temp2 = temp2.next;
            }
            //删除第m个结点：将第m个结点的前驱指向第m个结点后面那个结点,temp2表示第m个结点的前驱
            temp2.next = temp2.next.next;
            head = temp2.next; //更新头结点
            n--;
        }

        return head.val;

    }
}