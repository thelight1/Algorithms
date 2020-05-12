package org.thelight1;

/**
 * 题目描述
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class P03_二位数组中的查找 {

    public boolean Find(int [][] array,int target) {
        if (array == null) {
            return false;
        }
        int rows = array.length;
        int cols = array[0].length;
        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            if (array[row][col] == target) {
                return true;
            } else if (array[row][col] < target) {
                row++;
            } else if (array[row][col] > target) {
                col--;
            }
        }
        return false;
    }
}
