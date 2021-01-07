package veri_tabani;

public class SQL {
	/**
	 * 
	 */
	public SQL() {
		super();
		try {
			SQL.veritabani_listesi=new Veritabani_Listesi();
		} catch (Exception e) {
			System.out.println("veritabani_listesi hata var");
			e.printStackTrace();
			System.exit(0);
		}
	}

	/**
	 * @param args
	 */
	public static Veritabani_Listesi veritabani_listesi;

	public SQL(Veritabani_Listesi veritabani_listesi) {
		SQL.veritabani_listesi = veritabani_listesi;
	}

	public static Veritabani_Listesi getVeritabani_listesi() {
		return veritabani_listesi;
	}

	public void setVeritabani_listesi(Veritabani_Listesi veritabani_listesi) {
		SQL.veritabani_listesi = veritabani_listesi;
	}
}