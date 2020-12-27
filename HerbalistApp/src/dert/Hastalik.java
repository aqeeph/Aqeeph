package dert;

import java.util.StringTokenizer;

import capsule.Capsule_Vector_String;

//Hastaliklara iliskin bilgiler(Hastalik adi,belirtileri ,nedenleri,tedavisi,onerilen bitkiler )
//Hastalik adi#belirtileri(_ ile tutuluyor)#nedenleri(_ ile tutuluyor)#tedavisi(_ ile tutuluyor)#bilgi_sayisi>>onerilen bitkiler(>> ile tutuluyor)
public class Hastalik {
	/**
	 * 
	 */
	private static StringTokenizer st;
	/**
	 * 
	 */
	private String adi = "";
	/**
	 * 
	 */
	private int bilgi_sayisi;
	
	/**
	 * 
	 */
	private Capsule_Vector_String belirtileri;
	/**
	 * 
	 */
	private Capsule_Vector_String nedenleri;
	/**
	 * 
	 */
	private Capsule_Vector_String tedavisi;
	/**
	 * 
	 */
	private Capsule_Vector_String onerilen_bitkiler;

	/**
	 * @param adi
	 * @param belirtileri
	 * @param nedenleri
	 * @param tedavisi
	 * @param onerilen_bitkiler
	 */
	public Hastalik(String adi, Capsule_Vector_String belirtileri, Capsule_Vector_String nedenleri, Capsule_Vector_String tedavisi,
			Capsule_Vector_String onerilen_bitkiler) {
		setAdi(adi);
		setBelirtileri(belirtileri);
		setNedenleri(nedenleri);
		setTedavisi(tedavisi);
		setOnerilen_bitkiler(onerilen_bitkiler);
	}

	/**
	 * @param adi
	 * @param belirtileri
	 * @param nedenleri
	 * @param tedavisi
	 * @param onerilen_bitkiler
	 */
	public Hastalik(String adi, String belirtileri, String nedenleri, String tedavisi, String onerilen_bitkiler) {
		setAdi(adi);
		System.out.println("adi: " + adi + "\n");
		setBelirtileri(new Capsule_Vector_String());
		setNedenleri(new Capsule_Vector_String());
		setTedavisi(new Capsule_Vector_String());
		setOnerilen_bitkiler(new Capsule_Vector_String());
		setSt(new StringTokenizer(belirtileri, "_"));
		while (getSt().hasMoreTokens()) {
			getBelirtileri().add(getSt().nextToken());// belirtiler ekleniyor
		}
		setSt(new StringTokenizer(nedenleri, "_"));
		while (getSt().hasMoreTokens()) {
			getNedenleri().add(getSt().nextToken());// nedenler ekleniyor
		}
		setSt(new StringTokenizer(tedavisi, "_"));
		while (getSt().hasMoreTokens()) {
			getTedavisi().add(getSt().nextToken());// tedaviler ekleniyor
		}
		setSt(new StringTokenizer(onerilen_bitkiler, ">>"));
		setBilgi_sayisi(Integer.parseInt(getSt().nextToken()));
		while (getSt().hasMoreTokens()) {
			getonerilen_bitkiler().add(getSt().nextToken());// tedaviler ekleniyor
		}
	}

	/**
	 * @return
	 */
	public String getAdi() {
		return adi;
	}

	/**
	 * @param adi
	 */
	public void setAdi(String adi) {
		this.adi = adi;
	}

	/**
	 * @param belirtileri
	 */
	public void setBelirtileri(Capsule_Vector_String belirtileri) {
		this.belirtileri = belirtileri;
	}

	/**
	 * @return
	 */
	public Capsule_Vector_String getBelirtileri() {
		return belirtileri;
	}

	/**
	 * @param nedenleri
	 */
	public void setNedenleri(Capsule_Vector_String nedenleri) {
		this.nedenleri = nedenleri;
	}

	/**
	 * @return
	 */
	public Capsule_Vector_String getNedenleri() {
		return nedenleri;
	}

	/**
	 * @param tedavisi
	 */
	public void setTedavisi(Capsule_Vector_String tedavisi) {
		this.tedavisi = tedavisi;
	}

	/**
	 * @return
	 */
	public Capsule_Vector_String getTedavisi() {
		return tedavisi;
	}

	/**
	 * @param onerilen_bitkiler
	 */
	public void setOnerilen_bitkiler(Capsule_Vector_String onerilen_bitkiler) {
		this.onerilen_bitkiler = onerilen_bitkiler;
	}

	/**
	 * @return
	 */
	public Capsule_Vector_String getonerilen_bitkiler() {
		return getOnerilen_bitkiler();
	}

	/**
	 * @param bilgi_sayisi
	 */
	public void setBilgi_sayisi(int bilgi_sayisi) {
		this.bilgi_sayisi = bilgi_sayisi;
	}

	/**
	 * @return
	 */
	public int getBilgi_sayisi() {
		return bilgi_sayisi;
	}

	/**
	 *
	 */
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Adi              :");
		stringBuilder.append(getAdi());
		stringBuilder.append("\nBelirtileri      :");
		stringBuilder.append(belirtileri_toString());
		stringBuilder.append("\nNedenleri        :");
		stringBuilder.append(nedenleri_toString());
		stringBuilder.append("\nTedavisi         :");
		stringBuilder.append(tedavisi_toString());
		stringBuilder.append("\nOnerilen Bitkiler:");
		stringBuilder.append(onerilen_bitkiler_toString());
		System.out.println(stringBuilder.toString());
		return stringBuilder.toString();
	}

	/**
	 * @param onerilen_bitki
	 */
	public void add_onerilen_bitki(String onerilen_bitki) {
		getOnerilen_bitkiler().add(onerilen_bitki);
	}

	/**
	 * @return
	 */
	private String onerilen_bitkiler_toString() {
		return getOnerilen_bitkiler().toString();
	}

	/**
	 * @param onerilen_tedavi
	 */
	public void add_tedavi(String onerilen_tedavi) {
		getTedavisi().add(onerilen_tedavi);
	}

	/**
	 * @return
	 */
	private String tedavisi_toString() {
		return getTedavisi().toString();
	}

	/**
	 * @param yeni_neden
	 */
	public void add_neden(String yeni_neden) {
		getNedenleri().add(yeni_neden);
	}

	/**
	 * @return
	 */
	private String nedenleri_toString() {
		return getNedenleri().toString();
	}

	/**
	 * @return
	 */
	private String belirtileri_toString() {
		return getBelirtileri().toString();
	}

	/**
	 * @return the st
	 */
	private static StringTokenizer getSt() {
		return st;
	}

	/**
	 * @param st the st to set
	 */
	private static void setSt(StringTokenizer st) {
		Hastalik.st = st;
	}

	/**
	 * @return the onerilen_bitkiler
	 */
	private Capsule_Vector_String getOnerilen_bitkiler() {
		return onerilen_bitkiler;
	}
}