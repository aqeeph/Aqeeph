package main.java.generic;

/**
 * @author MEHMET AKIF ILYASOGULLARI
 *
 * @param <T>
 */
public class Node<T> {
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
		this.current_node = current_node;
		this.next_node = next_node;
		this.left_node = left_node;
		this.right_node = right_node;
	}


	/**
	 * @return the current_node
	 */
	public T getNode() {
		return current_node;
	}

	/**
	 * @param current_node the current_node to set
	 */
	public void setcurrentNode(T node) {
		this.current_node = node;
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
		this.current_node = t;
	}

	/**
	 * @return the next_node
	 */
	public Node<T> getNext() {
		return next_node;
	}

	/**
	 * @param next_node the next_node to set
	 */
	public void setNext(Node<T> sonraki) {
		this.next_node = sonraki;
	}

	/**
	 *
	 */
	public String toString() {
		if (current_node == null) {
			return null;
		} else {
			return current_node.toString();
		}
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
		if (this.left_node == null) {
			return this.getNode();
		} else {
			return this.left_node.minNode();
		}
	}
}