package capsule;

import deva.Bitki;
import generic.Node;

public class Capsule_Node_Bitki {
	/**
	 * 
	 */
	private Node<Bitki> node_bitki;
	/**
	 * @param node_bitki
	 */
	public Capsule_Node_Bitki(Node<Bitki> node_bitki) {
		super();
		this.setNode_bitki(node_bitki);
	}
	/**
	 * 
	 */
	public Capsule_Node_Bitki() {
		this.setNode_bitki(new Node<Bitki>());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Capsule_Node_Bitki [node_bitki=");
		builder.append(node_bitki);
		builder.append("]");
		return builder.toString();
	}
	/**
	 * @return
	 */
	public Node<Bitki> getNode_bitki() {
		return node_bitki;
	}

	/**
	 * @param node
	 */
	public void setNode(Node<Bitki> node) {
		this.setNode_bitki(node);
	}
	/**
	 * @param node_bitki the node_bitki to set
	 */
	private void setNode_bitki(Node<Bitki> node_bitki) {
		this.node_bitki = node_bitki;
	}
}