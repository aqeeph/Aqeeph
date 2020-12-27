package gui;

import javax.swing.JTabbedPane;

public class Herbalist_AppJTabbedPaneData {
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Herbalist_AppJTabbedPaneData [Kullanici_Menusu=");
		builder.append(Kullanici_Menusu);
		builder.append(", Musteri_Menusu=");
		builder.append(Musteri_Menusu);
		builder.append(", Personel_Menusu=");
		builder.append(Personel_Menusu);
		builder.append(", jTabbedPane3=");
		builder.append(jTabbedPane3);
		builder.append(", Kategori_Ekleme_ve_Silme_Menusu=");
		builder.append(Kategori_Ekleme_ve_Silme_Menusu);
		builder.append(", jTabbedPane6=");
		builder.append(jTabbedPane6);
		builder.append("]");
		return builder.toString();
	}

	private JTabbedPane Kullanici_Menusu;
	private JTabbedPane Musteri_Menusu;
	private JTabbedPane Personel_Menusu;
	private JTabbedPane jTabbedPane3;
	private JTabbedPane Kategori_Ekleme_ve_Silme_Menusu;
	private JTabbedPane jTabbedPane6;

	public Herbalist_AppJTabbedPaneData() {
	}

	public JTabbedPane getKullanici_Menusu() {
		return Kullanici_Menusu;
	}

	public void setKullanici_Menusu(JTabbedPane kullanici_Menusu) {
		Kullanici_Menusu = kullanici_Menusu;
	}

	public JTabbedPane getMusteri_Menusu() {
		return Musteri_Menusu;
	}

	public void setMusteri_Menusu(JTabbedPane musteri_Menusu) {
		Musteri_Menusu = musteri_Menusu;
	}

	public JTabbedPane getPersonel_Menusu() {
		return Personel_Menusu;
	}

	public void setPersonel_Menusu(JTabbedPane personel_Menusu) {
		Personel_Menusu = personel_Menusu;
	}

	public JTabbedPane getjTabbedPane3() {
		return jTabbedPane3;
	}

	public void setjTabbedPane3(JTabbedPane jTabbedPane3) {
		this.jTabbedPane3 = jTabbedPane3;
	}

	public JTabbedPane getKategori_Ekleme_ve_Silme_Menusu() {
		return Kategori_Ekleme_ve_Silme_Menusu;
	}

	public void setKategori_Ekleme_ve_Silme_Menusu(
			JTabbedPane kategori_Ekleme_ve_Silme_Menusu) {
		Kategori_Ekleme_ve_Silme_Menusu = kategori_Ekleme_ve_Silme_Menusu;
	}

	public JTabbedPane getjTabbedPane6() {
		return jTabbedPane6;
	}

	public void setjTabbedPane6(JTabbedPane jTabbedPane6) {
		this.jTabbedPane6 = jTabbedPane6;
	}
}