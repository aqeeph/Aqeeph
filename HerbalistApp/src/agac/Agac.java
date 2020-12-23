package agac;

import deva.Capsule_Vector_String;
import generic.Node;

public class Agac<T> {
	/**
	 * 
	 */
	private Node<T> node_bitki;
	/**
	 * 
	 */
	private int node_sayisi = 0;

	/**
	 * 
	 */
	private Capsule_Vector_String preorder;
	/**
	 * 
	 */
	private Capsule_Vector_String inorder;
	/**
	 * 
	 */
	private Capsule_Vector_String postorder;

	/**
	 * @param node_bitki
	 * @param node_sayisi
	 * @param preorder
	 * @param inorder
	 * @param postorder
	 */
	public Agac(Node<T> node_bitki, int node_sayisi, Capsule_Vector_String preorder, Capsule_Vector_String inorder,
			Capsule_Vector_String postorder) {
		super();
		this.node_bitki=node_bitki;
		this.setNode_sayisi(node_sayisi);
		this.preorder = preorder;
		this.inorder = inorder;
		this.postorder = postorder;
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return "Agac [node_bitki=" + getNode_bitki() + ", node_sayisi=" + getNode_sayisi() + ", preorder=" + preorder
				+ ", inorder=" + inorder + ", postorder=" + postorder + "]";
	}

	/**
	 * 
	 */
	public Agac() {
		this.node_bitki=new Node<T>();
		setPreorder(new Capsule_Vector_String());
		setInorder(new Capsule_Vector_String());
		setPostorder(new Capsule_Vector_String());
		setNode_sayisi(getNode_sayisi() + 1);
	}
	public Node<T> getNode_bitki() {
		return node_bitki;
	}

	public void setNode_bitki(Node<T> node_bitki) {
		this.node_bitki = node_bitki;
	}

	/**
	 * @param node
	 */
	public void setNode(Node<T> node) {
		this.node_bitki=node;
	}



	// Duzey listeleme
	/**
	 * @param localnode
	 */
	public void duzey_listele(Node<T> localnode) {

	}

	/**
	 * @return
	 */
	public String preOrder_yazdir() {
		return preorder.toString();
	}

	/**
	 * @return
	 */
	public String inOrder_yazdir() {
		return inorder.toString();
	}

	/**
	 * @return
	 */
	public String postOrder_yazdir() {
		return postorder.toString();
	}

	/**
	 * @param preorder
	 */
	public void setPreorder(Capsule_Vector_String preorder) {
		this.preorder = preorder;
	}

	/**
	 * @return
	 */
	public Capsule_Vector_String getPreorder() {
		return preorder;
	}

	/**
	 * @param capsule_Vector_String
	 */
	public void setInorder(Capsule_Vector_String capsule_Vector_String) {
		this.inorder = capsule_Vector_String;
	}

	/**
	 * @return
	 */
	public Capsule_Vector_String getInorder() {
		return inorder;
	}

	/**
	 * @param capsule_Vector_String
	 */
	public void setPostorder(Capsule_Vector_String capsule_Vector_String) {
		this.postorder = capsule_Vector_String;
	}

	/**
	 * @return
	 */
	public Capsule_Vector_String getPostorder() {
		return postorder;
	}

	public int getNode_sayisi() {
		return node_sayisi;
	}

	public void setNode_sayisi(int node_sayisi) {
		this.node_sayisi = node_sayisi;
	}
} // class Agac