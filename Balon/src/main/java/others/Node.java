package others;

/**
 * @author MEHMET AKIF ILYASOGULLARI
 *
 * @param <T>
 */
public class Node<T> {

	/**
	 * @param node       current node
	 * @param sonraki    sonraki node
	 * @param left_node  sol cocuk dugum
	 * @param right_node sag cocuk dugum
	 */
	public Node(T node, Node<T> sonraki, Node<T> left_node, Node<T> right_node) {
		super();
		this.node = node;
		this.sonraki = sonraki;
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
	private Node<T> sonraki;
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
	 * @return the sonraki
	 */
	public Node<T> getSonraki() {
		return sonraki;
	}

	/**
	 * @param sonraki the sonraki to set
	 */
	public void setSonraki(Node<T> sonraki) {
		this.sonraki = sonraki;
	}

	/**
	 *
	 */
	public String toString() {
		if (node == null) {
			return null;
		} else {
			return node.toString();
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
}