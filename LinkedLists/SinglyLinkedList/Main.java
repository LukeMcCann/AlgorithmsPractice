package SinglyLinkedList;

public class LinkedListMain {
	
	public static void main(String[] args)
	{
		LinkedList singly = new LinkedList();
		
		singly.addNode(1);
		singly.addNode(2);
		singly.addNode(22);
		singly.addNode(53);
		
		singly.printList();
		
		System.out.println("");
		System.out.println("Length: " + singly.getLength());
	}
	
}
