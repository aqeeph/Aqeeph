public class Bagli_Liste {
	private Node<Balon> bas;
	private Node<Balon> yeniBalon;
	private Node<Balon> simdiki;
	private Node<Balon> gecici;
	private Node<Balon> silinecek;
	private int katNumarasi;
	private int sayac;
	String renkler = "";
	String renk = null;
	Node<Balon> dolas;// listemiz dairesel oldugu icin sonuna gelinip
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
				bas.setSonraki(bas);// bagli listeyi dairesel hale getirmek icin
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
					gecici = gecici.getSonraki();
				} catch (NullPointerException e) {
					e.printStackTrace();
					return;
				} catch (Exception e) {
					e.printStackTrace();
					return;
				}
				try {
					simdiki = gecici.getSonraki();
				} catch (NullPointerException e) {
					e.printStackTrace();
					return;
				} catch (Exception e) {
					e.printStackTrace();
					return;
				}
			} while (simdiki != bas);
			try {
				gecici.setSonraki(yeniBalon);
			} catch (NullPointerException e) {
				e.printStackTrace();
				return;
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}
			try {
				yeniBalon.setSonraki(bas);
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
			yeniBalon = new Node<Balon>();
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		try {
			yeniBalon.set(new Balon(no));
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
				silinecek = bas.getSonraki();// silinecek olan balon
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		if (n == 1) {// eger balonlari teker teker silmemiz isteniyorsa
			while (silinecek.getSonraki() != bas) {
				silinecek = silinecek.getSonraki();
			}
			System.out.println(katNumarasi + ".kattaki " + n + ".s�radaki balonlar patlat�lmaktad�r. "
					+ "\nListedeki balonlar:\n");
			System.out.println(toString());
			while (doluMu()) {
				System.out.println("\nSilinen; ");
				System.out.println(bas.toString());
				silinecek.setSonraki(bas.getSonraki());
				bas = bas.getSonraki();
				System.out.println("\nListedeki balonlar:\n");
				System.out.println(toString());
			}
		} else {
			System.out.print(
					"\n" + katNumarasi + ".katta ilk balondan itibaren her " + n + ".balon patlat�lmaktad�r.\n\n");
			while (doluMu()) {
				System.out.println(katNumarasi + ".katta kalan balonlar:");
				System.out.println(toString());
				sayac = 1;
				while (sayac < n - 1) {// n defa donmek icin.
					sayac++;
					bas = bas.getSonraki();
					silinecek = silinecek.getSonraki();
				}
				System.out.println("\n" + katNumarasi + ".katta " + "patlat�lan; ");
				System.out.println(silinecek.toString());// her turda kat numaras� ve n de�erinin
				// yazdirilmasi
				// istenmistir.
				System.out.println();// bir satir alta gecelim
				bas.setSonraki(silinecek.getSonraki());
				bas = bas.getSonraki();
				silinecek = silinecek.getSonraki().getSonraki();
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
					dolas = dolas.getSonraki();
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
		if (bas == bas.getSonraki()) {// etkin kendine esit oldugunda
										// yani bagli listede sadece bir balon kaldiginda
										// doluMu sorusuna "hayir bos yanitini verir
			return false;// "hayir bos
		} else {
			return true;// "dolu || bas==null || bas.getSonraki()"
		}
	}

	public Node<Balon> getBas() {
		return bas;
	}

	public void setBas(Node<Balon> bas) {
		this.bas = bas;
	}

	public Node<Balon> getYeniBalon() {
		return yeniBalon;
	}

	public void setYeniBalon(Node<Balon> yeniBalon) {
		this.yeniBalon = yeniBalon;
	}

	public Node<Balon> getSimdiki() {
		return simdiki;
	}

	public void setSimdiki(Node<Balon> simdiki) {
		this.simdiki = simdiki;
	}

	public Node<Balon> getGecici() {
		return gecici;
	}

	public void setGecici(Node<Balon> gecici) {
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

	public Node<Balon> getSilinecek() {
		return silinecek;
	}

	public void setSilinecek(Node<Balon> silinecek) {
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

	public Node<Balon> getDolas() {
		return dolas;
	}

	public void setDolas(Node<Balon> dolas) {
		this.dolas = dolas;
	}

}
