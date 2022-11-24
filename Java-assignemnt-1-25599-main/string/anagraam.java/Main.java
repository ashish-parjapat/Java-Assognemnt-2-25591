import java.util.Arrays;  
public class Main
{
	public static void main(String[] args) {
	String one="abbbba";
	String two="bbbbaa";
	anagram(one,two);
	
	
	}
	public static void anagram(String first,String second){
	     boolean status=false;
	    if(first.length()!=second.length()){
	        System.out.println("Strings are not anagram");
	    }else{
	       
	        char[] Arrayfirst = first.toCharArray(); 
	        char[] Arraysecond = second.toCharArray(); 
	        Arrays.sort(Arrayfirst); 
	         Arrays.sort(Arraysecond); 
	         status = Arrays.equals(Arrayfirst, Arraysecond);
	        
	    }
	    if(status){
	        System.out.println("both stringfs are anagram of each other");
	    }else{
	        System.out.println("not anagaram");
	    }
	}
}
