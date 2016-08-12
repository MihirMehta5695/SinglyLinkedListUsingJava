package sll;
public class Node
{

	//Creating the Data Structure for Single Linked List
	int data;//Actual data to hold for the node
	Node next;//Points towards next node of linked list

	
	//Explicit no-argument constructor
	Node()
	{
		data =-1;
		next=null;
	}

	//Explicit argument Constructor
	Node(int value)
	{
		data=value;//Assigning the user defined value to the data field of node
		next=null;//null means 
	}

}


