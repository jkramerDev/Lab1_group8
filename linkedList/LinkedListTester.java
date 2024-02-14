package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		// create implementation, then...
		
		LinkedList tester = new LinkedListImpl();
		tester.addItem("2");
		tester.addItem("1");
		tester.addItem("3");
		tester.addItem("4");
		
		tester.insertAfter("3.5", "3");
		tester.insertBefore("1.5","2");
		
		tester.listItems();
	}

}
