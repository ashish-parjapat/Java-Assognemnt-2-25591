
public class Main
{
	public static void main(String[] args) {
			int arr[]={1,-27,-3,4,5,6,7,8,74,20};
System.out.print("originl array=");
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
int sum=0;
for(int i=0;i<arr.length;i++){
    sum+=arr[i];
}
System.out.println();
System.out.println("Sum of array ele= "+sum);

	}
}

