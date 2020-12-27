package main.java.renkler;
import java.util.Random; 
/**
 * @author MehmetAkif-PC
 *
 */
public class Renkler {
static Random r=new Random();
	static int max; 
    static int min; 
    static int range; 
    static int random_sayi;
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
		min=1;
		renkler.add("kırmızı");
		renkler.add("turuncu");
		renkler.add("sarı");
		renkler.add("yeşil");
		renkler.add("mavi");
		renkler.add("mor");
		max=renkler.size();
		range = max - min + 1; 
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
		random_sayi = (int) r.nextInt(range)*+ min;
		return getRenkler().elementAt(random_sayi);
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
}