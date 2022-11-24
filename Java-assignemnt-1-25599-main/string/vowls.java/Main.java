/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	String mystring="Shake Hands";
	String newString=mystring.toLowerCase();
	int length=newString.length();
	int c=0;
	int v=0;
	for(int i=0;i<length;i++){
	    if(newString.charAt(i)=='a'||newString.charAt(i)=='e'||newString.charAt(i)=='i'||newString.charAt(i)=='o'||newString.charAt(i)=='u'){
	        c++;
	    }else{
	        if(newString.charAt(i)!='!'){
	            v++;
	        }
	    }
	}
	System.out.println("Total consonants words = "+c);
	System.out.println("Total vovels words = "+v);
	}
}
