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

ArrayList.add(int index, value)
   // use add() method to add elements in the list
    arrlist.add(15);
    arrlist.add(22);
    arrlist.add(30);
    arrlist.add(40);

  // adding element 25 at third position
    arrlist.add(2,25);
    
    让我们来编译和运行上面的程序，这将产生以下结果：
Number = 15
Number = 22
Number = 25
Number = 30
Number = 40
java.util.ArrayList.add(int index, E elemen) 方法将指定的元素E在此列表中的指定位置。它改变了目前元素在该位置(如果有的话)和所有后续元素向右移动(将添加一个到其索引)。


为了达到这个目的，java在一个旧的的进程同步模型——监控器（Monitor）的基础上实现了一个巧妙的方案：监控器是一个控制机制，可以认为是一个很小的、只能容纳一个线程的盒子，一旦一个线程进入监控器，其它的线程必须等待，直到那个线程退出监控为止。通过这种方式，一个监控器可以保证共享资源在同一时刻只可被一个线程使用。这种方式称之为同步。（一旦一个线程进入一个实例的任何同步方法，别的线程将不能进入该同一实例的其它同步方法，但是该实例的非同步方法仍然能够被调用）


错误的理解：同步嘛，就是几个线程可以同时进行访问。 

同步和多线程关系：没多线程环境就不需要同步;有多线程环境也不一定需要同步。


产生死锁的四个必要条件：

1、互斥条件：一个资源每次只能被一个进程使用。

2、请求与保持条件：一个进程因请求资源而阻塞时，对已获得的资源保持不放。

3、不剥夺条件:进程已获得的资源，在末使用完之前，不能强行剥夺。

4、循环等待条件:若干进程之间形成一种头尾相接的循环等待资源关系。


避免死锁
上面列出了死锁的四个必要条件，我们只要想办法破其中的任意一个或多个条件，就可以避免死锁发生，一般有以下几种方法：

1、按同一顺序访问对象。

2、避免事务中的用户交互。

3、保持事务简短并处于一个批处理中。

4、使用较低的隔离级别。

5、使用基于行版本控制的隔离级别。

6、使用绑定连接。

以上就是有关进程和线程的总结，有什么好的意见欢迎大家留言。

