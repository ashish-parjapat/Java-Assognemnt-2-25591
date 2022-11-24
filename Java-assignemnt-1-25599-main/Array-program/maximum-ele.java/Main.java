
public class Main
{
	public static void main(String[] args) {
			int arr[]={10,274,3,4,5,6852,7,8};
System.out.print("originl array=");
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}

int maximum=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++){
    if(arr[i]>maximum){
        maximum=arr[i];
    }
}
System.out.println();
System.out.println("maximum elem = "+maximum);

	}
}
