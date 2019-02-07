import java.util.*;

public class BubbleSort
{
public void BubbleSort(int arr[])
{
int n=arr.length;
for(int i=0;i<n-1;i++)
for(int j=1;j<n;j++)

if(arr[j]>arr[i])
{
int temp=arr[j];
arr[j]=arr[i];
arr[i]=temp;
}
}
public void printsol(int arr[])
{
int n=arr.length;
for(int i=0;i<n;i++)
System.out.print(arr[i]);
System.out.println();
}

public static void main(String[] args)
{
BubbleSort ob = new BubbleSort();
int arr[]={64,34,25,12,22};
System.out.println("Sorted Array:");
ob.printsol(arr);
}
}
