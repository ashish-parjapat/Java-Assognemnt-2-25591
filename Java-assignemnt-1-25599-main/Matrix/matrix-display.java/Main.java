import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row=myScanner.nextInt();
			System.out.println("Enter the number of colums");
		int colum=myScanner.nextInt();
		
		int[][] matrix = new int[row][colum];
		System.out.println("Enter values in matrix");
		for(int i=0;i<row;i++){
		    for(int j=0;j<colum;j++){
		        matrix[i][j]=myScanner.nextInt();
		    }
		        
		}
		System.out.print("Displaying the matrix: ");
		for(int i=0;i<row;i++){
		    for(int j=0;j<colum;j++){
		        System.out.print(matrix[i][j]+" ");
		    }
		    System.out.println();
		}
}
}
