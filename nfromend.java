// A program to find the n'th from the end of the single Linked list

class LinkedList1
{
node head;
   class node
	{
	int data;
	node next;	
	node(int data)
		{
		this.data=data;
		next=null;
		}
	}


void nfromend(int n)
{
int len=0;
node temp = head;

while(temp!=null)
{ temp = temp.next; len++;}

if(len<n)
return;
temp = head;

for(int i=1;i<len-n+1;i++)
temp=temp.next;
System.out.println(temp.data);

}
public void push(int data)
{
node new_node = new node(data);
new_node.next=head;
head=new_node;
}
public static void main(String[] args)
{
LinkedList1 list1 = new LinkedList1();
list1.push(3);
list1.push(40);
list1.push(45);
list1.push(56);
list1.push(4);
list1.nfromend(4);
}
}
