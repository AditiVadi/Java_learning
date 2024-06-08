public class Rate {

    boolean canReach(int grid[][5],int r,int c,int n,int m,int path[][]){
        if(r==n-1 && c==m-1){
         path[r][c]=1;

        }


        if(r+1 != n && grid[r+1][c]!=1){
            boolean fout
        }
    }
    public static void main(String[] args) {
        int[4][5] grid={{0,0,0,0,1},
                         {0,1,1,0,0},
                         {0,0,1,1,1},
                        {0,0,0,0,0}};
        int[4][5] path={};
        if(canReach(grid,0,0,4,5,path)){
            System.out.println("Rat can Reach");
        }else{
            System.out.println("rat cannot reach");
        }
    }
}
