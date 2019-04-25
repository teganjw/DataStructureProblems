import java.util.Random;


public class construct {

    public int[][] grid = new int[5][5];

    public construct(){
        constructGrid();
    }

    public void constructGrid(){
        Random rand = new Random();
        for(int i=0; i<5; i++){
            for (int j = 0; j < 5; j++) {
                int random = rand.nextInt(51);
                grid[i][j] = random;
            }
        }
    }

    public String findCross(){
        int max = 0;
        int x = 0;
        int y = 0;
        for(int i=2; i<4; i++){
            for(int j=2; j<4; j++){
                int sum = grid[i][j]+grid[i][j+1]+grid[i][j-1]+grid[i+1][j]+grid[i-1][j];
                if (sum>max){
                    max = sum;
                    x = i;
                    y = j;
                }
            }
        }
        return "The sum of the cross is " + max + ". The numbers are: " + grid[x][y] + "," + grid[x][y+1] + "," + grid[x][y-1] + "," + grid[x+1][y] + "," + grid[x-1][y];

    }


}
