/**
 *
 *在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数.
 *
 *
 * @author
 */
public class offer1 {
    public boolean Find(int target, int [][] array) {
        //保存数组的大小
        int row=array[0].length;
        int pad=array.length;
        int i=row-1,j=0;
        while(i>=0&&j<pad){
            if(target==array[j][i]){
                return true;
            }
            else if(target>array[j][i]){
                j++;
            }
            else{
                i--;
            }
        }
        return false;
    }

}
