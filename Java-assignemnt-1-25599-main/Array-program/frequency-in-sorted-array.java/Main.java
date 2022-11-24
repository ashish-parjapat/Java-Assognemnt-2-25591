
public class Main
{
	public static void main(String[] args) {
	    int []arr=new int[]{1,1,1,2,2,3,4,4,6,7};
	    int freq=1,i=1;
	    while(i<arr.length){
	        while(i<arr.length&&arr[i]==arr[i-1]){
	            freq++;
	            i++;
	        }
	        System.out.println(arr[i-1]+" "+":"+freq);
	        i++;
	        freq=1;
	    }
	    if(arr[arr.length-1]!=arr[arr.length-2]){
	        System.out.println(arr[10-1]+" "+ 1);
	    }
		
	}
}
