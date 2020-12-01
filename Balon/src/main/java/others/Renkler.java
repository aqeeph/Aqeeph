package others;

/**
 * @author MehmetAkif-PC
 *
 */
public class Renkler {
	private static String[] renkler = new String[] { "yavru agzi", "cam gobegi", "van dyke kahverengisi", "hint sarisi",
			"alizarin kirmizisi", "kadmiyum sarisi", "gece yarisi siyahi", "prusya mavisi", "titanyum beyazi",
			"koyu siena" };

	/**
	 * 
	 */
	public Renkler() {
	}

	/**
	 * @param renkler
	 */
	public Renkler(String[] renkler) {
		this.setRenkler(renkler);
	}

	/**
	 * @return the renkler
	 */
	public static String[] getRenkler() {
		return renkler;
	}

	/**
	 * @param renkler the renkler to set
	 */
	public void setRenkler(String[] renkler) {
		Renkler.renkler = renkler;
	}

	/**
	 * @return
	 */
	public static String random_renk() {
		// TODO Auto-generated method stub
		int random_sayi = (int) Math.random();
		return renkler[random_sayi * renkler.length];
	}
}