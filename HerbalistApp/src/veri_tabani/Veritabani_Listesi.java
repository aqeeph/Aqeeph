
package veri_tabani;

import agac.Node;
import agaclar.Vector_Agac;
import deva.Bitki;
import hash_table.Hash_Table;

public class Veritabani_Listesi {
	
	private static Hash_Table hash_table = new Hash_Table(); // @jve:decl-index=0:
	private static Vector_Agac agac_vektoru = new Vector_Agac();
	private static Kategori_veri_tabani kategori_veri_tabani = new Kategori_veri_tabani();
	private static Bitki_veri_tabani bitki_veri_tabani = new Bitki_veri_tabani();
	private static Hastalik_veri_tabani hastalik_veri_tabani = new Hastalik_veri_tabani();;


	public static Hastalik_veri_tabani getHastalik_veri_tabani() {
		return hastalik_veri_tabani;
	}

	public static void veri_tabanlarini_olustur() {
		setKategori_veri_tabani(kategori_veri_tabani_olustur());
		setBitki_veri_tabani(bitki_veri_tabani_olustur());
		setHastalik_veri_tabani(hastalik_veri_tabani_olustur());
	}


	private static Hastalik_veri_tabani hastalik_veri_tabani_olustur() {
		return new Hastalik_veri_tabani("files\\hastalik.txt");
	}

	
	private static Bitki_veri_tabani bitki_veri_tabani_olustur() {
		return new Bitki_veri_tabani("files\\bitki.txt");
	}


	public static Kategori_veri_tabani kategori_veri_tabani_olustur() {
		return new Kategori_veri_tabani("files\\kategori.txt");
	}

	public static void veri_tabanlarini_veri_yapilarina_kopyala() {
		kategorilere_gore_agac_vektorunu_olustur();
		bitki_veri_tabanini_agac_vektorune_kopyala();
		hastalik_veri_tabanini_hash_table_ye_kopyala();
	}

	public static void setKategori_veri_tabani(Kategori_veri_tabani kategori_veri_tabani) {
		Veritabani_Listesi.kategori_veri_tabani = kategori_veri_tabani;
	}

	public static void setBitki_veri_tabani(Bitki_veri_tabani bitki_veri_tabani) {
		Veritabani_Listesi.bitki_veri_tabani = bitki_veri_tabani;
	}

	public static void setHastalik_veri_tabani(Hastalik_veri_tabani hastalik_veri_tabani) {
		Veritabani_Listesi.hastalik_veri_tabani = hastalik_veri_tabani;
	}

	public static void kategorilere_gore_agac_vektorunu_olustur() {
		setAgac_vektoru(new Vector_Agac(getKategori_veri_tabani().getKategoriler().size() + 1));
		// Son vektor elemani Kategorisiz olan bitkiler Icin
	}

	public static void bitki_veri_tabanini_agac_vektorune_kopyala() {
		int aranan, endex;
		Node<Bitki> newnode;
		for (int i = 0; i < getBitki_veri_tabani().getBitkiler().size(); i++) {
			newnode = new Node<Bitki>(getBitki_veri_tabani().getBitkiler().elementAt(i));
			aranan = newnode.getNode().getKategori();
			endex = getKategori_veri_tabani().bitkinin_kategorisini_bul(aranan);
			getAgac_vektoru().getAgaclar().elementAt(endex).insert(newnode);
		}
	}

	public static void hastalik_veri_tabanini_hash_table_ye_kopyala() {
		setHash_table(new Hash_Table(getHastalik_veri_tabani().getHastaliklar()));
	}

	public static void setAgac_vektoru(Vector_Agac agac_vektoru) {
		Veritabani_Listesi.agac_vektoru = agac_vektoru;
	}

	public static Bitki_veri_tabani getBitki_veri_tabani() {
		return bitki_veri_tabani;
	}

	public static Kategori_veri_tabani getKategori_veri_tabani() {
		return kategori_veri_tabani;
	}

	public static Vector_Agac getAgac_vektoru() {
		return Veritabani_Listesi.agac_vektoru;
	}

	public static Hash_Table getHash_table() {
		return hash_table;
	}

	public static void setHash_table(Hash_Table hash_table) {
		Veritabani_Listesi.hash_table = hash_table;
	}

	public static String aranan_Urunun_bilgilerini_listele(String aranan_Urun) {
		String yanit = "";

		for (int i = 0; i < getAgac_vektoru().getAgaclar().size(); i++) {
			yanit = getAgac_vektoru().getAgaclar().elementAt(i)
					.find(getAgac_vektoru().getAgaclar().elementAt(i).getNode(), aranan_Urun);
			if (yanit.compareTo("Bulunamadi") != 0) {
				break;
			}
		}
		return yanit;
	}

	public static String kategori_var_mi(String aranan) {
		String yanit = getKategori_veri_tabani().kategoriyi_arastir(aranan);
		return yanit;
	}

	public static boolean agac_vektorunden_kaldir(String string) {
		int Urunun_bulundugu_kategorinin_nosu;
		Urunun_bulundugu_kategorinin_nosu = agac_vektoru.getAranan_urun_hangi_kategoride_bulundu();
		return agac_vektoru.getAgaclar().elementAt(Urunun_bulundugu_kategorinin_nosu).agac_remove(string);
	}

	public static void bitki_veri_tabanindan_kaldir(String string) {
		getBitki_veri_tabani().remove(string);
		getBitki_veri_tabani().update_file();
	}

	public static String kategorisi(int kategori_id) {
		for (int i = 0; i < Veritabani_Listesi.getKategori_veri_tabani().getKategoriler().size(); i++) {
			if (Veritabani_Listesi.getKategori_veri_tabani().getKategoriler().elementAt(i)
					.getKategori_no() == kategori_id) {
				return Veritabani_Listesi.getKategori_veri_tabani().getKategoriler().elementAt(i).getKategori_adi();
			}
		}
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Kategorilenmemis\n");
		stringBuilder.append("Eger boyle bir urun bitki veri tabaninda bulunuyorsa\n");
		stringBuilder.append("1)Varsa lutfen kategori_no.txt dosyasindaki hatayi duzeltin\n");
		stringBuilder.append("2)Bitki veri tabanina veri yanlis girilmis olabilir\n");
		stringBuilder.append("3)Varsa lutfen bitki.txt dosyasindaki hatayi duzeltin\n");

		return stringBuilder.toString();
	}

}
