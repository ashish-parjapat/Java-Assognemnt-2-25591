
public class Main
{
	public static void main(String[] args) {
			int arr[]={1,-27,-3,4,5,6,7,8};
System.out.print("originl array=");
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}

int minimum=Integer.MAX_VALUE;
for(int i=0;i<arr.length;i++){
    if(arr[i]<minimum){
        minimum=arr[i];
    }
}
System.out.println();
System.out.println("minimum elem = "+minimum);

	}
}
