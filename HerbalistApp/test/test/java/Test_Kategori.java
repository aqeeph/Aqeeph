package test.java;

import java.io.IOException;

import veri_tabani.Kategori;
import veri_tabani.Veritabani_Listesi;

public class Test_Kategori {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		Veritabani_Listesi veritabani_listesi = new Veritabani_Listesi();
		veritabani_listesi.setKategori_veri_tabani(veritabani_listesi.kategori_veri_tabani_olustur());
		Kategori kategori = new Kategori(veritabani_listesi.getKategori_veri_tabani().getKategoriler().size(),
				"Bitkiler");
		veritabani_listesi.getKategori_veri_tabani().add_kategori(kategori);
		System.out
				.println(veritabani_listesi.getKategori_veri_tabani().getKategoriler().lastElement().getKategori_adi());
		veritabani_listesi.getKategori_veri_tabani().update_file();
	}

}
