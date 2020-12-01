package agac;

import java.util.Vector;

import deva.Bitki;

public class Agac {
	public Node<Bitki> node;
	public int node_sayisi = 0;

	private Vector<String> preorder;
	private Vector<String> inorder;
	private Vector<String> postorder;

	/**
	 * 
	 */
	public Agac() {
		setPreorder(new Vector<String>());
		setInorder(new Vector<String>());
		setPostorder(new Vector<String>());
		node = null;
		node_sayisi++;
	}

	/**
	 * @return
	 */
	public Node<Bitki> getNode() {
		return node;
	}

	/**
	 * @param node
	 */
	public void setNode(Node<Bitki> node) {
		this.node = node;
	}

	// Agaca bir dugum eklemeyi saglayan metot
	/**
	 * @param newnode
	 */
	public void insert(Node<Bitki> newnode) {
		if (node == null) {
			node = newnode;
		} else {
			Node<Bitki> current = node;
			Node<Bitki> parent;
			while (true) {
				parent = current;
				if (newnode.get().getAdi().compareTo(current.get().getAdi()) < 0) {
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
	public boolean remove(String value) {

		if (node == null) {
			return false;
		} else {

			if (node.get().getAdi().compareTo(value) == 0) {

				Node<Bitki> auxnode = new Node<Bitki>(null);

				auxnode.setLeft_node(node);

				boolean result = node.remove(value, auxnode);

				node = auxnode.getLeft_node();

				return result;

			} else {

				return node.remove(value, null);

			}

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
			if ((sonuc = data.compareTo(wanted.get().getAdi())) == 0) {
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
			preorder.add("Duzey: " + duzey + "Bitki Adi: " + localnode.get().getAdi() + "\n");
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
			inorder.add("Duzey: " + duzey + "Bitki Adi: " + localnode.get().getAdi() + "\n");
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
			postorder.add("Duzey: " + duzey + "Bitki Adi: " + localnode.get().getAdi() + "\n");
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
		String metin = "";
		for (int i = 0; i < preorder.size(); i++) {
			metin += preorder.elementAt(i);
		}
		return metin;
	}

	/**
	 * @return
	 */
	public String inOrder_yazdir() {
		String metin = "";
		for (int i = 0; i < inorder.size(); i++) {
			metin += inorder.elementAt(i);
		}
		return metin;
	}

	/**
	 * @return
	 */
	public String postOrder_yazdir() {
		String metin = "";
		for (int i = 0; i < postorder.size(); i++) {
			metin += postorder.elementAt(i);
		}
		return metin;
	}

	/**
	 * @param preorder
	 */
	public void setPreorder(Vector<String> preorder) {
		this.preorder = preorder;
	}

	/**
	 * @return
	 */
	public Vector<String> getPreorder() {
		return preorder;
	}

	/**
	 * @param inorder
	 */
	public void setInorder(Vector<String> inorder) {
		this.inorder = inorder;
	}

	/**
	 * @return
	 */
	public Vector<String> getInorder() {
		return inorder;
	}

	/**
	 * @param postorder
	 */
	public void setPostorder(Vector<String> postorder) {
		this.postorder = postorder;
	}

	/**
	 * @return
	 */
	public Vector<String> getPostorder() {
		return postorder;
	}
} // class Agac