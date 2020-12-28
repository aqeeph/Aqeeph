package main.java.problem;

import main.java.bagli_liste.Bagli_Liste_Node_Balon;
import main.java.bagli_liste.Stack_Bagli_Liste_balon;
import java.util.Scanner;

/**
 * @author MehmetAkif-PC
 *
 */
public class Problem {
	/**
	 * 
	 */
	private static final int MINIMUM_PROBLEM_COZUM_SURESI = 0;
	/**
	 * 
	 */
	private static final int MINIMUM_CIKARMA_DEGERI = 1;
	/**
	 * 
	 */
	private static int counter = 0;// static variable initialization
	/**
	 * 
	 */
	private Stack_Bagli_Liste_balon bly;
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
	private Bagli_Liste_Node_Balon gecici1;
	/**
	 * 
	 */
	private Bagli_Liste_Node_Balon gecici2;
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
	public Problem(Stack_Bagli_Liste_balon bly, Scanner str1, Scanner str2, int uretilecek_olan_balon_sayisi,
			int kacta_bir_cikarilacak, int sayac1, int sayac2, int katNo, int problemSayisi, long problem_cozum_suresi,
			long baslangic, Bagli_Liste_Node_Balon gecici1, Bagli_Liste_Node_Balon gecici2, int liste_eleman_sayisi,
			boolean yigin_bos_mu, long ortalama_problem_cozum_suresi) {
		super();
		this.setBly(bly);
		this.setStr1(str1);
		this.setStr2(str2);
		this.setUretilecek_olan_balon_sayisi(uretilecek_olan_balon_sayisi);
		this.setKacta_bir_cikarilacak(kacta_bir_cikarilacak);
		this.setSayac1(sayac1);
		this.setSayac2(sayac2);
		this.setKatNo(katNo);
		this.setProblemSayisi(problemSayisi);
		this.setProblem_cozum_suresi(problem_cozum_suresi);
		this.setBaslangic(baslangic);
		this.setGecici1(gecici1);
		this.setGecici2(gecici2);
		this.setListe_eleman_sayisi(liste_eleman_sayisi);
		this.setYigin_bos_mu(yigin_bos_mu);
		this.setOrtalama_problem_cozum_suresi(ortalama_problem_cozum_suresi);
	}

	/**
	 * 
	 */
	public Problem() {
		super();
		this.setBly(new Stack_Bagli_Liste_balon());
		this.setSayac1(1);
		this.setSayac2(1);
		this.setKatNo(1);
		this.setProblemSayisi(0);
		this.setListe_eleman_sayisi(10);
		Problem.setCounter(Problem.getCounter() + 1);
	}

	/**
	 * 
	 */
	protected void hesaplama_suresini_yazdir() {
		@SuppressWarnings("unused")
		long saniye_as_nano=1000000000;
		if (this.getProblem_cozum_suresi() == getMinimumProblemCozumSuresi()) {
			System.out.println("Problemin cozum suresi, sistem saatinin algilayabilecegi kadar buyuk degil.");
		} else {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("----------------------------------------------------------------------------");
			stringBuilder.append("\n\n" + this.getProblemSayisi() + "problem cozuldu.");
			ortalama_problem_cozum_suresini_hesapla();
			stringBuilder
					.append("1 adet problem yaklasik " + this.getOrtalama_problem_cozum_suresi() + " nanosaniyede cozuldu.");
//			stringBuilder.append("1 saniyede cozulebilecek ortalama balon problemi sayisi	= "
//					+ saniye_as_nano * this.problemSayisi / this.problem_cozum_suresi);
			System.out.println(stringBuilder.toString());
		}
	}

	/**
	 * 
	 */
	private void ortalama_problem_cozum_suresini_hesapla() {
		this.setOrtalama_problem_cozum_suresi(this.getProblem_cozum_suresi() / (long) this.getProblemSayisi());
	}

	/**
	 * 
	 */
	protected void coz() {
		this.setBaslangic(System.nanoTime()); // sistem saati degeri milisaniye olarak alindi.
		//System.err.println("coz() started");
		this.setYigin_bos_mu(this.blynin_yigini_bos_mu());
		while (!this.isYigin_bos_mu()) {
			this.setGecici2(this.getBly().pop_from_yigin());
			if (this.getGecici2() != null) {
				try {
					this.getGecici2().patlat(getKacta_bir_cikarilacak());
				} catch (NullPointerException e) {
					e.printStackTrace();
					System.exit(0);
					return;
				}
				this.setProblemSayisi(this.getProblemSayisi() + 1);
			}
			this.setYigin_bos_mu(this.blynin_yigini_bos_mu());
		} // yigit bosalana kadar her bir eleman gecici listeye atilip patlat metoduna
			// maruz
			// birakildi ve her bir liste bir balon problemi sayildi.
		//System.err.println("coz() finished");
		this.setProblem_cozum_suresi(System.nanoTime() - this.getBaslangic());
		if(this.getProblem_cozum_suresi()==0) {System.out.println("saatte hata var");}
	}

	/**
	 * @return
	 */
	private boolean blynin_yigini_bos_mu() {
		return this.getBly().yigin_bos_mu();
	}

	/**
	 * 
	 */
	protected void kac_tanede_bir_stackden_cikarilacak() {
		do {
			System.out.println("n degerini (kac dugumde bir yigindan cikarma isleminin yapilacagini) giriniz:");
			this.setStr2(new Scanner(System.in));
			this.setKacta_bir_cikarilacak(getStr2().nextInt());
		} while (this.getKacta_bir_cikarilacak() < getMinimumCikarmaDegeri());
		// girdiler alindi.
	}

	/**
	 * 
	 */
	protected void node_sayisini_kullanicidan_al() {
		do {
			System.out.println("m degerini (balon sayisini) giriniz:");
			this.setStr1(new Scanner(System.in));
			this.setUretilecek_olan_balon_sayisi(getStr1().nextInt());
		} while (this.getUretilecek_olan_balon_sayisi() <= 0);
	}

	/**
	 * 
	 */
	protected void insert_item_to_bly() {
		//System.err.println("insert_item_to_bly() started");
		try {
			while (getSayac1() <= getUretilecek_olan_balon_sayisi()) {
				this.setGecici1(new Bagli_Liste_Node_Balon(getKatNo()));// gruplama araci
				System.out.println("\n" + getKatNo() + ". kattaki bagli listedeki balonlar:");
				this.setSayac2(1);
				if (this.getGecici1() == null) {
					//System.err.println("bagli listeye ekleme yapilamadi.");
					System.exit(0);
					return;
				} else {
					while (getSayac2() <= getListe_eleman_sayisi() && getSayac1() <= getUretilecek_olan_balon_sayisi()) {
						try {
							this.getGecici1().Ekle(this.getSayac1());
						} catch (NullPointerException e) {
							e.printStackTrace();
							System.exit(0);
							return;
						} catch (Exception e) {
							e.printStackTrace();
							System.exit(0);
							return;
						}
						this.setSayac1(this.getSayac1() + 1);
						this.setSayac2(this.getSayac2() + 1);
					}
					try {
						System.out.println("this.gecici1.dolas():" + this.getGecici1().dolas());
					} catch (NullPointerException e) {
						e.printStackTrace();
						System.exit(0);
						return;
					} catch (Exception e) {
						e.printStackTrace();
						System.exit(0);
						return;
					}
					try {
						this.push_to_bly(this.getGecici1());
					} catch (NullPointerException e) {
						e.printStackTrace();
						System.exit(0);
						return;
					}
					this.setKatNo(this.getKatNo() + 1);
					// kucuk dongude her bir liste 10 eleman sayisina ulasinca o anki liste
					// yigita atilir, kat no artirilip
					// dongunun basina donulup yeni katin listesi olusturulur.
				}
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(0);
			return;
		}
		//System.err.println("insert_item_to_bly() finished");
	}

	/**
	 * @param gecici1
	 */
	protected void push_to_bly(Bagli_Liste_Node_Balon gecici1) {
		this.getBly().push_to_yigin(this.getGecici1());
	}

	/**
	 * @return
	 */
	protected Stack_Bagli_Liste_balon getBly() {
		return bly;
	}

	/**
	 * @param bly
	 */
	protected void setBly(Stack_Bagli_Liste_balon bly) {
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
		return getKacta_bir_cikarilacak();
	}

	/**
	 * @param kacta_bir_patlatilacak
	 */
	protected void setKacta_bir_patlatilacak(int kacta_bir_patlatilacak) {
		this.setKacta_bir_cikarilacak(kacta_bir_patlatilacak);
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
	protected Bagli_Liste_Node_Balon getGecici1() {
		return gecici1;
	}

	/**
	 * @param gecici1
	 */
	protected void setGecici1(Bagli_Liste_Node_Balon gecici1) {
		this.gecici1 = gecici1;
	}

	/**
	 * @return
	 */
	protected Bagli_Liste_Node_Balon getGecici2() {
		return gecici2;
	}

	/**
	 * @param gecici2
	 */
	protected void setGecici2(Bagli_Liste_Node_Balon gecici2) {
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
	protected boolean isStack_bos_mu() {
		return isYigin_bos_mu();
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
		this.setBly(new Stack_Bagli_Liste_balon());
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Problem [bly=");
		builder.append(getBly());
		builder.append(", str1=");
		builder.append(getStr1());
		builder.append(", str2=");
		builder.append(getStr2());
		builder.append(", uretilecek_olan_balon_sayisi=");
		builder.append(getUretilecek_olan_balon_sayisi());
		builder.append(", kacta_bir_cikarilacak=");
		builder.append(getKacta_bir_cikarilacak());
		builder.append(", sayac1=");
		builder.append(getSayac1());
		builder.append(", sayac2=");
		builder.append(getSayac2());
		builder.append(", katNo=");
		builder.append(getKatNo());
		builder.append(", problemSayisi=");
		builder.append(getProblemSayisi());
		builder.append(", problem_cozum_suresi=");
		builder.append(getProblem_cozum_suresi());
		builder.append(", baslangic=");
		builder.append(getBaslangic());
		builder.append(", gecici1=");
		builder.append(getGecici1());
		builder.append(", gecici2=");
		builder.append(getGecici2());
		builder.append(", liste_eleman_sayisi=");
		builder.append(getListe_eleman_sayisi());
		builder.append(", yigin_bos_mu=");
		builder.append(isYigin_bos_mu());
		builder.append(", ortalama_problem_cozum_suresi=");
		builder.append(getOrtalama_problem_cozum_suresi());
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the minimumProblemCozumSuresi
	 */
	private static int getMinimumProblemCozumSuresi() {
		return MINIMUM_PROBLEM_COZUM_SURESI;
	}

	/**
	 * @return the minimumCikarmaDegeri
	 */
	private static int getMinimumCikarmaDegeri() {
		return MINIMUM_CIKARMA_DEGERI;
	}

	/**
	 * @return the kacta_bir_cikarilacak
	 */
	private int getKacta_bir_cikarilacak() {
		return kacta_bir_cikarilacak;
	}

	/**
	 * @param kacta_bir_cikarilacak the kacta_bir_cikarilacak to set
	 */
	private void setKacta_bir_cikarilacak(int kacta_bir_cikarilacak) {
		this.kacta_bir_cikarilacak = kacta_bir_cikarilacak;
	}

	/**
	 * @return the yigin_bos_mu
	 */
	private boolean isYigin_bos_mu() {
		return yigin_bos_mu;
	}

}