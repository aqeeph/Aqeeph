package main.java.renkler;
import java.util.Random; 
/**
 * @author MehmetAkif-PC
 *
 */
public class Renkler {
static Random r=new Random();
	static int max = 10; 
    static int min = 1; 
    static int range = max - min + 1; 
    static int random_sayi;
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
		random_sayi = (int) r.nextInt(range)*+ min;
		return renkler[random_sayi];
	}
}