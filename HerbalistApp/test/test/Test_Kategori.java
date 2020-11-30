package test;

import java.io.IOException;

import veri_tabani.Kategori;
import veri_tabani.Veritabani_Listesi;

public class Test_Kategori {

	/**
	 * @param args
	 * @throws IOException
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Veritabani_Listesi.setKategori_veri_tabani(Veritabani_Listesi.kategori_veri_tabani_olustur());
		Kategori kategori = new Kategori(Veritabani_Listesi.getKategori_veri_tabani().getKategoriler().size(),
				"Bitkiler");
		Veritabani_Listesi.getKategori_veri_tabani().add_kategori(kategori);
		System.out
				.println(Veritabani_Listesi.getKategori_veri_tabani().getKategoriler().lastElement().getKategori_adi());
		Veritabani_Listesi.getKategori_veri_tabani().update_file();
	}

}
