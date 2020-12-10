package bagli_liste;


/**
 * @author MEHMET AKIF ILYASOGULLARI
 *
 */
public class Bagli_Liste<T> {
	@Override
	public String toString() {
		return "Bagli_Liste [bas=" + bas + ", yeniBalon=" + yeniBalon + ", simdiki=" + simdiki + ", gecici=" + gecici
				+ ", silinecek=" + silinecek + ", katNumarasi=" + katNumarasi + ", sayac=" + sayac + ", dolas=" + dolas
				+ "]";
	}

	/**
	 * @return the bas
	 */
	public T getBas() {
		return bas;
	}

	/**
	 * @param bas
	 * @param yeniBalon
	 * @param simdiki
	 * @param gecici
	 * @param silinecek
	 * @param katNumarasi
	 * @param sayac
	 * @param dolas
	 */
	public Bagli_Liste(T bas, T yeniBalon, T simdiki, T gecici,
			T silinecek, int katNumarasi, int sayac, T dolas) {
		super();
		this.bas = bas;
		this.yeniBalon = yeniBalon;
		this.simdiki = simdiki;
		this.gecici = gecici;
		this.silinecek = silinecek;
		this.katNumarasi = katNumarasi;
		this.sayac = sayac;
		this.dolas = dolas;
	}

	/**
	 * 
	 */
	private T bas;
	/**
	 * 
	 */
	private T yeniBalon;
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
	 * @param katNumarasi
	 */
	public Bagli_Liste(int katNumarasi) {// constructor
		this.katNumarasi = katNumarasi;
		bas = null;
	}
	
	public Bagli_Liste() {
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
		return yeniBalon;
	}

	/**
	 * @param yeniBalon
	 */
	public void setYeniBalon(T yeniBalon) {
		this.yeniBalon = yeniBalon;
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
}
