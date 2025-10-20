public class Array19{
public static void main (String[]args){
int []arr={60,10,20,40,30,60};
int secondlarge=-1;
int large=-1;
for (int i=0;i<arr.length;i++){
if(arr[i]>large){
 secondlarge=large;
 large=arr[i];
}
else if (arr[i]>secondlarge && arr[i]!= large){
	secondlarge=arr[i];
}
}
System.out.println(secondlarge);
}
}
}