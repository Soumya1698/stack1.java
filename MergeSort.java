// The following program is a example for divide and conquer strategy. 
class MergeSort
 {
	void mergeSort(int a[], int l, int r)
	{
	if(l<r)
		{
			int mid = (l+r)/2;

			mergeSort(a,l,mid);	
			mergeSort(a,mid+1,r);

			merge(a, l,r,mid); // The merge() function is used for merging the two halves. 
		}
	}

	void merge(int a[], int l, int r,int mid)
		{
			
			int i=l;
			int j=mid+1;
			int k=l;
			int[] temp = new int[100];
			while(i<=mid && j<=r)
				{
					if(a[i]<a[j])
						{	
						temp[k++]=a[i++];
						}
					else
						temp[k++]=a[j++];
				}

			while(i<=mid)
				{
				temp[i]=a[i];
				i++;
				}
			while(j<=r)
				{
				temp[j]=a[j];
				j++;
				}

			for(int x=l;x<=r;x++)
				a[i]=temp[i];
		}

	static void publicArray(int a[])
		{
			for(int i=0;i<a.length;i++)
				System.out.print(a+" ");
			System.out.println();
		}

	public static void main(String[] args)
		{
			int a[]={1,2,0,5};
			MergeSort m = new MergeSort();
			m.mergeSort(a,0,a.length-1);

			System.out.println("sorted Array:");
			publicArray(a);
		}
 }

//This still has an unresolved error. 
[ sorted Array:
 [I@15db9742 [I@15db9742 [I@15db9742 [I@15db9742  ]





