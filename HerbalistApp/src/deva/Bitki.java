package deva;

import java.util.StringTokenizer;

import veri_tabani.Veritabani_Listesi;

//Bitkiye iliskin bilgiler(bitki adi, kategori_no,bitkinin latince ismi,bitkinin ozellikleri,
//miktari,fiyati,bitki resminin diskteki yeri ve adi,bilgi sayisi(onerilen hastaliklar icin),
//onerilen hastaliklar)
// Bitkiye iliskin bilgiler(dosyadaki hali)(bitki adi# kategori_no(bitkiler icin 0,bitki
// caylari icin 1,vitaminler icin 2)#bitkinin latince ismi#bitkinin
// ozellikleri( _ ile ayrilidir)#miktari#fiyati#bitki resminin diskteki
// yeri#bitki resminin diskteki adi#bilgi sayisi(onerilen hastaliklar
// icin)#onerilen hastaliklar(>>ile ayrilmistir)
/**
 * @author MehmetAkif-PC
 *
 */
public class Bitki {
	private static int node_sayisi = 0;
	private String adi = "asd", latince_adi = "", diskteki_yeri = "", diskteki_adi = "";
	private int miktari;// paket cinsinden
	private float fiyati;
	private int kategori_no;
	private Vector_string onerilen_hastaliklar;
	private Vector_string ozellikleri;

	/**
	 * @param adi
	 * @param latince_adi
	 * @param diskteki_yeri
	 * @param diskteki_adi
	 * @param miktari
	 * @param fiyati
	 * @param kategori_no
	 * @param onerilen_hastaliklar
	 * @param ozellikleri
	 */
	public Bitki(String adi, String latince_adi, String diskteki_yeri, String diskteki_adi, int miktari, float fiyati,
			int kategori_no, Vector_string onerilen_hastaliklar, Vector_string ozellikleri) {
		super();
		this.adi = adi;
		this.latince_adi = latince_adi;
		this.diskteki_yeri = diskteki_yeri;
		this.diskteki_adi = diskteki_adi;
		this.miktari = miktari;
		this.fiyati = fiyati;
		this.kategori_no = kategori_no;
		this.onerilen_hastaliklar = onerilen_hastaliklar;
		this.ozellikleri = ozellikleri;
	}

	/**
	 * @param adi
	 * @param kategori
	 * @param latince_adi
	 * @param miktari
	 * @param fiyati
	 * @param diskteki_yeri
	 * @param diskteki_adi
	 * @param onerilen_hastaliklar
	 * @param ozellikleri
	 */
	public Bitki(String adi, String kategori, String latince_adi, int miktari, float fiyati, String diskteki_yeri,
			String diskteki_adi, Vector_string onerilen_hastaliklar, Vector_string ozellikleri) {
		setAdi(adi);
		setKategori(Integer.parseInt(kategori));
		setLatince_adi(latince_adi);
		setMiktari(miktari);
		setFiyati(fiyati);
		setDiskteki_yeri(diskteki_yeri);
		setDiskteki_adi(diskteki_adi);
		setonerilen_hastaliklar(onerilen_hastaliklar);
		setozellikleri(ozellikleri);
	}

	/**
	 * @param adi
	 * @param kategori
	 * @param latince_adi
	 * @param ozellikleri
	 * @param miktari
	 * @param fiyati
	 * @param diskteki_yeri
	 * @param diskteki_adi
	 */
	public Bitki(String adi, String kategori, String latince_adi, String ozellikleri, String miktari, String fiyati,
			String diskteki_yeri, String diskteki_adi) {
		setAdi(adi);
		setKategori(Integer.parseInt(kategori));
		setLatince_adi(latince_adi);
		setMiktari(Integer.parseInt(miktari));
		setFiyati(Float.parseFloat(fiyati));
		setDiskteki_yeri(diskteki_yeri);
		setDiskteki_adi(diskteki_adi);
		hastaliklari_ekle();
		ozellikleri_ekle(ozellikleri);
	}

	/**
	 * @return the kategori_no
	 */
	public int getKategori_no() {
		return kategori_no;
	}

	/**
	 * @param kategori_no the kategori_no to set
	 */
	public void setKategori_no(int kategori_no) {
		this.kategori_no = kategori_no;
	}

	/**
	 * @return the onerilen_hastaliklar
	 */
	public Vector_string getOnerilen_hastaliklar() {
		return onerilen_hastaliklar;
	}

	/**
	 * @param onerilen_hastaliklar the onerilen_hastaliklar to set
	 */
	public void setOnerilen_hastaliklar(Vector_string onerilen_hastaliklar) {
		this.onerilen_hastaliklar = onerilen_hastaliklar;
	}

	/**
	 * @return the ozellikleri
	 */
	public Vector_string getOzellikleri() {
		return ozellikleri;
	}

	/**
	 * @param ozellikleri the ozellikleri to set
	 */
	public void setOzellikleri(Vector_string ozellikleri) {
		this.ozellikleri = ozellikleri;
	}

	/**
	 * 
	 */
	private void hastaliklari_ekle() {
		setonerilen_hastaliklar(new Vector_string());
	}

	/**
	 * @param ozellikleri
	 */
	private void ozellikleri_ekle(String ozellikleri) {
		setozellikleri(new Vector_string());
		StringTokenizer st3 = new StringTokenizer(ozellikleri, "_");
		while (st3.hasMoreTokens()) {
			ozellik_ekle(st3);
		}
	}

	/**
	 * @param st3
	 */
	private void ozellik_ekle(StringTokenizer st3) {
		getozellikleri().add(st3.nextToken());// ozellik ekleniyor
	}

	@SuppressWarnings("unused")
	private void hastalik_ekle(StringTokenizer st3) {
		onerilen_hastaliklar.add(st3.nextToken());// hastalik ekleniyor
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public int getKategori() {
		return kategori_no;
	}

	public void setKategori(int kategori) {
		this.kategori_no = kategori;
	}

	public String getLatince_adi() {
		return latince_adi;
	}

	public void setLatince_adi(String latince_adi) {
		this.latince_adi = latince_adi;
	}

	public String getDiskteki_yeri() {
		return diskteki_yeri;
	}

	public void setDiskteki_yeri(String diskteki_yeri) {
		this.diskteki_yeri = diskteki_yeri;
	}

	public String getDiskteki_adi() {
		return diskteki_adi;
	}

	public void setDiskteki_adi(String diskteki_adi) {
		this.diskteki_adi = diskteki_adi;
	}

	public int getMiktari() {
		return miktari;
	}

	public void setMiktari(int miktari) {
		this.miktari = miktari;
	}

	public float getFiyati() {
		return fiyati;
	}

	public void setFiyati(float fiyati) {
		this.fiyati = fiyati;
	}

	public Vector_string getonerilen_hastaliklar() {
		return onerilen_hastaliklar;
	}

	public void setonerilen_hastaliklar(Vector_string onerilen_hastaliklar) {
		this.onerilen_hastaliklar = onerilen_hastaliklar;
	}

	public Vector_string getozellikleri() {
		return ozellikleri;
	}

	public void setozellikleri(Vector_string ozellikleri) {
		this.ozellikleri = ozellikleri;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Adi           : ");
		stringBuilder.append(adi);
		stringBuilder.append("\nKategori      : ");
		stringBuilder.append(Veritabani_Listesi.kategorisi(getKategori()));
		stringBuilder.append("\nLatince adi   : ");
		stringBuilder.append(latince_adi);
		stringBuilder.append("\nozellikleri   : ");
		stringBuilder.append(ozellikleri_toString());
		stringBuilder.append("\n\nDiskteki Yeri : ");
		stringBuilder.append(diskteki_yeri);
		stringBuilder.append("\nDiskteki Adi  : ");
		stringBuilder.append(diskteki_adi);
		stringBuilder.append("\nMiktari       : ");
		stringBuilder.append(miktari);
		stringBuilder.append(" Paket");
		stringBuilder.append("\nFiyati        : ");
		stringBuilder.append(fiyati);
		stringBuilder.append("\n\nonerilen Hastaliklar\n");
		stringBuilder.append(onerilen_hastaliklar_toString());
		return stringBuilder.toString();
	}

	public String onerilen_hastaliklar_toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < onerilen_hastaliklar.size(); i++) {
			stringBuilder.append("\n" + onerilen_hastaliklar.elementAt(i));
		}
		return stringBuilder.toString();
	}

	public String ozellikleri_toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < ozellikleri.size(); i++) {
			stringBuilder.append("\n" + ozellikleri.elementAt(i));
		}
		return stringBuilder.toString();
	}

	public static int getNode_sayisi() {
		return node_sayisi;
	}

	public static void setNode_sayisi(int node_sayisi) {
		Bitki.node_sayisi = node_sayisi;
	}

}