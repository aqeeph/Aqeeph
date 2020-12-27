package generic;

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
		this.setNode(node);
		this.setSonrakiNode(sonraki);
		this.setLeft_node(left_node);
		this.setRight_node(right_node);
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
	private Node<T> left_node;
	private Node<T> right_node;

	/**
	 * 
	 */
	public Node() {
	}

	/**
	 * @param t
	 */
	public Node(T t) {
		this.setNode(t);
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Node [node=");
		builder.append(node);
		builder.append(", sonrakiNode=");
		builder.append(sonrakiNode);
		builder.append(", left_node=");
		builder.append(left_node);
		builder.append(", right_node=");
		builder.append(right_node);
		builder.append("]");
		return builder.toString();
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
	public T minNode() {
		if (this.getLeft_node() == null) {
			return this.getNode();
		} else {
			return this.getLeft_node().minNode();
		}
	}
	/**
	 * @param current
	 * @return
	 */
	public Node<T> sol_doluysa_sol_yoksa_sag_dugum() {
		return (this.getLeft_node() != null) ? (Node<T>) this.getLeft_node() : (Node<T>) this.getRight_node();
	}
}