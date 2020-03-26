public class array {
    public static void main(String []arg){
        int [][]a={{1,3,7},{2,5,8},{3,9,11}};
        System.out.print(Find(12,a));
    }
    static boolean Find(int target, int [][] array) {
        int hang=array.length-1;
        if(array.length==0)//因为是二维的数组所以必须要有这样的一个检测判断
            return false;
        if(array[0].length==0)
            return false;
        int lie=0;
        while(hang>=0&&lie<array[0].length){
            if(array[hang][lie]>target){
                hang--;
            }
            else if(array[hang][lie]<target){
                lie++;
            }
            else
                return true;
        }
            return false;
    }

}


利用该二维数组的性质：

每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序
改变个说法，即对于左下角的值 m，m 是该行最小的数，是该列最大的数
每次将 m 和目标值 target 比较：

当 m < target，由于 m 已经是该列最大的元素，想要更大只有从行考虑，取值右移一位
当 m > target，由于 m 已经是该行最小的元素，想要更小只有从列考虑，取值上移一位
当 m = target，找到该值，返回 true
用某行最小或某列最大与 target 比较，每次可剔除一整行或一整列
