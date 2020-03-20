public class MagicSquare {
	public static void main(String[] args) {

	    int[][] magicsquare = new int[n][n];
	    int a = 0;
	    int b = (n-1)/2;

	    magicsquare[a][b] = 1;

	    for(int i=2; i <=n*n; i++){
	       b = b + 1;
	       a = a - 1;
	       if (a == -1)
	           a = n - 1;
	       if (b == n)
	           b = 0;
	       if(magicsquare[a][b] !=0 ){
	         a = a + 1;
	         if (a == -1)
	           a = n-1;
	       }
	       magicsquare[a][b]=i;
	    }
	    for(int x = 0; x < n; x++){
	      for(int y=0; y < n; y++)
	        System.out.print("|"+magicsquare[x][y] +"|\t");
	      System.out.println();
	    }
	}
}