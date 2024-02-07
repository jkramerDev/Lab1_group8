package linkedList;

public class LinkedListImpl implements LinkedList {

	private ListItem head = null;
	
	@Override
	public Boolean isItemInList(String thisItem) {
		if(this.head == null) {
			return false;
		} else {
			ListItem point = this.head;
			while(point.data != thisItem && point.next != null) {
				point = point.next;
			}
			if(point.data == thisItem) {
				return true;
			} else {
				return false;
			}
		}
	}

	@Override
	public Boolean addItem(String thisItem) {
		if(this.head == null) {
			this.head = new ListItem(thisItem);
			if(this.head.data == thisItem) {
				return true;
			}
		} else {
			ListItem point = this.head;
			while(point.next != null) {
				point = point.next;
			}
			point.next = new ListItem(thisItem);
			if(point.next.data == thisItem) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Integer itemCount() {
		if(this.head == null) {
			return 0;
		} else {
			int count = 1;
			ListItem point = this.head;
			while(point.next != null) {
				point = point.next;
				count++;
			}
			return count;
		}
	}

	@Override
	public void listItems() {
		ListItem temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	@Override
	public Boolean deleteItem(String thisItem) {
		if(head == null)
			return true;

		ListItem current = head;
		
		while(current.next != null) {
			if(current.next.data == thisItem)
				current.next = current.next.next;
			else
				current = current.next;
		}

		return true;
	}

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
		if(this.head == null) {
			return false;
		} else {
			ListItem point = this.head;
			while(point.data != itemToInsertAfter && point.next != null) {
				point = point.next;
			}
			if(point.data == itemToInsertAfter) {
				ListItem newNext = point.next;
				point.next = new ListItem(newItem);
				point.next.next = newNext;
				
				return true;
			} else {
				return false;
			}
		}
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}

	public ListItem getHead() {
		return head;
	}
	
}
