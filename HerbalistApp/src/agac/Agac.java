package agac;

import deva.Bitki;
import deva.Capsule_Vector_String;
import generic.Node;

public class Agac {
	/**
	 * 
	 */
	private Capsule_Node_Bitki node_bitki;
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
	public Agac(Capsule_Node_Bitki node_bitki, int node_sayisi, Capsule_Vector_String preorder, Capsule_Vector_String inorder,
			Capsule_Vector_String postorder) {
		super();
		this.setNode_bitki(node_bitki);
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
		this.setNode_bitki(new Capsule_Node_Bitki());
		setPreorder(new Capsule_Vector_String());
		setInorder(new Capsule_Vector_String());
		setPostorder(new Capsule_Vector_String());
		setNode_sayisi(getNode_sayisi() + 1);
	}
	public Capsule_Node_Bitki getNode_bitki() {
		return node_bitki;
	}

	public void setNode_bitki(Capsule_Node_Bitki node_bitki) {
		this.node_bitki = node_bitki;
	}
	/**
	 * @return
	 */
	public Node<Bitki> getNode() {
		return getNode_bitki().getNode_bitki();
	}

	/**
	 * @param node
	 */
	public void setNode(Node<Bitki> node) {
		this.getNode_bitki().setNode(node);
	}

	// Agaca bir dugum eklemeyi saglayan metot
	/**
	 * @param newnode
	 */
	public void insert(Node<Bitki> newnode) {
		if (getNode_bitki().getNode_bitki() == null) {
			getNode_bitki().setNode(newnode);
		} else {
			Node<Bitki> current = getNode_bitki().getNode_bitki();
			Node<Bitki> parent;
			while (true) {
				parent = current;
				// newnode.get().getAdi().compareTo(current.get().getAdi()) < 0
				if (newnode.getNode().getAdi().compareTo(current.getNode().getAdi()) < 0) {
					current = current.getLeft_node();// Kucukse sola
					if (current == null) {
						parent.setLeft_node(newnode);
						return;
					}
				} else {
					current = current.getRight_node();
					if (current == null) {
						parent.setRight_node(newnode);
						return;
					}
				}
			}
		} // end else not node
	} // end insert()

	/**
	 * @param value
	 * @return
	 */
	public boolean agac_remove(String value) {
		if (getNode_bitki().getNode_bitki() == null) {
			return false;
		} else {
			if (getNode_bitki().getNode_bitki().getNode().getAdi().compareTo(value) == 0) {
				Node<Bitki> auxnode = new Node<Bitki>(null);
				auxnode.setLeft_node(getNode_bitki().getNode_bitki());
				boolean result = remove(value, getNode_bitki().getNode_bitki(), auxnode);
				getNode_bitki().setNode(auxnode.getLeft_node());
				return result;
			} else {
				return remove(value, getNode_bitki().getNode_bitki(), null);
			}
		}
	}

	/**
	 * @return left_node.minValue()
	 */
//	public String minValue(Node<Bitki> current) {
//		if (current.getLeft_node() == null) {
//			return current.getNode().getAdi();
//		} else {
//			return minValue(current.getLeft_node());
//		}
//	}
	public boolean remove(String value, Node<Bitki> current, Node<Bitki> parent) {
		if (value.compareTo(current.getNode().getAdi()) < 0) {
			if (current.getLeft_node() != null) {
				return remove(value, current.getLeft_node(), current);
			} else {
				return false;
			}
		} else if (value.compareTo(current.getNode().getAdi()) > 0) {
			if (current.getRight_node() != null) {
				return remove(value, current.getRight_node(), current);
			} else {
				return false;
			}
		} else {
			if (current.getLeft_node() != null && current.getRight_node() != null) {
				// current.getNode().setAdi(minValue(current.getRight_node()));
				current.getNode().setAdi(current.getRight_node().minNode().getAdi());
				remove(current.getNode().getAdi(), current.getRight_node(), current);
			} else if (parent.getLeft_node() == current) {
				parent.setLeft_node(current.sol_doluysa_sol_yoksa_sag_dugum());
			} else if (parent.getRight_node() == current) {
				parent.setRight_node(current.sol_doluysa_sol_yoksa_sag_dugum());
			}
			return true;
		}
	}

	/**
	 * @param wanted
	 * @param data
	 * @return
	 */
	public String find(Node<Bitki> wanted, String data) {
		if (wanted == null) {
			System.out.println("Bulunamadi\n");
			return "Bulunamadi";
		} else {
			int sonuc;
			if ((sonuc = data.compareTo(wanted.getNode().getAdi())) == 0) {
				System.out.println("Bulundu\n");
				// System.out.println("Bulunan:\n" + wanted.toString());
				return wanted.toString();
			} else {
				if (sonuc < 0) {
					return find(wanted.getLeft_node(), data);
				} else {
					return find(wanted.getRight_node(), data);
				}
			}
		}
	}

	// **************** Listeleme
	// Metotlari ************************************************
	// Agacin preOrder Dolasilmasi
	/**
	 * @param localnode
	 * @param duzey
	 */
	public void preOrder(Node<Bitki> localnode, int duzey) {
		if (localnode != null) {
			// System.out.println(localnode.getBitki().getAdi());
			preorder.add("Duzey: " + duzey + "Bitki Adi: " + localnode.getNode().getAdi() + "\n");
			preOrder(localnode.getLeft_node(), ++duzey);
			preOrder(localnode.getRight_node(), duzey);
		}
	}

	// Agacin inOrder Dolasilmasi
	/**
	 * @param localnode
	 * @param duzey
	 */
	public void inOrder(Node<Bitki> localnode, int duzey) {
		if (localnode != null) {
			inOrder(localnode.getLeft_node(), duzey);
			// System.out.println(localnode.getBitki().getAdi());
			inorder.add("Duzey: " + duzey + "Bitki Adi: " + localnode.getNode().getAdi() + "\n");
			inOrder(localnode.getRight_node(), duzey);
		}
	}

	// Agacin postOrder Dolasilmasi
	/**
	 * @param localnode
	 * @param duzey
	 */
	public void postOrder(Node<Bitki> localnode, int duzey) {
		if (localnode != null) {
			postOrder(localnode.getLeft_node(), duzey);
			postOrder(localnode.getRight_node(), duzey);
			// System.out.println(localnode.getBitki().getAdi());
			postorder.add("Duzey: " + duzey + "Bitki Adi: " + localnode.getNode().getAdi() + "\n");
		}
	}

	// Duzey listeleme
	/**
	 * @param localnode
	 */
	public void duzey_listele(Node<Bitki> localnode) {

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