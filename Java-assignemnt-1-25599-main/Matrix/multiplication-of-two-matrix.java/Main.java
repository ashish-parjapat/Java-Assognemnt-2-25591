import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
	System.out.println("Enter the number of rows in 1st matrix");
		int row1=myScanner.nextInt();
			System.out.println("Enter the number of colums in 1st matrix");
		int colum1=myScanner.nextInt();
		
		int[][] matrix1 = new int[row1][colum1];
		System.out.println("Enter values in matrix in 1st matrix");
		for(int i=0;i<row1;i++){
		    for(int j=0;j<colum1;j++){
		        matrix1[i][j]=myScanner.nextInt();
		    }
		        
		}
		   	System.out.println("Enter the number of rows in 2nd matrix");
			int row2=myScanner.nextInt();
			System.out.println("Enter the number of colums in 2nd matrix");
		int colum2=myScanner.nextInt();
		
			int[][] matrix2 = new int[row2][colum2];
		System.out.println("Enter values in matrix in 2nd matrix");
		for(int i=0;i<row2;i++){
		    for(int j=0;j<colum2;j++){
		        matrix2[i][j]=myScanner.nextInt();
		    }
		        
		}
			int[][] matrix3 = new int[row2][colum2];
			
			for(int i=0;i<row1;i++){
			    for(int j=0;j<colum2;j++){
			        matrix3[i][j]=0;
			        for(int k=0;k<row2;k++){
			             matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
			        }
			        System.out.print(matrix3[i][j]+" ");
			    }
			    System.out.println();
			  
			}
			
		
		   
		
	
}
}
