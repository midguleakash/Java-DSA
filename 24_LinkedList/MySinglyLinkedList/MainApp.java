package MySinglyLinkedList;

import java.util.Scanner ;

public class MainApp {
	public static void main(String[] args) {
		MySinglyLinkedList myLL = new MySinglyLinkedList();
		
		Scanner sc = new Scanner(System.in);
		int choice ;
		
		
		do {
			System.out.println("\t1.Add at start");
			System.out.println("\t2.Display a list");
			System.out.println("\t10.Exit");
			System.out.print("Enter choice : ");
			choice = sc.nextInt();
			
			
			switch(choice) {
				case 1 : {
					int data ;					
					System.out.print("Enter data : ");
					data = sc.nextInt();
					myLL.insertAtBeg(data);
					break ;
				}
				
				case 2 : {
					myLL.display();
					break ;
				}
				
				case 10 : {
					System.out.println("----- Prgram terminatting -----");	
					break ;
				}
				
				default : {
					System.out.println("--- Invalid Choice! ---");
					break ;
				}
			}
			
		} while (choice != 10);
		
	}
}
