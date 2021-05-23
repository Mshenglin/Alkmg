import java.util.Stack;

/**
 * 栈的压入弹出序列
 * @author Dell
 */
public class offer21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length==0){
            return true;
        }
        //使用栈模拟压入弹出
        Stack<Integer> stack=new Stack<>();
        int j=0;
        for(int i=0;i<pushA.length;i++){
            while(!stack.isEmpty()&&stack.peek()==popA[j]&&j<popA.length){
                stack.pop();
                j++;
            }
            stack.push(pushA[i]);
        }
        while(!stack.isEmpty()&&stack.peek()==popA[j]&&j<popA.length){
            stack.pop();
            j++;
        }
        return stack.isEmpty();
    }
}
