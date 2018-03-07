package offer;

/**
 * Created by huali on 2018/3/7.
 */
public class movingCount_robot {
    public int movingCount(int threshold, int rows, int cols)
    {
        if (threshold < 0)
            return 0;

        boolean[] visited = new boolean[rows*cols];
        int count = countMovingSteps ( threshold,rows,cols,0,0,visited);
        return count;
    }

    public int countMovingSteps(int threshold,int rows,int cols,
                                int row,int col,boolean[] visited){
        int count = 0;
        if (row>=0 && row<rows && col>=0 && col<cols
                && getSum ( row )+getSum ( col )<= threshold
                && !visited[row*cols+col]){
            visited[row*cols+col] = true;

            count = 1+ countMovingSteps ( threshold, rows, cols, row-1, col, visited )
                    + countMovingSteps ( threshold, rows, cols, row, col-1, visited )
                    + countMovingSteps ( threshold, rows, cols, row+1, col, visited )
                    + countMovingSteps ( threshold, rows, cols, row, col+1, visited );

        }
        return count;
    }
    public int getSum(int num){
        int count = 0;
        while (num != 0){
            count +=  num %10;
            num = num /10;
        }
        return count;
    }
}