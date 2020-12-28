package main.java.renkler;
import java.util.Random; 
/**
 * @author MehmetAkif-PC
 *
 */
public class Renkler {
private static Random r=new Random();
	private static int max; 
    private static int min; 
    private static int range; 
    private static int random_sayi;
	private static Capsule_Vector_String renkler=new Capsule_Vector_String();

	/**
	 * 
	 */
	public Renkler() {
	}

	/**
	 * 
	 */
	public void renkleri_init() {
		setMin(1);
		getRenkler().add("kırmızı");
		getRenkler().add("turuncu");
		getRenkler().add("sarı");
		getRenkler().add("yeşil");
		getRenkler().add("mavi");
		getRenkler().add("mor");
		setMax(getRenkler().size());
		setRange(getMax() - getMin() + 1); 
	}

	/**
	 * @param renkler
	 */
	public Renkler(Capsule_Vector_String renkler) {
		Renkler.setRenkler(renkler);
	}


	/**
	 * @return
	 */
	public static String random_renk() {
		setRandom_sayi((int) getR().nextInt(getRange())*+ getMin());
		return getRenkler().elementAt(getRandom_sayi());
	}

	/**
	 * @return the renkler
	 */
	private static Capsule_Vector_String getRenkler() {
		return renkler;
	}

	/**
	 * @param renkler the renkler to set
	 */
	private static void setRenkler(Capsule_Vector_String renkler) {
		Renkler.renkler = renkler;
	}

	/**
	 * @return the r
	 */
	static Random getR() {
		return r;
	}

	/**
	 * @param r the r to set
	 */
	static void setR(Random r) {
		Renkler.r = r;
	}

	/**
	 * @return the max
	 */
	static int getMax() {
		return max;
	}

	/**
	 * @param max the max to set
	 */
	static void setMax(int max) {
		Renkler.max = max;
	}

	/**
	 * @return the min
	 */
	static int getMin() {
		return min;
	}

	/**
	 * @param min the min to set
	 */
	static void setMin(int min) {
		Renkler.min = min;
	}

	/**
	 * @return the range
	 */
	static int getRange() {
		return range;
	}

	/**
	 * @param range the range to set
	 */
	static void setRange(int range) {
		Renkler.range = range;
	}

	/**
	 * @return the random_sayi
	 */
	static int getRandom_sayi() {
		return random_sayi;
	}

	/**
	 * @param random_sayi the random_sayi to set
	 */
	static void setRandom_sayi(int random_sayi) {
		Renkler.random_sayi = random_sayi;
	}
}