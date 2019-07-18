package SinglyLinkedList;

import java.io.*;
/*
 * @Author: Luke McCann
 * 
 * SinglyLinkedList - LinkedLists are a simple data structure.
 * it is a list of elements where each element links to the next element
 * it can contain any data type, and can be unsorted or sorted, each element 
 * may be unique or there may be duplicates.
 * 
 * Note: LinkedLists are not indexed like arrays.
 * you must start at the head and work through until
 * you reach the target element taking O(n) time. 
 *
 * insertions and deletions can be faster than arrays O(1)
 * when dealing with the head of the list.
 * 
 */
public class LinkedList 
{
	private Node head;
	private int length;
	
	public LinkedList()
	{
		this.head = null; // first link always starts as null
		this.length = 0;
	}	
	
	// Insertions
	public void addNode(int data)
	{
		Node newNode = new Node(data, null);
		if(this.isEmpty())
		{
			this.setHead(newNode);
			++this.length;
		}
		else 
		{
			appendNodeToEnd(newNode);
			++this.length;
		}
	}
	
	public void appendNodeToEnd(Node newNode)
	{
		Node lastNode = this.head;
		while(lastNode.hasNext())
		{
			lastNode = lastNode.getNextNode();
		}
		lastNode.setNextNode(newNode);
	}
	
	
	// Miscellaneous
	public void printList()
	{
		Node pointer = this.head;
		System.out.print("LinkedList: ");
		while(pointer != null)
		{
			if(!pointer.hasNext()) 
			{
				System.out.print(pointer.getData());
			}
			else
			{
				System.out.print(pointer.getData() + ", ");
			}
			pointer = pointer.getNextNode();
		}
	}
	
	public void printHead()
	{
		System.out.print(this.head.getData());
	}
	
	
	// Validation
	public boolean isEmpty() {return(head == null);}
	
	// Getters and Setters
	public Node getHead() {return this.head;}
	public void setHead(Node node) {this.head = node;}
	public int getLength() {return this.length;}
	public void setLength(int length) {this.length = length;}
	
	
	
}
