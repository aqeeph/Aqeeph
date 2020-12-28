/**
 * 
 */
package main.java.bagli_liste;

import main.java.balon.Balon;
import main.java.generic.Bagli_Liste;
import main.java.generic.Node;
import main.java.renkler.Renkler;

/**
 * @author MEHMET AKIF ILYASOGULLARI
 *
 */
public class Bagli_Liste_Node_Balon {
	/**
	 * 
	 */
	private Bagli_Liste<Node_Balon> bagli_liste_node_balon;

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private Bagli_Liste_Node_Balon() {
		super();
		this.setBagli_liste_node_balon(new Bagli_Liste<Node_Balon>());
		this.getBagli_liste_node_balon().setBas(new Node_Balon());
		this.getBagli_liste_node_balon().setYeniBalon(new Node_Balon());
		this.getBagli_liste_node_balon().setSimdiki(new Node_Balon());
		this.getBagli_liste_node_balon().setGecici(new Node_Balon());
		this.getBagli_liste_node_balon().setSilinecek(new Node_Balon());
		this.getBagli_liste_node_balon().setDolas(new Node_Balon());
		this.getBagli_liste_node_balon().getYeniBalon().setNode_balon(new Node<Balon>());
		this.getBagli_liste_node_balon().getSimdiki().setNode_balon(new Node<Balon>());
		this.getBagli_liste_node_balon().getGecici().setNode_balon(new Node<Balon>());
		this.getBagli_liste_node_balon().getSilinecek().setNode_balon(new Node<Balon>());
		this.getBagli_liste_node_balon().getDolas().setNode_balon(new Node<Balon>());
	}

	public Bagli_Liste_Node_Balon(int katNo) {
		super();
		this.setBagli_liste_node_balon(new Bagli_Liste<Node_Balon>());
		this.getBagli_liste_node_balon().setBas(new Node_Balon());
		this.getBagli_liste_node_balon().setYeniBalon(new Node_Balon());
		this.getBagli_liste_node_balon().setSimdiki(new Node_Balon());
		this.getBagli_liste_node_balon().setGecici(new Node_Balon());
		this.getBagli_liste_node_balon().setSilinecek(new Node_Balon());
		this.getBagli_liste_node_balon().setDolas(new Node_Balon());
		this.getBagli_liste_node_balon().getYeniBalon().setNode_balon(new Node<Balon>());
		this.getBagli_liste_node_balon().getSimdiki().setNode_balon(new Node<Balon>());
		this.getBagli_liste_node_balon().getGecici().setNode_balon(new Node<Balon>());
		this.getBagli_liste_node_balon().getSilinecek().setNode_balon(new Node<Balon>());
		this.getBagli_liste_node_balon().getDolas().setNode_balon(new Node<Balon>());
		this.getBagli_liste_node_balon().setKatNumarasi(katNo);
	}

	private Node_Balon yeni_balon(int no) {
		try {
			this.getBagli_liste_node_balon().setYeniBalon(new Node_Balon());
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(0);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
			return null;
		}
		try {
			this.getBagli_liste_node_balon().getYeniBalon().setNode_balon(new Node<Balon>());
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(0);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
			return null;
		}
		try {
			this.getBagli_liste_node_balon().getYeniBalon().setcurrentNode(no, Renkler.random_renk());
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(0);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return this.getBagli_liste_node_balon().getYeniBalon();
	}

	/**
	 * @param no
	 */
	public void Ekle(int no) {
		if (this.getBagli_liste_node_balon() == null && this.getBagli_liste_node_balon().getBas() == null
				&& this.getBagli_liste_node_balon().getBas().getNode_balon() == null) {
			System.exit(0);
		} else {
			if (this.getBagli_liste_node_balon().getBas().getNode_balon().getNode() == null) {
				Balon balon = new Balon(no, Renkler.random_renk());
				this.getBagli_liste_node_balon().getBas().getNode_balon().setcurrentNode(balon);
				System.out.println("eklenen balon:" + this.getBagli_liste_node_balon().Bas_toString());
				try {
					this.getBagli_liste_node_balon().getBas()
							.root_olarak_ayarla();/* bagli listeyi dairesel hale getirmek icin */
				} catch (NullPointerException e) {
					e.printStackTrace();
					System.exit(0);
					return;
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(0);
					return;
				}
			} else {
				this.getBagli_liste_node_balon().setYeniBalon(yeni_balon(no));
				try {
					this.getBagli_liste_node_balon().getSimdiki()
							.setNode_balon(this.getBagli_liste_node_balon().getBas().getNode_balon());
				} catch (NullPointerException e) {
					e.printStackTrace();
					System.exit(0);
					return;
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(0);
					return;
				}
				try {
					this.getBagli_liste_node_balon().getGecici()
							.setNode_balon(this.getBagli_liste_node_balon().getBas().getNode_balon());
				} catch (NullPointerException e) {
					e.printStackTrace();
					System.exit(0);
					return;
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(0);
					return;
				}
				do {
					try {
						this.getBagli_liste_node_balon().getGecici().sonraki_node_balonu_simdiki_node_balon_olarak_ayarla();
					} catch (NullPointerException e) {
						e.printStackTrace();
						System.exit(0);
						return;
					} catch (Exception e) {
						e.printStackTrace();
						System.exit(0);
						return;
					}
					try {
						this.getBagli_liste_node_balon().getSimdiki()
								.setNode_balon(this.getBagli_liste_node_balon().getGecici().getSonraki_node_balon());
					} catch (NullPointerException e) {
						e.printStackTrace();
						System.exit(0);
						return;
					} catch (Exception e) {
						e.printStackTrace();
						System.exit(0);
						return;
					}
				} while (this.getBagli_liste_node_balon().getSimdiki().getNode_balon() != this.getBagli_liste_node_balon()
						.getBas().getNode_balon());
				try {
					this.getBagli_liste_node_balon().getGecici()
							.setSonraki_node_balon(this.getBagli_liste_node_balon().getYeniBalon().getNode_balon());
				} catch (NullPointerException e) {
					e.printStackTrace();
					System.exit(0);
					return;
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(0);
					return;
				}
				try {
					this.getBagli_liste_node_balon().getYeniBalon()
							.setSonraki_node_balon(this.getBagli_liste_node_balon().getBas().getNode_balon());
				} catch (NullPointerException e) {
					e.printStackTrace();
					System.exit(0);
					return;
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(0);
					return;
				}
				try {
					System.out.println("eklenen balon:" + this.getBagli_liste_node_balon().YeniBalon_toString());
				} catch (NullPointerException e) {
					e.printStackTrace();
					System.exit(0);
					return;
				} catch (OutOfMemoryError e) {
					e.printStackTrace();
					System.exit(0);
					return;
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(0);
					return;
				}

			}
		}
	}

	/**
	 * @param bagli_liste_node_balon
	 */
	@SuppressWarnings("unused")
	private Bagli_Liste_Node_Balon(Bagli_Liste<Node_Balon> bagli_liste_balon) {
		super();
		this.setBagli_liste_node_balon(bagli_liste_balon);
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		StringBuffer s;
		s = new StringBuffer();
		s.append("Bagli_Liste_Node_Balon [bagli_liste_node_balon=");
		s.append(this.getBagli_liste_node_balon());
		s.append("]");
		return s.toString();
	}

	/**
	 * @return
	 */
	public Bagli_Liste<Node_Balon> getBagli_liste_balon() {
		return this.getBagli_liste_node_balon();
	}

	/**
	 * @param bagli_liste_node_balon
	 */
	public void setBagli_liste_balon(Bagli_Liste<Node_Balon> bagli_liste_balon) {
		this.setBagli_liste_node_balon(bagli_liste_balon);
	}

	/**
	 * @param no
	 */

	/**
	 * @param n
	 */
	public void patlat(int n) {
		StringBuffer s;
		s = new StringBuffer();
		if (this.getBagli_liste_node_balon().getBas() == null) {
			return;
		} else {
			if (this.getBagli_liste_node_balon().getBas().getNode_balon() == null) {
				return;
			} else {
				if (this.getBagli_liste_node_balon().getBas().getNode_balon().getNode() == null) {
					return;
				} else {
					try {
						this.getBagli_liste_node_balon().getSilinecek().setNode_balon(
								this.getBagli_liste_node_balon().getBas().getSonraki_node_balon());/* silinecek olan balon */
					} catch (NullPointerException e) {
						e.printStackTrace();
						System.exit(0);
						return;
					} catch (Exception e) {
						e.printStackTrace();
						System.exit(0);
						return;
					}
				}
			}
		}
		if (n == 1) {// eger balonlari teker teker silmemiz isteniyorsa
			while (this.getBagli_liste_node_balon().getSilinecek().getSonraki_node_balon() != this.getBagli_liste_node_balon()
					.getBas().getNode_balon()) {
				this.getBagli_liste_node_balon().getSilinecek().sonraki_node_balonu_simdiki_node_balon_olarak_ayarla();
			}
			s.append(this.getBagli_liste_node_balon().getKatNumarasi());
			s.append(".kattaki ");
			s.append(n);
			s.append(".siradaki balonlar patlatilmaktadir. ");
			s.append("\nListedeki balonlar:\n");
			s.append(this.dolas());// yeni eklendi.
			while (doluMu()) {
				s.append("\nSilinen; ");
				s.append(this.getBagli_liste_node_balon().Bas_toString());
				this.getBagli_liste_node_balon().getSilinecek()
						.setSonraki_node_balon(this.getBagli_liste_node_balon().getBas().getNode_balon());
				this.getBagli_liste_node_balon().getBas().sonraki_node_balonu_simdiki_node_balon_olarak_ayarla();
				s.append("\nListedeki balonlar:\n");
				s.append(this.dolas());// yeni eklendi.
			}
		} else {
			s.append("\n" + this.getBagli_liste_node_balon().getKatNumarasi() + ".katta ilk balondan itibaren her " + n
					+ ".balon patlatilmaktadir.\n\n");
			while (doluMu()) {
				s.append(this.getBagli_liste_node_balon().getKatNumarasi() + ".katta kalan balonlar:");
				s.append(this.dolas());
				this.getBagli_liste_node_balon().setSayac(1);
				while (this.getBagli_liste_node_balon().getSayac() < n - 1) {// n defa donmek icin.
					this.getBagli_liste_node_balon().setSayac(this.getBagli_liste_node_balon().getSayac() + 1);
					this.getBagli_liste_node_balon().getBas()
							.setNode_balon(this.getBagli_liste_node_balon().getBas().getSonraki_node_balon());
					this.getBagli_liste_node_balon().getSilinecek().sonraki_node_balonu_simdiki_node_balon_olarak_ayarla();
				}
				s.append("\n" + this.getBagli_liste_node_balon().getKatNumarasi() + ".katta " + "patlatilan; ");
				s.append(this.getBagli_liste_node_balon().Silinecek_toString()
						+ "\n");/* her turda kat numarasi ve n degerinin yazdirilmasi istenmistir. */
				this.getBagli_liste_node_balon().getBas()
						.setSonraki_node_balon(this.getBagli_liste_node_balon().getSilinecek().getNode_balon());
				this.getBagli_liste_node_balon().getBas().sonraki_node_balonu_simdiki_node_balon_olarak_ayarla();
				this.getBagli_liste_node_balon().getSilinecek().sonraki_node_balonu_simdiki_node_balon_olarak_ayarla();
			} // donguden cikildiginda elimizde sadece bir balon kalmis olacaktir
		}
		s.append("\n\n" + this.getBagli_liste_node_balon().getKatNumarasi() + ".katta " + "kalan;\t");
		s.append(this.getBagli_liste_node_balon().Bas_toString());/* onu da ekrana yazdiralim. */
		System.out.println(s.toString());
	}

	/**
	 * @return
	 */
	public String dolas() {
		StringBuffer s;
		s = new StringBuffer();
		if (this.getBagli_liste_node_balon() == null && this.getBagli_liste_node_balon().getBas() == null
				&& this.getBagli_liste_node_balon().getBas().getNode_balon() == null
				&& this.getBagli_liste_node_balon().getBas().getNode_balon().getNode() == null) {
			s.append("Liste bos");
		} else {
			this.getBagli_liste_node_balon().setDolas(this.getBagli_liste_node_balon().getBas());
			do {
				try {
					s.append(this.getBagli_liste_node_balon().Dolas_toString() + "\n");
				} catch (NullPointerException e) {
					e.printStackTrace();
					System.exit(0);
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(0);
				}
				try {
					this.getBagli_liste_node_balon().getDolas()
							.setNode_balon(this.getBagli_liste_node_balon().getDolas().getSonraki_node_balon());
				} catch (NullPointerException e) {
					e.printStackTrace();
					System.exit(0);
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(0);
				}
			} while (this.getBagli_liste_node_balon().getDolas() != this.getBagli_liste_node_balon().getBas());
		}
		return s.toString();
	}

	/**
	 * @return
	 */
	public boolean doluMu() {// patlat metodu icin gereklidir.
		if (this.getBagli_liste_node_balon().getBas().getNode_balon() == this.getBagli_liste_node_balon().getBas()
				.getSonraki_node_balon()) {// etkin
			// kendine
			// esit
			// oldugunda
			// yani bagli listede sadece bir balon kaldiginda
			// doluMu sorusuna "hayir bos yanitini verir
			return false;// "hayir bos
		} else {
			return true;// "dolu || bas==null || bas.getSonraki()"
		}
	}

	/**
	 * @return the bagli_liste_node_balon
	 */
	private Bagli_Liste<Node_Balon> getBagli_liste_node_balon() {
		return bagli_liste_node_balon;
	}

	/**
	 * @param bagli_liste_node_balon the bagli_liste_node_balon to set
	 */
	private void setBagli_liste_node_balon(Bagli_Liste<Node_Balon> bagli_liste_node_balon) {
		this.bagli_liste_node_balon = bagli_liste_node_balon;
	}
}
