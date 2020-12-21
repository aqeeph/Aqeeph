package main.java.generic;


/**
 * @author MEHMET AKIF ILYASOGULLARI
 *
 */
public class Bagli_Liste<T> {
	/**
	 * 
	 */
	private T bas;
	/**
	 * 
	 */
	private T yeni;
	/**
	 * 
	 */
	private T simdiki;
	/**
	 * 
	 */
	private T gecici;
	/**
	 * 
	 */
	private T silinecek;
	/**
	 * 
	 */
	private int katNumarasi;
	/**
	 * 
	 */
	private int sayac;
	/**
	 * 
	 */
	private T dolas;// listemiz dairesel oldugu icin sonuna gelinip
	// gelinmedigini anlamak icin ayrica bir balon olusturmak
	// lazimdir.
	/**
	 * @param bas
	 * @param yeni
	 * @param simdiki
	 * @param gecici
	 * @param silinecek
	 * @param katNumarasi
	 * @param sayac
	 * @param dolas
	 */
	public Bagli_Liste(T bas, T yeni, T simdiki, T gecici,
			T silinecek, int katNumarasi, int sayac, T dolas) {
		super();
		this.bas = bas;
		this.yeni = yeni;
		this.simdiki = simdiki;
		this.gecici = gecici;
		this.silinecek = silinecek;
		this.katNumarasi = katNumarasi;
		this.sayac = sayac;
		this.dolas = dolas;
	}

	/**
	 * @param katNumarasi
	 */
	public Bagli_Liste(int katNumarasi) {// constructor
		this.katNumarasi = katNumarasi;
		bas = null;
	}
	
	public Bagli_Liste() {
	}

	/**
	 * @return the bas
	 */
	public T getBas() {
		return bas;
	}

	/**
	 * @return
	 */
	public T getNode_balon() {
		return bas;
	}

	/**
	 * @param bas
	 */
	public void setBas(T bas) {
		this.bas = bas;
	}

	/**
	 * @return
	 */
	public T getYeniBalon() {
		return yeni;
	}

	/**
	 * @param yeni
	 */
	public void setYeniBalon(T yeniBalon) {
		this.yeni = yeniBalon;
	}

	/**
	 * @return
	 */
	public T getSimdiki() {
		return simdiki;
	}

	/**
	 * @param simdiki
	 */
	public void setSimdiki(T simdiki) {
		this.simdiki = simdiki;
	}

	/**
	 * @return
	 */
	public T getGecici() {
		return gecici;
	}

	/**
	 * @param gecici
	 */
	public void setGecici(T gecici) {
		this.gecici = gecici;
	}

	/**
	 * @return
	 */
	public int getKatNumarasi() {
		return katNumarasi;
	}

	/**
	 * @param katNumarasi
	 */
	public void setKatNumarasi(int katNumarasi) {
		this.katNumarasi = katNumarasi;
	}

	/**
	 * @return
	 */
	public int getSayac() {
		return sayac;
	}

	/**
	 * @param sayac
	 */
	public void setSayac(int sayac) {
		this.sayac = sayac;
	}

	/**
	 * @return
	 */
	public T getSilinecek() {
		return silinecek;
	}

	/**
	 * @param silinecek
	 */
	public void setSilinecek(T silinecek) {
		this.silinecek = silinecek;
	}

	/**
	 * @return
	 */
	public T getDolas() {
		return dolas;
	}

	/**
	 * @param dolas
	 */
	public void setDolas(T dolas) {
		this.dolas = dolas;
	}
	@Override
	public String toString() {
		return "Bagli_Liste [bas=" + bas + ", yeni=" + yeni + ", simdiki=" + simdiki + ", gecici=" + gecici
				+ ", silinecek=" + silinecek + ", katNumarasi=" + katNumarasi + ", sayac=" + sayac + ", dolas=" + dolas
				+ "]";
	}

	public String Bas_toString() {
		return this.getBas().toString();
	}
	public String Dolas_toString() {
		return this.getDolas().toString();
	}
	public String Gecici_toString() {
		return this.getGecici().toString();
	}
	public String Silinecek_toString() {
		return this.getSilinecek().toString();
	}
	public String YeniBalon_toString() {
		return this.getYeniBalon().toString();
	}
	public String Simdiki_toString() {
		return this.getSimdiki().toString();
	}
}
