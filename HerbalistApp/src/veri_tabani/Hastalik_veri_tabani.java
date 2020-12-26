package veri_tabani;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import capsule.Capsule_Vector_Hastalik;
import dert.Hastalik;

public class Hastalik_veri_tabani {
	private Capsule_Vector_Hastalik hastaliklar;
	/**
	 * @return the hastaliklar
	 */
	public Capsule_Vector_Hastalik getHastaliklar() {
		return this.hastaliklar;
	}
	/**
	 * @param hastaliklar the hastaliklar to set
	 */
	public void setHastaliklar(Capsule_Vector_Hastalik hastaliklar) {
		this.hastaliklar = hastaliklar;
	}

	private String kullandigi_dosya = "";

	// Hastaliklara ili�kin bilgiler(Hastalik adi,belirtileri
	// ,nedenleri,tedavisi,onerilen bitkiler )
	// Hastalik adi#belirtileri(_ ile tutuluyor)#nedenleri(_ ile
	// tutuluyor)#tedavisi(_ ile tutuluyor)#bilgi_sayisi>>onerilen bitkiler(>>
	// ile tutuluyor)
	public static Capsule_Vector_Hastalik dosya_oku(final String fileName) {
		// burada tanimliyoruz boylece finally blogunda gorulebiliyor
		BufferedReader input = null;
		Capsule_Vector_Hastalik hastaliklar = new Capsule_Vector_Hastalik();
		try {
			// her okumada tek satir okuyacak sekilde kullanabilecegimiz yapi
			input = new BufferedReader(new FileReader(fileName));

			String line = null; // while dongusu icinde tanimlamiyoruz
			Hastalik hastalik;
			StringTokenizer st;
			while ((line = input.readLine()) != null) {
				st = new StringTokenizer(line, "#");
				hastalik = new Hastalik(st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken());
				hastaliklar.add(hastalik);
			}
		} catch (final FileNotFoundException ex) {
			// Dosya bulunamadi hatasi
			// Bir hata olusursa ekrana yaziyoruz
			ex.printStackTrace();
		} catch (final IOException ex) {
			// Herhangi bir i/O hatasi
			// Bir hata olusursa ekrana yaziyoruz
			ex.printStackTrace();
		} finally {
			try {
				if (input != null) {
					// actigimiz dosyayi kapatmaliyiz
					input.close();
				}
			} catch (final IOException ex) {
				// Bir hata olusursa ekrana yaziyoruz
				ex.printStackTrace();
			}
		}
		return hastaliklar;
	}
	public Hastalik_veri_tabani(String dosya_adi) {
		this.hastaliklar = new Capsule_Vector_Hastalik();
		this.kullandigi_dosya=dosya_adi;
		this.hastaliklar=dosya_oku(kullandigi_dosya);
	}

	public Hastalik_veri_tabani() {
		// TODO Auto-generated constructor stub
	}

	public void setKullandigi_dosya(String kullandigi_dosya) {
		this.kullandigi_dosya = kullandigi_dosya;
	}

	public String getKullandigi_dosya() {
		return kullandigi_dosya;
	}

	// Hastaliklara iliskin bilgiler(Hastalik adi,belirtileri
	// ,nedenleri,tedavisi,Onerilen bitkiler )
	// Hastalik adi#belirtileri(_ ile tutuluyor)#nedenleri(_ ile
	// tutuluyor)#tedavisi(_ ile tutuluyor)#bilgi_sayisi>>Onerilen bitkiler(>>
	// ile tutuluyor)

	public synchronized void update_file() {
		String metin = "";
		Hastalik hastalik;

		try {
			final BufferedWriter out = new BufferedWriter(new FileWriter(getKullandigi_dosya()));
			final PrintWriter pw = new PrintWriter(out);
			// buffer icin flussh metodu var
			for (int i = 0; i < hastaliklar.size(); i++) {
				hastalik = hastaliklar.elementAt(i);
				metin += hastalik.getAdi() + "#" + hastaligin_belirtileri(hastalik) + "#"
						+ hastaligin_nedenleri(hastalik) + "#" + hastaligin_tedavisi(hastalik) + "#"
						+ hastalik.getBilgi_sayisi();
				if (hastalik.getonerilen_bitkiler().size() != 0) {
					metin += faydali_olabilecek_bitkiler(hastalik);
				}
				pw.println(metin);
				pw.flush();
				metin = "";
			}
			out.close();
		} catch (final IOException e) {
		}
	}

	private String faydali_olabilecek_bitkiler(Hastalik hastalik) {
		String metin = "";
		for (int i = 1; i < hastalik.getonerilen_bitkiler().size(); i++) {
			metin += ">>" + hastalik.getonerilen_bitkiler().elementAt(i);
		}
		return metin;
	}

	private String hastaligin_tedavisi(Hastalik hastalik) {
		String metin = "";
		for (int i = 0; i < hastalik.getTedavisi().size(); i++) {
			metin += "_" + hastalik.getTedavisi().elementAt(i);
		}
		return metin;
	}

	private String hastaligin_nedenleri(Hastalik hastalik) {
		String metin = "";
		for (int i = 0; i < hastalik.getNedenleri().size(); i++) {
			metin += "_" + hastalik.getNedenleri().elementAt(i);
		}
		return metin;
	}

	private String hastaligin_belirtileri(Hastalik hastalik) {
		String metin = "";
		for (int i = 0; i < hastalik.getBelirtileri().size(); i++) {
			metin += "_" + hastalik.getBelirtileri().elementAt(i);
		}
		return metin;
	}

	public String toString() {
		return hastaliklar.toString();
	}
	// Hastalik arama ve ekleme islemleri hash table ile is birligi icerisinde
	// yapiliyor
}