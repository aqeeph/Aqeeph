package veri_tabani;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import capsule.Capsule_Vector_Kategori;

public class Kategori_veritabani {
	/**
	 * 
	 */
	private static Capsule_Vector_Kategori kategoriler;
	/**
	 * 
	 */
	private static int aranan_kategori_kacinci_sirada_bulundu;
	/**
	 * 
	 */
	private static String kullandigi_dosya = "";

	/**
	 * @param dosya_adi
	 */
	public Kategori_veritabani(String dosya_adi) {
		kategoriler=new Capsule_Vector_Kategori();
		Kategori_veritabani.setKullandigi_dosya(dosya_adi);
		Kategori_veritabani.dosya_oku(Kategori_veritabani.getKullandigi_dosya());
	}

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private Kategori_veritabani() {
		kategoriler=new Capsule_Vector_Kategori();
	}

	/**
	 * @return
	 */
	public Capsule_Vector_Kategori getKategoriler() {
		return kategoriler;
	}

	/**
	 * @param kategoriler
	 */
	public static void setKategoriler(Capsule_Vector_Kategori kategoriler) {
		Kategori_veritabani.kategoriler = kategoriler;
	}

	/**
	 * @return
	 */
	public static String getKullandigi_dosya() {
		return kullandigi_dosya;
	}

	public static void setKullandigi_dosya(String kullandigi_dosya) {
		Kategori_veritabani.kullandigi_dosya = kullandigi_dosya;
	}

	// Kategoriye iliskin bilgiler(kategori_no#Kategori_adi)
	/**
	 * @param kategori
	 */
	public synchronized static void add_kategori(Kategori kategori) {
		synchronized (kategoriler) {
			kategoriler.getKategoriler().add(kategori);
		}
	}

	/**
	 * 
	 */
	public void update_file() {
		String metin = "";
		Kategori kategori_obj;
		try {
			final BufferedWriter out = new BufferedWriter(new FileWriter(getKullandigi_dosya()));
			final PrintWriter pw = new PrintWriter(out);
			// buffer icin flussh metodu var
			for (int kategori_id = 0; kategori_id < kategoriler.getKategoriler().size(); kategori_id++) {
				kategori_obj = kategoriler.getKategoriler().elementAt(kategori_id);
				metin += kategori_id + "#" + kategori_obj.getKategori_adi();
				pw.println(metin);
				pw.flush();
				metin = "";
			}
			out.close();
		} catch (final IOException e) {
		}
	}

	/**
	 * @param aranan
	 * @return
	 */
	public int bitkinin_kategorisini_bul(int aranan) {
		for (int i = 0; i < kategoriler.getKategoriler().size(); i++) {
			if (aranan == kategoriler.getKategoriler().elementAt(i).getKategori_no()) {
				return i;
			}
		}
		return kategoriler.getKategoriler().size();
	}

	/**
	 * @param aranan
	 * @return
	 */
	public String kategoriyi_arastir(String aranan) {
		String yanit = "Bgyle Bir Kategori Bulunmamaktadir";
		int i;
		for (i = 0; i < kategoriler.getKategoriler().size(); i++) {
			if (aranan.compareTo(kategoriler.getKategoriler().elementAt(i).getKategori_adi()) == 0) {
				setAranan_kategori_kacinci_sirada_bulundu(i);
				yanit = "Bulundu";
				return yanit;
			}
		}
		setAranan_kategori_kacinci_sirada_bulundu(i);
		return yanit;
	}

	/**
	 * @param aranan_kategori_kacinci_sirada_bulundu
	 */
	public static void setAranan_kategori_kacinci_sirada_bulundu(int aranan_kategori_kacinci_sirada_bulundu) {
		Kategori_veritabani.aranan_kategori_kacinci_sirada_bulundu = aranan_kategori_kacinci_sirada_bulundu;
	}

	/**
	 * @return
	 */
	public int getAranan_kategori_kacinci_sirada_bulundu() {
		return aranan_kategori_kacinci_sirada_bulundu;
	}

	/**
	 *
	 */
	public String toString() {
		String metin = "";
		for (int i = 0; i < kategoriler.getKategoriler().size(); i++) {
			metin += kategoriler.getKategoriler().elementAt(i).toString() + "\n\n";
		}
		return metin;
	}

	/**
	 * 
	 */
	public void kategoriyi_sil() {
		kategoriler.getKategoriler().removeElementAt(getAranan_kategori_kacinci_sirada_bulundu());
	}

	/**
	 * @param yeni_kategori_adi
	 */
	public void kategori_ekle(String yeni_kategori_adi) {
		int yeni_kategori_Id = this.getKategoriler().getKategoriler().size();
		Kategori kategori = new Kategori(yeni_kategori_Id, yeni_kategori_adi);
		Kategori_veritabani.add_kategori(kategori);
		this.update_file();
		System.out.println(this.getKategoriler().getKategoriler().lastElement().toString());
	}

	/**
	 * 
	 */
	public void kategori_sil() {
		this.kategoriyi_sil();
		this.update_file();
	}

	// Kategoriye iliskin bilgiler(kategori_no#Kategori_adi)
	/**
	 * @param fileName
	 */
	public synchronized static void dosya_oku(final String fileName) {
		int no;
		// burada tanimliyoruz boylece finally blogunda gorulebiliyor
		BufferedReader input = null;
		try {
			// her okumada tek satir okuyacak sekilde kullanabilecegimiz yapi
			FileReader file_reader = new FileReader(fileName);
			input = new BufferedReader(file_reader);

			String line = null; // while dongusu icinde tanimlamiyoruz
			while ((line = input.readLine()) != null) {
				final StringTokenizer st = new StringTokenizer(line, "#");
				no = Integer.parseInt(st.nextToken());
				Kategori yeni_kategori = new Kategori(no, st.nextToken());
				Kategori_veritabani.add_kategori(yeni_kategori);
			}
		} catch (final FileNotFoundException ex) {
			// Dosya bulunamadi hatasi
			// Bir hata olusursa ekrana yaziyoruz
			ex.printStackTrace();
		} catch (final IOException ex) {
			// Herhangi bir I/O hatasi
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
	}
}