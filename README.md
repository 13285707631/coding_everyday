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
