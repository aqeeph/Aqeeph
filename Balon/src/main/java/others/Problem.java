package others;
import bagli_liste.Bagli_Liste;
import bagli_liste.Stack_Bagli_Liste;
import java.util.Scanner;

/**
 * @author MehmetAkif-PC
 *
 */
public class Problem {
	private static final int MINIMUM_PROBLEM_COZUM_SURESI = 0;
	private static final int MINIMUM_CIKARMA_DEGERI = 1;

	/**
	 * @param bly
	 * @param str1
	 * @param str2
	 * @param uretilecek_olan_balon_sayisi
	 * @param kacta_bir_cikarilacak
	 * @param sayac1
	 * @param sayac2
	 * @param katNo
	 * @param problemSayisi
	 * @param problem_cozum_suresi
	 * @param baslangic
	 * @param bitis
	 * @param gecici1
	 * @param gecici2
	 * @param liste_eleman_sayisi
	 * @param yigin_bos_mu
	 * @param ortalama_problem_cozum_suresi
	 */
	public Problem(Stack_Bagli_Liste bly, Scanner str1, Scanner str2, int uretilecek_olan_balon_sayisi,
			int kacta_bir_cikarilacak, int sayac1, int sayac2, int katNo, int problemSayisi, long problem_cozum_suresi,
			long baslangic, long bitis, Bagli_Liste gecici1, Bagli_Liste gecici2, int liste_eleman_sayisi,
			boolean yigin_bos_mu, long ortalama_problem_cozum_suresi) {
		super();
		this.bly = bly;
		this.str1 = str1;
		this.str2 = str2;
		this.uretilecek_olan_balon_sayisi = uretilecek_olan_balon_sayisi;
		this.kacta_bir_cikarilacak = kacta_bir_cikarilacak;
		this.sayac1 = sayac1;
		this.sayac2 = sayac2;
		this.katNo = katNo;
		this.problemSayisi = problemSayisi;
		this.problem_cozum_suresi = problem_cozum_suresi;
		this.baslangic = baslangic;
		this.bitis = bitis;
		this.gecici1 = gecici1;
		this.gecici2 = gecici2;
		this.liste_eleman_sayisi = liste_eleman_sayisi;
		this.yigin_bos_mu = yigin_bos_mu;
		this.ortalama_problem_cozum_suresi = ortalama_problem_cozum_suresi;
	}

	/**
	 * 
	 */
	private static int counter = 0;// static variable initialization
	/**
	 * 
	 */
	private Stack_Bagli_Liste bly;
	/**
	 * 
	 */
	private Scanner str1;
	/**
	 * 
	 */
	private Scanner str2;
	/**
	 * 
	 */
	private int uretilecek_olan_balon_sayisi;
	/**
	 * 
	 */
	private int kacta_bir_cikarilacak;
	/**
	 * 
	 */
	private int sayac1;
	/**
	 * 
	 */
	private int sayac2;
	/**
	 * 
	 */
	private int katNo;
	/**
	 * 
	 */
	private int problemSayisi;
	/**
	 * 
	 */
	private long problem_cozum_suresi;
	/**
	 * 
	 */
	private long baslangic;
	/**
	 * 
	 */
	private long bitis;
	/**
	 * 
	 */
	private Bagli_Liste gecici1;
	/**
	 * 
	 */
	private Bagli_Liste gecici2;
	/**
	 * 
	 */
	private int liste_eleman_sayisi;
	/**
	 * 
	 */
	private boolean yigin_bos_mu;
	/**
	 * 
	 */
	private long ortalama_problem_cozum_suresi;

	/**
	 * 
	 */
	public Problem() {
		super();
		this.bly = new Stack_Bagli_Liste();
		this.sayac1 = 1;
		this.sayac2 = 1;
		this.katNo = 1;
		this.problemSayisi = 0;
		this.liste_eleman_sayisi = 10;
		++Problem.counter;
	}

	/**
	 * 
	 */
	protected void hesaplama_suresini_yazdir() {
		if (this.problem_cozum_suresi == MINIMUM_PROBLEM_COZUM_SURESI) {
			System.out.println("Problemin cozum suresi, sistem saatinin algilayabilecegi kadar buyuk degil.");
		} else {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("----------------------------------------------------------------------------");
			stringBuilder.append("\n\n" + this.problemSayisi + " this.problem cozuldu.");
			ortalama_problem_cozum_suresini_hesapla();
			stringBuilder.append(
					"1 adet problem yaklasik " + this.ortalama_problem_cozum_suresi + " milisaniyede cozuldu.");
			stringBuilder.append("1 saniyede cozulebilecek balon problemi sayisi	= "
					+ (long) 1000 * this.problemSayisi / this.problem_cozum_suresi);
			System.out.println(stringBuilder.toString());
		}
	}

	/**
	 * 
	 */
	private void ortalama_problem_cozum_suresini_hesapla() {
		this.ortalama_problem_cozum_suresi = this.problem_cozum_suresi / (long) this.problemSayisi;
	}

	/**
	 * 
	 */
	protected void coz() {
		this.baslangic = System.currentTimeMillis(); // sistem saati degeri milisaniye olarak alindi.
		this.yigin_bos_mu = this.blynin_yigini_bos_mu();
		while (!this.yigin_bos_mu) {
			this.gecici2 = this.bly.pop_from_yigin();
			if (this.gecici2 != null) {
				try {
					this.gecici2.patlat(kacta_bir_cikarilacak);
				} catch (NullPointerException e) {
					e.printStackTrace();
					return;
				}
				this.problemSayisi++;
			}
			this.yigin_bos_mu = this.blynin_yigini_bos_mu();
		} // yigit bosalana kadar her bir eleman gecici listeye atilip patlat metoduna
			// maruz
			// birakildi ve her bir liste bir balon problemi sayildi.
		this.bitis = System.currentTimeMillis(); // islem bitince sistem saatine bakildi.
		this.problem_cozum_suresi = this.bitis - this.baslangic;
	}

	/**
	 * @return
	 */
	private boolean blynin_yigini_bos_mu() {
		return this.bly.yigin_bos_mu();
	}

	/**
	 * 
	 */
	protected void kac_tanede_bir_yigindan_cikarilacak() {
		do {
			System.out.println("n degerini (kac dugumde bir yigindan cikarma isleminin yapilacagini) giriniz:");
			this.str2 = new Scanner(System.in);
			this.kacta_bir_cikarilacak = str2.nextInt();
		} while (this.kacta_bir_cikarilacak < MINIMUM_CIKARMA_DEGERI);
		// girdiler alindi.
	}

	/**
	 * 
	 */
	protected void node_sayisini_kullanicidan_al() {
		do {
			System.out.println("m degerini (balon sayisini) giriniz:");
			this.str1 = new Scanner(System.in);
			this.uretilecek_olan_balon_sayisi = str1.nextInt();
		} while (this.uretilecek_olan_balon_sayisi <= 0);
	}

	/**
	 * 
	 */
	protected void insert_item_to_bly() {
		try {
			while (sayac1 <= uretilecek_olan_balon_sayisi) {
				this.gecici1 = new Bagli_Liste(katNo);// gruplama araci
				System.out.println("\n" + katNo + ". kattaki listedeki balonlar:");
				this.sayac2 = 1;
				while (sayac2 <= liste_eleman_sayisi && sayac1 <= uretilecek_olan_balon_sayisi) {
					if (this.gecici1 == null) {
						System.err.println("ekleme yapilamadi.");
						return;
					} else {
						try {
							this.gecici1.Ekle(this.sayac1);
						} catch (NullPointerException e) {
							e.printStackTrace();
							return;
						} catch (Exception e) {
							e.printStackTrace();
							return;
						}
					}
					this.sayac1++;
					this.sayac2++;
				}
				if (this.gecici1 == null) {
					System.err.println("gecici1 null");
					return;
				} else {
					try {
						System.out.println("this.gecici1.toString():" + this.gecici1.toString());
					} catch (NullPointerException e) {
						e.printStackTrace();
						return;
					} catch (Exception e) {
						e.printStackTrace();
						return;
					}
				}
				try {
					this.push_to_bly(this.gecici1);
				} catch (NullPointerException e) {
					e.printStackTrace();
					return;
				}
				this.katNo++;
				// kucuk dongude her bir liste 10 eleman sayisina ulasinca o anki liste
				// yigita atilir, kat no artirilip
				// dongunun basina donulup yeni katin listesi olusturulur.
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		}
	}

	/**
	 * @param gecici1
	 */
	protected void push_to_bly(Bagli_Liste gecici1) {
		this.bly.push_to_yigin(this.gecici1);
	}

	/**
	 * @return
	 */
	protected Stack_Bagli_Liste getBly() {
		return bly;
	}

	/**
	 * @param bly
	 */
	protected void setBly(Stack_Bagli_Liste bly) {
		this.bly = bly;
	}

	/**
	 * @return
	 */
	protected Scanner getStr1() {
		return str1;
	}

	/**
	 * @param str1
	 */
	protected void setStr1(Scanner str1) {
		this.str1 = str1;
	}

	/**
	 * @return
	 */
	protected Scanner getStr2() {
		return str2;
	}

	/**
	 * @param str2
	 */
	protected void setStr2(Scanner str2) {
		this.str2 = str2;
	}

	/**
	 * @return
	 */
	protected int getUretilecek_olan_balon_sayisi() {
		return uretilecek_olan_balon_sayisi;
	}

	/**
	 * @param uretilecek_olan_balon_sayisi
	 */
	protected void setUretilecek_olan_balon_sayisi(int uretilecek_olan_balon_sayisi) {
		this.uretilecek_olan_balon_sayisi = uretilecek_olan_balon_sayisi;
	}

	/**
	 * @return
	 */
	protected int getKacta_bir_patlatilacak() {
		return kacta_bir_cikarilacak;
	}

	/**
	 * @param kacta_bir_patlatilacak
	 */
	protected void setKacta_bir_patlatilacak(int kacta_bir_patlatilacak) {
		this.kacta_bir_cikarilacak = kacta_bir_patlatilacak;
	}

	/**
	 * @return
	 */
	protected int getSayac1() {
		return sayac1;
	}

	/**
	 * @param sayac1
	 */
	protected void setSayac1(int sayac1) {
		this.sayac1 = sayac1;
	}

	/**
	 * @return
	 */
	protected int getSayac2() {
		return sayac2;
	}

	/**
	 * @param sayac2
	 */
	protected void setSayac2(int sayac2) {
		this.sayac2 = sayac2;
	}

	/**
	 * @return
	 */
	protected int getKatNo() {
		return katNo;
	}

	/**
	 * @param katNo
	 */
	protected void setKatNo(int katNo) {
		this.katNo = katNo;
	}

	/**
	 * @return
	 */
	protected int getProblemSayisi() {
		return problemSayisi;
	}

	/**
	 * @param problemSayisi
	 */
	protected void setProblemSayisi(int problemSayisi) {
		this.problemSayisi = problemSayisi;
	}

	/**
	 * @return
	 */
	protected long getProblem_cozum_suresi() {
		return problem_cozum_suresi;
	}

	/**
	 * @param problem_cozum_suresi
	 */
	protected void setProblem_cozum_suresi(long problem_cozum_suresi) {
		this.problem_cozum_suresi = problem_cozum_suresi;
	}

	/**
	 * @return
	 */
	protected long getBaslangic() {
		return baslangic;
	}

	/**
	 * @param baslangic
	 */
	protected void setBaslangic(long baslangic) {
		this.baslangic = baslangic;
	}

	/**
	 * @return
	 */
	protected long getBitis() {
		return bitis;
	}

	/**
	 * @param bitis
	 */
	protected void setBitis(long bitis) {
		this.bitis = bitis;
	}

	/**
	 * @return
	 */
	protected Bagli_Liste getGecici1() {
		return gecici1;
	}

	/**
	 * @param gecici1
	 */
	protected void setGecici1(Bagli_Liste gecici1) {
		this.gecici1 = gecici1;
	}

	/**
	 * @return
	 */
	protected Bagli_Liste getGecici2() {
		return gecici2;
	}

	/**
	 * @param gecici2
	 */
	protected void setGecici2(Bagli_Liste gecici2) {
		this.gecici2 = gecici2;
	}

	/**
	 * @return
	 */
	protected int getListe_eleman_sayisi() {
		return liste_eleman_sayisi;
	}

	/**
	 * @param liste_eleman_sayisi
	 */
	protected void setListe_eleman_sayisi(int liste_eleman_sayisi) {
		this.liste_eleman_sayisi = liste_eleman_sayisi;
	}

	/**
	 * @return
	 */
	protected boolean isYigin_bos_mu() {
		return yigin_bos_mu;
	}

	/**
	 * @param yigin_bos_mu
	 */
	protected void setYigin_bos_mu(boolean yigin_bos_mu) {
		this.yigin_bos_mu = yigin_bos_mu;
	}

	/**
	 * @return
	 */
	protected long getOrtalama_problem_cozum_suresi() {
		return ortalama_problem_cozum_suresi;
	}

	/**
	 * @param ortalama_problem_cozum_suresi
	 */
	protected void setOrtalama_problem_cozum_suresi(long ortalama_problem_cozum_suresi) {
		this.ortalama_problem_cozum_suresi = ortalama_problem_cozum_suresi;
	}

	/**
	 * 
	 */
	protected void init_bly() {
		// TODO Auto-generated method stub
		this.setBly(new Stack_Bagli_Liste());
	}

	/**
	 * @return
	 */
	public static int getCounter() {
		return counter;
	}

	/**
	 * @param counter
	 */
	public static void setCounter(int counter) {
		Problem.counter = counter;
	}

}