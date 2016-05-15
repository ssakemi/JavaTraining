package ch11.ex01;

public class LinkedList<E> {
	private Node<E> head;
	private Node<E> tail;

	public void add(E content) {
		if (head == null) {
			head = new Node<E>(content);
			tail = head;
			return;
		}
		tail.setNext(new Node<E>(content));
		tail = tail.getNext();
	}

	public Node<E> getHead() {
		return head;
	}
}
