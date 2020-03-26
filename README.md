# coding_everyday
好好刷题吧

if(treeArray[i] != Integer.MIN_VALUE){
    if(i*2+1 >= P || i*2+2>=P){
        //是叶子结点
        sum+=helper(treeArray,i);
    }
    if(treeArray[i*2+1] == Integer.MIN_VALUE){
        // 是叶子节点
        sum+=helper(treeArray,i);
    }
}

第一个if的意思是：如果当前位置的索引为i，
那么左子节点的索引为i*2+1，右子节点的索引为i*2+2
如果左子节点和右子节点的索引超过treeArray的长度，表明当前索引i在最后一行，则一定是叶子结点

第二个if的意思是：如果满足了第一个if，也就是说当前的索引i不在最后一行，如果它的左子节点为空，那么一定是叶子节点

    // 根据叶子节点求出根节点到该叶子结点的路径长度
    static int helper(int[] treeArray,int index){
        // 是根节点
        if(index == 0){
            return treeArray[index];
        }
        if(index %2==1){
            // 是左节点
            return treeArray[index]+helper(treeArray,(index-1)/2);
        }else{
            // 是右节点
            return treeArray[index]+helper(treeArray,(index-2)/2);
        }
    }

叶子节点的路径长度等于其父节点的路径长度加自己的值



空集合也是树，称为空树。空树中没有结点。
结点的度：一个结点含有的子结点的个数称为该结点的度；
叶结点或终端结点：度为0的结点称为叶结点；
非终端结点或分支结点：度不为0的结点；
双亲结点或父结点：若一个结点含有子结点，则这个结点称为其子结点的父结点；
孩子结点或子结点：一个结点含有的子树的根结点称为该结点的子结点；
兄弟结点：具有相同父结点的结点互称为兄弟结点；
树的度：一棵树中，最大的结点的度称为树的度；
结点的层次：从根开始定义起，根为第1层，根的子结点为第2层，以此类推；
树的高度或深度：树中结点的最大层次；
堂兄弟结点：双亲在同一层的结点互为堂兄弟；
结点的祖先：从根到该结点所经分支上的所有结点；
子孙：以某结点为根的子树中任一结点都称为该结点的子孙。
森林：由m（m>=0）棵互不相交的树的集合称为森林；

二叉树索引和其左右叶子节点的关系，，根节点K,左节点2K+1,右节点2K+2


java的标准输入，使用Scanner，一行的输入使用nextline.

public class Test {
    public static  void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input you name:");
        String a = in.nextLine();
        System.out.println("name = " + a);
        a = in.nextLine(); // read until find the \n
        System.out.println(a);
    }
}

str.toString.replace（）函数的使用

public class replace {
    static   String replaceSpace(StringBuffer str){
        return str.toString().replace(" ","%20");
    }
    public static void main(String [] arg){
        Scanner in =new Scanner(System.in);
        String a= in.nextLine();
        System.out.println(a.toString().replace(" ","%10"));

        StringBuffer b=new StringBuffer(a);
        System.out.print(replaceSpace(b));
    }
}
