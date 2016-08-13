# Singly-Linked-List-Using-Java
We have seen Implementation of Singly Linked List in C language,but it is really difficult for students 
to find codes regarding implementation of Data Structures using JAVA.
Thus I have created this repository to help everyone understand Implementation of SinglyLinkedList in JAVA!

There are 3 class files in this project:
1) class Node             :- This class is the main data structure.
                             It has the capacity to hold one Integer value (Named as 'data').
                             The other variable is named as 'next' which holds the reference to the next node of the list.
                             It has 2 explicit constructors.
                             .a) Node()          :- No argument explicit constructor which is used only to initialise the head node
                             (b) Node(int value) :- Explicit Ctor with argument, is used to initialise all other nodes expect head node.
                             
2) class SinglyLinkedList :- This class implements the Data Structure and manages the whole lot of operations given to usr for performing.
                             There are 5 variables and 10 methods.
                             head - represents the head node of the list and is used to only hold the address of the first node.
                             p    -used for all operations of nodes. Used as primary node in all operatins.
                             temp -It is used int several operations where more than one variable are required to give the desired output.
                             
                             createList()              - Created the head node in order to make a list.
                             insertAtBegin(int value)  - Creates a new node and places it at the start of the list.
                             insertAtEnd(int value)    - Creates a new node and places it at the end of the list.
                             insertAfter(int key,value)- First it searches the node having key value and then creates and places the node after the key node.
                             deleteAtBegin()           - Deletes the first node from the list and makes the second node as the first node of the list.
                             deleteAtEnd()             - Deletes the last node from the list and makes the second last node as the last node of the list.
                             deleteValue(int key)      - Searches the node with key value and deletes that node from the lsit.
                             findPosition(int value)   - Searches the node with value and displays is distance from the head node of the list.
                             displayList()             - Displays the value of all the nodes in the list starting from the first node after the head node.
                             vanishList()              - Unsets the head node ,thus the list is destroyed.

3) class SLLTest          :- This class implements the class SinglyLinkedList. 
                             It produces a list in front of user , thus user makes his choices and enter and upon validating the choice of user, user gets the result.
                             
                 
