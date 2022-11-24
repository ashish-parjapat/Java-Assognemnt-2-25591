/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8};
System.out.print("originl array=");
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
System.out.println();
System.out.print("Elememnts present at even place:");

for(int i=0;i<arr.length;i+=2){
    System.out.print(arr[i]+" ");
}


	}
}
