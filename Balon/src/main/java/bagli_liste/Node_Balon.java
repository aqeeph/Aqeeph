package main.java.bagli_liste;

import main.java.balon.Balon;
import main.java.generic.Node;

/**
 * @author MehmetAkif-PC
 *
 */
public class Node_Balon {
	/**
	 * 
	 */
	private Node<Balon> node_balon;
	/**
	 * @param node_balon
	 */
	public Node_Balon(Node<Balon> node_balon) {
		super();
		this.node_balon = node_balon;
	}
	/**
	 * 
	 */
	public Node_Balon() {
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
	@SuppressWarnings("unused")
	private Node_Balon(int no, String renk) {
		this_node_balon_init();
		setNode(no, renk);
	}
	private void this_node_balon_init() {
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
	@SuppressWarnings("unused")
	private void this_node_balon_setNode(Balon balon) {
		try {
			this.node_balon.setNode(new Balon());
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}
	@SuppressWarnings("unused")
	private void this_node_balon_getNode_setNo(int no) {
		try {
			this.node_balon.getNode().setNo(no);
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
	}
	@SuppressWarnings("unused")
	private void this_node_balon_getNode_setRenk(String renk) {
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
	public void setNode(Balon balon) {
		node_balon.setNode(balon);
	}
	/**
	 * @param no
	 * @param random_renk
	 */
	public void setNode(int no, String random_renk) {
		Balon balon=new Balon(no, random_renk);
		try {
			this.getNode_balon().setNode(balon);
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
		// [Node<Balon> node_balon].[setSonraki([Node_Balon node_balon].[Node<Balon>
		// node_balon])]
		this.node_balon.setNext(node_balon);
	}
	/**
	 * @return
	 */
	public Node<Balon> getSonraki_node_balon() {
		// [Node<Balon> gecici].[getSonraki()]
		return node_balon.getNext();
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
			this.node_balon = this.node_balon.getNext();
		}
	}
	/**
	 * 
	 */
	public void root_olarak_ayarla() {
		this.node_balon.setNext(node_balon);// dairesel hale geldi.
	}
	/**
	 *
	 */
	@Override
	public String toString() {
		return "Node_Balon [node_balon=" + node_balon + "]";
	}
}