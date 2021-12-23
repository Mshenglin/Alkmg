/**
 * 合并两个有序的链表
 *
 */
public class leetcode21_MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //特殊情况判断
        if(list1==null||list2==null){
            return list1==null?list2:list1;
        }
        //设置一个虚拟头节点
        ListNode dump=new ListNode(-1);
        ListNode ans=dump;
        while (list1==null||list2==null){
            if(list1.val< list2.val){
                dump.next=list1;
                dump=list1;
                list1=list1.next;
            }
            else {
                dump.next=list2;
                dump=list2;
                list2=list2.next;
            }
        }
        //判断那个链表还存在数据，剩下的元素都链接上去
        dump.next=list1==null?list2:list1;
        return ans.next;
    }



    public static void main(String[] args) {
        ListNode list1=new ListNode(1);
        ListNode list1_2=new ListNode(2);
        ListNode list1_3=new ListNode(4);
        list1.next=list1_2;
        list1_2.next=list1_3;
        ListNode list2=new ListNode(1);
        ListNode list2_2=new ListNode(3);
        ListNode list2_3=new ListNode(4);
        list2.next=list2_2;
        list2_2.next=list2_3;
        leetcode21_MergeTwoSortedLists mergeTwoSortedLists=new leetcode21_MergeTwoSortedLists();
        ListNode listNode = mergeTwoSortedLists.mergeTwoLists(list1, list2);
        while(listNode!=null){

            System.out.print(listNode.val+"\t");
            listNode=listNode.next;
        }
    }
}
