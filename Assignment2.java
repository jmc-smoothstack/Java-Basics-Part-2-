public class Assignment2{
    
  public static void main(String args[]) { 

    int array [][] = new int [10][15];

    int row = array.length, col = array.length[0];

    int max = 0, max_x = 0, max_y=0;

    for(int x; x<row; x++)
    {
      for(int y; y<col; y++)
      {
        if(array[x][y]>max)
        {
          max  = array[x][y];
          max_x = x;
          max_y = y;
        }
      }
    }

    System.out.print("Max Value at position"+ max_x+","+max_y);



    
  } 

}
