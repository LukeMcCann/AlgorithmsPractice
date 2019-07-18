package SinglyLinkedList;

/**
 * 
 * @author Luke McCann
 *
 * Node class - represents a node in a LinkedList
 */

public class Node 
{
	private int data;
	private Node next; // pointer to next node
	
	Node(int data, Node next)
	{
		this.data = data;
		this.next = next;
	}
	
	// Checkers
	public boolean hasNext() {return(this.next != null);}
	
	// Getters and Setters
	public int getData() {return this.data;}
	public void setData(int data) {this.data = data;}
	public Node getNextNode() {return this.next;}
	public void setNextNode(Node node) {this.next = node;}
	
}
