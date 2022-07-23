importjava.util.scanner;
public class training1
class training1{public static void main(string[]args)
{
int arr[]={5,-9,6,-1,8,-2,-3,-4,0,-5,-4,-3,-6};
int n=arr.length;
triple(arr,n,0);
}
static void triple(int arr[],int n, int sum)
{
for(inti=0;i<n-2;i++)
{
for(int j=i+1;j<n-1;j++)
{
for(int k=j+1;k<n;k++)
{
if(arr[i]+arr[j]+arr[k]==sum)
{
system.out.println(arr[i] +" "+arr[j]+" "+arr[k]);
}
}
}
}
}