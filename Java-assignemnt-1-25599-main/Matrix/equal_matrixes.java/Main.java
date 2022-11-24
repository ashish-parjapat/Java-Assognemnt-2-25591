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
		if(equalMatrix(matrix1,matrix2,row1,colum1)){
		    System.out.println("Matrixes are equal");
		}else{
		    System.out.println("Matrixes are not equal");
		}
		
	
		
		
	
}

public static boolean equalMatrix(int matrix1[][],int matrix2[][],int row1,int colum1){
    for(int i=0;i<row1;i++){
        for(int j=0;j<colum1;j++){
            if(matrix1[i][j]!=matrix2[i][j]){
                return false;
            }
        }
    }
    return true;
}

}

