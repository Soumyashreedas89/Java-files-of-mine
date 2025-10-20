public class Array3{
public static void main (String[]args){
	int [] arr={10,20,30,40,50};
	int length=arr.length;
		int large=arr[0];
		
	for(int i=1;i<length;i++){
		if(large < arr[i]){
		large=arr[i];
		}
	}
	System.out.println("largest number is:"+large);
		
		
}
}
