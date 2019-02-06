// This program also follows Divide and Conquer strategy like MergeSort.java

class QuickSort
{
  void partition(int l, int r, int a[])
  {
  int pivot = a[0];
  int i=l;
  int j=r;
  while(i<j)
  {
  do
  {i++;} while(pivot>=a[i])
  do
  {j--;} while(a[j]>pivot)
  if(i<j)
  { 
    int temp = a[i];
    a[i]=a[j];
    a[j]=temp;
  }
  }
  int temp=a[l];
  a[l]=a[j];
  a[j]=temp;
  return j;
  }
  }
  void sort(int l, int r, int a[])
  {
  if(l<r)
  { 
    int pi = partition(l,r,a);
    sort(l,pi-1,a);
    sort(pi+1,l,a);
  }
  }
  static void printArray(int a[])
  {
  int n=a.length;
  for(int i=0;i<n;i++)
   
    System.out.print(a[i]+ " ");
   System.out.println();
   
  }
  public static void main(String[] args)
  {
  int a[]={ 10,5,7,11,8,2};
  int n = a.length;
  
  QuickSort ob = new QuickSort();
  sort(0,n-1,a);
  
  System.out.println("Sorted Array:");
  printArray(a);
  }
  }
  
  
  
  
   
