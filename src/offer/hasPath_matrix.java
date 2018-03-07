package offer;

/**
 * Created by huali on 2018/3/7.
 */
public class hasPath_matrix {
    int pathLength=0;
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if(!isLegalInput(matrix,rows,cols,str))
            return false;
        boolean[] visited = new boolean[rows*cols];
        for(int row = 0;row<rows;row++)
        {
            for(int col=0;col<cols;col++)
            {
                if(hasPathCore(matrix,rows,cols,row,col,str,pathLength,visited))
                    return true;
            }
        }
        return false;
    }


    public boolean hasPathCore(char[]matrix,int rows,int cols,int row,
                               int col,char[]str,int pathlength,boolean []visited)
    {
        if(pathlength==str.length)
            return true;
        boolean haPath = false;
        if (row>=0 && row<rows && col>=0 && col<cols
                && matrix[row*cols + col] == str[pathlength]
                && !visited[row*cols + col]){
            pathlength ++;
            visited[row*cols + col] = true;

            haPath = hasPathCore ( matrix, rows, cols, row-1, col, str, pathlength, visited )
                    || hasPathCore ( matrix, rows, cols, row, col-1, str, pathlength, visited )
                    || hasPathCore ( matrix, rows, cols, row+1, col, str, pathlength, visited )
                    || hasPathCore ( matrix, rows, cols, row, col+1, str, pathlength, visited );

            if (!haPath){
                pathlength -- ;
                visited[row*cols + col] = false;
            }
        }

        return haPath;
    }

    public boolean isLegalInput(char [] matrix,int rows ,int cols ,char[]str)
    {
        if(matrix==null||str==null||matrix.length==0||str.length==0)
            return false;
        if(rows<1||cols<1)
            return false;
        return true;
    }
}