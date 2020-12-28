package main.java.generic;

/**
 * @author MEHMET AKIF ILYASOGULLARI
 *
 * @param <T>
 */
public class Node<T> {
	@Override
	public String toString() {
		if (getCurrent_node() == null) {
			return null;
		} else {
			return getCurrent_node().toString();
		}
	}

	// T stands for "Type"
	/**
	 * 
	 */
	private T current_node;
	/**
	 * 
	 */
	private Node<T> next_node;
	/**
	 * 
	 */
	private Node<T> left_node;
	/**
	 * 
	 */
	private Node<T> right_node;
	/**
	 * @param current_node       current current_node
	 * @param next_node    next_node current_node
	 * @param left_node  sol cocuk dugum
	 * @param right_node sag cocuk dugum
	 */
	public Node(T current_node, Node<T> next_node, Node<T> left_node, Node<T> right_node) {
		super();
		this.setCurrent_node(current_node);
		this.setNext_node(next_node);
		this.setLeft_node(left_node);
		this.setRight_node(right_node);
	}


	/**
	 * @return the current_node
	 */
	public T getNode() {
		return getCurrent_node();
	}

	/**
	 * @param current_node the current_node to set
	 */
	public void setcurrentNode(T node) {
		this.setCurrent_node(node);
	}



	/**
	 * 
	 */
	public Node() {
	}

	/**
	 * @param t
	 */
	public Node(T t) {
		this.setCurrent_node(t);
	}

	/**
	 * @return the next_node
	 */
	public Node<T> getNext() {
		return getNext_node();
	}

	/**
	 * @param next_node the next_node to set
	 */
	public void setNext(Node<T> sonraki) {
		this.setNext_node(sonraki);
	}

	/**
	 * @return
	 */
	public Node<T> getLeft_node() {
		return left_node;
	}

	/**
	 * @param left_node
	 */
	public void setLeft_node(Node<T> left_node) {
		this.left_node = left_node;
	}

	/**
	 * @return
	 */
	public Node<T> getRight_node() {
		return right_node;
	}

	/**
	 * @param right_node
	 */
	public void setRight_node(Node<T> right_node) {
		this.right_node = right_node;
	}

	/**
	 * @return
	 */
	public T minNode() {
		if (this.getLeft_node() == null) {
			return this.getNode();
		} else {
			return this.getLeft_node().minNode();
		}
	}


	/**
	 * @return the current_node
	 */
	private T getCurrent_node() {
		return current_node;
	}


	/**
	 * @param current_node the current_node to set
	 */
	private void setCurrent_node(T current_node) {
		this.current_node = current_node;
	}


	/**
	 * @return the next_node
	 */
	private Node<T> getNext_node() {
		return next_node;
	}


	/**
	 * @param next_node the next_node to set
	 */
	private void setNext_node(Node<T> next_node) {
		this.next_node = next_node;
	}
}