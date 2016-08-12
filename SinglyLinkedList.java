package sll;

public class SinglyLinkedList
{

	Node head;//The head of the list,which points towards the first node of list
	Node temp;//Temporary variable of Node type to help in insert and delete operations
	Node p;//The primary variable of type Node to be used for all operations regarding SinglyLinkedList
	boolean isListExisting=false;
	boolean isListEmpty=false;
	//Creating a list
	void createList()
	{

		head=new Node();//Creating the head node which points the first node of the list (if the list exists)

	}//end of createList() method

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
				temp=p;//assigning the previous value of 
				p=p.next;
			}
		}


	}//end of insertAtEnd() method

	
	void insertAtBegin(int value)
	{
		
	}//end of insertAtBegin() method
	

}//end of SinglyLinkedList class