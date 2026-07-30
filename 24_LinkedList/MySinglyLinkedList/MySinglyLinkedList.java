package MySinglyLinkedList;

public class MySinglyLinkedList {
	Node start ;
	
	public MySinglyLinkedList() {
		
	}
	
	
	public void insertAtBeg(int element) {
		Node newNode = new Node(element);
		
		if(start == null) {
			start = newNode ;
			System.out.print("--- Node inserted at begining ---\n");
			return ;
		}
		
		newNode.next = start ;
		start = newNode ;
		System.out.print("--- Node inserted at begining ---\n");		
	}
	
	public void display() {
		if(start == null) {
			System.out.println("--- List is empty ---\n");			
		}
		else {
			// iterator
			Node itr = start ;
			System.out.print("list : ");
			while(itr != null) {
				System.out.print(itr.data + " -> ");
				itr = itr.next ;
			}
		}
		
		System.out.print("null");
		
		System.out.println();
		
	}
}
