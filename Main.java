import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void MinLength(int N,int L){

    }
    public  static void main(String [] arg){
      ArrayList<Integer>   input=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        while(str!=null&&!str.isEmpty()){
            Integer value=Integer.parseInt(str);
            input.add(value);
            str=sc.nextLine();
        }
        int[] A=new int[input.size()];
        for(int i=0;i<A.length;i++)
        {
            A[i]=input.get(i).intValue();
        }
        int sum=resolve(A);
        System.out.print(sum);
    }

    static int resolve(int []A){
        int len=A.length;
        int []bai=new int[len];
        int []shi=new int[len];
        int []ge=new int[len];
        for(int i=0;i<len;i++)
        {
            bai[i]=A[i]/100;
            shi[i]=A[i]%100/10;
            ge[i]=A[i]%10;

        }
        int P=15;//构造二叉树的数组
        int []treeArray=new int[15];
        for(int i=0;i<15;i++)
        {
            treeArray[i]=Integer.MIN_VALUE;//对数组里的数据进行初始化，注意Integer.MIN_VALUE的使用

        }
        //用个位数作为二叉树的内容进行存储
        for(int i=0;i<len;i++)
        {
            //System.out.println("Math"+Math.pow(2,bai[i]-1));
            int loc=(int)Math.pow(2,bai[i]-1)-2+shi[i];//根据二叉树的深度和第几个推算出二叉树在数组里的位置
            //System.out.println("loc:"+loc);
            treeArray[loc]=ge[i];
        }
        int sum=0;
        for(int i=0;i<P;i++)
        {
            if(treeArray[i]!=Integer.MIN_VALUE){
                if(2*i+1>=P||2*i+2>=P){
                    sum+=helper(treeArray,i);
                }
                if(treeArray[i*2+1]==Integer.MIN_VALUE){
                    sum+=helper(treeArray,i);
                }
            }
        }
        return sum;
    }//https://blog.csdn.net/qq_16403141/article/details/79473815
    static int helper(int[] treeArray,int index){
        if(index==0){
            return treeArray[index];
        }
        if(index%2==1)//索引为奇数则为左节点
        {
            return treeArray[index]+helper(treeArray,(index-1)/2);
        }
        else{
            return treeArray[index]+helper(treeArray,(index-2)/2);
        }
    }

}
