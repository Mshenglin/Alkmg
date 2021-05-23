import java.util.ArrayList;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * @author
 */
public class offer3 {
    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
        //1.使用栈实现
        //2.递归
        ArrayList<Integer> list=new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        dfs(listNode);
        return list;
    }
    public   void dfs(ListNode listnode){
        if(listnode==null){
            return;
        }
        dfs(listnode.next);
        list.add(listnode.val);
        return;
    }
}
