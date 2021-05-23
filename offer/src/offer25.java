import java.util.HashMap;

/**
 * 复杂链表的复制
 * @author
 */
public class offer25 {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null){
            return null;
        }
        //使用map来记录节点的随机指针
        HashMap<RandomListNode,RandomListNode> map=new HashMap<RandomListNode,RandomListNode>();
        //使用哨兵节点
        RandomListNode head=new RandomListNode(-1);
        //记录当前节点
        RandomListNode cur=pHead;
        //对原始链表遍历
        while(pHead!=null){
            //将该节点加入map
            map.put(pHead,new RandomListNode(pHead.label));
            pHead=pHead.next;
        }
        head.next=map.get(cur);
        //取到Map中的节点的值，对他的指针赋值
        while(cur!=null){
            RandomListNode node=map.get(cur);
            node.next=map.get(cur.next);
            node.random=map.get(cur.random);
            cur=cur.next;
        }
        return head.next;
    }
}
