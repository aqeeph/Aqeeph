package bagli_liste;

import balon.Balon;
import others.Node;

public class Node_balon {
	@Override
	public String toString() {
		return "Node_balon [node_balon=" + node_balon + "]";
	}

	private Node<Balon> node_balon=new Node<Balon>();

	public Node_balon() {
	}

	public Node<Balon> getNode_balon() {
		return node_balon;
	}

	public void setNode_balon(Node<Balon> node_balon) {
		this.node_balon = node_balon;
	}

	public void setSonraki_node_balon(Node_balon node_balon) {
		//[Node<Balon> node_balon].[setSonraki([Node_balon node_balon].[Node<Balon> node_balon])]
		this.node_balon.setSonraki(node_balon.node_balon);
	}

	public Node<Balon> getSonraki_node_balon() {
		//[Node<Balon> gecici].[getSonraki()]
		return node_balon.getSonraki();
	}

	public void set(Balon balon) {
		node_balon.set(balon);
	}
}