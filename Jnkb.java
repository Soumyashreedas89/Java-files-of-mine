public class Jnkb{
  public static void main(String[]args){
    int n=7;
    int item;
    int position;
int arr[]={2,3,4,5,6,7,8,9};
position=3;
item=6;
for(int i=0;i<n-1;i++){
    arr[i+1]=arr[i];
    arr[position]=item;

}
  }  
}