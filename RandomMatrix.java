import java.lang.Math;
public class RandomMatrix {

	public static void main(String[] args) {
		
		int[][] board= new int[8][8];
		
		for (int i=0; i< board.length; i++) {
			for (int j=0; j< board[i].length; j++) {
				int rand=(int) Math.round(Math.random());
				board[i][j]=rand;
				System.out.println();		
			}
			}
		
//		int[][] board= {
//				{0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0},
				
	//	};
			
			
			
			for (int i=0; i< board.length; i++) {
				boolean row=true;
				boolean col= true;
				
				for(int j=0; j<board[i].length; j++) {
					if (board[j][i]!= board[i][0]) {
						row=false;
					}
					
					if (board[j][i]!= board[0][i]) {
						col=false;
					}
				}	
					
				if (row) {
					System.out.printf("All %d's  on row %d\n ", board[i][0],i);
					
				}
				
				if (col) {
					System.out.printf("All %d's  on col %d\n ", board[0][i],i);
					
				}
				}
				
				boolean minDiag=true;
				boolean majDiag=true;
				for(int i=0;i<board.length;i++) {
						int rev=board.length-1-i;
						if (board[i][i] != board[0][0]) {
							majDiag =false;		
							
						}
						if (board[i][rev] != board[0][board.length-1]) {
							minDiag =false;		
										
					}
				}
				
				if(minDiag) {
					System.out.printf("All %d's on the minor diagnol\n",board[0][board.length-1]);
					
				if(majDiag) {
					System.out.printf ("All %d's on the major diagnol",board[0][0]);
				}
					
				
					
				
				
					

								
					}
				}

}
