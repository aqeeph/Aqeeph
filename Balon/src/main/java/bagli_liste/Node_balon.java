package bagli_liste;

import balon.Balon;
import generic.Node;
import renkler.Renkler;

/**
 * @author MehmetAkif-PC
 *
 */
public class Node_balon {
	/**
	 * 
	 */
	private Node<Balon> node_balon;

	/**
	 * 
	 */
	public Node_balon() {
		try {
			this.node_balon = new Node<Balon>();
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}

	/**
	 * @param no
	 * @param renk
	 */
	public Node_balon(int no, String renk) {
		try {
			this.node_balon = new Node<Balon>();
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		try {
			this.node_balon.setNode(new Balon());
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		try {
			this.node_balon.getNode().setNo(no);
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		try {
			this.node_balon.getNode().setRenk(renk);
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}

	/**
	 * @param balon
	 */
	public void set(Balon balon) {
		node_balon.setNode(balon);
	}

	/**
	 * @param no
	 * @param random_renk
	 */
	public void set(int no, String random_renk) {
		try {
			this.getNode_balon().setNode(new Balon(no, Renkler.random_renk()));
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}

	/**
	 * @return
	 */
	public Node<Balon> getNode_balon() {
		return node_balon;
	}

	/**
	 * @param node_balon
	 */
	public void setNode_balon(Node<Balon> node_balon) {
		this.node_balon = node_balon;
	}

	/**
	 * @param node_balon
	 */
	public void setSonraki_node_balon(Node<Balon> node_balon) {
		// [Node<Balon> node_balon].[setSonraki([Node_balon node_balon].[Node<Balon>
		// node_balon])]
		this.node_balon.setSonraki(node_balon);
	}

	/**
	 * @return
	 */
	public Node<Balon> getSonraki_node_balon() {
		// [Node<Balon> gecici].[getSonraki()]
		return node_balon.getSonraki();
	}

	/**
	 * 
	 */
	public void sonraki_node_balonu_simdiki_node_balon_olarak_ayarla() {
		if (this.node_balon == null) {
			System.err.println("this.node_balon==null");
			System.out.println("exit..."); 
            // Terminate JVM 
            System.exit(0);
			return;
		} else {
			this.node_balon = this.node_balon.getSonraki();
		}
	}

	/**
	 * 
	 */
	public void root_olarak_ayarla() {
		this.node_balon.setSonraki(node_balon);// dairesel hale geldi.
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return "Node_balon [node_balon=" + node_balon + "]";
	}

}