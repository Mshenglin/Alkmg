/**
 * 160. 相交链表
 *
 *     //如果A遍历完，就headA=B;继续遍历，同理，对B进行操作。如果A和B没有相交的节点，那么A和B都是null。循环结束
 */
public class leetcode160_IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //特殊值的判断
        if(headA==null||headB==null){
            return headB==null?headA:headB;
        }
        ListNode A=headA;
        ListNode B=headB;
        while(headA!=headB){
            //如果A遍历完，就headA=B;继续遍历，同理，对B进行操作。如果A和B没有相交的节点，那么A和B都是null。循环结束
            if(headA==null){
                headA=B;
            }
            else{
                headA=headA.next;
            }
            if(headB==null){
                headB=A;
            }
            else{
                headB=headB.next;
            }
        }

        return headA;
    }
}
