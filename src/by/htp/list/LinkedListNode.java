package by.htp.list;

public class LinkedListNode {

	private Object data;
	private LinkedListNode next;
	private LinkedListNode previous;

	public LinkedListNode(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public LinkedListNode getNext() {
		return next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}

	public LinkedListNode getPrevious() {
		return previous;
	}

	public void setPrevious(LinkedListNode previous) {
		this.previous = previous;
	}

}
