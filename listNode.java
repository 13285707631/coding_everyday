import java.util.ArrayList;
import java.util.Stack;

class ListNode {
         int val;
         ListNode next = null;

        ListNode(int val) {
             this.val = val;
         }
     }


public class listNode {
     //非递归，使用ArrayList.add的后移操作
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            ArrayList<Integer> list=new ArrayList<>();
            ListNode tmp=listNode;
            while(tmp!=null){
                list.add(0,tmp.val);
                tmp=tmp.next;
            }
            return list;
    }
    //利用栈
    public ArrayList printListFromTailToHead2(ListNode listNode) {
        ArrayList list=new ArrayList<>();
        Stack stack=new Stack();
        ListNode listNode1=listNode;
        while(listNode1!=null){
            stack.push(listNode1.val);
            listNode1=listNode1.next;
        }
        while(!stack.empty()){
            list.add(stack.pop());
        }
        return list;
    }

    public ListNode ReverseList(ListNode head) {
           //刚开始都需要判断一下是否为空的情况
        if(head==null){
            return null;
        }
        ListNode node=head.next;
        head.next=null;//使用两个指针，node和nextNode，注意实时的更新
        while(node!=null){
            ListNode nextNode=node.next;
            node.next=head;
            head=node;
            node=nextNode;
        }
        return head;
            
    }

}
