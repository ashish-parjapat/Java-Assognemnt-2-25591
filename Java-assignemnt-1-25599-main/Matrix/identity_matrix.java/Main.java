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
		System.out.println();
		identity_matrix(matrix1,row1,colum1);
	
	}	

  public static void row_sum(int matrix1[][],int row1,int colum1){
      int sum=0;
      for(int i=0;i<row1;i++){
          for(int j=0;j<colum1;j++){
              sum+=matrix1[i][j];
          }
          System.out.println("sum of " + i +" row =" + sum);
          sum=0;
      }
  }
  
 public static void identity_matrix(int matrix1[][],int row1,int colum1){
     int flag=0;
     for(int i=0;i<row1;i++ ){
         for(int j=0;j<colum1;j++){
             if(matrix1[i][j]!=1&&matrix1[i][j]!=0){
                 flag=1;
                 break;
             }
         }
     }
     if(flag==0){
         System.out.println("its an identity matrix");
     }else{
         System.out.println("not an identity matrix");
     }
 }
 





}
