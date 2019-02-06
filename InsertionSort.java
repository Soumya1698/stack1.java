import java.util.*;
import java.lang.*;

public class InsertionSort
{
public void InsertionSort(int arr[])
{
int n= arr.length;
for(int i=1;i<n;i++)
{
int key=arr[i];
int j=i-1;
while(arr[j]>key)
{
arr[j+1] = arr[j]; 
j = j-1; 
} 
arr[j+1] = key;
}
}

public void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
  
public static void main(String[] args)
{
InsertionSort ob = new InsertionSort();
int arr[]={4,3,2,10,12,1,5,6};
ob.InsertionSort(arr);
System.out.println("sorted array:");
ob.printArray(arr);

}
}
