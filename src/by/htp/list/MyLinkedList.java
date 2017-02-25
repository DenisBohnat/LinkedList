package by.htp.list;

public class MyLinkedList {

	private LinkedListNode first;
	private LinkedListNode last;
	private LinkedListNode current;
	private int size;

	public MyLinkedList() {
		this.first = null;
		this.last = null;
		this.current = null;
		this.size = 0;
	}

	public void addElement(Object data) {
		LinkedListNode node = new LinkedListNode(data);
		if (this.first == null) {
			this.first = node;
			this.last = node;
			this.size++;
		} else {
			if (this.first != null) {
				this.last.setNext(node);
				node.setPrevious(this.last);
				this.last = node;
				this.size++;
			}
		}
	}

	public void viewList() {
		if (this.first == null) {
			System.out.println("List is empty!");
		} else {
			this.current = this.first;
			int count = 1;
			while (this.current != null) {
				System.out.println(count + " - " + this.current.getData().toString());
				this.current = this.current.getNext();
				count++;
			}
		}
	}

	public Object getElement(int index) {
		if (index < 1 || index > this.size) {
			System.out.println("Incorrect index!");
			return null;
		} else {
			if (index == 1) {
				return this.first.getData();
			} else {
				if (index == this.size) {
					return this.last.getData();
				} else {
					this.current = this.first;
					int count = 1;
					while (current != null && count != index) {
						this.current = this.current.getNext();
						count++;
					}
					return this.current.getData();
				}
			}
		}
	}

	public void addElement(int index, Object data) {
		LinkedListNode node = new LinkedListNode(data);
		if (index < 1 || index > this.size) {
			System.out.println("Incorrect index!");
		} else {
			if (index == 1) {
				this.first.setPrevious(node);
				node.setNext(this.first);
				this.first = node;
				this.size++;
			} else {
				int count = 1;
				this.current = this.first;
				while (current != null && count != index) {
					this.current = this.current.getNext();
					count++;
				}
				node.setPrevious(this.current.getPrevious());
				node.setNext(this.current);
				this.current = this.current.getPrevious();
				this.current.setNext(node);
				this.current = node.getNext();
				this.current.setPrevious(node);
				this.size++;
			}
		}
	}

	public void deleteElement(int index) {
		if (index < 1 || index > this.size) {
			System.out.println("Incorrect index!");
		} else {
			if (index == 1) {
				this.first = this.first.getNext();
				this.first.setPrevious(null);
				this.size--;
			} else {
				if (index == this.size) {
					this.last = this.last.getPrevious();
					this.last.setNext(null);
					this.size--;
				} else {
					int count = 1;
					this.current = this.first;
					while (current != null && count != index) {
						this.current = this.current.getNext();
						count++;
					}
					LinkedListNode temp = this.current;
					this.current = this.current.getPrevious();
					this.current.setNext(temp.getNext());
					this.current = temp.getNext();
					this.current.setPrevious(temp.getPrevious());
					this.size--;
				}
			}
		}
	}

	public int size() {
		return this.size;
	}

}
