package capsule;

import java.util.Vector;

import deva.Bitki;
import generic.Node;

public class Capsule_Vector_Agac_Bitki {
	/**
	 * 
	 */
	private static Vector<Capsule_Agac_Bitki> agaclar;
	/**
	 * 
	 */
	private static int aranan_urun_hangi_kategoride_bulundu;

	/**
	 * @param kategori_cesidi
	 */
	public Capsule_Vector_Agac_Bitki(int kategori_cesidi) {
		Capsule_Vector_Agac_Bitki.setAgaclar(new Vector<Capsule_Agac_Bitki>());
		Capsule_Vector_Agac_Bitki.agaclar.setSize(kategori_cesidi);
		for (int i = 0; i < kategori_cesidi; i++) {
			Capsule_Vector_Agac_Bitki.agaclar.set(i, new Capsule_Agac_Bitki());
		}
	}

	/**
	 * 
	 */
	public Capsule_Vector_Agac_Bitki() {
		Capsule_Vector_Agac_Bitki.setAgaclar(new Vector<Capsule_Agac_Bitki>());
	}

	/**
	 * @return
	 */
	public static Vector<Capsule_Agac_Bitki> getAgaclar() {
		return Capsule_Vector_Agac_Bitki.agaclar;
	}

	/**
	 * @param agaclar
	 */
	public static void setAgaclar(Vector<Capsule_Agac_Bitki> agaclar) {
		Capsule_Vector_Agac_Bitki.agaclar = agaclar;
	}

	/**
	 * @param data
	 * @return
	 */
	public String search_on_trees(String data) {
		String yanit = "";
		for (int i = 0; i < agaclar.size(); i++) {
			yanit = Capsule_Vector_Agac_Bitki.find(Capsule_Vector_Agac_Bitki.agaclar.elementAt(i).getAgac_bitki().getNode_bitki(), data);
			if (yanit.compareTo("Bulunamadi") != 0) {
				// Bulunduysa diger kategorilerde arama yapmaya gerek yok
				Capsule_Vector_Agac_Bitki.setAranan_urun_hangi_kategoride_bulundu(i);
				return yanit;
			}
		}
		return yanit;
	}

	/**
	 * @param i
	 * @param aranan_Urun
	 * @return
	 */
	public static String find_request(int i, String aranan_Urun) {
		return Capsule_Vector_Agac_Bitki.find(Capsule_Vector_Agac_Bitki.getAgaclar().elementAt(i).getAgac_bitki().getNode_bitki(), aranan_Urun);
	}

	/**
	 * @param wanted
	 * @param data
	 * @return
	 */
	public static String find(Node<Bitki> wanted, String data) {
		if (wanted == null) {
			System.out.println("wanted Bulunamadi\n");
			return "Bulunamadi";
		} else {
			if (wanted.getNode() == null) {
				System.out.println("wanted.getNode() Bulunamadi\n");
				return "Bulunamadi";
			} else {
				int sonuc;
				if ((sonuc = data.compareTo(wanted.getNode().getAdi())) == 0) {
					System.out.println("Bulundu\n");
					// System.out.println("Bulunan:\n" + wanted.toString());
					return wanted.toString();
				} else {
					if (sonuc < 0) {
						return  Capsule_Vector_Agac_Bitki.find(wanted.getLeft_node(), data);
					} else {
						return  Capsule_Vector_Agac_Bitki.find(wanted.getRight_node(), data);
					}
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
		if (Capsule_Vector_Agac_Bitki.agaclar.elementAt(index).getAgac_bitki().getNode_bitki().getNode() == null) {
			/*buraya her kategori için 1 defa girmesi gerekiyor.*/
			Capsule_Vector_Agac_Bitki.agaclar.elementAt(index).getAgac_bitki().setNode(newnode);
		} else {
			Node<Bitki> current;
			current= Capsule_Vector_Agac_Bitki.agaclar.elementAt(index).getAgac_bitki().getNode_bitki();
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
		}
	}

	/**
	 * @param value
	 * @return
	 */
	public boolean agac_remove(int index, String value) {
		if (Capsule_Vector_Agac_Bitki.agaclar.elementAt(index).getAgac_bitki().getNode_bitki() == null) {
			return false;
		} else {
			if (Capsule_Vector_Agac_Bitki.agaclar.elementAt(index).getAgac_bitki().getNode_bitki().getNode().adi_compareTo(value) == 0) {
				Node<Bitki> auxnode = new Node<Bitki>(null);
				auxnode.setLeft_node(Capsule_Vector_Agac_Bitki.agaclar.elementAt(index).getAgac_bitki().getNode_bitki());
				boolean result = remove(value, Capsule_Vector_Agac_Bitki.agaclar.elementAt(index).getAgac_bitki().getNode_bitki(), auxnode);
				Capsule_Vector_Agac_Bitki.agaclar.elementAt(index).getAgac_bitki().setNode(auxnode.getLeft_node());
				return result;
			} else {
				return remove(value, Capsule_Vector_Agac_Bitki.agaclar.elementAt(index).getAgac_bitki().getNode_bitki(), null);
			}
		}
	}
	/**
	 * @param value
	 * @param current
	 * @param parent
	 * @return
	 */
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
	/**
	 * @param endex
	 * @param i
	 */
	public static void preOrder_request(int endex, int i) {
		Capsule_Vector_Agac_Bitki.preOrder(endex, Capsule_Vector_Agac_Bitki.getAgaclar().elementAt(endex).getAgac_bitki().getNode_bitki(), i);
	}

	/**
	 * @param localnode
	 * @param duzey
	 */
	private static void preOrder(int index, Node<Bitki> localnode, int duzey) {
		if (localnode != null) {
			// System.out.println(localnode.getBitki().getAdi());
			Capsule_Vector_Agac_Bitki.agaclar.elementAt(index).getAgac_bitki().getPreorder()
					.add("Duzey: " + duzey + "Bitki Adi: " + localnode.getNode().getAdi() + "\n");
			preOrder(index, localnode.getLeft_node(), ++duzey);
			preOrder(index, localnode.getRight_node(), duzey);
		}
	}

	// Agacin inOrder Dolasilmasi
	/**
	 * @param endex
	 * @param i
	 */
	public static void inOrder_request(int endex, int i) {
		Capsule_Vector_Agac_Bitki.inOrder(endex, Capsule_Vector_Agac_Bitki.getAgaclar().elementAt(endex).getAgac_bitki().getNode_bitki(), i);
	}

	/**
	 * @param localnode
	 * @param duzey
	 */
	private static void inOrder(int index, Node<Bitki> localnode, int duzey) {
		if (localnode != null) {
			if (localnode.getNode() != null) {
				Capsule_Vector_Agac_Bitki.inOrder(index, localnode.getLeft_node(), duzey);
				// System.out.println(localnode.getBitki().getAdi());
				Capsule_Vector_Agac_Bitki.agaclar.elementAt(index).getAgac_bitki().getInorder()
						.add("Duzey: " + duzey + "Bitki Adi: " + localnode.getNode().getAdi() + "\n");
				Capsule_Vector_Agac_Bitki.inOrder(index, localnode.getRight_node(), duzey);
			}else {
				System.out.println("localnode.getNode() null");
			}
		}
	}

	// Agacin postOrder Dolasilmasi
	/**
	 * @param endex
	 * @param i
	 */
	public static void postOrder_request(int endex, int i) {
		Capsule_Vector_Agac_Bitki.postOrder(endex, Capsule_Vector_Agac_Bitki.getAgaclar().elementAt(endex).getAgac_bitki().getNode_bitki(), i);
	}

	/**
	 * @param localnode
	 * @param duzey
	 */
	private static void postOrder(int index, Node<Bitki> localnode, int duzey) {
		if (localnode != null) {
			Capsule_Vector_Agac_Bitki.postOrder(index, localnode.getLeft_node(), duzey);
			Capsule_Vector_Agac_Bitki.postOrder(index, localnode.getRight_node(), duzey);
			// System.out.println(localnode.getBitki().getAdi());
			Capsule_Vector_Agac_Bitki.agaclar.elementAt(index).getAgac_bitki().getPostorder()
					.add("Duzey: " + duzey + "Bitki Adi: " + localnode.getNode().getAdi() + "\n");
		}
	}

	/**
	 * @param aranan_urun_hangi_kategoride_bulundu
	 */
	public static void setAranan_urun_hangi_kategoride_bulundu(int aranan_urun_hangi_kategoride_bulundu) {
		Capsule_Vector_Agac_Bitki.aranan_urun_hangi_kategoride_bulundu = aranan_urun_hangi_kategoride_bulundu;
	}

	/**
	 * @return
	 */
	public int getAranan_urun_hangi_kategoride_bulundu() {
		return Capsule_Vector_Agac_Bitki.aranan_urun_hangi_kategoride_bulundu;
	}
}