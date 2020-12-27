package generic;

import capsule.Capsule_Vector_String;

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
		this.setNode_bitki(node_bitki);
		this.setNode_sayisi(node_sayisi);
		this.setPreorder(preorder);
		this.setInorder(inorder);
		this.setPostorder(postorder);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Agac [node_bitki=");
		builder.append(node_bitki);
		builder.append(", node_sayisi=");
		builder.append(node_sayisi);
		builder.append(", preorder=");
		builder.append(preorder);
		builder.append(", inorder=");
		builder.append(inorder);
		builder.append(", postorder=");
		builder.append(postorder);
		builder.append("]");
		return builder.toString();
	}
	/**
	 * 
	 */
	public Agac() {
		this.setNode_bitki(new Node<T>());
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
		this.setNode_bitki(node);
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
		return getPreorder().toString();
	}
	/**
	 * @return
	 */
	public String inOrder_yazdir() {
		return getInorder().toString();
	}
	/**
	 * @return
	 */
	public String postOrder_yazdir() {
		return getPostorder().toString();
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
}