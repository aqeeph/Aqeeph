package agaclar;

import java.util.Vector;

import agac.Agac;
import deva.Bitki;
import generic.Node;

public class Capsule_Vector_Agac {
	/**
	 * 
	 */
	private static Vector<Agac<Bitki>> agaclar;
	/**
	 * 
	 */
	private static int aranan_urun_hangi_kategoride_bulundu;

	/**
	 * @param kategori_cesidi
	 */
	public Capsule_Vector_Agac(int kategori_cesidi) {
		Capsule_Vector_Agac.setAgaclar(new Vector<Agac<Bitki>>());
		Capsule_Vector_Agac.agaclar.setSize(kategori_cesidi);
		for (int i = 0; i < kategori_cesidi; i++) {
			Capsule_Vector_Agac.agaclar.set(i, new Agac<Bitki>());
		}
	}

	/**
	 * 
	 */
	public Capsule_Vector_Agac() {
		Capsule_Vector_Agac.setAgaclar(new Vector<Agac<Bitki>>());
	}

	/**
	 * @return
	 */
	public static Vector<Agac<Bitki>> getAgaclar() {
		return Capsule_Vector_Agac.agaclar;
	}

	/**
	 * @param agaclar
	 */
	public static void setAgaclar(Vector<Agac<Bitki>> agaclar) {
		Capsule_Vector_Agac.agaclar = agaclar;
	}

	/**
	 * @param data
	 * @return
	 */
	public String find(String data) {
		String yanit = "";
		for (int i = 0; i < agaclar.size(); i++) {
			yanit = Capsule_Vector_Agac.find(agaclar.elementAt(i).getNode_bitki(), data);
			if (yanit.compareTo("Bulunamadi") != 0) {
				// Bulunduysa diger kategorilerde arama yapmaya gerek yok
				setAranan_urun_hangi_kategoride_bulundu(i);
				return yanit;
			}
		}
		return yanit;
	}

	public String find_request(int i, String aranan_Urun) {
		return Capsule_Vector_Agac.find(Capsule_Vector_Agac.getAgaclar().elementAt(i).getNode_bitki(), aranan_Urun);
	}

	/**
	 * @param wanted
	 * @param data
	 * @return
	 */
	public static String find(Node<Bitki> wanted, String data) {
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

	// Agaca bir dugum eklemeyi saglayan metot
	/**
	 * @param newnode
	 */
	public void insert(int index, Node<Bitki> newnode) {
		System.out.println("burayagirdi1");
		if (Capsule_Vector_Agac.agaclar.elementAt(index).getNode_bitki().getNode() == null) {
			//System.out.println("buraya her kategori için 1 defa girmesi gerekiyor.");
			//System.out.println("index"+index);
			Capsule_Vector_Agac.agaclar.elementAt(index).setNode(newnode);
			//System.out.println("Capsule_Vector_Agac.agaclar.elementAt(index).tostring"
				//	+ Capsule_Vector_Agac.agaclar.elementAt(index).toString());
		} else {
			//System.out.println("Capsule_Vector_Agac.agaclar.elementAt(index).getNode_bitki().tostring"
				//	+ Capsule_Vector_Agac.agaclar.elementAt(index).getNode_bitki());
			Capsule_Vector_Agac.inOrder_request(index, 0);
			//System.out.println("Capsule_Vector_Agac.getAgaclar().elementAt(endex).inOrder_yazdir();"
				//	+ Capsule_Vector_Agac.getAgaclar().elementAt(index).inOrder_yazdir());
			Node<Bitki> current = Capsule_Vector_Agac.agaclar.elementAt(index).getNode_bitki();
			Node<Bitki> parent;
			if (current == null) {
				System.out.println("current null var");
				throw new NullPointerException();
			} else {
				System.out.println("current to string:" + current.toString());
				if (current.toString() == null) {
					System.out.println("current.toString() null");
					throw new NullPointerException();
				} else {
					while (true) {
						parent = current;
						// newnode.get().getAdi().compareBitkio(current.get().getAdi()) < 0
						String str = null;
						try {
							str = current.getNode().getAdi();
						} catch (Exception e) {
							throw new NullPointerException();
						}
						if (newnode.getNode().getAdi().compareTo(str) < 0) {
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
				}
			}
		} // end else not node
	} // end insert()

	/**
	 * @param value
	 * @return
	 */
	public boolean agac_remove(int index, String value) {
		if (Capsule_Vector_Agac.agaclar.elementAt(index).getNode_bitki() == null) {
			return false;
		} else {
			if (Capsule_Vector_Agac.agaclar.elementAt(index).getNode_bitki().getNode().getAdi().compareTo(value) == 0) {
				Node<Bitki> auxnode = new Node<Bitki>(null);
				auxnode.setLeft_node(Capsule_Vector_Agac.agaclar.elementAt(index).getNode_bitki());
				boolean result = remove(value, Capsule_Vector_Agac.agaclar.elementAt(index).getNode_bitki(), auxnode);
				Capsule_Vector_Agac.agaclar.elementAt(index).setNode(auxnode.getLeft_node());
				return result;
			} else {
				return remove(value, Capsule_Vector_Agac.agaclar.elementAt(index).getNode_bitki(), null);
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

	// **************** Listeleme
	// Metotlari ************************************************
	// Agacin preOrder Dolasilmasi
	public void preOrder_request(int endex, int i) {
		preOrder(endex, Capsule_Vector_Agac.getAgaclar().elementAt(endex).getNode_bitki(), i);
	}

	/**
	 * @param localnode
	 * @param duzey
	 */
	public void preOrder(int index, Node<Bitki> localnode, int duzey) {
		if (localnode != null) {
			// System.out.println(localnode.getBitki().getAdi());
			Capsule_Vector_Agac.agaclar.elementAt(index).getPreorder()
					.add("Duzey: " + duzey + "Bitki Adi: " + localnode.getNode().getAdi() + "\n");
			preOrder(index, localnode.getLeft_node(), ++duzey);
			preOrder(index, localnode.getRight_node(), duzey);
		}
	}

	// Agacin inOrder Dolasilmasi
	public static void inOrder_request(int endex, int i) {
		Capsule_Vector_Agac.inOrder(endex, Capsule_Vector_Agac.getAgaclar().elementAt(endex).getNode_bitki(), i);
	}

	/**
	 * @param localnode
	 * @param duzey
	 */
	public static void inOrder(int index, Node<Bitki> localnode, int duzey) {
		if (localnode != null) {
			if (localnode.getNode() != null) {
				Capsule_Vector_Agac.inOrder(index, localnode.getLeft_node(), duzey);
				// System.out.println(localnode.getBitki().getAdi());
				Capsule_Vector_Agac.agaclar.elementAt(index).getInorder()
						.add("Duzey: " + duzey + "Bitki Adi: " + localnode.getNode().getAdi() + "\n");
				Capsule_Vector_Agac.inOrder(index, localnode.getRight_node(), duzey);
			}else {
				System.out.println("localnode.getNode() null");
			}
		}
	}

	// Agacin postOrder Dolasilmasi
	public void postOrder_request(int endex, int i) {
		postOrder(endex, Capsule_Vector_Agac.getAgaclar().elementAt(endex).getNode_bitki(), i);
	}

	/**
	 * @param localnode
	 * @param duzey
	 */
	public void postOrder(int index, Node<Bitki> localnode, int duzey) {
		if (localnode != null) {
			postOrder(index, localnode.getLeft_node(), duzey);
			postOrder(index, localnode.getRight_node(), duzey);
			// System.out.println(localnode.getBitki().getAdi());
			Capsule_Vector_Agac.agaclar.elementAt(index).getPostorder()
					.add("Duzey: " + duzey + "Bitki Adi: " + localnode.getNode().getAdi() + "\n");
		}
	}

	/**
	 * @param aranan_urun_hangi_kategoride_bulundu
	 */
	public void setAranan_urun_hangi_kategoride_bulundu(int aranan_urun_hangi_kategoride_bulundu) {
		Capsule_Vector_Agac.aranan_urun_hangi_kategoride_bulundu = aranan_urun_hangi_kategoride_bulundu;
	}

	/**
	 * @return
	 */
	public int getAranan_urun_hangi_kategoride_bulundu() {
		return aranan_urun_hangi_kategoride_bulundu;
	}

}