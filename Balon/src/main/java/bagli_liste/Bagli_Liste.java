package bagli_liste;
import balon.Balon;
import others.Renkler;

public class Bagli_Liste {
	private Node_balon bas=new Node_balon();
	private Node_balon yeniBalon=new Node_balon();
	private Node_balon simdiki=new Node_balon();
	private Node_balon gecici=new Node_balon();
	private Node_balon silinecek=new Node_balon();
	private int katNumarasi;
	private int sayac;
	String renkler = "";
	String renk = null;
	Node_balon dolas=new Node_balon();// listemiz dairesel oldugu icin sonuna gelinip
	// gelinmedigini anlamak icin ayrica bir balon olusturmak
	// lazimdir.

	public Bagli_Liste(int katNumarasi) {// constructor
		this.katNumarasi = katNumarasi;
		bas = null;
	}

	public void Ekle(int no) {// bagli diziye eleman ekler.
		if (bas == null) {// liste yeni olusturuluyorsa;
			yeni_balon(no);
			try {
				bas = yeniBalon;
			} catch (NullPointerException e) {
				e.printStackTrace();
				return;
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}
			try {
				//node<balon> bas.setSonraki(node<balon> bas)
				bas.setSonraki_node_balon(bas);// bagli listeyi dairesel hale getirmek icin
			} catch (NullPointerException e) {
				e.printStackTrace();
				return;
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}
		} else {// listede birden fazla eleman varsa;
			yeni_balon(no);
			try {
				simdiki = bas;
			} catch (NullPointerException e) {
				e.printStackTrace();
				return;
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}
			try {
				gecici = bas;
			} catch (NullPointerException e) {
				e.printStackTrace();
				return;
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}
			do {
				try {
					//[Node<Balon> gecici].[getSonraki()]
					gecici.setNode_balon(gecici.getSonraki_node_balon());
				} catch (NullPointerException e) {
					e.printStackTrace();
					return;
				} catch (Exception e) {
					e.printStackTrace();
					return;
				}
				try {
					simdiki.setNode_balon(gecici.getSonraki_node_balon());
				} catch (NullPointerException e) {
					e.printStackTrace();
					return;
				} catch (Exception e) {
					e.printStackTrace();
					return;
				}
			} while (simdiki != bas);
			try {
				gecici.setSonraki_node_balon(yeniBalon);
			} catch (NullPointerException e) {
				e.printStackTrace();
				return;
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}
			try {
				yeniBalon.setSonraki_node_balon(bas);
			} catch (NullPointerException e) {
				e.printStackTrace();
				return;
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}
		}
	}

	private void yeni_balon(int no) {
		try {
			yeniBalon = new Node_balon();
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		try {
			yeniBalon.set(new Balon(no,Renkler.random_renk()));
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}

	public void patlat(int n) {
		try {
			if (bas == null) {
				return;
			} else {
				silinecek.setNode_balon(bas.getSonraki_node_balon());// silinecek olan balon
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		if (n == 1) {// eger balonlari teker teker silmemiz isteniyorsa
			while (silinecek.getSonraki_node_balon() != bas.getNode_balon()) {
				silinecek.setNode_balon(silinecek.getSonraki_node_balon());
			}
			System.out.println(katNumarasi + ".kattaki " + n + ".siradaki balonlar patlatilmaktadir. "
					+ "\nListedeki balonlar:\n");
			System.out.println(toString());
			while (doluMu()) {
				System.out.println("\nSilinen; ");
				System.out.println(bas.toString());
				silinecek.setSonraki_node_balon(bas);
				bas.setNode_balon(bas.getSonraki_node_balon());
				System.out.println("\nListedeki balonlar:\n");
				System.out.println(toString());
			}
		} else {
			System.out.print(
					"\n" + katNumarasi + ".katta ilk balondan itibaren her " + n + ".balon patlatilmaktadir.\n\n");
			while (doluMu()) {
				System.out.println(katNumarasi + ".katta kalan balonlar:");
				System.out.println(toString());
				sayac = 1;
				while (sayac < n - 1) {// n defa donmek icin.
					sayac++;
					bas.setNode_balon(bas.getSonraki_node_balon());
					silinecek.setNode_balon(silinecek.getSonraki_node_balon());
				}
				System.out.println("\n" + katNumarasi + ".katta " + "patlatilan; ");
				System.out.println(silinecek.toString());// her turda kat numarasi ve n degerinin
				// yazdirilmasi
				// istenmistir.
				System.out.println();// bir satir alta gecelim
				bas.setSonraki_node_balon(silinecek);
				bas.setNode_balon(bas.getSonraki_node_balon());
				silinecek.setNode_balon(silinecek.getSonraki_node_balon().getSonraki());
			} // donguden cikildiginda elimizde sadece bir balon kalmis
				// olacaktir
		}
		System.out.println("\n\n" + katNumarasi + ".katta " + "kalan;\t");
		System.out.println(bas.toString());// onu da ekrana yazdiralim.
	}

	public String toString() {
		System.err.println("bagli liste ciktisi hazirlaniyor");
		dolas = bas;
		do {
			if (dolas == null) {
				System.err.println("hata null");
			} else {
				try {
					renk = dolas.toString() + "\n";
				} catch (NullPointerException e) {
					e.printStackTrace();
					return "hata";
				} catch (Exception e) {
					e.printStackTrace();
					return "hata";
				}
			}
			try {
				renkler += renk;// ve dolasirken elemanlari balon sinifinda bulunan
				// yazdir yardimiyla teker teker yazdirir.
			} catch (NullPointerException e) {
				e.printStackTrace();
				return "hata";
			} catch (Exception e) {
				e.printStackTrace();
				return "hata";
			}
			if (dolas == null) {
				System.err.println("hata null");
			} else {
				try {
					dolas.setNode_balon(dolas.getSonraki_node_balon());
				} catch (NullPointerException e) {
					e.printStackTrace();
					return "hata";
				} catch (Exception e) {
					e.printStackTrace();
					return "hata";
				}
			}
		} while (dolas != bas);
		System.err.println("bagli liste ciktisi hazir");
		return renkler;
	}

	public boolean doluMu() {// patlat metodu icin gereklidir.
		if (bas.getNode_balon() == bas.getSonraki_node_balon()) {// etkin kendine esit oldugunda
										// yani bagli listede sadece bir balon kaldiginda
										// doluMu sorusuna "hayir bos yanitini verir
			return false;// "hayir bos
		} else {
			return true;// "dolu || bas==null || bas.getSonraki()"
		}
	}

	public Node_balon getNode_balon() {
		return bas;
	}

	public void setBas(Node_balon bas) {
		this.bas = bas;
	}

	public Node_balon getYeniBalon() {
		return yeniBalon;
	}

	public void setYeniBalon(Node_balon yeniBalon) {
		this.yeniBalon = yeniBalon;
	}

	public Node_balon getSimdiki() {
		return simdiki;
	}

	public void setSimdiki(Node_balon simdiki) {
		this.simdiki = simdiki;
	}

	public Node_balon getGecici() {
		return gecici;
	}

	public void setGecici(Node_balon gecici) {
		this.gecici = gecici;
	}

	public int getKatNumarasi() {
		return katNumarasi;
	}

	public void setKatNumarasi(int katNumarasi) {
		this.katNumarasi = katNumarasi;
	}

	public int getSayac() {
		return sayac;
	}

	public void setSayac(int sayac) {
		this.sayac = sayac;
	}

	public Node_balon getSilinecek() {
		return silinecek;
	}

	public void setSilinecek(Node_balon silinecek) {
		this.silinecek = silinecek;
	}

	public String getRenkler() {
		return renkler;
	}

	public void setRenkler(String renkler) {
		this.renkler = renkler;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public Node_balon getDolas() {
		return dolas;
	}

	public void setDolas(Node_balon dolas) {
		this.dolas = dolas;
	}

}
