package queue;
import linkedList.LinkedListImpl;
import linkedList.ListItem;

public class QueueImpl implements Queue {
	LinkedListImpl list = new LinkedListImpl();

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		return this.list.getHead() == null;
	}

	@Override
	public void enQueue(String element) {
		this.list.addItem(element);
		
	}

	@Override
	public String deQueue() {
		ListItem oldHead = this.list.getHead();
		this.list.deleteItem(oldHead.data);
		return oldHead.data;
	}

	@Override
	public void display() {
		this.list.listItems();
	}

	@Override
	public String peek() {
		return this.list.getHead().data;
	}

}
