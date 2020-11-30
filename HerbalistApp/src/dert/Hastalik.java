package dert;

import java.util.StringTokenizer;
import java.util.Vector;

//Hastaliklara iliskin bilgiler(Hastalik adi,belirtileri ,nedenleri,tedavisi,onerilen bitkiler )
//Hastalik adi#belirtileri(_ ile tutuluyor)#nedenleri(_ ile tutuluyor)#tedavisi(_ ile tutuluyor)#bilgi_sayisi>>onerilen bitkiler(>> ile tutuluyor)
public class Hastalik {
	public static StringTokenizer st;
	private String adi = "";
	private int bilgi_sayisi;
	private Vector<String> belirtileri, nedenleri, tedavisi, onerilen_bitkiler;

	public Hastalik(String adi, Vector<String> belirtileri, Vector<String> nedenleri, Vector<String> tedavisi,
			Vector<String> onerilen_bitkiler) {
		setAdi(adi);
		setBelirtileri(belirtileri);
		setNedenleri(nedenleri);
		setTedavisi(tedavisi);
		setOnerilen_bitkiler(onerilen_bitkiler);
	}

	public Hastalik(String adi, String belirtileri, String nedenleri, String tedavisi, String onerilen_bitkiler) {
		setAdi(adi);
		System.out.println("adi: " + adi + "\n");
		setBelirtileri(new Vector<String>());
		setNedenleri(new Vector<String>());
		setTedavisi(new Vector<String>());
		setOnerilen_bitkiler(new Vector<String>());
		st = new StringTokenizer(belirtileri, "_");
		while (st.hasMoreTokens()) {
			getBelirtileri().add(st.nextToken());// belirtiler ekleniyor
		}
		st = new StringTokenizer(nedenleri, "_");
		while (st.hasMoreTokens()) {
			getNedenleri().add(st.nextToken());// nedenler ekleniyor
		}
		st = new StringTokenizer(tedavisi, "_");
		while (st.hasMoreTokens()) {
			getTedavisi().add(st.nextToken());// tedaviler ekleniyor
		}
		st = new StringTokenizer(onerilen_bitkiler, ">>");
		setBilgi_sayisi(Integer.parseInt(st.nextToken()));
		while (st.hasMoreTokens()) {
			getonerilen_bitkiler().add(st.nextToken());// tedaviler ekleniyor
		}
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public void setBelirtileri(Vector<String> belirtileri) {
		this.belirtileri = belirtileri;
	}

	public Vector<String> getBelirtileri() {
		return belirtileri;
	}

	public void setNedenleri(Vector<String> nedenleri) {
		this.nedenleri = nedenleri;
	}

	public Vector<String> getNedenleri() {
		return nedenleri;
	}

	public void setTedavisi(Vector<String> tedavisi) {
		this.tedavisi = tedavisi;
	}

	public Vector<String> getTedavisi() {
		return tedavisi;
	}

	public void setOnerilen_bitkiler(Vector<String> onerilen_bitkiler) {
		this.onerilen_bitkiler = onerilen_bitkiler;
	}

	public Vector<String> getonerilen_bitkiler() {
		return onerilen_bitkiler;
	}

	public void setBilgi_sayisi(int bilgi_sayisi) {
		this.bilgi_sayisi = bilgi_sayisi;
	}

	public int getBilgi_sayisi() {
		return bilgi_sayisi;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Adi              :");
		stringBuilder.append(adi);
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

	public void add_onerilen_bitki(String onerilen_bitki) {
		onerilen_bitkiler.add(onerilen_bitki);
	}

	private String onerilen_bitkiler_toString() {
		String metin = "";
		for (int i = 0; i < onerilen_bitkiler.size(); i++) {
			metin += onerilen_bitkiler.elementAt(i);
		}
		return metin;
	}

	public void add_tedavi(String onerilen_tedavi) {
		tedavisi.add(onerilen_tedavi);
	}

	private String tedavisi_toString() {
		String metin = "";
		for (int i = 0; i < tedavisi.size(); i++) {
			metin += tedavisi.elementAt(i);
		}
		return metin;
	}

	public void add_neden(String yeni_neden) {
		nedenleri.add(yeni_neden);
	}

	private String nedenleri_toString() {
		String metin = "";
		for (int i = 0; i < nedenleri.size(); i++) {
			metin += nedenleri.elementAt(i);
		}
		return metin;
	}

	private String belirtileri_toString() {
		String metin = "";
		for (int i = 0; i < belirtileri.size(); i++) {
			metin += belirtileri.elementAt(i);
		}
		return metin;
	}
}