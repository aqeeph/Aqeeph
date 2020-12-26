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
		this.node_bitki = node_bitki;
	}
	/**
	 * 
	 */
	public Capsule_Node_Bitki() {
		this.node_bitki=new Node<Bitki>();
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return "Capsule_Node_Bitki [node_bitki=" + node_bitki + "]";
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
		this.node_bitki = node;
	}
}