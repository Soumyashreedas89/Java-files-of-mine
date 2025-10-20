public class Array7{
public static void main(String[]args){
	int [] arr={10,5,9,8,6};
	int item=8;
	int flag=0;
	for(int i=0;i<arr.length;i++){
    if( item==arr[i]){
		flag=1;
		break;
	}
}
if(flag==1){
	System.out.println("Elemnt found");
}
else
	System.out.println("not found");
}
}