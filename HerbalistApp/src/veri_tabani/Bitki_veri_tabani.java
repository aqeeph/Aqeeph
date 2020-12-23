package veri_tabani;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import deva.Bitki;

/**
 * @author MehmetAkif-PC
 *
 */
public class Bitki_veri_tabani {
	private static Capsule_Vector_Bitki vector_bitki;
	private String kullandigi_dosya = "";

	/**
	 * @param dosya_adi
	 */
	public Bitki_veri_tabani(String dosya_adi) {
		vector_bitki = new Capsule_Vector_Bitki();
		kullandigi_dosya=dosya_adi;
		try {
			vector_bitki=Bitki_veri_tabani.dosya_oku(kullandigi_dosya);
		} catch (Exception e) {
			System.out.println("hata var");
			e.printStackTrace();
			System.exit(0);
		}
	}
	/**
	 * 
	 */
	public Bitki_veri_tabani() {
		setVector_bitki(new Capsule_Vector_Bitki());
	}

	/**
	 * @return
	 */
	public String getKullandigi_dosya() {
		return kullandigi_dosya;
	}

	/**
	 * @param kullandigi_dosya
	 */
	public void setKullandigi_dosya(String kullandigi_dosya) {
		this.kullandigi_dosya = kullandigi_dosya;
	}

	// Bitkiye iliskin bilgiler(bitki adi# kategori(bitkiler icin 0,bitki
	// caylari icin 1,vitaminler icin 2)#bitkinin latince ismi#bitkinin
	// ozellikleri( _ ile ayrilidir)#miktari#fiyati#bitki resminin diskteki
	// yeri#bitki resminin diskteki adi#bilgi sayisi(onerilen hastaliklar
	// icin)#onerilen hastaliklar(>>ile ayrilmistir)
	/**
	 * 
	 */
	public synchronized void add_botan() {
		// bitki yoksa ekleme yapilamalidir

		String bitki_adi = "", yeni_bitkinin_adi = "";
		int bitki_zaten_var_mi = 0;
		int evet = 1, hayir = 0;

		// Burasi ust menude yapilamali
		for (int i = 0; i < vector_bitki.size(); i++) {
			bitki_adi = vector_bitki.elementAt(i).getAdi();
			if (yeni_bitkinin_adi.compareTo(bitki_adi) == 0) {
				bitki_zaten_var_mi = evet;
			}
		}
		if (bitki_zaten_var_mi == hayir) {
			// Bitki yeni_bitki; //=new Bitki(yeni_bitkinin_adi,
			// yeni_bitkinin_adi, yeni_bitkinin_adi, yeni_bitkinin_adi,
			// yeni_bitkinin_adi, yeni_bitkinin_adi, yeni_bitkinin_adi,
			// yeni_bitkinin_adi);
			// bitkiler.add(yeni_bitki);
		}

	}

	public synchronized void remove(String data) {
		String bitki_adi = "";
		for (int i = 0; i < vector_bitki.size(); i++) {
			bitki_adi = vector_bitki.elementAt(i).getAdi();
			if (bitki_adi.compareTo(data) == 0) {
				vector_bitki.remove(i);
				break;
			}
		}
	}

	public synchronized void update_file() {
		String metin = "";
		Bitki bitki;

		try {
			FileWriter file_writer=new FileWriter(getKullandigi_dosya());
			final BufferedWriter out = new BufferedWriter(file_writer);
			final PrintWriter pw = new PrintWriter(out);
			// buffer icin flussh metodu var
			for (int i = 0; i < vector_bitki.size(); i++) {
				bitki = vector_bitki.elementAt(i);
				metin+=bitki.toUpdateString();
				if (bitki.getonerilen_hastaliklar().size() != 0) {
					metin += bitki.faydali_oldugu_hastaliklar();
				}
				pw.println(metin);
				pw.flush();
				metin = "";
			}
			out.close();
		} catch (final IOException e) {
		}
	}

	public String urunleri_listele(float min, float max) {
		String metin = "";
		float bitkinin_fiyati;
		for (int i = 0; i < vector_bitki.size(); i++) {
			bitkinin_fiyati = vector_bitki.elementAt(i).getFiyati();
			if (min <= bitkinin_fiyati && bitkinin_fiyati <= max) {
				metin += vector_bitki.elementAt(i).getAdi() + "\n";
			}
		}
		return metin;
	}

	public synchronized static Capsule_Vector_Bitki dosya_oku(final String fileName) {
		// Bitkiye iliskin bilgiler(bitki adi# kategori(bitkiler isin 0,bitki
		// sayilari icin 1,vitaminler icin 2)#bitkinin latince ismi#bitkinin
		// ozellikleri( _ ile ayrilidir)#miktari#fiyati#bitki resminin diskteki
		// yeri#bitki resminin diskteki adi#bilgi sayisi(onerilen hastaliklar
		// isin)#onerilen hastaliklar(>>ile ayrilmistir)
		// final Vector<Kisi> kisiler =
		// kisileriOku("kullanicilar.txt");
		Capsule_Vector_Bitki vector_bitki = new Capsule_Vector_Bitki();

		// burada tanimliyoruz boylece finally blogunda gorulebiliyor
		BufferedReader input = null;
		try {
			// her okumada tek satir okuyacak sekilde kullanabilecegimiz yapi
			input = new BufferedReader(new FileReader(fileName));

			String line = null; // while dongusu icinde tanimlamiyoruz
			Bitki bitki;
			StringTokenizer st;
			StringTokenizer st2;
			StringTokenizer st3;
			int bilgi_sayisi;
			while ((line = input.readLine()) != null) {
				System.out.println("line"+line);
				st = new StringTokenizer(line, "#");
				bitki = new Bitki(st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken(),
						st.nextToken(), st.nextToken(), st.nextToken());
				try {
					System.out.println("bitki"+bitki);
				} catch (Exception e) {
					System.out.println("hata var");
					e.printStackTrace();
					System.exit(0);
				}
				String onerilen_hastaliklar = st.nextToken();
				st2 = new StringTokenizer(onerilen_hastaliklar, ">>");
				bilgi_sayisi = Integer.parseInt(st2.nextToken());
				String tum_hastaliklar = "";
				while (bilgi_sayisi > 0) {
					bilgi_sayisi--;
					tum_hastaliklar = st2.nextToken();
					st3 = new StringTokenizer(tum_hastaliklar, ">>");
					while (st3.hasMoreTokens()) {
						bitki.getonerilen_hastaliklar().add(st3.nextToken());
					}
				}
				vector_bitki.add(bitki);
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
		return vector_bitki;
	}
	public Capsule_Vector_Bitki getVector_bitki() {
		return Bitki_veri_tabani.vector_bitki;
	}
	public void setVector_bitki(Capsule_Vector_Bitki vector_bitki) {
		Bitki_veri_tabani.vector_bitki = vector_bitki;
	}
}