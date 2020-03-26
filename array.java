public class array {
    public static void main(String []arg){
        int [][]a={{1,3,7},{2,5,8},{3,9,11}};
        System.out.print(Find(12,a));
    }
    static boolean Find(int target, int [][] array) {
        int hang=array.length-1;
        if(array.length==0)
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
