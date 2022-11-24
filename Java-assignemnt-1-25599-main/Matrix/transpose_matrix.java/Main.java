import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
	System.out.println("Enter the number of rows in  matrix");
		int row1=myScanner.nextInt();
			System.out.println("Enter the number of colums in  matrix");
		int colum1=myScanner.nextInt();
		
		int[][] matrix1 = new int[row1][colum1];
		System.out.println("Enter values in matrix in  matrix");
		for(int i=0;i<row1;i++){
		    for(int j=0;j<colum1;j++){
		        matrix1[i][j]=myScanner.nextInt();
		    }
		        
		}
		System.out.println("transpose matrix=");
    transpose_matrix(matrix1,row1,colum1);		
		
	
	}	
	
	public static void transpose_matrix(int matrix1[][],int row1,int colum1){
	    for(int i=0;i<colum1;i++){
	        for(int j=0;j<row1;j++){
	          System.out.print(matrix1[j][i]+" ");
	        }
	        System.out.println();
	    }
	}

 
  
 





}

