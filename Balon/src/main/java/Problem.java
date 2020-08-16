import java.util.Scanner;

public class Problem {
	private static int counter = 0;// static variable initialization
	private Bagli_Liste_Yigini bly;
	private Scanner str1;
	private Scanner str2;
	private int uretilecek_olan_balon_sayisi;
	private int kacta_bir_cikarilacak;
	private int sayac1;
	private int sayac2;
	private int katNo;
	private int problemSayisi;
	private long problem_cozum_suresi;
	private long baslangic;
	private long bitis;
	private Bagli_Liste gecici1;
	private Bagli_Liste gecici2;
	private int liste_eleman_sayisi;
	private boolean yigin_bos_mu;
	private long ortalama_problem_cozum_suresi;

	public Problem() {
		super();
		this.bly = new Bagli_Liste_Yigini();
		this.sayac1 = 1;
		this.sayac2 = 1;
		this.katNo = 1;
		this.problemSayisi = 0;
		this.liste_eleman_sayisi = 10;
		++Problem.counter;
	}

	protected void hesaplama_suresini_yazdir() {
		if (this.problem_cozum_suresi == 0) {
			System.out.println("Problemin cozum suresi, sistem saatinin algilayabilecegi kadar buyuk degil.");
		} else {
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("\n\n" + this.problemSayisi + " this.problem cozuldu.");
			this.ortalama_problem_cozum_suresi = this.problem_cozum_suresi / (long) this.problemSayisi;
			System.out.println(
					"1 adet problem yaklasik " + this.ortalama_problem_cozum_suresi + " milisaniyede cozuldu.");
			System.out.println("1 saniyede cozulebilecek balon problemi sayisi	= "
					+ (long) 1000 * this.problemSayisi / this.problem_cozum_suresi);
		}
	}

	protected void coz() {
		this.baslangic = System.currentTimeMillis(); // sistem saati degeri milisaniye olarak alindi.
		this.yigin_bos_mu = this.blynin_yigini_bos_mu();
		while (!this.yigin_bos_mu) {
			this.gecici2 = bly.pop_from_yigin();
			if (gecici2 != null) {
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

	private boolean blynin_yigini_bos_mu() {
		return this.bly.yigin_bos_mu();
	}

	protected void kac_tanede_bir_yigindan_cikarilacak() {
		do {
			System.out.println("n degerini (kac dugumde bir yigindan cikarma isleminin yapilacagini) giriniz:");
			this.str2 = new Scanner(System.in);
			this.kacta_bir_cikarilacak = str2.nextInt();
		} while (this.kacta_bir_cikarilacak <= 0);
		// girdiler alindi.
	}

	protected void node_sayisini_kullanicidan_al() {
		do {
			System.out.println("m degerini (balon sayisini) giriniz:");
			this.str1 = new Scanner(System.in);
			this.uretilecek_olan_balon_sayisi = str1.nextInt();
		} while (this.uretilecek_olan_balon_sayisi <= 0);
	}

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

	protected void push_to_bly(Bagli_Liste gecici1) {
		this.bly.push_to_yigin(this.gecici1);
	}

	protected Bagli_Liste_Yigini getBly() {
		return bly;
	}

	protected void setBly(Bagli_Liste_Yigini bly) {
		this.bly = bly;
	}

	protected Scanner getStr1() {
		return str1;
	}

	protected void setStr1(Scanner str1) {
		this.str1 = str1;
	}

	protected Scanner getStr2() {
		return str2;
	}

	protected void setStr2(Scanner str2) {
		this.str2 = str2;
	}

	protected int getUretilecek_olan_balon_sayisi() {
		return uretilecek_olan_balon_sayisi;
	}

	protected void setUretilecek_olan_balon_sayisi(int uretilecek_olan_balon_sayisi) {
		this.uretilecek_olan_balon_sayisi = uretilecek_olan_balon_sayisi;
	}

	protected int getKacta_bir_patlatilacak() {
		return kacta_bir_cikarilacak;
	}

	protected void setKacta_bir_patlatilacak(int kacta_bir_patlatilacak) {
		this.kacta_bir_cikarilacak = kacta_bir_patlatilacak;
	}

	protected int getSayac1() {
		return sayac1;
	}

	protected void setSayac1(int sayac1) {
		this.sayac1 = sayac1;
	}

	protected int getSayac2() {
		return sayac2;
	}

	protected void setSayac2(int sayac2) {
		this.sayac2 = sayac2;
	}

	protected int getKatNo() {
		return katNo;
	}

	protected void setKatNo(int katNo) {
		this.katNo = katNo;
	}

	protected int getProblemSayisi() {
		return problemSayisi;
	}

	protected void setProblemSayisi(int problemSayisi) {
		this.problemSayisi = problemSayisi;
	}

	protected long getProblem_cozum_suresi() {
		return problem_cozum_suresi;
	}

	protected void setProblem_cozum_suresi(long problem_cozum_suresi) {
		this.problem_cozum_suresi = problem_cozum_suresi;
	}

	protected long getBaslangic() {
		return baslangic;
	}

	protected void setBaslangic(long baslangic) {
		this.baslangic = baslangic;
	}

	protected long getBitis() {
		return bitis;
	}

	protected void setBitis(long bitis) {
		this.bitis = bitis;
	}

	protected Bagli_Liste getGecici1() {
		return gecici1;
	}

	protected void setGecici1(Bagli_Liste gecici1) {
		this.gecici1 = gecici1;
	}

	protected Bagli_Liste getGecici2() {
		return gecici2;
	}

	protected void setGecici2(Bagli_Liste gecici2) {
		this.gecici2 = gecici2;
	}

	protected int getListe_eleman_sayisi() {
		return liste_eleman_sayisi;
	}

	protected void setListe_eleman_sayisi(int liste_eleman_sayisi) {
		this.liste_eleman_sayisi = liste_eleman_sayisi;
	}

	protected boolean isYigin_bos_mu() {
		return yigin_bos_mu;
	}

	protected void setYigin_bos_mu(boolean yigin_bos_mu) {
		this.yigin_bos_mu = yigin_bos_mu;
	}

	protected long getOrtalama_problem_cozum_suresi() {
		return ortalama_problem_cozum_suresi;
	}

	protected void setOrtalama_problem_cozum_suresi(long ortalama_problem_cozum_suresi) {
		this.ortalama_problem_cozum_suresi = ortalama_problem_cozum_suresi;
	}

	protected void init_bly() {
		// TODO Auto-generated method stub
		this.setBly(new Bagli_Liste_Yigini());
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Problem.counter = counter;
	}

}