package veri_tabani;

/**
 * @author MehmetAkif-PC
 *
 */
public class Kategori {
	// Kategoriye iliskin bilgiler(kategori_no#Kategori_adi)
	private int kategori_no = 0;
	private String kategori_adi = "";

	/**
	 * @param kategori_no
	 * @param kategori_adi
	 */
	public Kategori(int kategori_no, String kategori_adi) {
		setKategori_no(kategori_no);
		setKategori_adi(kategori_adi);
	}

	/**
	 * @return
	 */
	public String getKategori_adi() {
		return kategori_adi;
	}

	/**
	 * @param kategori_adi
	 */
	public void setKategori_adi(String kategori_adi) {
		this.kategori_adi = kategori_adi;
	}

	/**
	 * @return
	 */
	public int getKategori_no() {
		return kategori_no;
	}

	/**
	 * @param kategori_no
	 */
	public void setKategori_no(int kategori_no) {
		this.kategori_no = kategori_no;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Kategori [kategori_no=");
		builder.append(kategori_no);
		builder.append(", kategori_adi=");
		builder.append(kategori_adi);
		builder.append("]");
		return builder.toString();
	}
}