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


1.    加载

加载，是指Java虚拟机查找字节流（查找.class文件），并且根据字节流创建java.lang.Class对象的过程。这个过程，将类的.class文件中的二进制数据读入内存，放在运行时区域的方法区内。然后在堆中创建java.lang.Class对象，用来封装类在方法区的数据结构。

类加载阶段：

（1）Java虚拟机将.class文件读入内存，并为之创建一个Class对象。

（2）任何类被使用时系统都会为其创建一个且仅有一个Class对象。

（3）这个Class对象描述了这个类创建出来的对象的所有信息，比如有哪些构造方法，都有哪些成员方法，都有哪些成员变量等。

2.    链接

链接包括验证、准备以及解析三个阶段。

（1）验证阶段。主要的目的是确保被加载的类（.class文件的字节流）满足Java虚拟机规范，不会造成安全错误。

（2）准备阶段。负责为类的静态成员分配内存，并设置默认初始值。

（3）解析阶段。将类的二进制数据中的符号引用替换为直接引用



Synchronized 保证⽅法内部或代码块内部资源（数据）的互斥访问。即同⼀时间、由同⼀个 Monitor（监视锁） 监视的代码，最多只能有⼀个线程在访问。


4. Lock
Lock 也是 java.util.concurrent 包下的一个接口，定义了一系列的锁操作方法。Lock 接口主要有 ReentrantLock，ReentrantReadWriteLock.ReadLock，ReentrantReadWriteLock.WriteLock 实现类。与 Synchronized 不同是 Lock 提供了获取锁和释


什么是序列化，怎么序列化，为什么序列化，反序列化会遇到什么问题，如何解决。
答案

什么是序列化：在java中，把对象转换成字节序列的过程叫做序列化。
把字节序列转换成对象的过程叫做反序列化。
怎么序列化：在实现了Serializable接口的情况下，便可以序列化。
为什么要序列化：
1.为了我们在内存中的对象能够存储在硬盘文件或数据库需要序列化
2.为了对象在网络中通过套接字进行传输。
3.通过rmi传输对象时需要用到序列化
反序列化会遇到什么问题。
在我们实现了Serializable接口后，没有给serialVersionUID一个固定值。这时候会发生这种情况，当我们序列化之后，然后改变了类中的属性。然后再进行反序列化。这时候程序便会报错，原因在于我们序列化时候的serialVersionUID与我们反序列化时候的serialVersionUID不一致所导致的，这也是为什么我们在实现了Serializable接口后，不给serialVersionUID一个固定值，ide会给我们一个警告。因为我们没有给一个固定的值。系统会根据类的属性自动生成一个值，在我们改变了类中的属性后，这个值自然也会发生变化。



公平锁：当线程A获取访问该对象，获取到锁后，此时内部存在一个计数器num+1，其他线程想访问该对象，就会进行排队等待(等待队列最前一个线程处于待唤醒状态)，直到线程A释放锁(num = 0)，此时会唤醒处于待唤醒状态的线程进行获取锁的操作，一直循环。如果线程A再次尝试获取该对象锁是，会检查该对象锁释放已经被占用，如果被占用，会做一次是否为当前线程占用锁的判断，如果是内部计数器num+1，并且不需要进入等待队列，而是直接回去当前锁。

　　非公平锁：当线程A在释放锁后，等待对象的线程会进行资源竞争，竞争成功的线程将获取该锁，其他线程继续睡眠。

　　公平锁是严格的以FIFO的方式进行锁的竞争，但是非公平锁是无序的锁竞争，刚释放锁的线程很大程度上能比较快的获取到锁，队列中的线程只能等待，所以非公平锁可能会有“饥饿”的问题。但是重复的锁获取能减小线程之间的切换，而公平锁则是严格的线程切换，这样对操作系统的影响是比较大的，所以非公平锁的吞吐量是大于公平锁的，这也是为什么JDK将非公平锁作为默认的实现。



协程不是被操作系统内核所管理的，而是完全由程序所控制，也就是在用户态执行。这样带来的好处是性能大幅度的提升，因为不会像线程切换那样消耗资源。

协程不是进程也不是线程，而是一个特殊的函数，这个函数可以在某个地方挂起，并且可以重新在挂起处外继续运行。所以说，协程与进程、线程相比并不是一个维度的概念。

一个进程可以包含多个线程，一个线程也可以包含多个协程。简单来说，一个线程内可以由多个这样的特殊函数在运行，但是有一点必须明确的是，一个线程的多个协程的运行是串行的。如果是多核CPU，多个进程或一个进程内的多个线程是可以并行运行的，但是一个线程内协程却绝对是串行的，无论CPU有多少个核。毕竟协程虽然是一个特殊的函数，但仍然是一个函数。一个线程内可以运行多个函数，但这些函数都是串行运行的。当一个协程运行时，其它协程必须挂起。

进程、线程、协程的对比

协程既不是进程也不是线程，协程仅仅是一个特殊的函数，协程它进程和进程不是一个维度的。
一个进程可以包含多个线程，一个线程可以包含多个协程。
一个线程内的多个协程虽然可以切换，但是多个协程是串行执行的，只能在一个线程内运行，没法利用CPU多核能力。
协程与进程一样，切换是存在上下文切换问题的。

