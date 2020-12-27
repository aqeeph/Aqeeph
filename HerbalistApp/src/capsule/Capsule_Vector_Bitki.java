/**
 * 
 */
package capsule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;

import deva.Bitki;

/**
 * @author MEHMET AKIF ILYASOGULLARI
 *
 */
public class Capsule_Vector_Bitki {
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < getBitkiler().size(); i++) {
			builder.append(getBitkiler().elementAt(i));
		}
		return builder.toString();
	}
	private Vector<Bitki> bitkiler;
	/**
	 * 
	 */
	public Capsule_Vector_Bitki() {
		setBitkiler(new Vector<Bitki>());
	}
	public Vector<Bitki> getBitkiler() {
		return bitkiler;
	}
	public void setBitkiler(Vector<Bitki> bitkiler) {
		this.bitkiler = bitkiler;
	}
	public int size() {
		return getBitkiler().size();
	}
	public Bitki elementAt(int i) {
		return getBitkiler().elementAt(i);
	}
	public void remove(int i) {
		getBitkiler().remove(i);
	}
	public void add(Bitki bitki) {
		getBitkiler().add(bitki);
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

}
