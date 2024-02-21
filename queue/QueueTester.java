package queue;

public class QueueTester {

	public static void main(String[] args) {
			QueueImpl queue = new QueueImpl();
			queue.enQueue("Adam");
			queue.enQueue("Barbara");
			queue.enQueue("Charlie");
			queue.enQueue("Dave");
			queue.enQueue("Erin");

			queue.display();
			System.out.println("--");

			System.out.println(queue.deQueue());
			System.out.println("--");
			queue.display();
			queue.enQueue("Franklin");
			System.out.println("--");
			queue.display();
			System.out.println("--");

			System.out.println(queue.peek());
			System.out.println("--");

			queue.display();
	}

}
