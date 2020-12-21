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
	public Bagli_Liste_Node_Balon() {
		super();
		if (this.bagli_liste_node_balon == null) {
			this.bagli_liste_node_balon = new Bagli_Liste<Node_Balon>();
			// System.err.println("hata1 Bagli_Liste_Node_Balon()
			// this.bagli_liste_balon==null)");
			// System.err.println("consructor 1)");
			this.bagli_liste_node_balon.setBas(new Node_Balon());
			this.bagli_liste_node_balon.setYeniBalon(new Node_Balon());
			this.bagli_liste_node_balon.setSimdiki(new Node_Balon());
			this.bagli_liste_node_balon.setGecici(new Node_Balon());
			this.bagli_liste_node_balon.setSilinecek(new Node_Balon());
			this.bagli_liste_node_balon.setDolas(new Node_Balon());
			this.bagli_liste_node_balon.getYeniBalon().setNode_balon(new Node<Balon>());
			this.bagli_liste_node_balon.getSimdiki().setNode_balon(new Node<Balon>());
			this.bagli_liste_node_balon.getGecici().setNode_balon(new Node<Balon>());
			this.bagli_liste_node_balon.getSilinecek().setNode_balon(new Node<Balon>());
			this.bagli_liste_node_balon.getDolas().setNode_balon(new Node<Balon>());
		} else {
			// System.err.println("consructor 1)");
			this.bagli_liste_node_balon.setBas(new Node_Balon());
			this.bagli_liste_node_balon.setYeniBalon(new Node_Balon());
			this.bagli_liste_node_balon.setSimdiki(new Node_Balon());
			this.bagli_liste_node_balon.setGecici(new Node_Balon());
			this.bagli_liste_node_balon.setSilinecek(new Node_Balon());
			this.bagli_liste_node_balon.setDolas(new Node_Balon());
			this.bagli_liste_node_balon.getYeniBalon().setNode_balon(new Node<Balon>());
			this.bagli_liste_node_balon.getSimdiki().setNode_balon(new Node<Balon>());
			this.bagli_liste_node_balon.getGecici().setNode_balon(new Node<Balon>());
			this.bagli_liste_node_balon.getSilinecek().setNode_balon(new Node<Balon>());
			this.bagli_liste_node_balon.getDolas().setNode_balon(new Node<Balon>());
		}
	}

	public Bagli_Liste_Node_Balon(int katNo) {
		super();
		if (this.bagli_liste_node_balon == null) {
			this.bagli_liste_node_balon = new Bagli_Liste<Node_Balon>();
			// System.err.println("init Bagli_Liste_Node_Balon(int katNo)
			// this.bagli_liste_balon==null)");
			if (this.bagli_liste_node_balon.getBas() == null) {// liste yeni olusturuluyorsa;
				this.bagli_liste_node_balon.setBas(new Node_Balon());
				if (this.bagli_liste_node_balon.getBas().getNode_balon() == null) {
					this.bagli_liste_node_balon.getBas().setNode_balon(new Node<Balon>());
				}
			} else {
				// daha onceden initialization islemi gerceklestirilmistir.
			}
			this.bagli_liste_node_balon.setYeniBalon(new Node_Balon());
			this.bagli_liste_node_balon.setSimdiki(new Node_Balon());
			this.bagli_liste_node_balon.setGecici(new Node_Balon());
			this.bagli_liste_node_balon.setSilinecek(new Node_Balon());
			this.bagli_liste_node_balon.setDolas(new Node_Balon());
			this.bagli_liste_node_balon.getYeniBalon().setNode_balon(new Node<Balon>());
			this.bagli_liste_node_balon.getSimdiki().setNode_balon(new Node<Balon>());
			this.bagli_liste_node_balon.getGecici().setNode_balon(new Node<Balon>());
			this.bagli_liste_node_balon.getSilinecek().setNode_balon(new Node<Balon>());
			this.bagli_liste_node_balon.getDolas().setNode_balon(new Node<Balon>());
			this.bagli_liste_node_balon.setKatNumarasi(katNo);
		} else {
			// System.err.println("consructor 2)");
			this.bagli_liste_node_balon.setBas(new Node_Balon());
			this.bagli_liste_node_balon.setYeniBalon(new Node_Balon());
			this.bagli_liste_node_balon.setSimdiki(new Node_Balon());
			this.bagli_liste_node_balon.setGecici(new Node_Balon());
			this.bagli_liste_node_balon.setSilinecek(new Node_Balon());
			this.bagli_liste_node_balon.setDolas(new Node_Balon());
			this.bagli_liste_node_balon.setKatNumarasi(katNo);
			this.bagli_liste_node_balon.getYeniBalon().setNode_balon(new Node<Balon>());
			this.bagli_liste_node_balon.getSimdiki().setNode_balon(new Node<Balon>());
			this.bagli_liste_node_balon.getGecici().setNode_balon(new Node<Balon>());
			this.bagli_liste_node_balon.getSilinecek().setNode_balon(new Node<Balon>());
			this.bagli_liste_node_balon.getDolas().setNode_balon(new Node<Balon>());
		}
	}
	private Node_Balon yeni_balon(int no) {
		try {
			this.bagli_liste_node_balon.setYeniBalon(new Node_Balon());
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
			this.bagli_liste_node_balon.getYeniBalon().setNode_balon(new Node<Balon>());
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
			this.bagli_liste_node_balon.getYeniBalon().setNode(no, Renkler.random_renk());
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(0);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return this.bagli_liste_node_balon.getYeniBalon();
	}
	/**
	 * @param no
	 */
	public void Ekle(int no) {// bagli diziye eleman ekler.
		// System.out.println("Ekle(int no) started");
		if (this.bagli_liste_node_balon == null) {
			// System.err.println("Ekle(int no) this.bagli_liste_balon==null)");
			// System.out.println("exit...");
			// Terminate JVM
			System.exit(0);
		} else {
			// bagli_liste_node_balon = new Bagli_Liste<Node_Balon>();
			if (this.bagli_liste_node_balon.getBas() == null) {// liste yeni olusturuluyorsa;
				// System.err.println("Ekle(int no) this.bagli_liste_balon.getBas()==null)");
				// System.out.println("exit...");
				// Terminate JVM
				System.exit(0);
			} else {
				// this.bagli_liste_balon.setBas(new Node_Balon());
				if (this.bagli_liste_node_balon.getBas().getNode_balon() == null) {
					// System.err.println("Ekle(int no)
					// this.bagli_liste_balon.getBas().getNode_balon() == null");
					// System.out.println("exit...");
					// Terminate JVM
					System.exit(0);
				} else {
					// this.bagli_liste_balon.getBas().setNode_balon(new Node<Balon>());
					if (this.bagli_liste_node_balon.getBas().getNode_balon().getNode() == null) {
						// System.err.println("Ekle(int no)
						// this.bagli_liste_balon.getBas().getNode_balon().getNode() == null");
						Balon balon=new Balon(no, Renkler.random_renk());
						this.bagli_liste_node_balon.getBas().getNode_balon().setNode(balon);
						System.out.println("eklenen balon:" + this.bagli_liste_node_balon.Bas_toString());
						try {
//							this.bagli_liste_balon.getBas().getNode_balon()
//									.setSonraki(this.bagli_liste_balon.getBas().getNode_balon());
							this.bagli_liste_node_balon.getBas().root_olarak_ayarla();// bagli listeyi dairesel hale getirmek
																					// icin
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
						this.bagli_liste_node_balon.setYeniBalon(yeni_balon(no));
						try {
							this.bagli_liste_node_balon.getSimdiki()
									.setNode_balon(this.bagli_liste_node_balon.getBas().getNode_balon());
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
							this.bagli_liste_node_balon.getGecici()
									.setNode_balon(this.bagli_liste_node_balon.getBas().getNode_balon());
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
								this.bagli_liste_node_balon.getGecici()
										.sonraki_node_balonu_simdiki_node_balon_olarak_ayarla();
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
								this.bagli_liste_node_balon.getSimdiki()
										.setNode_balon(this.bagli_liste_node_balon.getGecici().getSonraki_node_balon());
							} catch (NullPointerException e) {
								e.printStackTrace();
								System.exit(0);
								return;
							} catch (Exception e) {
								e.printStackTrace();
								System.exit(0);
								return;
							}
						} while (this.bagli_liste_node_balon.getSimdiki().getNode_balon() != this.bagli_liste_node_balon.getBas()
								.getNode_balon());

						try {
							this.bagli_liste_node_balon.getGecici()
									.setSonraki_node_balon(this.bagli_liste_node_balon.getYeniBalon().getNode_balon());
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
							this.bagli_liste_node_balon.getYeniBalon()
									.setSonraki_node_balon(this.bagli_liste_node_balon.getBas().getNode_balon());
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
							System.out.println("eklenen balon:" + this.bagli_liste_node_balon.YeniBalon_toString());
						} catch (NullPointerException e) {
							e.printStackTrace();
							System.exit(0);
							return;
						}catch (OutOfMemoryError e) {
							e.printStackTrace();//Java heap space bu hatanın çözülmesi lazım.
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
		}
		// System.out.println("Ekle(int no) finished");
	}

	/**
	 * @param bagli_liste_node_balon
	 */
	public Bagli_Liste_Node_Balon(Bagli_Liste<Node_Balon> bagli_liste_balon) {
		super();
		if (bagli_liste_balon == null) {
			// System.err.println("hata3 Bagli_Liste_Node_Balon(Bagli_Liste<Node_Balon>
			// bagli_liste_node_balon==null)");
			this.bagli_liste_node_balon = new Bagli_Liste<Node_Balon>();
			this.bagli_liste_node_balon.setBas(new Node_Balon());
			this.bagli_liste_node_balon.setYeniBalon(new Node_Balon());
			this.bagli_liste_node_balon.setSimdiki(new Node_Balon());
			this.bagli_liste_node_balon.setGecici(new Node_Balon());
			this.bagli_liste_node_balon.setSilinecek(new Node_Balon());
			this.bagli_liste_node_balon.setDolas(new Node_Balon());
			this.bagli_liste_node_balon.getYeniBalon().setNode_balon(new Node<Balon>());
			this.bagli_liste_node_balon.getSimdiki().setNode_balon(new Node<Balon>());
			this.bagli_liste_node_balon.getGecici().setNode_balon(new Node<Balon>());
			this.bagli_liste_node_balon.getSilinecek().setNode_balon(new Node<Balon>());
			this.bagli_liste_node_balon.getDolas().setNode_balon(new Node<Balon>());
		} else {
			// System.err.println("consructor 3)");
			this.bagli_liste_node_balon = bagli_liste_balon;
		}
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return "Bagli_Liste_Node_Balon [bagli_liste_node_balon=" + this.bagli_liste_node_balon + "]";
	}

	/**
	 * @return
	 */
	public Bagli_Liste<Node_Balon> getBagli_liste_balon() {
		return this.bagli_liste_node_balon;
	}

	/**
	 * @param bagli_liste_node_balon
	 */
	public void setBagli_liste_balon(Bagli_Liste<Node_Balon> bagli_liste_balon) {
		this.bagli_liste_node_balon = bagli_liste_balon;
	}

	/**
	 * @param no
	 */
	

	/**
	 * @param n
	 */
	public void patlat(int n) {
		// System.err.println("patlat(int n) started");
		StringBuilder stringBuilder = new StringBuilder();
		if (this.bagli_liste_node_balon.getBas() == null) {
			// System.err.println(
			// "hata patlat(int n) : this.bagli_liste_balon.getBas() == null");
			return;
		} else {
			if (this.bagli_liste_node_balon.getBas().getNode_balon() == null) {
				// System.err.println(
				// "hata patlat(int n) : this.bagli_liste_balon.getBas().getNode_balon() ==
				// null");
				return;
			} else {
				if (this.bagli_liste_node_balon.getBas().getNode_balon().getNode() == null) {
					// System.err.println(
					// "hata patlat(int n) :
					// this.bagli_liste_balon.getBas().getNode_balon().getNode()==null");
					return;
				} else {
					try {
						this.bagli_liste_node_balon.getSilinecek()
								.setNode_balon(this.bagli_liste_node_balon.getBas().getSonraki_node_balon());// silinecek
						// olan
						// balon
					} catch (NullPointerException e) {
						e.printStackTrace();
						return;
					} catch (Exception e) {
						e.printStackTrace();
						return;
					}
				}
			}
		}
		if (n == 1) {// eger balonlari teker teker silmemiz isteniyorsa
			while (this.bagli_liste_node_balon.getSilinecek().getSonraki_node_balon() != this.bagli_liste_node_balon.getBas()
					.getNode_balon()) {
				this.bagli_liste_node_balon.getSilinecek().sonraki_node_balonu_simdiki_node_balon_olarak_ayarla();
			}
			stringBuilder.append(this.bagli_liste_node_balon.getKatNumarasi());
			stringBuilder.append(".kattaki ");
			stringBuilder.append(n);
			stringBuilder.append(".siradaki balonlar patlatilmaktadir. ");
			stringBuilder.append("\nListedeki balonlar:\n");
			stringBuilder.append(this.dolas());// yeni eklendi.
			while (doluMu()) {
				stringBuilder.append("\nSilinen; ");
				stringBuilder.append(this.bagli_liste_node_balon.Bas_toString());
				this.bagli_liste_node_balon.getSilinecek()
						.setSonraki_node_balon(this.bagli_liste_node_balon.getBas().getNode_balon());
				this.bagli_liste_node_balon.getBas().sonraki_node_balonu_simdiki_node_balon_olarak_ayarla();
				stringBuilder.append("\nListedeki balonlar:\n");
				stringBuilder.append(this.dolas());// yeni eklendi.
			}
		} else {
			stringBuilder.append("\n" + this.bagli_liste_node_balon.getKatNumarasi() + ".katta ilk balondan itibaren her "
					+ n + ".balon patlatilmaktadir.\n\n");
			while (doluMu()) {
				stringBuilder.append(this.bagli_liste_node_balon.getKatNumarasi() + ".katta kalan balonlar:");
				stringBuilder.append(this.dolas());
				this.bagli_liste_node_balon.setSayac(1);
				while (this.bagli_liste_node_balon.getSayac() < n - 1) {// n defa donmek icin.
					this.bagli_liste_node_balon.setSayac(this.bagli_liste_node_balon.getSayac() + 1);
					this.bagli_liste_node_balon.getBas()
							.setNode_balon(this.bagli_liste_node_balon.getBas().getSonraki_node_balon());
					this.bagli_liste_node_balon.getSilinecek().sonraki_node_balonu_simdiki_node_balon_olarak_ayarla();
				}
				stringBuilder.append("\n" + this.bagli_liste_node_balon.getKatNumarasi() + ".katta " + "patlatilan; ");
				stringBuilder.append(this.bagli_liste_node_balon.Silinecek_toString() + "\n");// her turda kat numarasi
																								// ve n
																								// degerinin
				// yazdirilmasi
				// istenmistir.
				this.bagli_liste_node_balon.getBas()
						.setSonraki_node_balon(this.bagli_liste_node_balon.getSilinecek().getNode_balon());
				this.bagli_liste_node_balon.getBas().sonraki_node_balonu_simdiki_node_balon_olarak_ayarla();
				this.bagli_liste_node_balon.getSilinecek().sonraki_node_balonu_simdiki_node_balon_olarak_ayarla();
			} // donguden cikildiginda elimizde sadece bir balon kalmis
				// olacaktir
		}
		stringBuilder.append("\n\n" + this.bagli_liste_node_balon.getKatNumarasi() + ".katta " + "kalan;\t");
		stringBuilder.append(this.bagli_liste_node_balon.Bas_toString());// onu da ekrana yazdiralim.
		System.out.println(stringBuilder.toString());
		//System.err.println("patlat(int n) finished");
	}

	/**
	 * @return
	 */
	public String dolas() {
		//System.err.println("dolas() started");
		StringBuilder stringBuilder = new StringBuilder();
		if (this.bagli_liste_node_balon == null) {
			//System.err.println("hata bagli_liste_node_balon==null");
		} else {
			// System.err.println("hata bagli_liste_node_balon null değil");
			if (this.bagli_liste_node_balon.getBas() == null) {
				//System.err.println("hata this.bagli_liste_balon.getBas() == null");
			} else {
				if (this.bagli_liste_node_balon.getBas().getNode_balon() == null) {
					//System.err.println("hata this.bagli_liste_balon.getBas().getNode_balon()==null");
				} else {
					if (this.bagli_liste_node_balon.getBas().getNode_balon().getNode() == null) {
						//System.err.println("hata this.bagli_liste_balon.getBas().getNode_balon().getNode()==null");
					} else {
						this.bagli_liste_node_balon.setDolas(this.bagli_liste_node_balon.getBas());
						do {
							try {
								stringBuilder.append(
										this.bagli_liste_node_balon.Dolas_toString() + "\n");
							} catch (NullPointerException e) {
								e.printStackTrace();
								return "hata";
							} catch (Exception e) {
								e.printStackTrace();
								return "hata";
							}
							try {
								this.bagli_liste_node_balon.getDolas()
										.setNode_balon(this.bagli_liste_node_balon.getDolas().getSonraki_node_balon());
								// this.bagli_liste_balon.getDolas()
								// .sonraki_node_balonu_simdiki_node_balon_olarak_ayarla();
							} catch (NullPointerException e) {
								e.printStackTrace();
								return "hata";
							} catch (Exception e) {
								e.printStackTrace();
								return "hata";
							}
						} while (this.bagli_liste_node_balon.getDolas() != this.bagli_liste_node_balon.getBas());
					}
				}
			}
		}
		//System.err.println("dolas() finished");
		return stringBuilder.toString();
	}

	/**
	 * @return
	 */
	public boolean doluMu() {// patlat metodu icin gereklidir.
		if (this.bagli_liste_node_balon.getBas().getNode_balon() == this.bagli_liste_node_balon.getBas()
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
}
