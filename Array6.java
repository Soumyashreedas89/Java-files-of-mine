public class Array6{
public static void main (String[]args){
	int [] arr={6,20,15,5,10};
	int length=arr.length;
	int left=0;
	int right=length-1;
    int temp;
	while( left< right){
		temp=arr[left];
		arr[left]=arr[right];
      arr[right]=temp;
     left++;
    right--;	
	}
	for(int i=0;i<length;i++){
	System.out.println(arr[i]);
}
}
}
