package stack;
import linkedList.LinkedListImpl;
import linkedList.ListItem;

public class StackImpl implements Stack {
	LinkedListImpl list = new LinkedListImpl();

	@Override
	public void push(String s) {
		if(this.list.getHead() == null) {
			this.list.addItem(s);
		} else {
			this.list.insertBefore(s, this.list.getHead().data);
		}
	}

	@Override
	public String pop() {
		ListItem oldHead = this.list.getHead();
		this.list.deleteItem(oldHead.data);
		return oldHead.data;
	}

	@Override
	public Boolean isEmpty() {
		return this.list.getHead() == null;
	}

	@Override
	public Boolean isFull() {
		return false;
	}

	@Override
	public int size() {
		return this.list.itemCount();
	}

	@Override
	public String peek() {
		return this.list.getHead().data;
	}

	@Override
	public void setCapacity(int size) {
		System.out.println("This method is useless due to the implementation");		
	}

	@Override
	public void display() {
		this.list.listItems();	
	}
 

}
