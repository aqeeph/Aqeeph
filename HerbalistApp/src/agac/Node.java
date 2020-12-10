package agac;

import deva.Bitki;

/**
 * @author MehmetAkif-PC
 *
 * @param <T> generic tip
 */
public class Node<T> {
	
	/**
	 * @param node current node
	 * @param sonrakiNode sonrakiNode node
	 * @param left_node sol cocuk dugum
	 * @param right_node sag cocuk dugum
	 */
	public Node(T node, Node<T> sonraki, Node<T> left_node, Node<T> right_node) {
		super();
		this.node = node;
		this.sonrakiNode = sonraki;
		this.left_node = left_node;
		this.right_node = right_node;
	}

	// T stands for "Type"
	/**
	 * 
	 */
	private T node;

	/**
	 * @return the node
	 */
	public T getNode() {
		return node;
	}

	/**
	 * @param node the node to set
	 */
	public void setNode(T node) {
		this.node = node;
	}

	/**
	 * 
	 */
	private Node<T> sonrakiNode;
	/**
	 * 
	 */
	private Node<T> left_node, right_node;

	/**
	 * 
	 */
	public Node() {
	}

	/**
	 * @param t
	 */
	public Node(T t) {
		this.node = t;
	}

	/**
	 * @return the sonrakiNode
	 */
	public Node<T> getSonrakiNode() {
		return sonrakiNode;
	}

	/**
	 * @param sonrakiNode the sonrakiNode to set
	 */
	public void setSonrakiNode(Node<T> sonraki) {
		this.sonrakiNode = sonraki;
	}

	/**
	 *
	 */
	public String toString() {
		return node.toString();
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
	 * @return left_node.minValue()
	 */
	public String minValue() {
		if (left_node == null) {
			return ((Bitki) this.getNode()).getAdi();
		} else {
			return left_node.minValue();
		}
	}
}