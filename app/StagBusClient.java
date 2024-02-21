package app;
 
import linkedList.LinkedList;
import linkedList.LinkedListImpl;
import queue.Queue;
import queue.QueueImpl;
import stack.Stack;
import stack.StackImpl;

public class StagBusClient {

	public static void main(String[] args) {
		// create implementation, then

		System.out.println("-----L I S T  T E S T------");
		
		LinkedListImpl list = new LinkedListImpl();
		list.addItem("Fairfield Station");
		list.addItem("Bookstore");
		list.addItem("Whole Foods");
		list.addItem("Stop & Shop");
		
		list.listItems();
		
		System.out.println(list.isItemInList("Fairfield Station"));
		System.out.println(list.isItemInList("Target"));
		
		list.deleteItem("Whole Foods");
		
		list.listItems();
		
		list.insertBefore("Home Depot", "Stop & Shop");
		
		list.listItems();
		
		list.insertAfter("CVS", "Stop & Shop");
		
		list.listItems();
		 		
		System.out.println("-----S T A C K  T E S T------");

		StackImpl stack = new StackImpl();
		
		stack.push("Aaron");
		stack.push("Bob");
		stack.push("Chris");
		stack.push("Dave");
		stack.push("Ethan");
		stack.push("Fernando");
		
		stack.display();
		
		System.out.println(stack.peek());
		
		stack.pop();
		
		stack.display();
		
		System.out.println(stack.peek());
		
		stack.push("Gregg");
		stack.push("Howard");
		
		System.out.println(stack.peek());
		
		while(!stack.isEmpty()) {
			stack.pop();
		}
				
		System.out.println(stack.isEmpty());
		
		System.out.println("----Q U E U E  T E S T-------");
		
		QueueImpl queue = new QueueImpl();
		
		queue.enQueue("Adam");
		queue.enQueue("Bob");
		queue.enQueue("Charlie");
		queue.enQueue("Dan");
		queue.enQueue("Eric");
		queue.enQueue("Ferdenand");
		
		queue.display();
		
		System.out.println(queue.peek());
		
		System.out.println(queue.deQueue());
		
		queue.display();
		
		queue.enQueue("George");
		queue.enQueue("Henry");
		
		System.out.println(queue.peek());
		
		queue.deQueue(); // removes the head
		
		queue.display();
		
	 	}

}
