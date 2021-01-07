package test;

import java.io.IOException;

import veri_tabani.Kategori;
import veri_tabani.Kategori_veritabani;
import veri_tabani.Veritabani_Listesi;

public class Test_Kategori {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Veritabani_Listesi veritabani_listesi = new Veritabani_Listesi();
		Veritabani_Listesi.setKategori_veri_tabani(Veritabani_Listesi.kategori_veri_tabani_olustur());
		Kategori kategori = new Kategori(Veritabani_Listesi.getKategori_veri_tabani().getKategoriler().getKategoriler().size(),
				"Bitkiler");
		Kategori_veritabani.add_kategori(kategori);
		System.out
				.println(Veritabani_Listesi.getKategori_veri_tabani().getKategoriler().getKategoriler().lastElement().getKategori_adi());
		Veritabani_Listesi.getKategori_veri_tabani().update_file();
	}

}
