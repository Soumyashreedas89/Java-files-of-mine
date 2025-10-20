public  class Array20{
public static void main (String[]args){
int []arr={60,10,20,40,30,60};
int thirdlarge=-1;
int secondlarge=-1;
int large=-1;
for (int i=0;i<arr.length;i++){
if(arr[i]>large){
	thirdlarge=secondlarge;
 secondlarge=large;
 large=arr[i];
}
else if (arr[i]>secondlarge && arr[i]!= large && arr[i]!=thirdlarge){
	thirdlarge=secondlarge;
	secondlarge=arr[i];
}
else if(arr[i]>thirdlarge && arr[i]!= large && arr[i]!=thirdlarge){
	thirdlarge=arr[i];
}
}

System.out.println(thirdlarge);
}
}