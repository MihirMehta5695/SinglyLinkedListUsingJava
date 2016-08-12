package sll;

public class SinglyLinkedList
{

	Node head;//The head of the list,which points towards the first node of list
	Node temp;//Temporary variable of Node type to help in insert and delete operations
	Node p;//The primary variable of type Node to be used for all operations regarding SinglyLinkedList
	boolean isListExisting=false;//flag for checking existence of the list
	boolean isListEmpty=true;//flag for checking if list is empty
	//Creating a list
	void createList()
	{

		head=new Node();//Creating the head node which points the first node of the list (if the list exists)

	}//end of createList(.) method

	void insertAtEnd(int value)
	{

		if(isListExisting)//Check if the list exists or not 
		{
			System.out.println("Error: No list exists yet,Please a create list to enter values");
			return;
		}//end of if

		if(isListEmpty)//if the list is empty the value is inserted at the begining of the list		
		{

			insertAtBegin(value);
			System.out.println("Value inserted successfully");
			return;

		}//end of if

		else
		{
			p=head.next;//assigning the first node to be represented by the variable 'p'

			while(p.next!=null)//traverse to the end of the list 
			{
				 
				p=p.next;
			}//end of while loop
			
			temp=new Node(value);//creating a new Node
			temp.next=p.next;//Assigning the value 
			p.next=temp;//variable 'p' points towards newly created node
		}


	}//end of insertAtEnd(.) method

	
	void insertAtBegin(int value)
	{
		if(isListExisting)
		{
			temp=new Node(value);
			temp.next=head.next;//making the first node of the list as the second node of the list , since we are inserting node at the beginning
			head.next=temp;//head now points to the newly created node
		}//end of if stmt
		
		else
		{
			System.out.println("Error: No list Exists,please create a new list and try again");
		}
		
		
	}//end of insertAtBegin(.) method
	
	void insertAfter(int key,int value)
	{
		p=head.next;//assigning the value of first node to variable 'p'
		while(p.data!=key)
		{
			
			if(p.next==null)
			{
				System.out.println("Error : End of the list reached yet not found where to insert,thus inserting at the end of the list");
				insertAtEnd(value);
				return;
			}//end of if stmt
			
		}//end of while loop
		
		temp=new Node(value);//create a new node
		temp.next=p.next;//Assigning the pointer for next node
		p.next=temp;//making p to point towards newly created node 
		
	}//end of insertAfter(..)
	
	void displayList()
	{
		
		if(isListExisting&&!isListEmpty)
		{
			p=head.next;
			
			while(p.next!=null)
			{
				
				System.out.println(p.data);
				p=p.next;
				
			}//end of while stmt
			
			System.out.println(p.data);
			
						
		}//end of if stmt
		else
		{
			System.out.println("The List is either Empty or Not Existing yet,pls try again !");
		}
		
	}//end of displayList() method
	

}//end of SinglyLinkedList class{}