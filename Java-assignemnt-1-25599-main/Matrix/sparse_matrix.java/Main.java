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
		int countElement=0;
		System.out.println("Enter values in matrix in  matrix");
		for(int i=0;i<row1;i++){
		    for(int j=0;j<colum1;j++){
		        matrix1[i][j]=myScanner.nextInt();
		        if(matrix1[i][j]==0){
		            countElement++;
		        }
		    }
		        
		}
		System.out.println();
		if(countElement>(row1*colum1)/2){
		    System.out.println("Matrix is an sparse matrix");
		}else{
		    System.out.println("Matrix is not an sparse matrix");
		}
	
	
	}	

 
 
 





}
