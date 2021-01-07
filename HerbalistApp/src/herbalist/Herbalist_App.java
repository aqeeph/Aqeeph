package herbalist;

import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

import capsule.Capsule_Vector_Agac_Bitki;
import capsule.Capsule_Vector_String;
import dert.Hastalik;
import gui.Herbalist_AppGUIData;
import gui.Herbalist_AppJTextFieldData;
import gui.Herbalist_AppSwingData;
import veri_tabani.Veritabani_Listesi;

@SuppressWarnings("deprecation")
public class Herbalist_App {

	private Veritabani_Listesi veritabani_listesi;
	private static Herbalist_AppGUIData herbalist_app_guidata;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Herbalist_App [veritabani_listesi=");
		builder.append(getVeritabani_listesi());
		builder.append(", exitActionListener=");
		builder.append(exitActionListener);
		builder.append("]");
		return builder.toString();
	}


	/**
	 * @param herbalist_app_guidata
	 */
	public Herbalist_App(Herbalist_AppGUIData herbalist_app_guidata) {
		super();
		veritabani_listesi = new Veritabani_Listesi();
		Herbalist_App.setHerbalist_app_guidata(herbalist_app_guidata);
	}

	/**
	 * @return
	 */
	private JTabbedPane getKullanici_Menusu() {
		Kullanici_Menusu_init();
		return getHerbalist_app_guidata().getKullanici_Menusu();
	}

	/**
	 * 
	 */
	private void Kullanici_Menusu_init() {
		if (getHerbalist_app_guidata().getKullanici_Menusu() == null) {
			getHerbalist_app_guidata().setKullanici_Menusu(new JTabbedPane());
			getHerbalist_app_guidata().getKullanici_Menusu().setBounds(new Rectangle(0, 0, 985, 635));
			getHerbalist_app_guidata().getKullanici_Menusu().addTab("Musterilerin Kulanabilecekleri Bolum", null,
					getmusteri_bolumu(), null);
			getHerbalist_app_guidata().getKullanici_Menusu().addTab("Sadece Firma Personelinin Kullanabilecegi Bolum", null,
					getfirma_bolumu(), null);
		}
	}

	/**
	 * This method initializes jPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getmusteri_bolumu() {
		musteri_bolumu_init();
		return getHerbalist_app_guidata().getmusteri_bolumu();
	}

	/**
	 * 
	 */
	private void musteri_bolumu_init() {
		if (getHerbalist_app_guidata().getmusteri_bolumu() == null) {
			getHerbalist_app_guidata().setmusteri_bolumu(new JPanel());
			getHerbalist_app_guidata().getmusteri_bolumu().setLayout(null);
			getHerbalist_app_guidata().getmusteri_bolumu().add(getMusteri_Menusu(), null);
		}
	}

	/**
	 * This method initializes jPanel1
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getfirma_bolumu() {
		firma_bolumu_init();
		return getHerbalist_app_guidata().getfirma_bolumu();
	}

	/**
	 * 
	 */
	private void firma_bolumu_init() {
		if (getHerbalist_app_guidata().getfirma_bolumu() == null) {
			getHerbalist_app_guidata().setfirma_bolumu(new JPanel());
			getHerbalist_app_guidata().getfirma_bolumu().setLayout(null);
			getHerbalist_app_guidata().getfirma_bolumu().add(getPersonel_Menusu(), null);
		}
	}

	/**
	 * This method initializes Musteri_Menusu
	 * 
	 * @return javax.swing.JTabbedPane
	 */
	private JTabbedPane getMusteri_Menusu() {
		Musteri_Menusu_init();
		return getHerbalist_app_guidata().getMusteri_Menusu();
	}

	/**
	 * 
	 */
	private void Musteri_Menusu_init() {
		if (getHerbalist_app_guidata().getMusteri_Menusu() == null) {
			getHerbalist_app_guidata().setMusteri_Menusu(new JTabbedPane());
			getHerbalist_app_guidata().getMusteri_Menusu().setBounds(new Rectangle(0, 16, 979, 589));
			getHerbalist_app_guidata().getMusteri_Menusu().addTab("Adindan Urun Arama ve Bilgilerini Listeleme", null,
					getAdindan_Urun_Arama_ve_Listeleme_bolumu(), null);
			getHerbalist_app_guidata().getMusteri_Menusu().addTab(
					"Belirli Fiyatlar Arasindaki Tum Urunlerin Bulunup Listelenmesi", null,
					getBelirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi(), null);
			getHerbalist_app_guidata().getMusteri_Menusu().addTab(
					"Verilen Bir Kelimenin Kategori Agaclarinda Tutulan Bitkilerin Ozellikleri Icinden Aratilmasi,Bulunan Bitki Isimlerinin Listelenmesi",
					null,
					getVerilen_Bir_Kelimenin_Kategori_Agaclarinda_Tutulan_Bitkilerin_Ozellikleri_Icinden_Aratilmasi_Bulunan_Bitki_Isimlerinin_Listelenmesi(),
					null);
			getHerbalist_app_guidata().getMusteri_Menusu().addTab("Urun Siparisi (Birden Cok Paket Istenebilir )ve Alimi",
					null, getUrun_Siparisi_Birden_Cok_Paket_Istenebilir_ve_Alimi(), null);
			getHerbalist_app_guidata().getMusteri_Menusu().addTab("Ilgili Agacin Derinligini ve Eleman Sayisini Yazdirma",
					null, getKategori_Listeleme_Agac_Derinligini_ve_Eleman_Sayisini_Yazdirma(), null);
			getHerbalist_app_guidata().getMusteri_Menusu().addTab("Kategori Agaclarini Dengeleme", null,
					getKategori_Agaclarini_Dengeleme(), null);
			getHerbalist_app_guidata().getMusteri_Menusu().addTab(
					"Verilen Bir Hastaliga Iliskin Bilgilerin Listelenmesi (Hash Table'dan)", null,
					getVerilen_Bir_Hastaliga_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan(), null);
			getHerbalist_app_guidata().getMusteri_Menusu().addTab(
					"Belli Bir Hastaliga iyi Gelebilen Bitkilerin Fiyatlarina Gire Heap'e Atilmasi", null,
					getBelli_Bir_Hastaliga_Iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gore_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi(),
					null);
		}
	}

	/**
	 * This method initializes jPanel2
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getAdindan_Urun_Arama_ve_Listeleme_bolumu() {
		Adindan_Urun_Arama_ve_Listeleme_bolumu_init();
		return getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Listeleme_bolumu();
	}

	/**
	 * 
	 */
	private void Adindan_Urun_Arama_ve_Listeleme_bolumu_init() {
		if (getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Listeleme_bolumu() == null) {
			getHerbalist_app_guidata().setjPanel2(new JPanel());
			getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Listeleme_bolumu().setLayout(null);
			getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Listeleme_bolumu().add(getAdindan_Urun_Arama_ve_Listeleme(),
					null);
		}
	}

	/**
	 * This method initializes
	 * Belirli_Fiyatlar_Arasindaki_Tim_Tirlerin_Bulunup_Listelenmesi
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getBelirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi() {
		Belirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi_init();
		return getHerbalist_app_guidata().getBelirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi();
	}

	/**
	 * 
	 */
	private void Belirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi_init() {
		if (getHerbalist_app_guidata().getBelirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi() == null) {
			getHerbalist_app_guidata().setjLabel48(new JLabel());
			getHerbalist_app_guidata().getjLabel48().setBounds(new Rectangle(330, 17, 166, 16));
			getHerbalist_app_guidata().getjLabel48().setText("Maximum Fiyati Giriniz");
			getHerbalist_app_guidata().setjLabel47(new JLabel());
			getHerbalist_app_guidata().getjLabel47().setBounds(new Rectangle(-2, 17, 168, 16));
			getHerbalist_app_guidata().getjLabel47().setText("Minimum Fiyati Giriniz");
			getHerbalist_app_guidata().setjLabel3(new JLabel());
			getHerbalist_app_guidata().getjLabel3().setBounds(new Rectangle(0, 1, 495, 16));
			getHerbalist_app_guidata().getjLabel3()
					.setText("Belirli Fiyatlar Arasindaki Tum Urunlerin Bulunup Listelenmesi");
			getHerbalist_app_guidata().setBelirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi(new JPanel());
			getHerbalist_app_guidata().getBelirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi().setLayout(null);
			getHerbalist_app_guidata().getBelirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi()
					.add(getHerbalist_app_guidata().getjLabel3(), null);
			getHerbalist_app_guidata().getBelirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi()
					.add(getHerbalist_app_guidata().getjLabel47(), null);
			getHerbalist_app_guidata().getBelirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi()
					.add(getHerbalist_app_guidata().getjLabel48(), null);
			getHerbalist_app_guidata().getBelirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi()
					.add(getJTextField11(), null);
			getHerbalist_app_guidata().getBelirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi()
					.add(getJTextField16(), null);
			getHerbalist_app_guidata().getBelirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi().add(getJButton13(),
					null);
			getHerbalist_app_guidata().getBelirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi()
					.add(getJTextArea15(), null);
		}
	}

	/**
	 * ThismethodinitializesVerilen_Bir_Kelimenin_Kategori_Agaclarinda_Tutulan_Bitkilerin_izellikleri_Icinden_Aratilmasi_Bulunan_Bitki_isimlerinin_Listelenmesi
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getVerilen_Bir_Kelimenin_Kategori_Agaclarinda_Tutulan_Bitkilerin_Ozellikleri_Icinden_Aratilmasi_Bulunan_Bitki_Isimlerinin_Listelenmesi() {
		Verilen_Bir_Kelimenin_Kategori_Agaclarinda_Tutulan_Bitkilerin_Ozellikleri_Icinden_Aratilmasi_Bulunan_Bitki_Isimlerinin_Listelenmesi_init();
		return getHerbalist_app_guidata()
				.getVerilen_Bir_Kelimenin_Kategori_Agaclarinda_Tutulan_Bitkilerin_Ozellikleri_Icinden_Aratilmasi_Bulunan_Bitki_Isimlerinin_Listelenmesi();
	}

	/**
	 * 
	 */
	private void Verilen_Bir_Kelimenin_Kategori_Agaclarinda_Tutulan_Bitkilerin_Ozellikleri_Icinden_Aratilmasi_Bulunan_Bitki_Isimlerinin_Listelenmesi_init() {
		if (getHerbalist_app_guidata()
				.getVerilen_Bir_Kelimenin_Kategori_Agaclarinda_Tutulan_Bitkilerin_Ozellikleri_Icinden_Aratilmasi_Bulunan_Bitki_Isimlerinin_Listelenmesi() == null) {
			getHerbalist_app_guidata().setjLabel4(new JLabel());
			getHerbalist_app_guidata().getjLabel4().setBounds(new Rectangle(0, 2, 779, 16));
			getHerbalist_app_guidata().getjLabel4().setText(
					"Verilen Bir Kelimenin Kategori Agaclarinda Tutulan Bitkilerin Ozellikleri Icinden Aratilmasi,Bulunan Bitki Isimlerinin Listelenmesi");
			getHerbalist_app_guidata()
					.setVerilen_Bir_Kelimenin_Kategori_Agaclarinda_Tutulan_Bitkilerin_Ozellikleri_Icinden_Aratilmasi_Bulunan_Bitki_isimlerinin_Listelenmesi(
							new JPanel());
			getHerbalist_app_guidata()
					.getVerilen_Bir_Kelimenin_Kategori_Agaclarinda_Tutulan_Bitkilerin_Ozellikleri_Icinden_Aratilmasi_Bulunan_Bitki_Isimlerinin_Listelenmesi()
					.setLayout(null);
			getHerbalist_app_guidata()
					.getVerilen_Bir_Kelimenin_Kategori_Agaclarinda_Tutulan_Bitkilerin_Ozellikleri_Icinden_Aratilmasi_Bulunan_Bitki_Isimlerinin_Listelenmesi()
					.add(getHerbalist_app_guidata().getjLabel4(), null);
		}
	}

	/**
	 * This method initializes Urun_Sipariii_Birden_iok_Paket_istenebilir_ve_Alimi
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getUrun_Siparisi_Birden_Cok_Paket_Istenebilir_ve_Alimi() {
		Urun_Siparisi_Birden_Cok_Paket_Istenebilir_ve_Alimi_init();
		return getHerbalist_app_guidata().getUrun_Siparisi_Birden_Cok_Paket_Istenebilir_ve_Alimi();
	}

	/**
	 * 
	 */
	private void Urun_Siparisi_Birden_Cok_Paket_Istenebilir_ve_Alimi_init() {
		if (getHerbalist_app_guidata().getUrun_Siparisi_Birden_Cok_Paket_Istenebilir_ve_Alimi() == null) {
			getHerbalist_app_guidata().setjLabel5(new JLabel());
			getHerbalist_app_guidata().getjLabel5().setBounds(new Rectangle(0, 2, 779, 16));
			getHerbalist_app_guidata().getjLabel5().setText("Urun Siparisi (Birden Cok Paket Istenebilir )ve Alimi");
			getHerbalist_app_guidata().setUrun_Siparisi_Birden_Cok_Paket_istenebilir_ve_Alimi(new JPanel());
			getHerbalist_app_guidata().getUrun_Siparisi_Birden_Cok_Paket_Istenebilir_ve_Alimi().setLayout(null);
			getHerbalist_app_guidata().getUrun_Siparisi_Birden_Cok_Paket_Istenebilir_ve_Alimi()
					.add(getHerbalist_app_guidata().getjLabel5(), null);
		}
	}

	/**
	 * This method initializes Personel_Menusu
	 * 
	 * @return javax.swing.JTabbedPane
	 */
	private JTabbedPane getPersonel_Menusu() {
		Personel_Menusu_init();
		return getHerbalist_app_guidata().getPersonel_Menusu();
	}

	/**
	 * 
	 */
	private void Personel_Menusu_init() {
		if (getHerbalist_app_guidata().getPersonel_Menusu() == null) {
			getHerbalist_app_guidata().setPersonel_Menusu(new JTabbedPane());
			getHerbalist_app_guidata().getPersonel_Menusu().setBounds(new Rectangle(0, 16, 979, 590));
			getHerbalist_app_guidata().getPersonel_Menusu().addTab(null, null, Kategori_Ekleme_ve_Kategori_Silme(), null);
			getHerbalist_app_guidata().getPersonel_Menusu().addTab(null, null, getFirmaya_Yeni_Turde_Urun_Girisi(), null);
			getHerbalist_app_guidata().getPersonel_Menusu().addTab(null, null, getAdindan_Urun_Arama_ve_Silme(), null);
			getHerbalist_app_guidata().getPersonel_Menusu().addTab(null, null, getUrun_Bilgilerinde_Degisiklik(), null);
			getHerbalist_app_guidata().getPersonel_Menusu().addTab(null, null, getYeni_Hastalik_Bilgisi_Girisi(), null);
		}
	}

	/**
	 * This method initializes jPanel6
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel Kategori_Ekleme_ve_Kategori_Silme() {
		Kategori_Ekleme_ve_Kategori_Silme_init();
		return getHerbalist_app_guidata().getjPanel6();
	}

	/**
	 * 
	 */
	private void Kategori_Ekleme_ve_Kategori_Silme_init() {
		if (getHerbalist_app_guidata().getjPanel6() == null) {
			getHerbalist_app_guidata().setjLabel12(new JLabel());
			getHerbalist_app_guidata().getjLabel12().setBounds(new Rectangle(0, 0, 779, 16));
			getHerbalist_app_guidata().getjLabel12().setText("Kategori Ekleme ve Kategori Silme");
			getHerbalist_app_guidata().setjPanel6(new JPanel());
			getHerbalist_app_guidata().getjPanel6().setLayout(null);
			getHerbalist_app_guidata().getjPanel6().add(getHerbalist_app_guidata().getjLabel12(), null);
			getHerbalist_app_guidata().getjPanel6().add(getKategori_Ekleme_ve_Silme_Menusu(), null);
		}
	}

	/**
	 * This method initializes Firmaya_Yeni_Tirde_Urun_Giriii
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getFirmaya_Yeni_Turde_Urun_Girisi() {
		Firmaya_Yeni_Turde_Urun_Girisi_init();
		return getHerbalist_app_guidata().getFirmaya_Yeni_Turde_Urun_Girisi();
	}

	/**
	 * 
	 */
	private void Firmaya_Yeni_Turde_Urun_Girisi_init() {
		if (getHerbalist_app_guidata().getFirmaya_Yeni_Turde_Urun_Girisi() == null) {
			getHerbalist_app_guidata().setjLabel49(new JLabel());
			getHerbalist_app_guidata().getjLabel49().setBounds(new Rectangle(241, 16, 316, 16));
			getHerbalist_app_guidata().getjLabel49().setText("Eklenmek Istenen Urun Agac Kategorilerinde Var Mi?");
			getHerbalist_app_guidata().setjLabel46(new JLabel());
			getHerbalist_app_guidata().getjLabel46().setBounds(new Rectangle(1, 16, 241, 16));
			getHerbalist_app_guidata().getjLabel46().setText("Eklemek Istediginiz Urunun Adini Giriniz");
			getHerbalist_app_guidata().setjLabel15(new JLabel());
			getHerbalist_app_guidata().getjLabel15().setBounds(new Rectangle(0, 0, 778, 16));
			getHerbalist_app_guidata().getjLabel15().setText("Firmaya Yeni Turde Urun Girisi");
			getHerbalist_app_guidata().setFirmaya_Yeni_Tirde_Urun_Girisi(new JPanel());
			getHerbalist_app_guidata().getFirmaya_Yeni_Turde_Urun_Girisi().setLayout(null);
			getHerbalist_app_guidata().getFirmaya_Yeni_Turde_Urun_Girisi().add(getHerbalist_app_guidata().getjLabel15(), null);
			getHerbalist_app_guidata().getFirmaya_Yeni_Turde_Urun_Girisi().add(getGecici_metin_kutusu(), null);
			getHerbalist_app_guidata().getFirmaya_Yeni_Turde_Urun_Girisi().add(getHerbalist_app_guidata().getjLabel46(), null);
			getHerbalist_app_guidata().getFirmaya_Yeni_Turde_Urun_Girisi().add(getJTextField17(), null);
			getHerbalist_app_guidata().getFirmaya_Yeni_Turde_Urun_Girisi().add(getHerbalist_app_guidata().getjLabel49(), null);
			getHerbalist_app_guidata().getFirmaya_Yeni_Turde_Urun_Girisi().add(getJTextField18(), null);
			getHerbalist_app_guidata().getFirmaya_Yeni_Turde_Urun_Girisi().add(getJButton19(), null);
		}
	}

	/**
	 * This method initializes Adindan_Urun_Arama_ve_Silme
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getAdindan_Urun_Arama_ve_Silme() {
		Adindan_Urun_Arama_ve_Silme_init();
		return getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Silme();
	}

	/**
	 * 
	 */
	private void Adindan_Urun_Arama_ve_Silme_init() {
		if (getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Silme() == null) {
			getHerbalist_app_guidata().setjLabel33(new JLabel());
			getHerbalist_app_guidata().getjLabel33().setBounds(new Rectangle(-1, 72, 112, 16));
			getHerbalist_app_guidata().getjLabel33().setText("Urun Bilgisi");
			getHerbalist_app_guidata().setjLabel20(new JLabel());
			getHerbalist_app_guidata().getjLabel20().setBounds(new Rectangle(300, 16, 300, 16));
			getHerbalist_app_guidata().getjLabel20().setText("Aranan Urun Var Mi?");
			getHerbalist_app_guidata().setjLabel19(new JLabel());
			getHerbalist_app_guidata().getjLabel19().setBounds(new Rectangle(0, 16, 300, 16));
			getHerbalist_app_guidata().getjLabel19().setText("Aranan Urunun Adini Giriniz");
			getHerbalist_app_guidata().setjLabel16(new JLabel());
			getHerbalist_app_guidata().getjLabel16().setBounds(new Rectangle(0, 0, 778, 16));
			getHerbalist_app_guidata().getjLabel16().setText("Adindan Urun Bilgisi Arama ve Silme");
			getHerbalist_app_guidata().setAdindan_Urun_Arama_ve_Silme(new JPanel());
			getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Silme().setLayout(null);
			getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Silme().add(getHerbalist_app_guidata().getjLabel16(), null);
			getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Silme().add(getHerbalist_app_guidata().getjLabel19(), null);
			getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Silme().add(getHerbalist_app_guidata().getJTextField7(), null);
			getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Silme().add(getJButton10(), null);
			getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Silme().add(getHerbalist_app_guidata().getjLabel20(), null);
			getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Silme().add(getJTextField8(), null);
			getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Silme().add(getJButton11(), null);
			getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Silme().add(getHerbalist_app_guidata().getjLabel33(), null);
			getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Silme().add(getUrun_Bilgisi_Listeleyici(), null);
			getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Silme().add(getJTextArea8(), null);
		}
	}

	/**
	 * This method initializes Urun_Bilgilerinde_Degisiklik
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getUrun_Bilgilerinde_Degisiklik() {
		Urun_Bilgilerinde_Degisiklik_init();
		return getHerbalist_app_guidata().getUrun_Bilgilerinde_Degisiklik();
	}

	/**
	 * 
	 */
	private void Urun_Bilgilerinde_Degisiklik_init() {
		if (getHerbalist_app_guidata().getUrun_Bilgilerinde_Degisiklik() == null) {
			getHerbalist_app_guidata().setjLabel17(new JLabel());
			getHerbalist_app_guidata().getjLabel17().setBounds(new Rectangle(0, 0, 775, 16));
			getHerbalist_app_guidata().getjLabel17().setText("Urun Bilgilerinde Degisiklik");
			getHerbalist_app_guidata().setUrun_Bilgilerinde_Degisiklik(new JPanel());
			getHerbalist_app_guidata().getUrun_Bilgilerinde_Degisiklik().setLayout(null);
			getHerbalist_app_guidata().getUrun_Bilgilerinde_Degisiklik().add(getHerbalist_app_guidata().getjLabel17(), null);
			getHerbalist_app_guidata().getUrun_Bilgilerinde_Degisiklik().add(getJTextArea(), null);
		}
	}

	/**
	 * This method initializes Yeni_Hastalik_Bilgisi_Giriii
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getYeni_Hastalik_Bilgisi_Girisi() {
		Yeni_Hastalik_Bilgisi_Girisi_init();
		return getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi();
	}

	/**
	 * 
	 */
	private void Yeni_Hastalik_Bilgisi_Girisi_init() {
		if (getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi() == null) {
			getHerbalist_app_guidata().setjLabel45(new JLabel());
			getHerbalist_app_guidata().getjLabel45().setBounds(new Rectangle(4, 448, 220, 23));
			getHerbalist_app_guidata().getjLabel45().setText("Kaydetme Bilgisi");
			getHerbalist_app_guidata().setjLabel36(new JLabel());
			getHerbalist_app_guidata().getjLabel36().setBounds(new Rectangle(0, 427, 225, 16));
			getHerbalist_app_guidata().getjLabel36().setText("Bilgileri Kaydetmek istiyor Musunuz?");
			getHerbalist_app_guidata().setjLabel44(new JLabel());
			getHerbalist_app_guidata().getjLabel44().setBounds(new Rectangle(468, 313, 318, 16));
			getHerbalist_app_guidata().getjLabel44().setText("Tavsiye Edilen Bitkiler");
			getHerbalist_app_guidata().setjLabel43(new JLabel());
			getHerbalist_app_guidata().getjLabel43().setBounds(new Rectangle(1, 213, 224, 16));
			getHerbalist_app_guidata().getjLabel43().setText("Tedavi Yontemi");
			getHerbalist_app_guidata().setjLabel42(new JLabel());
			getHerbalist_app_guidata().getjLabel42().setBounds(new Rectangle(470, 163, 314, 16));
			getHerbalist_app_guidata().getjLabel42().setText("Nedenler");
			getHerbalist_app_guidata().setjLabel41(new JLabel());
			getHerbalist_app_guidata().getjLabel41().setBounds(new Rectangle(471, 17, 314, 16));
			getHerbalist_app_guidata().getjLabel41().setText("Belirtiler");
			getHerbalist_app_guidata().setjLabel40(new JLabel());
			getHerbalist_app_guidata().getjLabel40().setBounds(new Rectangle(0, 179, 222, 16));
			getHerbalist_app_guidata().getjLabel40().setText("Onerilen Bitkileri Ekleme Yeri");
			getHerbalist_app_guidata().setjLabel39(new JLabel());
			getHerbalist_app_guidata().getjLabel39().setBounds(new Rectangle(-1, 144, 222, 16));
			getHerbalist_app_guidata().getjLabel39().setText("Tedavileri Ekleme Yeri");
			getHerbalist_app_guidata().setjLabel38(new JLabel());
			getHerbalist_app_guidata().getjLabel38().setBounds(new Rectangle(1, 109, 220, 16));
			getHerbalist_app_guidata().getjLabel38().setText("Nedenleri Ekleme Yeri");
			getHerbalist_app_guidata().setjLabel37(new JLabel());
			getHerbalist_app_guidata().getjLabel37().setBounds(new Rectangle(1, 72, 222, 16));
			getHerbalist_app_guidata().getjLabel37().setText("Belirtileri Ekleme Yeri");
			getHerbalist_app_guidata().setjLabel35(new JLabel());
			getHerbalist_app_guidata().getjLabel35().setBounds(new Rectangle(226, 15, 240, 16));
			getHerbalist_app_guidata().getjLabel35().setText("Hastalik Veri Tabaninda Var Mi?");
			getHerbalist_app_guidata().setjLabel31(new JLabel());
			getHerbalist_app_guidata().getjLabel31().setBounds(new Rectangle(0, 16, 227, 16));
			getHerbalist_app_guidata().getjLabel31().setText("Hastalik Adini Giriniz");
			getHerbalist_app_guidata().setjLabel18(new JLabel());
			getHerbalist_app_guidata().getjLabel18().setBounds(new Rectangle(0, 0, 780, 16));
			getHerbalist_app_guidata().getjLabel18().setText("Yeni Hastalik Bilgisi Girisi");
			getHerbalist_app_guidata().setYeni_Hastalik_Bilgisi_Girisi(new JPanel());
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().setLayout(null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getHerbalist_app_guidata().getjLabel18(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getHerbalist_app_guidata().getjLabel31(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getJTextField4(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getJButton7(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getHerbalist_app_guidata().getjLabel35(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getJTextField10(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getHerbalist_app_guidata().getjLabel37(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getJTextField12(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getJButton14(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getHerbalist_app_guidata().getjLabel38(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getJTextField13(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getJButton15(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getHerbalist_app_guidata().getjLabel39(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getJTextField14(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getJButton16(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getHerbalist_app_guidata().getjLabel40(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getJButton17(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getJTextField15(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getJTextArea10(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getHerbalist_app_guidata().getjLabel41(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getHerbalist_app_guidata().getjLabel42(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getJTextArea11(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getHerbalist_app_guidata().getjLabel43(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getJTextArea12(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getHerbalist_app_guidata().getjLabel44(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getJTextArea13(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getJButton18(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getHerbalist_app_guidata().getjLabel36(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getJTextArea14(), null);
			getHerbalist_app_guidata().getYeni_Hastalik_Bilgisi_Girisi().add(getHerbalist_app_guidata().getjLabel45(), null);
		}
	}

	/**
	 * This method initializes
	 * Kategori_Listeleme_Agac_Derinlliii_ve_Eleman_Sayisini_Yazdirma
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getKategori_Listeleme_Agac_Derinligini_ve_Eleman_Sayisini_Yazdirma() {
		Kategori_Listeleme_Agac_Derinligini_ve_Eleman_Sayisini_Yazdirma_init();
		return getHerbalist_app_guidata().getKategori_Listeleme_Agac_Derinligi_ve_Eleman_Sayisini_Yazdirma();
	}

	/**
	 * 
	 */
	private void Kategori_Listeleme_Agac_Derinligini_ve_Eleman_Sayisini_Yazdirma_init() {
		if (getHerbalist_app_guidata().getKategori_Listeleme_Agac_Derinligi_ve_Eleman_Sayisini_Yazdirma() == null) {
			getHerbalist_app_guidata().setjLabel10(new JLabel());
			getHerbalist_app_guidata().getjLabel10().setBounds(new Rectangle(0, 16, 783, 16));
			getHerbalist_app_guidata().getjLabel10().setText("Ilgili Agacin Derinligini ve Eleman Sayisini Yazdirma");
			getHerbalist_app_guidata().setjLabel6(new JLabel());
			getHerbalist_app_guidata().getjLabel6().setBounds(new Rectangle(1, 2, 778, 16));
			getHerbalist_app_guidata().getjLabel6().setText(
					"Belirtilen Bir Kategorideki Tum Urunleri Duzeyleri ile Birlikte Listeleme(Inorder,Preorder,Postorder).");
			getHerbalist_app_guidata().setKategori_Listeleme_Agac_Derinligi_ve_Eleman_Sayisini_Yazdirma(new JPanel());
			getHerbalist_app_guidata().getKategori_Listeleme_Agac_Derinligi_ve_Eleman_Sayisini_Yazdirma().setLayout(null);
			getHerbalist_app_guidata().getKategori_Listeleme_Agac_Derinligi_ve_Eleman_Sayisini_Yazdirma()
					.add(getHerbalist_app_guidata().getjLabel6(), null);
			getHerbalist_app_guidata().getKategori_Listeleme_Agac_Derinligi_ve_Eleman_Sayisini_Yazdirma()
					.add(getHerbalist_app_guidata().getjLabel10(), null);
			getHerbalist_app_guidata().getKategori_Listeleme_Agac_Derinligi_ve_Eleman_Sayisini_Yazdirma()
					.add(getJTabbedPane3(), null);
		}
	}

	/**
	 * This method initializes Kategori_Agaclarini_Dengeleme
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getKategori_Agaclarini_Dengeleme() {
		Kategori_Agaclarini_Dengeleme_init();
		return getHerbalist_app_guidata().getKategori_Agaclarini_Dengeleme();
	}

	/**
	 * 
	 */
	private void Kategori_Agaclarini_Dengeleme_init() {
		if (getHerbalist_app_guidata().getKategori_Agaclarini_Dengeleme() == null) {
			getHerbalist_app_guidata().setjLabel7(new JLabel());
			getHerbalist_app_guidata().getjLabel7().setBounds(new Rectangle(2, 1, 778, 16));
			getHerbalist_app_guidata().getjLabel7().setText("Kategori Agaclarini Dengeleme");
			getHerbalist_app_guidata().setKategori_Agaclarini_Dengeleme(new JPanel());
			getHerbalist_app_guidata().getKategori_Agaclarini_Dengeleme().setLayout(null);
			getHerbalist_app_guidata().getKategori_Agaclarini_Dengeleme().add(getHerbalist_app_guidata().getjLabel7(), null);
		}
	}

	/**
	 * This method initializes
	 * Verilen_Bir_Hastaliia_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getVerilen_Bir_Hastaliga_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan() {
		Verilen_Bir_Hastaliga_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan_init();
		return getHerbalist_app_guidata().getVerilen_Bir_Hastaliga_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan();
	}

	/**
	 * 
	 */
	private void Verilen_Bir_Hastaliga_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan_init() {
		if (getHerbalist_app_guidata().getVerilen_Bir_Hastaliga_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan() == null) {
			getHerbalist_app_guidata().setjLabel34(new JLabel());
			getHerbalist_app_guidata().getjLabel34().setBounds(new Rectangle(0, 16, 260, 16));
			getHerbalist_app_guidata().getjLabel34().setText("Aranan Hastaligin Adini Giriniz");
			getHerbalist_app_guidata().setVerilen_Bir_Hastaliga_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan(new JPanel());
			getHerbalist_app_guidata().getVerilen_Bir_Hastaliga_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan()
					.setLayout(null);
			getHerbalist_app_guidata().getVerilen_Bir_Hastaliga_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan()
					.add(getJTextField9(), null);
			getHerbalist_app_guidata().getVerilen_Bir_Hastaliga_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan()
					.add(getHerbalist_app_guidata().getjLabel34(), null);
			getHerbalist_app_guidata().getVerilen_Bir_Hastaliga_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan()
					.add(getJButton12(), null);
			getHerbalist_app_guidata().getVerilen_Bir_Hastaliga_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan()
					.add(getJTextArea9(), null);
		}
	}

	/**
	 * ThismethodinitializesBelli_Bir_Hastaliia_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gire_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getBelli_Bir_Hastaliga_Iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gore_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi() {
		Belli_Bir_Hastaliga_Iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gore_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi_init();
		return getHerbalist_app_guidata()
				.getBelli_Bir_Hastaliga_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gire_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi();
	}

	/**
	 * 
	 */
	private void Belli_Bir_Hastaliga_Iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gore_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi_init() {
		if (getHerbalist_app_guidata()
				.getBelli_Bir_Hastaliga_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gire_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi() == null) {
			getHerbalist_app_guidata().setjLabel11(new JLabel());
			getHerbalist_app_guidata().getjLabel11().setBounds(new Rectangle(0, 16, 784, 16));
			getHerbalist_app_guidata().getjLabel11().setText("En Ucuz N Tanesinden 1'er Paket Satin Alinmasi");
			getHerbalist_app_guidata().setjLabel9(new JLabel());
			getHerbalist_app_guidata().getjLabel9().setBounds(new Rectangle(0, 1, 780, 16));
			getHerbalist_app_guidata().getjLabel9()
					.setText("Belli Bir Hastaliga iyi Gelebilen Bitkilerin Fiyatlarina Gire Heap'e Atilmasi");
			getHerbalist_app_guidata()
					.setBelli_Bir_Hastaliga_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gire_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi(
							new JPanel());
			getHerbalist_app_guidata()
					.getBelli_Bir_Hastaliga_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gire_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi()
					.setLayout(null);
			getHerbalist_app_guidata()
					.getBelli_Bir_Hastaliga_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gire_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi()
					.add(getHerbalist_app_guidata().getjLabel9(), null);
			getHerbalist_app_guidata()
					.getBelli_Bir_Hastaliga_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gire_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi()
					.add(getHerbalist_app_guidata().getjLabel11(), null);
		}
	}

	/**
	 * This method initializes jTabbedPane3
	 * 
	 * @return javax.swing.JTabbedPane
	 */
	private JTabbedPane getJTabbedPane3() {
		if (getHerbalist_app_guidata().getjTabbedPane3() == null) {
			getHerbalist_app_guidata().setjTabbedPane3(new JTabbedPane());
			getHerbalist_app_guidata().getjTabbedPane3().setBounds(new Rectangle(-1, 31, 972, 531));
			getHerbalist_app_guidata().getjTabbedPane3().addTab(null, null, getJPanel16(), null);
		}
		return getHerbalist_app_guidata().getjTabbedPane3();
	}

	/**
	 * This method initializes jPanel16
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel16() {
		if (getHerbalist_app_guidata().getjPanel16() == null) {
			getHerbalist_app_guidata().setjLabel50(new JLabel());
			getHerbalist_app_guidata().getjLabel50().setBounds(new Rectangle(819, 37, 144, 16));
			getHerbalist_app_guidata().getjLabel50().setText("Eleman Sayisi");
			getHerbalist_app_guidata().setjLabel27(new JLabel());
			getHerbalist_app_guidata().getjLabel27().setBounds(new Rectangle(819, 3, 143, 16));
			getHerbalist_app_guidata().getjLabel27().setText("Aiacin Derinliii");
			getHerbalist_app_guidata().setjLabel26(new JLabel());
			getHerbalist_app_guidata().getjLabel26().setBounds(new Rectangle(405, 32, 410, 16));
			getHerbalist_app_guidata().getjLabel26().setText("Kategori Var Mi?");
			getHerbalist_app_guidata().setjLabel25(new JLabel());
			getHerbalist_app_guidata().getjLabel25().setBounds(new Rectangle(0, 16, 777, 16));
			getHerbalist_app_guidata().getjLabel25().setText("Litfen Listelemek istedIciniz Kategoriyi Belirtiniz");
			getHerbalist_app_guidata().setjLabel61(new JLabel());
			getHerbalist_app_guidata().getjLabel61().setBounds(new Rectangle(1, 1, 776, 16));
			getHerbalist_app_guidata().getjLabel61().setText(
					"Belirtilen Bir Kategorideki Tim Urunleri Dizeyleri ile Birlikte Listeleme(Inorder,Preorder,Postorder).");
			getHerbalist_app_guidata().setjPanel16(new JPanel());
			getHerbalist_app_guidata().getjPanel16().setLayout(null);
			getHerbalist_app_guidata().getjPanel16().add(getHerbalist_app_guidata().getjLabel61(), null);
			getHerbalist_app_guidata().getjPanel16().add(getJTabbedPane6(), null);
			getHerbalist_app_guidata().getjPanel16().add(getHerbalist_app_guidata().getjLabel25(), null);
			getHerbalist_app_guidata().getjPanel16().add(getJTextField1(), null);
			getHerbalist_app_guidata().getjPanel16().add(getJButton1(), null);
			getHerbalist_app_guidata().getjPanel16().add(getJTextArea5(), null);
			getHerbalist_app_guidata().getjPanel16().add(getHerbalist_app_guidata().getjLabel26(), null);
			getHerbalist_app_guidata().getjPanel16().add(getHerbalist_app_guidata().getjLabel27(), null);
			getHerbalist_app_guidata().getjPanel16().add(getJTextField19(), null);
			getHerbalist_app_guidata().getjPanel16().add(getHerbalist_app_guidata().getjLabel50(), null);
			getHerbalist_app_guidata().getjPanel16().add(getJTextField20(), null);
		}
		return getHerbalist_app_guidata().getjPanel16();
	}

	/**
	 * This method initializes Kategori_Ekleme_ve_Silme_Menusu
	 * 
	 * @return javax.swing.JTabbedPane
	 */
	private JTabbedPane getKategori_Ekleme_ve_Silme_Menusu() {
		Kategori_Ekleme_ve_Silme_Menusu_init();
		return getHerbalist_app_guidata().getKategori_Ekleme_ve_Silme_Menusu();
	}

	/**
	 * 
	 */
	private void Kategori_Ekleme_ve_Silme_Menusu_init() {
		if (getHerbalist_app_guidata().getKategori_Ekleme_ve_Silme_Menusu() == null) {
			getHerbalist_app_guidata().setKategori_Ekleme_ve_Silme_Menusu(new JTabbedPane());
			getHerbalist_app_guidata().getKategori_Ekleme_ve_Silme_Menusu().setBounds(new Rectangle(0, 16, 973, 555));
			getHerbalist_app_guidata().getKategori_Ekleme_ve_Silme_Menusu().addTab(null, null, getKategori_Ekleme(), null);
			getHerbalist_app_guidata().getKategori_Ekleme_ve_Silme_Menusu().addTab(null, null, getKategori_Silme(), null);
		}
	}

	/**
	 * This method initializes Kategori_Ekleme
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getKategori_Ekleme() {
		Kategori_Ekleme_init();
		return getHerbalist_app_guidata().getKategori_Ekleme();
	}

	/**
	 * 
	 */
	private void Kategori_Ekleme_init() {
		if (getHerbalist_app_guidata().getKategori_Ekleme() == null) {
			getHerbalist_app_guidata().setjLabel29(new JLabel());
			getHerbalist_app_guidata().getjLabel29().setBounds(new Rectangle(290, 16, 283, 16));
			getHerbalist_app_guidata().getjLabel29().setText("Kategori Var Mi?");
			getHerbalist_app_guidata().setjLabel28(new JLabel());
			getHerbalist_app_guidata().getjLabel28().setBounds(new Rectangle(0, 16, 291, 16));
			getHerbalist_app_guidata().getjLabel28().setText("Litfen Eklemek istedIciniz Kategori ismini GUruniz");
			getHerbalist_app_guidata().setjLabel13(new JLabel());
			getHerbalist_app_guidata().getjLabel13().setBounds(new Rectangle(0, 0, 771, 16));
			getHerbalist_app_guidata().getjLabel13().setText("Kategori Ekleme");
			getHerbalist_app_guidata().setKategori_Ekleme(new JPanel());
			getHerbalist_app_guidata().getKategori_Ekleme().setLayout(null);
			getHerbalist_app_guidata().getKategori_Ekleme().add(getHerbalist_app_guidata().getjLabel13(), null);
			getHerbalist_app_guidata().getKategori_Ekleme().add(getHerbalist_app_guidata().getjLabel28(), null);
			getHerbalist_app_guidata().getKategori_Ekleme().add(Herbalist_AppGUIData.getJTextField2(), null);
			getHerbalist_app_guidata().getKategori_Ekleme().add(getHerbalist_app_guidata().getjLabel29(), null);
			getHerbalist_app_guidata().getKategori_Ekleme().add(getHerbalist_app_guidata().getJTextField3(), null);
			getHerbalist_app_guidata().getKategori_Ekleme().add(getJButton5(), null);
			getHerbalist_app_guidata().getKategori_Ekleme().add(getJButton6(), null);
			getHerbalist_app_guidata().getKategori_Ekleme().add(getJLabel30(), null);
			getHerbalist_app_guidata().getKategori_Ekleme().add(getJTextArea4(), null);
			getHerbalist_app_guidata().getKategori_Ekleme().add(getKategori_Listeleyici(), null);
		}
	}

	/**
	 * This method initializes Kategori_Silme
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getKategori_Silme() {
		Kategori_Silme_init();
		return getHerbalist_app_guidata().getKategori_Silme();
	}

	/**
	 * 
	 */
	private void Kategori_Silme_init() {
		if (getHerbalist_app_guidata().getKategori_Silme() == null) {
			getHerbalist_app_guidata().setjLabel32(new JLabel());
			getHerbalist_app_guidata().getjLabel32().setBounds(new Rectangle(0, 72, 111, 16));
			getHerbalist_app_guidata().getjLabel32().setText("Kategori Listesi");
			getHerbalist_app_guidata().setjLabel1(new JLabel());
			getHerbalist_app_guidata().getjLabel1().setBounds(new Rectangle(252, 16, 240, 16));
			getHerbalist_app_guidata().getjLabel1().setText("Kategori Var Mi?");
			getHerbalist_app_guidata().setjLabel(new JLabel());
			getHerbalist_app_guidata().getjLabel().setBounds(new Rectangle(0, 16, 252, 16));
			getHerbalist_app_guidata().getjLabel().setText("Silmek istedIciniz Kategorinin Adini GUruniz");
			getHerbalist_app_guidata().setjLabel14(new JLabel());
			getHerbalist_app_guidata().getjLabel14().setBounds(new Rectangle(0, 0, 771, 16));
			getHerbalist_app_guidata().getjLabel14().setText("Kategori Silme");
			getHerbalist_app_guidata().setKategori_Silme(new JPanel());
			getHerbalist_app_guidata().getKategori_Silme().setLayout(null);
			getHerbalist_app_guidata().getKategori_Silme().add(getHerbalist_app_guidata().getjLabel14(), null);
			getHerbalist_app_guidata().getKategori_Silme().add(getHerbalist_app_guidata().getjLabel(), null);
			getHerbalist_app_guidata().getKategori_Silme().add(getHerbalist_app_guidata().getJTextField5(), null);
			getHerbalist_app_guidata().getKategori_Silme().add(getHerbalist_app_guidata().getjLabel1(), null);
			getHerbalist_app_guidata().getKategori_Silme().add(getJTextField6(), null);
			getHerbalist_app_guidata().getKategori_Silme().add(getJButton8(), null);
			getHerbalist_app_guidata().getKategori_Silme().add(getJButton9(), null);
			getHerbalist_app_guidata().getKategori_Silme().add(getHerbalist_app_guidata().getjLabel32(), null);
			getHerbalist_app_guidata().getKategori_Silme().add(getKategori_Listeleyici_2(), null);
			getHerbalist_app_guidata().getKategori_Silme().add(getJTextArea7(), null);
		}
	}

	/**
	 * This method initializes jTextArea
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea() {
		if (getHerbalist_app_guidata().getjTextArea() == null) {
			getHerbalist_app_guidata().setjTextArea(new JTextArea());
			getHerbalist_app_guidata().getjTextArea().setBounds(new Rectangle(0, 16, 776, 181));
			getHerbalist_app_guidata().getjTextArea().setText(
					"Bitkiye Iliskin Bilgiler:\nBitki Adi,\nKategori,\nBitkinin Latince ismi,\nBitkinin izellikleri,\nMiktari,\nFiyati,\nBitki Resminin Diskteki Yeri\nBitki isminin Diskteki Adi,\ninerilen Hastaliklar\nVectore ekleme yapilacak iekilde ayarlanmali");
		}
		return getHerbalist_app_guidata().getjTextArea();
	}

	/**
	 * This method initializes Adindan_Urun_Arama_ve_Listeleme
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getAdindan_Urun_Arama_ve_Listeleme() {
		Adindan_Urun_Arama_ve_Listeleme_init();
		return getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Listeleme();
	}

	/**
	 * 
	 */
	private void Adindan_Urun_Arama_ve_Listeleme_init() {
		if (getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Listeleme() == null) {
			getHerbalist_app_guidata().setAdindan_Urun_Arama_ve_Listeleme(new JPanel());
			getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Listeleme().setLayout(null);
			getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Listeleme().setBounds(new Rectangle(0, 16, 971, 550));
			getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Listeleme().add(getJPanel23(), null);
			getHerbalist_app_guidata().getAdindan_Urun_Arama_ve_Listeleme().add(getJTextArea1(), null);
		}
	}

	/**
	 * This method initializes jPanel23
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel23() {
		if (getHerbalist_app_guidata().getjPanel23() == null) {
			getHerbalist_app_guidata().setjLabel21(new JLabel());
			getHerbalist_app_guidata().getjLabel21().setBounds(new Rectangle(0, 0, 249, 16));
			getHerbalist_app_guidata().getjLabel21().setText("Aranan Urunun Adini GUruniz:");
			getHerbalist_app_guidata().setjPanel23(new JPanel());
			getHerbalist_app_guidata().getjPanel23().setLayout(null);
			getHerbalist_app_guidata().getjPanel23().setBounds(new Rectangle(0, 0, 251, 64));
			getHerbalist_app_guidata().getjPanel23().add(getHerbalist_app_guidata().getjLabel21(), null);
			getHerbalist_app_guidata().getjPanel23().add(getJTextField(), null);
			getHerbalist_app_guidata().getjPanel23().add(getJButton(), null);
		}
		return getHerbalist_app_guidata().getjPanel23();
	}

	/**
	 * This method initializes jTextField
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField() {
		if (Herbalist_AppJTextFieldData.getjTextField() == null) {
			Herbalist_AppJTextFieldData.setjTextField(new JTextField());
			Herbalist_AppJTextFieldData.getjTextField().setBounds(new Rectangle(0, 16, 249, 16));
			Herbalist_AppJTextFieldData.getjTextField().setText("");
		}
		return Herbalist_AppJTextFieldData.getjTextField();
	}

	/**
	 * This method initializes jTextArea1
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea1() {
		if (getHerbalist_app_guidata().getjTextArea1() == null) {
			getHerbalist_app_guidata().setjTextArea1(new JTextArea());
			getHerbalist_app_guidata().getjTextArea1().setBounds(new Rectangle(0, 65, 965, 450));
			getHerbalist_app_guidata().getjTextArea1().setText("");
		}
		return getHerbalist_app_guidata().getjTextArea1();
	}

	/**
	 * This method initializes jButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton() {
		if (getHerbalist_app_guidata().getjButton() == null) {
			getHerbalist_app_guidata().setjButton(new JButton());
			getHerbalist_app_guidata().getjButton().setBounds(new Rectangle(2, 31, 246, 33));
			getHerbalist_app_guidata().getjButton().setText("Aranan Urunun Bilgilerini Listele");
			getHerbalist_app_guidata().getjButton().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					getHerbalist_app_guidata().getjTextArea1().setText(getVeritabani_listesi()
							.aranan_Urunun_bilgilerini_listele(Herbalist_AppJTextFieldData.getjTextField().getText()));
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return getHerbalist_app_guidata().getjButton();
	}

	/**
	 * This method initializes jTabbedPane6
	 * 
	 * @return javax.swing.JTabbedPane
	 */
	private JTabbedPane getJTabbedPane6() {
		if (getHerbalist_app_guidata().getjTabbedPane6() == null) {
			getHerbalist_app_guidata().setjTabbedPane6(new JTabbedPane());
			getHerbalist_app_guidata().getjTabbedPane6().setBounds(new Rectangle(0, 71, 963, 432));
			getHerbalist_app_guidata().getjTabbedPane6().addTab(null, null, getJPanel11(), null);
			getHerbalist_app_guidata().getjTabbedPane6().addTab(null, null, getJPanel24(), null);
			getHerbalist_app_guidata().getjTabbedPane6().addTab(null, null, getJPanel25(), null);
		}
		return getHerbalist_app_guidata().getjTabbedPane6();
	}

	/**
	 * This method initializes jPanel11
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel11() {
		if (getHerbalist_app_guidata().getjPanel11() == null) {
			getHerbalist_app_guidata().setjLabel22(new JLabel());
			getHerbalist_app_guidata().getjLabel22().setBounds(new Rectangle(0, 0, 59, 16));
			getHerbalist_app_guidata().getjLabel22().setText("Inorder");
			getHerbalist_app_guidata().setjPanel11(new JPanel());
			getHerbalist_app_guidata().getjPanel11().setLayout(null);
			getHerbalist_app_guidata().getjPanel11().add(getHerbalist_app_guidata().getjLabel22(), null);
			getHerbalist_app_guidata().getjPanel11().add(getJButton2(), null);
			getHerbalist_app_guidata().getjPanel11().add(getJTextArea2(), null);
		}
		return getHerbalist_app_guidata().getjPanel11();
	}

	/**
	 * This method initializes jPanel24
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel24() {
		if (getHerbalist_app_guidata().getjPanel24() == null) {
			getHerbalist_app_guidata().setjLabel23(new JLabel());
			getHerbalist_app_guidata().getjLabel23().setBounds(new Rectangle(0, 0, 64, 16));
			getHerbalist_app_guidata().getjLabel23().setText("Preorder");
			getHerbalist_app_guidata().setjPanel24(new JPanel());
			getHerbalist_app_guidata().getjPanel24().setLayout(null);
			getHerbalist_app_guidata().getjPanel24().add(getHerbalist_app_guidata().getjLabel23(), null);
			getHerbalist_app_guidata().getjPanel24().add(getJScrollPane1(), null);
			getHerbalist_app_guidata().getjPanel24().add(getJButton3(), null);
		}
		return getHerbalist_app_guidata().getjPanel24();
	}

	/**
	 * This method initializes jPanel25
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel25() {
		if (getHerbalist_app_guidata().getjPanel25() == null) {
			getHerbalist_app_guidata().setjLabel24(new JLabel());
			getHerbalist_app_guidata().getjLabel24().setBounds(new Rectangle(0, 0, 76, 16));
			getHerbalist_app_guidata().getjLabel24().setText("Postorder");
			getHerbalist_app_guidata().setjPanel25(new JPanel());
			getHerbalist_app_guidata().getjPanel25().setLayout(null);
			getHerbalist_app_guidata().getjPanel25().add(getHerbalist_app_guidata().getjLabel24(), null);
			getHerbalist_app_guidata().getjPanel25().add(getJButton4(), null);
			getHerbalist_app_guidata().getjPanel25().add(getJTextArea6(), null);
		}
		return getHerbalist_app_guidata().getjPanel25();
	}

	/**
	 * This method initializes jScrollPane1
	 * 
	 * @return javax.swing.JScrollPane
	 */
	private JScrollPane getJScrollPane1() {
		if (getHerbalist_app_guidata().getjScrollPane1() == null) {
			getHerbalist_app_guidata().setjScrollPane1(new JScrollPane());
			getHerbalist_app_guidata().getjScrollPane1().setBounds(new Rectangle(0, 16, 957, 445));
			getHerbalist_app_guidata().getjScrollPane1().setViewportView(getJTextArea3());
		}
		return getHerbalist_app_guidata().getjScrollPane1();
	}

	/**
	 * This method initializes jTextArea3
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea3() {
		if (getHerbalist_app_guidata().getjTextArea3() == null) {
			getHerbalist_app_guidata().setjTextArea3(new JTextArea());
			getHerbalist_app_guidata().getjTextArea3().setText("");
		}
		return getHerbalist_app_guidata().getjTextArea3();
	}

	/**
	 * This method initializes jTextField1
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField1() {
		if (getHerbalist_app_guidata().getjTextField1() == null) {
			getHerbalist_app_guidata().setjTextField1(new JTextField());
			getHerbalist_app_guidata().getjTextField1().setBounds(new Rectangle(0, 32, 400, 20));
			getHerbalist_app_guidata().getjTextField1().setText("");
		}
		return getHerbalist_app_guidata().getjTextField1();
	}

	private JButton getJButton1() {
		if (getHerbalist_app_guidata().getjButton1() == null) {
			getHerbalist_app_guidata().setjButton1(new JButton());
			getHerbalist_app_guidata().getjButton1().setBounds(new Rectangle(1, 50, 399, 21));
			getHerbalist_app_guidata().getjButton1().setText("Kategori Var Mi?");
			getHerbalist_app_guidata().getjButton1().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					getHerbalist_app_guidata().setYanit(
							getVeritabani_listesi().kategori_var_mi(getHerbalist_app_guidata().getjTextField1().getText()));
					getHerbalist_app_guidata().getjTextArea5().setText(getHerbalist_app_guidata().getYanit());
					if (getHerbalist_app_guidata().getYanit().compareTo("Bulunamadi") != 0) {
						int endex = getVeritabani_listesi().kategori_veri_tabanindaki_aranan_kategorinin_indexi();
						int node_sayisi = getVeritabani_listesi().su_kategorideki_agacin_node_sayisi(endex);
						getHerbalist_app_guidata().getjTextField20().setText("" + node_sayisi);
					}
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});

		}
		return getHerbalist_app_guidata().getjButton1();
	}

	/**
	 * This method initializes jTextArea5
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea5() {
		if (getHerbalist_app_guidata().getjTextArea5() == null) {
			getHerbalist_app_guidata().setjTextArea5(new JTextArea());
			getHerbalist_app_guidata().getjTextArea5().setBounds(new Rectangle(407, 51, 408, 18));
			getHerbalist_app_guidata().getjTextArea5().setText("ilk ince Arama Yapmaniz Gerekmektedir.");
		}
		return getHerbalist_app_guidata().getjTextArea5();
	}

	/**
	 * This method initializes jButton2
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton2() {
		if (getHerbalist_app_guidata().getjButton2() == null) {
			getHerbalist_app_guidata().setjButton2(new JButton());
			getHerbalist_app_guidata().getjButton2().setBounds(new Rectangle(59, 1, 115, 15));
			getHerbalist_app_guidata().getjButton2().setText("Listele");
			getHerbalist_app_guidata().getjButton2().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					getHerbalist_app_guidata().getjButton2().setText("Tiklandi zaten...");
					if (getHerbalist_app_guidata().getjTextArea5().getText()
							.compareTo("ilk ince Arama Yapmaniz Gerekmektedir.") != 0
							&& getHerbalist_app_guidata().getjTextArea5().getText()
									.compareTo("Biyle Bir Kategori Bulunmamaktadir") != 0) {
						int endex = Veritabani_Listesi.getKategori_veri_tabani()
								.getAranan_kategori_kacinci_sirada_bulundu();
						Capsule_Vector_Agac_Bitki.getAgaclar().elementAt(endex).getAgac_bitki()
								.setInorder(new Capsule_Vector_String());
						Capsule_Vector_Agac_Bitki.inOrder_request(endex, 0);
						getHerbalist_app_guidata().getjTextArea2().setText(
								Capsule_Vector_Agac_Bitki.getAgaclar().elementAt(endex).getAgac_bitki().inOrder_yazdir());
					}
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return getHerbalist_app_guidata().getjButton2();
	}

	/**
	 * This method initializes jButton3
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton3() {
		if (getHerbalist_app_guidata().getjButton3() == null) {
			getHerbalist_app_guidata().setjButton3(new JButton());
			getHerbalist_app_guidata().getjButton3().setBounds(new Rectangle(65, 1, 115, 15));
			getHerbalist_app_guidata().getjButton3().setText("Listele");
			getHerbalist_app_guidata().getjButton3().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					getHerbalist_app_guidata().getjButton3().setText("Tiklandi zaten...");
					if (getHerbalist_app_guidata().getjTextArea5().getText()
							.compareTo("ilk ince Arama Yapmaniz Gerekmektedir.") != 0
							&& getHerbalist_app_guidata().getjTextArea5().getText()
									.compareTo("Biyle Bir Kategori Bulunmamaktadir") != 0) {
						int endex = Veritabani_Listesi.getKategori_veri_tabani()
								.getAranan_kategori_kacinci_sirada_bulundu();
						Capsule_Vector_Agac_Bitki.getAgaclar().elementAt(endex).getAgac_bitki()
								.setPreorder(new Capsule_Vector_String());
						getVeritabani_listesi().verilen_indexteki_elemanin_preorder_ciktisini_hazirla(endex);
						;
						getHerbalist_app_guidata().getjTextArea3().setText(
								getVeritabani_listesi().agac_vektorundeki_su_indexteki_elemani_preorder_yazdir(endex));
					}
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return getHerbalist_app_guidata().getjButton3();
	}

	/**
	 * This method initializes jButton4
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton4() {
		if (getHerbalist_app_guidata().getjButton4() == null) {
			getHerbalist_app_guidata().setjButton4(new JButton());
			getHerbalist_app_guidata().getjButton4().setBounds(new Rectangle(74, 1, 115, 15));
			getHerbalist_app_guidata().getjButton4().setText("Listele");
			getHerbalist_app_guidata().getjButton4().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					getHerbalist_app_guidata().getjButton4().setText("Tiklandi zaten...");
					if (getHerbalist_app_guidata().getjTextArea5().getText()
							.compareTo("ilk ince Arama Yapmaniz Gerekmektedir.") != 0
							&& getHerbalist_app_guidata().getjTextArea5().getText()
									.compareTo("Biyle Bir Kategori Bulunmamaktadir") != 0) {
						int endex = getVeritabani_listesi()
								.getKategori_veri_tabaninda_Aranan_kategori_kacinci_sirada_bulundu();
						Capsule_Vector_Agac_Bitki.getAgaclar().elementAt(endex).getAgac_bitki()
								.setPostorder(new Capsule_Vector_String());
						getVeritabani_listesi().verilen_indexteki_elemanin_postorder_ciktisini_hazirla(endex);
						getHerbalist_app_guidata().getjTextArea6().setText(
								getVeritabani_listesi().agac_vektorundeki_su_indexteki_elemani_postorder_yazdir(endex));
					}
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return getHerbalist_app_guidata().getjButton4();
	}

	/**
	 * This method initializes jTextArea2
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea2() {
		if (getHerbalist_app_guidata().getjTextArea2() == null) {
			getHerbalist_app_guidata().setjTextArea2(new JTextArea());
			getHerbalist_app_guidata().getjTextArea2().setBounds(new Rectangle(0, 16, 953, 385));
			getHerbalist_app_guidata().getjTextArea2().setText("");
		}
		return getHerbalist_app_guidata().getjTextArea2();
	}

	/**
	 * This method initializes jTextArea6
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea6() {
		if (getHerbalist_app_guidata().getjTextArea6() == null) {
			getHerbalist_app_guidata().setjTextArea6(new JTextArea());
			getHerbalist_app_guidata().getjTextArea6().setBounds(new Rectangle(0, 16, 953, 385));
			getHerbalist_app_guidata().getjTextArea6().setText("");
		}
		return getHerbalist_app_guidata().getjTextArea6();
	}

	/**
	 * This method initializes jTextField2
	 * 
	 * @return javax.swing.JTextField
	 */

	/**
	 * This method initializes jButton5
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton5() {
		if (getHerbalist_app_guidata().getjButton5() == null) {
			getHerbalist_app_guidata().setjButton5(new JButton());
			getHerbalist_app_guidata().getjButton5().setBounds(new Rectangle(2, 51, 288, 18));
			getHerbalist_app_guidata().getjButton5().setText("Kategori Var Mi?");
			getHerbalist_app_guidata().getjButton5().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					getHerbalist_app_guidata().setYanit(
							getVeritabani_listesi().kategori_var_mi(Herbalist_AppGUIData.getJTextField2().getText()));
					getHerbalist_app_guidata().getJTextField3().setText(getHerbalist_app_guidata().getYanit());
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return getHerbalist_app_guidata().getjButton5();
	}

	/**
	 * This method initializes jButton6
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton6() {
		if (getHerbalist_app_guidata().getjButton6() == null) {
			getHerbalist_app_guidata().setjButton6(new JButton());
			getHerbalist_app_guidata().getjButton6().setBounds(new Rectangle(290, 51, 282, 18));
			getHerbalist_app_guidata().getjButton6().setText("Ekleme Yapmak Icin Tiklayiniz");
			getHerbalist_app_guidata().getJTextField3().setText("ilk ince Arama Yapmaniz Gerekmektedir.");
			getHerbalist_app_guidata().getjButton6().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (getHerbalist_app_guidata().getJTextField3().getText().compareTo("Bulundu") != 0
							&& getHerbalist_app_guidata().getJTextField3().getText()
									.compareTo("ilk ince Arama Yapmaniz Gerekmektedir.") != 0) {
						getHerbalist_app_guidata().getJTextField3().setText("ilk ince Arama Yapmaniz Gerekmektedir.");
						getVeritabani_listesi()
								.kategori_veri_tabanina_kategori_ekle(Herbalist_AppGUIData.getJTextField2().getText());
						Herbalist_AppGUIData.getJTextField2().setText("Ekleme Yapildi");
					}
					getHerbalist_app_guidata().getjTextArea4().setText("Yenileniyor Litfen Bekleyiniz");
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return getHerbalist_app_guidata().getjButton6();
	}

	/**
	 * This method initializes jLabel30
	 * 
	 * @return javax.swing.JLabel
	 */
	private JLabel getJLabel30() {
		if (getHerbalist_app_guidata().getjLabel30() == null) {
			getHerbalist_app_guidata().setjLabel30(new JLabel());
			getHerbalist_app_guidata().getjLabel30().setText("Kategori Listesi");
			getHerbalist_app_guidata().getjLabel30().setBounds(new Rectangle(2, 70, 166, 16));
		}
		return getHerbalist_app_guidata().getjLabel30();
	}

	/**
	 * This method initializes jTextArea4
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea4() {
		if (getHerbalist_app_guidata().getjTextArea4() == null) {
			getHerbalist_app_guidata().setjTextArea4(new JTextArea());
			getHerbalist_app_guidata().getjTextArea4().setBounds(new Rectangle(4, 87, 569, 430));
			getHerbalist_app_guidata().getjTextArea4().setText("");
		}
		return getHerbalist_app_guidata().getjTextArea4();
	}

	/**
	 * This method initializes jTextField4
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField4() {
		if (getHerbalist_app_guidata().getjTextField4() == null) {
			getHerbalist_app_guidata().setjTextField4(new JTextField());
			getHerbalist_app_guidata().getjTextField4().setBounds(new Rectangle(0, 32, 226, 20));
			getHerbalist_app_guidata().getjTextField4().setText("");
		}
		return getHerbalist_app_guidata().getjTextField4();
	}

	/**
	 * This method initializes jButton7
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton7() {
		if (getHerbalist_app_guidata().getjButton7() == null) {
			getHerbalist_app_guidata().setjButton7(new JButton());
			getHerbalist_app_guidata().getjButton7().setBounds(new Rectangle(1, 52, 224, 20));
			getHerbalist_app_guidata().getjButton7().setText("Veri Tabaninda Ara");
			getHerbalist_app_guidata().getjButton7().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					Hastalik aranan;
					aranan = Veritabani_Listesi.getHash_table().getHash_hastalik()
							.get(getHerbalist_app_guidata().getjTextField4().getText());
					if (aranan == null) {
						getHerbalist_app_guidata().getjTextField10().setText("Bulunamadi");
						getHerbalist_app_guidata().setYanit("");
					} else {
						getHerbalist_app_guidata().getjTextField10().setText("Bulundu");
						getHerbalist_app_guidata().setYanit(getHerbalist_app_guidata().getjTextField4().getText());
					}
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return getHerbalist_app_guidata().getjButton7();
	}

	/**
	 * This method initializes Kategori_Listeleyici
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getKategori_Listeleyici() {
		Kategori_Listeleyici_init();
		return getHerbalist_app_guidata().getKategori_Listeleyici();
	}

	/**
	 * 
	 */
	private void Kategori_Listeleyici_init() {
		if (getHerbalist_app_guidata().getKategori_Listeleyici() == null) {
			getHerbalist_app_guidata().setKategori_Listeleyici(new JButton());
			getHerbalist_app_guidata().getKategori_Listeleyici().setBounds(new Rectangle(166, 69, 152, 17));
			getHerbalist_app_guidata().getKategori_Listeleyici().setText("Kategori Listeleyici");
			getHerbalist_app_guidata().getKategori_Listeleyici().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					getHerbalist_app_guidata().getjTextArea4()
							.setText(Veritabani_Listesi.getKategori_veri_tabani().getKategoriler().toString());
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
	}

	/**
	 * This method initializes jTextField6
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField6() {
		if (getHerbalist_app_guidata().getjTextField6() == null) {
			getHerbalist_app_guidata().setjTextField6(new JTextField());
			getHerbalist_app_guidata().getjTextField6().setBounds(new Rectangle(250, 32, 243, 20));
			getHerbalist_app_guidata().getjTextField6().setText("ilk ince Arama Yapmaniz Gerekmektedir.");
		}
		return getHerbalist_app_guidata().getjTextField6();
	}

	/**
	 * This method initializes jButton8
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton8() {
		if (getHerbalist_app_guidata().getjButton8() == null) {
			getHerbalist_app_guidata().setjButton8(new JButton());
			getHerbalist_app_guidata().getjButton8().setBounds(new Rectangle(0, 52, 252, 20));
			getHerbalist_app_guidata().getjButton8().setText("Kategori Var Mi?");
			getHerbalist_app_guidata().getjButton8().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					getHerbalist_app_guidata().setYanit(
							getVeritabani_listesi().kategori_var_mi(getHerbalist_app_guidata().getJTextField5().getText()));
					getHerbalist_app_guidata().getjTextField6().setText(getHerbalist_app_guidata().getYanit());
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return getHerbalist_app_guidata().getjButton8();
	}

	/**
	 * This method initializes jButton9
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton9() {
		if (getHerbalist_app_guidata().getjButton9() == null) {
			getHerbalist_app_guidata().setjButton9(new JButton());
			getHerbalist_app_guidata().getjButton9().setBounds(new Rectangle(252, 52, 241, 20));
			getHerbalist_app_guidata().getjButton9().setText("Kategoriyi Silmek Icin Tiklayiniz");
			getHerbalist_app_guidata().getjButton9().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (getHerbalist_app_guidata().getjTextField6().getText().compareTo("Bulundu") == 0) {
						getHerbalist_app_guidata().getjTextField6().setText("ilk ince Arama Yapmaniz Gerekmektedir.");
						Veritabani_Listesi.getKategori_veri_tabani().kategori_sil();
						getHerbalist_app_guidata().getJTextField5().setText("Kategori Silindi");
					}
					getHerbalist_app_guidata().getjTextArea7().setText("Yenileniyor Litfen Bekleyiniz");
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return getHerbalist_app_guidata().getjButton9();
	}

	/**
	 * This method initializes Kategori_Listeleyici_2
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getKategori_Listeleyici_2() {
		Kategori_Listeleyici_2_init();
		return getHerbalist_app_guidata().getKategori_Listeleyici_2();
	}

	/**
	 * 
	 */
	private void Kategori_Listeleyici_2_init() {
		if (getHerbalist_app_guidata().getKategori_Listeleyici_2() == null) {
			getHerbalist_app_guidata().setKategori_Listeleyici_2(new JButton());
			getHerbalist_app_guidata().getKategori_Listeleyici_2().setBounds(new Rectangle(109, 73, 143, 16));
			getHerbalist_app_guidata().getKategori_Listeleyici_2().setText("Kategori Listeleyici");
			getHerbalist_app_guidata().getKategori_Listeleyici_2().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					getHerbalist_app_guidata().getjTextArea7()
							.setText(Veritabani_Listesi.getKategori_veri_tabani().getKategoriler().toString());
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
	}

	/**
	 * This method initializes jTextArea7
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea7() {
		if (getHerbalist_app_guidata().getjTextArea7() == null) {
			getHerbalist_app_guidata().setjTextArea7(new JTextArea());
			getHerbalist_app_guidata().getjTextArea7().setBounds(new Rectangle(0, 90, 965, 429));
		}
		return getHerbalist_app_guidata().getjTextArea7();
	}

	/**
	 * This method initializes jButton10
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton10() {
		if (getHerbalist_app_guidata().getjButton10() == null) {
			getHerbalist_app_guidata().setjButton10(new JButton());
			getHerbalist_app_guidata().getjButton10().setBounds(new Rectangle(0, 51, 299, 21));
			getHerbalist_app_guidata().getjButton10().setText("Urun Var Mi?");
			getHerbalist_app_guidata().getjButton10().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					// Uruni Agacta Ara
					getHerbalist_app_guidata().setYanit(getVeritabani_listesi()
							.agac_kategorilerinde_ara(getHerbalist_app_guidata().getJTextField7().getText()));
					if (getHerbalist_app_guidata().getYanit().compareTo("Bulunamadi") != 0) {
						getHerbalist_app_guidata().getjTextField8().setText("Bulundu");
					} else {
						getHerbalist_app_guidata().getjTextField8().setText(getHerbalist_app_guidata().getYanit());
					}
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return getHerbalist_app_guidata().getjButton10();
	}

	/**
	 * This method initializes jTextField8
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField8() {
		if (getHerbalist_app_guidata().getjTextField8() == null) {
			getHerbalist_app_guidata().setjTextField8(new JTextField());
			getHerbalist_app_guidata().getjTextField8().setBounds(new Rectangle(299, 32, 301, 20));
			getHerbalist_app_guidata().getjTextField8().setText("ilk ince Arama Yapmaniz Gerekmektedir");
		}
		return getHerbalist_app_guidata().getjTextField8();
	}

	/**
	 * This method initializes jButton11
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton11() {
		if (getHerbalist_app_guidata().getjButton11() == null) {
			getHerbalist_app_guidata().setjButton11(new JButton());
			getHerbalist_app_guidata().getjButton11().setBounds(new Rectangle(299, 51, 301, 20));
			getHerbalist_app_guidata().getjButton11().setText("Uruni Silmek Icin Tiklayiniz");
			getHerbalist_app_guidata().getjButton11().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {

					if (getHerbalist_app_guidata().getjTextField8().getText().compareTo("Bulundu") == 0) {
						Herbalist_AppSwingData.getjTextArea8()
								.setText("Veri Tabani Yenileniyor.Litfen Bekleyiniz");
						boolean silinme_bilgisi = getVeritabani_listesi()
								.agac_vektorunden_sil(getHerbalist_app_guidata().getJTextField7().getText());
						Herbalist_AppGUIData.agac_vectorunden_urun_silindi_mi(silinme_bilgisi);
						getVeritabani_listesi()
								.bitki_veri_tabanindan_kaldir(getHerbalist_app_guidata().getJTextField7().getText());
						getHerbalist_app_guidata().getjTextField8().setText("ilk ince Arama Yapmaniz Gerekmektedir");
						getHerbalist_app_guidata().getJTextField7().setText("Silindi");
					}
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return getHerbalist_app_guidata().getjButton11();
	}

	/**
	 * This method initializes Urun_Bilgisi_Listeleyici
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getUrun_Bilgisi_Listeleyici() {
		Urun_Bilgisi_Listeleyici_init();
		return getHerbalist_app_guidata().getUrun_Bilgisi_Listeleyici();
	}

	/**
	 * 
	 */
	private void Urun_Bilgisi_Listeleyici_init() {
		if (getHerbalist_app_guidata().getUrun_Bilgisi_Listeleyici() == null) {
			getHerbalist_app_guidata().setUrun_Bilgisi_Listeleyici(new JButton());
			getHerbalist_app_guidata().getUrun_Bilgisi_Listeleyici().setBounds(new Rectangle(110, 73, 193, 15));
			getHerbalist_app_guidata().getUrun_Bilgisi_Listeleyici().setText("Urun Bilgisi Listeleyici");
			getHerbalist_app_guidata().getUrun_Bilgisi_Listeleyici().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					Herbalist_AppSwingData.getjTextArea8().setText(getHerbalist_app_guidata().getYanit());
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
	}

	/**
	 * This method initializes jTextArea8
	 * 
	 * @return javax.swing.JTextArea
	 */
	private static JTextArea getJTextArea8() {
		if (Herbalist_AppSwingData.getjTextArea8() == null) {
			Herbalist_AppSwingData.setjTextArea8(new JTextArea());
			Herbalist_AppSwingData.getjTextArea8().setBounds(new Rectangle(-2, 89, 970, 469));
		}
		return Herbalist_AppSwingData.getjTextArea8();
	}

	/**
	 * This method initializes geiici_metin_kutusu
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getGecici_metin_kutusu() {
		Gecici_metin_kutusu_init();
		return getHerbalist_app_guidata().getGecici_metin_kutusu();
	}

	/**
	 * 
	 */
	private void Gecici_metin_kutusu_init() {
		if (getHerbalist_app_guidata().getGecici_metin_kutusu() == null) {
			getHerbalist_app_guidata().setGecici_metin_kutusu(new JTextArea());
			getHerbalist_app_guidata().getGecici_metin_kutusu().setBounds(new Rectangle(604, 58, 238, 150));
			getHerbalist_app_guidata().getGecici_metin_kutusu().setText(
					"String adi\n, String kategori\n, String latince_adi\n, int miktari\n,float fiyati\n, String diskteki_yeri\n, String diskteki_adi\n,Vector<String> inerilen_hastaliklar\n, Vector<String> izellikleri");
		}
	}

	/**
	 * This method initializes jTextField9
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField9() {
		if (getHerbalist_app_guidata().getjTextField9() == null) {
			getHerbalist_app_guidata().setjTextField9(new JTextField());
			getHerbalist_app_guidata().getjTextField9().setBounds(new Rectangle(0, 31, 262, 20));
			getHerbalist_app_guidata().getjTextField9().setText("");
		}
		return getHerbalist_app_guidata().getjTextField9();
	}

	/**
	 * This method initializes jButton12
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton12() {
		if (getHerbalist_app_guidata().getjButton12() == null) {
			getHerbalist_app_guidata().setjButton12(new JButton());
			getHerbalist_app_guidata().getjButton12().setBounds(new Rectangle(0, 49, 262, 18));
			getHerbalist_app_guidata().getjButton12().setText("Aranan Hastaligin Bilgilerini Listele");
			getHerbalist_app_guidata().getjButton12().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					getHerbalist_app_guidata().setYanit(Veritabani_Listesi.getHash_table().getHash_hastalik()
							.get(getHerbalist_app_guidata().getjTextField9().getText()).toString());

					if (getHerbalist_app_guidata().getYanit() != null) {
						getHerbalist_app_guidata().getjTextArea9().setText(getHerbalist_app_guidata().getYanit());
						System.out.println("Aranan Hastaligin Bilgileri Listelendi");
					} else {
						getHerbalist_app_guidata().getjTextArea9().setText("Bulunamadi");
					}
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return getHerbalist_app_guidata().getjButton12();
	}

	/**
	 * This method initializes jTextArea9
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea9() {
		if (getHerbalist_app_guidata().getjTextArea9() == null) {
			getHerbalist_app_guidata().setjTextArea9(new JTextArea());
			getHerbalist_app_guidata().getjTextArea9().setBounds(new Rectangle(1, 67, 972, 494));
			getHerbalist_app_guidata().getjTextArea9().setText("");
		}
		return getHerbalist_app_guidata().getjTextArea9();
	}

	/**
	 * This method initializes jTextField10
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField10() {
		if (getHerbalist_app_guidata().getjTextField10() == null) {
			getHerbalist_app_guidata().setjTextField10(new JTextField());
			getHerbalist_app_guidata().getjTextField10().setBounds(new Rectangle(223, 31, 244, 20));
			getHerbalist_app_guidata().getjTextField10().setText("");
		}
		return getHerbalist_app_guidata().getjTextField10();
	}

	/**
	 * This method initializes jTextField12
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField12() {
		if (getHerbalist_app_guidata().getjTextField12() == null) {
			getHerbalist_app_guidata().setjTextField12(new JTextField());
			getHerbalist_app_guidata().getjTextField12().setBounds(new Rectangle(1, 89, 465, 20));
			getHerbalist_app_guidata().getjTextField12().setText("");
		}
		return getHerbalist_app_guidata().getjTextField12();
	}

	private JButton getJButton14() {
		if (getHerbalist_app_guidata().getjButton14() == null) {
			getHerbalist_app_guidata().setjButton14(new JButton());
			getHerbalist_app_guidata().getjButton14().setBounds(new Rectangle(224, 67, 243, 22));
			getHerbalist_app_guidata().getjButton14().setText("Belirtiyi Eklemek Icin Tiklayiniz");
			getHerbalist_app_guidata().getjButton14().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (getHerbalist_app_guidata().getjTextField12().getText().compareTo("Eklendi") != 0)
						getHerbalist_app_guidata().getBelirtiler().add(getHerbalist_app_guidata().getjTextField12().getText());
					String metin = "";
					for (int i = 0; i < getHerbalist_app_guidata().getBelirtiler().size(); i++) {
						metin += getHerbalist_app_guidata().getBelirtiler().elementAt(i);
					}
					getHerbalist_app_guidata().getjTextArea10().setText(metin);
					getHerbalist_app_guidata().getjTextField12().setText("Eklendi");
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return getHerbalist_app_guidata().getjButton14();
	}

	/**
	 * This method initializes jTextField13
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField13() {
		if (getHerbalist_app_guidata().getjTextField13() == null) {
			getHerbalist_app_guidata().setjTextField13(new JTextField());
			getHerbalist_app_guidata().getjTextField13().setBounds(new Rectangle(1, 125, 463, 20));
			getHerbalist_app_guidata().getjTextField13().setText("");
		}
		return getHerbalist_app_guidata().getjTextField13();
	}

	/**
	 * This method initializes jButton15
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton15() {
		if (getHerbalist_app_guidata().getjButton15() == null) {
			getHerbalist_app_guidata().setjButton15(new JButton());
			getHerbalist_app_guidata().getjButton15().setBounds(new Rectangle(220, 108, 240, 19));
			getHerbalist_app_guidata().getjButton15().setText("Nedeni Eklemek Icin Tiklayiniz");
			getHerbalist_app_guidata().getjButton15().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (getHerbalist_app_guidata().getjTextField13().getText().compareTo("Eklendi") != 0) {
						getHerbalist_app_guidata().getNedenler().add(getHerbalist_app_guidata().getjTextField13().getText());
						String metin = "";
						for (int i = 0; i < getHerbalist_app_guidata().getNedenler().size(); i++) {
							metin += getHerbalist_app_guidata().getNedenler().elementAt(i);
						}
						getHerbalist_app_guidata().getjTextArea11().setText(metin);
						getHerbalist_app_guidata().getjTextField13().setText("Eklendi");
					}
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return getHerbalist_app_guidata().getjButton15();
	}

	/**
	 * This method initializes jTextField14
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField14() {
		if (getHerbalist_app_guidata().getjTextField14() == null) {
			getHerbalist_app_guidata().setjTextField14(new JTextField());
			getHerbalist_app_guidata().getjTextField14().setBounds(new Rectangle(0, 160, 465, 20));
			getHerbalist_app_guidata().getjTextField14().setText("");
		}
		return getHerbalist_app_guidata().getjTextField14();
	}

	/**
	 * This method initializes jButton16
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton16() {
		if (getHerbalist_app_guidata().getjButton16() == null) {
			getHerbalist_app_guidata().setjButton16(new JButton());
			getHerbalist_app_guidata().getjButton16().setBounds(new Rectangle(220, 143, 240, 16));
			getHerbalist_app_guidata().getjButton16().setText("Tedavi Eklemek Icin Tiklayiniz");
			getHerbalist_app_guidata().getjButton16().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (getHerbalist_app_guidata().getjTextField14().getText().compareTo("Eklendi") != 0) {
						getHerbalist_app_guidata().getTedaviler().add(getHerbalist_app_guidata().getjTextField14().getText());
						String metin = "";
						for (int i = 0; i < getHerbalist_app_guidata().getTedaviler().size(); i++) {
							metin += getHerbalist_app_guidata().getTedaviler().elementAt(i);
						}
						getHerbalist_app_guidata().getjTextArea12().setText(metin);
						getHerbalist_app_guidata().getjTextField14().setText("Eklendi");
					}
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return getHerbalist_app_guidata().getjButton16();
	}

	/**
	 * This method initializes jButton17
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton17() {
		if (getHerbalist_app_guidata().getjButton17() == null) {
			getHerbalist_app_guidata().setjButton17(new JButton());
			getHerbalist_app_guidata().getjButton17().setBounds(new Rectangle(222, 180, 241, 14));
			getHerbalist_app_guidata().getjButton17().setText("Bitkiyi Eklemek Icin Tiklayiniz");
			getHerbalist_app_guidata().getjButton17().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (getHerbalist_app_guidata().getjTextField15().getText().compareTo("Eklendi") != 0) {
						getHerbalist_app_guidata().getBitkiler().add(getHerbalist_app_guidata().getjTextField15().getText());
						String metin = "";
						for (int i = 0; i < getHerbalist_app_guidata().getBitkiler().size(); i++) {
							metin += getHerbalist_app_guidata().getBitkiler().elementAt(i);
						}
						getHerbalist_app_guidata().getjTextArea13().setText(metin);
						getHerbalist_app_guidata().getjTextField15().setText("Eklendi");
					}
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return getHerbalist_app_guidata().getjButton17();
	}

	/**
	 * This method initializes jTextField15
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField15() {
		if (getHerbalist_app_guidata().getjTextField15() == null) {
			getHerbalist_app_guidata().setjTextField15(new JTextField());
			getHerbalist_app_guidata().getjTextField15().setBounds(new Rectangle(-1, 194, 464, 20));
			getHerbalist_app_guidata().getjTextField15().setText("");
		}
		return getHerbalist_app_guidata().getjTextField15();
	}

	/**
	 * This method initializes jTextArea10
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea10() {
		if (getHerbalist_app_guidata().getjTextArea10() == null) {
			getHerbalist_app_guidata().setjTextArea10(new JTextArea());
			getHerbalist_app_guidata().getjTextArea10().setBounds(new Rectangle(472, 35, 500, 127));
		}
		return getHerbalist_app_guidata().getjTextArea10();
	}

	/**
	 * This method initializes jTextArea11
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea11() {
		if (getHerbalist_app_guidata().getjTextArea11() == null) {
			getHerbalist_app_guidata().setjTextArea11(new JTextArea());
			getHerbalist_app_guidata().getjTextArea11().setBounds(new Rectangle(468, 180, 505, 135));
		}
		return getHerbalist_app_guidata().getjTextArea11();
	}

	/**
	 * This method initializes jTextArea12
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea12() {
		if (getHerbalist_app_guidata().getjTextArea12() == null) {
			getHerbalist_app_guidata().setjTextArea12(new JTextArea());
			getHerbalist_app_guidata().getjTextArea12().setBounds(new Rectangle(0, 229, 463, 197));
		}
		return getHerbalist_app_guidata().getjTextArea12();
	}

	/**
	 * This method initializes jTextArea13
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea13() {
		if (getHerbalist_app_guidata().getjTextArea13() == null) {
			getHerbalist_app_guidata().setjTextArea13(new JTextArea());
			getHerbalist_app_guidata().getjTextArea13().setBounds(new Rectangle(470, 330, 500, 225));
		}
		return getHerbalist_app_guidata().getjTextArea13();
	}

	/**
	 * This method initializes jButton18
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton18() {
		if (getHerbalist_app_guidata().getjButton18() == null) {
			getHerbalist_app_guidata().setjButton18(new JButton());
			getHerbalist_app_guidata().getjButton18().setBounds(new Rectangle(223, 427, 241, 16));
			getHerbalist_app_guidata().getjButton18().setText("Bilgileri Kaydetmek istiyorum");
			getHerbalist_app_guidata().getjButton18().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					/* belirtiler nedenler tedaviler bitkiler */
					if (getHerbalist_app_guidata().getjTextField10().getText().compareTo("Bulunamadi") == 0) {
						getHerbalist_app_guidata().getjTextArea14().setText("Veriler Kaydediliyor");
						Hastalik yeni = new Hastalik(getHerbalist_app_guidata().getjTextField4().getText(),
								getHerbalist_app_guidata().getBelirtiler(), getHerbalist_app_guidata().getNedenler(),
								getHerbalist_app_guidata().getTedaviler(), getHerbalist_app_guidata().getBitkiler());
						Veritabani_Listesi.getHash_table().getHash_hastalik()
								.put(getHerbalist_app_guidata().getjTextField4().getText(), yeni);
						Veritabani_Listesi.getHastalik_veri_tabani().getHastaliklar().add(yeni);
						Veritabani_Listesi.getHastalik_veri_tabani().update_file();
						getHerbalist_app_guidata().getjTextArea14().setText("Veriler Kaydedildi");
					}
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return getHerbalist_app_guidata().getjButton18();
	}

	/**
	 * This method initializes jTextArea14
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea14() {
		if (getHerbalist_app_guidata().getjTextArea14() == null) {
			getHerbalist_app_guidata().setjTextArea14(new JTextArea());
			getHerbalist_app_guidata().getjTextArea14().setBounds(new Rectangle(3, 474, 459, 80));
			getHerbalist_app_guidata().getjTextArea14().setText("");
		}
		return getHerbalist_app_guidata().getjTextArea14();
	}

	/**
	 * This method initializes jTextField11
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField11() {
		if (getHerbalist_app_guidata().getjTextField11() == null) {
			getHerbalist_app_guidata().setjTextField11(new JTextField());
			getHerbalist_app_guidata().getjTextField11().setBounds(new Rectangle(166, 17, 165, 20));
			getHerbalist_app_guidata().getjTextField11().setText("0");
		}
		return getHerbalist_app_guidata().getjTextField11();
	}

	/**
	 * This method initializes jTextField16
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField16() {
		if (getHerbalist_app_guidata().getjTextField16() == null) {
			getHerbalist_app_guidata().setjTextField16(new JTextField());
			getHerbalist_app_guidata().getjTextField16().setBounds(new Rectangle(494, 16, 167, 20));
			getHerbalist_app_guidata().getjTextField16().setText("0");
		}
		return getHerbalist_app_guidata().getjTextField16();
	}

	/**
	 * This method initializes jButton13
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton13() {
		if (getHerbalist_app_guidata().getjButton13() == null) {
			getHerbalist_app_guidata().setjButton13(new JButton());
			getHerbalist_app_guidata().getjButton13().setBounds(new Rectangle(662, 17, 139, 18));
			getHerbalist_app_guidata().getjButton13().setText("Urunleri Listele");
			getHerbalist_app_guidata().getjButton13().addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					float min, max;
					min = Float.parseFloat(getHerbalist_app_guidata().getjTextField11().getText());
					max = Float.parseFloat(getHerbalist_app_guidata().getjTextField16().getText());
					getHerbalist_app_guidata().getjTextArea15()
					.setText(Veritabani_Listesi.getBitki_veri_tabani().urunleri_listele(min, max));
					System.out.println("mouseClicked()");
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return getHerbalist_app_guidata().getjButton13();
	}

	/**
	 * This method initializes jTextArea15
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea15() {
		if (getHerbalist_app_guidata().getjTextArea15() == null) {
			getHerbalist_app_guidata().setjTextArea15(new JTextArea());
			getHerbalist_app_guidata().getjTextArea15().setBounds(new Rectangle(6, 40, 964, 518));
		}
		return getHerbalist_app_guidata().getjTextArea15();
	}

	/**
	 * This method initializes jTextField17
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField17() {
		if (getHerbalist_app_guidata().getjTextField17() == null) {
			getHerbalist_app_guidata().setjTextField17(new JTextField());
			getHerbalist_app_guidata().getjTextField17().setBounds(new Rectangle(0, 33, 238, 20));
			getHerbalist_app_guidata().getjTextField17().setText("");
		}
		return getHerbalist_app_guidata().getjTextField17();
	}

	/**
	 * This method initializes jTextField18
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField18() {
		if (getHerbalist_app_guidata().getjTextField18() == null) {
			getHerbalist_app_guidata().setjTextField18(new JTextField());
			getHerbalist_app_guidata().getjTextField18().setBounds(new Rectangle(238, 33, 320, 20));
			getHerbalist_app_guidata().getjTextField18().setText("ilk ince Arama Yapmaniz Gerekmektedir.");
		}
		return getHerbalist_app_guidata().getjTextField18();
	}

	/**
	 * This method initializes jTextField19
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField19() {
		if (getHerbalist_app_guidata().getjTextField19() == null) {
			getHerbalist_app_guidata().setjTextField19(new JTextField());
			getHerbalist_app_guidata().getjTextField19().setBounds(new Rectangle(818, 19, 145, 20));
		}
		return getHerbalist_app_guidata().getjTextField19();
	}

	/**
	 * This method initializes jTextField20
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField20() {
		if (getHerbalist_app_guidata().getjTextField20() == null) {
			getHerbalist_app_guidata().setjTextField20(new JTextField());
			getHerbalist_app_guidata().getjTextField20().setBounds(new Rectangle(820, 52, 143, 20));
		}
		return getHerbalist_app_guidata().getjTextField20();
	}

	/**
	 * This method initializes jButton19
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton19() {
		if (getHerbalist_app_guidata().getjButton19() == null) {
			getHerbalist_app_guidata().setjButton19(new JButton());
			getHerbalist_app_guidata().getjButton19().setBounds(new Rectangle(3, 51, 235, 22));
			getHerbalist_app_guidata().getjButton19().setText("Agac Vekturunde Var Mi?");
		}
		return getHerbalist_app_guidata().getjButton19();
	}

	/**
	 * This method initializes Menu
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getMenu() {
		if (getHerbalist_app_guidata().getMenu() == null) {
			getHerbalist_app_guidata().setMenu(new JPanel());
			getHerbalist_app_guidata().getMenu().setLayout(null);
			getHerbalist_app_guidata().getMenu().add(getKullanici_Menusu(), null);
		}
		return getHerbalist_app_guidata().getMenu();
	}

	/**
	 * This method initializes jJMenuBar
	 * 
	 * @return javax.swing.JMenuBar
	 */
	private JMenuBar getJJMenuBar() {
		if (getHerbalist_app_guidata().getjJMenuBar() == null) {
			getHerbalist_app_guidata().setjJMenuBar(new JMenuBar());
			getHerbalist_app_guidata().getjJMenuBar().add(getFileMenu());
			getHerbalist_app_guidata().getjJMenuBar().add(getEditMenu());
			getHerbalist_app_guidata().getjJMenuBar().add(getHelpMenu());
		}
		return getHerbalist_app_guidata().getjJMenuBar();
	}

	/**
	 * This method initializes jMenu
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getFileMenu() {
		if (getHerbalist_app_guidata().getFileMenu() == null) {
			getHerbalist_app_guidata().setFileMenu(new JMenu());
			getHerbalist_app_guidata().getFileMenu().setText("Dosya");
			getHerbalist_app_guidata().getFileMenu().add(getSaveMenuItem());
			getHerbalist_app_guidata().getFileMenu().add(getExitMenuItem());
		}
		return getHerbalist_app_guidata().getFileMenu();
	}

	/**
	 * This method initializes jMenu
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getEditMenu() {
		if (getHerbalist_app_guidata().getEditMenu() == null) {
			getHerbalist_app_guidata().setEditMenu(new JMenu());
			getHerbalist_app_guidata().getEditMenu().setText("Duzenle");
			getHerbalist_app_guidata().getEditMenu().add(getCutMenuItem());
			getHerbalist_app_guidata().getEditMenu().add(getCopyMenuItem());
			getHerbalist_app_guidata().getEditMenu().add(getPasteMenuItem());
		}
		return getHerbalist_app_guidata().getEditMenu();
	}

	/**
	 * This method initializes jMenu
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getHelpMenu() {
		if (getHerbalist_app_guidata().getHelpMenu() == null) {
			getHerbalist_app_guidata().setHelpMenu(new JMenu());
			getHerbalist_app_guidata().getHelpMenu().setText("Yardim");
			getHerbalist_app_guidata().getHelpMenu().add(getAboutMenuItem());
		}
		return getHerbalist_app_guidata().getHelpMenu();
	}

	/**
	 * This method initializes jMenuItem
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getExitMenuItem() {
		ExitMenuItem_init();
		return getHerbalist_app_guidata().getExitMenuItem();
	}

	private ActionListener exitActionListener = new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
		}
	};

	/**
	 * 
	 */
	private void ExitMenuItem_init() {
		if (getHerbalist_app_guidata().getExitMenuItem() == null) {
			getHerbalist_app_guidata().setExitMenuItem(new JMenuItem());
			getHerbalist_app_guidata().getExitMenuItem().setText("Cikis");
			getHerbalist_app_guidata().getExitMenuItem().addActionListener(exitActionListener);
		}
	}

	/**
	 * This method initializes jMenuItem
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getAboutMenuItem() {
		AboutMenuItem_init();
		return getHerbalist_app_guidata().getAboutMenuItem();
	}

	/**
	 * 
	 */
	private void AboutMenuItem_init() {
		if (getHerbalist_app_guidata().getAboutMenuItem() == null) {
			getHerbalist_app_guidata().setAboutMenuItem(new JMenuItem());
			getHerbalist_app_guidata().getAboutMenuItem().setText("Hakkinda");
			getHerbalist_app_guidata().getAboutMenuItem().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JDialog aboutDialog = getAboutDialog();
					aboutDialog.pack();
					Point loc = getHerbalist_Application().getLocation();
					loc.translate(20, 20);
					aboutDialog.setLocation(loc);
					aboutDialog.setVisible(true);
				}
			});
		}
	}

	/**
	 * This method initializes aboutDialog
	 * 
	 * @return javax.swing.JDialog
	 */
	private JDialog getAboutDialog() {
		AboutDialog_init();
		return getHerbalist_app_guidata().getAboutDialog();
	}

	/**
	 * 
	 */
	private void AboutDialog_init() {
		if (getHerbalist_app_guidata().getAboutDialog() == null) {
			getHerbalist_app_guidata().setAboutDialog(new JDialog(getHerbalist_Application(), true));
			getHerbalist_app_guidata().getAboutDialog().setTitle("Hakkinda");
			getHerbalist_app_guidata().getAboutDialog().setContentPane(getAboutContentPane());
		}
	}

	/**
	 * This method initializes aboutContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getAboutContentPane() {
		AboutContentPane_init();
		return getHerbalist_app_guidata().getAboutContentPane();
	}

	/**
	 * 
	 */
	private void AboutContentPane_init() {
		if (getHerbalist_app_guidata().getAboutContentPane() == null) {
			getHerbalist_app_guidata().setAboutContentPane(new JPanel());
			getHerbalist_app_guidata().getAboutContentPane().setLayout(new BorderLayout());
			getHerbalist_app_guidata().getAboutContentPane().add(getAboutVersionLabel(), BorderLayout.CENTER);
		}
	}

	/**
	 * This method initializes aboutVersionLabel
	 * 
	 * @return javax.swing.JLabel
	 */
	private JLabel getAboutVersionLabel() {
		AboutVersionLabel_init();
		return getHerbalist_app_guidata().getAboutVersionLabel();
	}

	/**
	 * 
	 */
	private void AboutVersionLabel_init() {
		if (getHerbalist_app_guidata().getAboutVersionLabel() == null) {
			getHerbalist_app_guidata().setAboutVersionLabel(new JLabel());
			getHerbalist_app_guidata().getAboutVersionLabel().setText("Versiyon 1.1");
			getHerbalist_app_guidata().getAboutVersionLabel().setHorizontalAlignment(SwingConstants.CENTER);
		}
	}

	/**
	 * This method initializes jMenuItem
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getCutMenuItem() {
		CutMenuItem_init();
		return getHerbalist_app_guidata().getCutMenuItem();
	}

	/**
	 * 
	 */
	private void CutMenuItem_init() {
		if (getHerbalist_app_guidata().getCutMenuItem() == null) {
			getHerbalist_app_guidata().setCutMenuItem(new JMenuItem());
			getHerbalist_app_guidata().getCutMenuItem().setText("Kes");
			getHerbalist_app_guidata().getCutMenuItem()
					.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, Event.CTRL_MASK, true));
		}
	}

	/**
	 * This method initializes jMenuItem
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getCopyMenuItem() {
		CopyMenuItem_init();
		return getHerbalist_app_guidata().getCopyMenuItem();
	}

	/**
	 * 
	 */
	private void CopyMenuItem_init() {
		if (getHerbalist_app_guidata().getCopyMenuItem() == null) {
			getHerbalist_app_guidata().setCopyMenuItem(new JMenuItem());
			getHerbalist_app_guidata().getCopyMenuItem().setText("Kopyala");
			getHerbalist_app_guidata().getCopyMenuItem()
					.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, Event.CTRL_MASK, true));
		}
	}

	/**
	 * This method initializes jMenuItem
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getPasteMenuItem() {
		PasteMenuItem_init();
		return getHerbalist_app_guidata().getPasteMenuItem();
	}

	/**
	 * 
	 */
	private void PasteMenuItem_init() {
		if (getHerbalist_app_guidata().getPasteMenuItem() == null) {
			getHerbalist_app_guidata().setPasteMenuItem(new JMenuItem());
			getHerbalist_app_guidata().getPasteMenuItem().setText("Yapistir");
			getHerbalist_app_guidata().getPasteMenuItem()
					.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK, true));
		}
	}

	/**
	 * This method initializes jMenuItem
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getSaveMenuItem() {
		SaveMenuItem_init();
		return getHerbalist_app_guidata().getSaveMenuItem();
	}

	/**
	 * 
	 */
	private void SaveMenuItem_init() {
		if (getHerbalist_app_guidata().getSaveMenuItem() == null) {
			getHerbalist_app_guidata().setSaveMenuItem(new JMenuItem());
			getHerbalist_app_guidata().getSaveMenuItem().setText("Kaydet");
			getHerbalist_app_guidata().getSaveMenuItem()
					.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Event.CTRL_MASK, true));
		}
	}

	/**
	 * This method initializes Herbalist_Application
	 * 
	 * @return javax.swing.JFrame
	 */
	public JFrame getHerbalist_Application() {
		try {
			Herbalist_Application_init();
		} catch (HeadlessException e) {
			System.out.println("Sistem gorsel uygulamayi desteklemiyor.");
			e.printStackTrace();
			System.exit(0);
		}
		return getHerbalist_app_guidata().getHerbalist_Application();
	}

	/**
	 * @throws HeadlessException
	 */
	private void Herbalist_Application_init() throws HeadlessException {
		if (getHerbalist_app_guidata().getHerbalist_Application() == null) {
			getHerbalist_app_guidata().setHerbalist_Application(new JFrame());
			getHerbalist_app_guidata().getHerbalist_Application().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			getHerbalist_app_guidata().getHerbalist_Application().setJMenuBar(getJJMenuBar());
			getHerbalist_app_guidata().getHerbalist_Application().setSize(1000, 700);
			getHerbalist_app_guidata().getHerbalist_Application().setContentPane(getMenu());
			getHerbalist_app_guidata().getHerbalist_Application().setTitle("Herbalist Uygulamasi");
		}
	}

	public ActionListener getFirstActionListener() {
		return exitActionListener;
	}

	public void setFirstActionListener(ActionListener firstActionListener) {
		this.exitActionListener = firstActionListener;
	}


	/**
	 * @return the veritabani_listesi
	 */
	Veritabani_Listesi getVeritabani_listesi() {
		return veritabani_listesi;
	}


	/**
	 * @param veritabani_listesi the veritabani_listesi to set
	 */
	void setVeritabani_listesi(Veritabani_Listesi veritabani_listesi) {
		this.veritabani_listesi = veritabani_listesi;
	}


	/**
	 * @return the herbalist_app_guidata
	 */
	private static Herbalist_AppGUIData getHerbalist_app_guidata() {
		return herbalist_app_guidata;
	}


	/**
	 * @param herbalist_app_guidata the herbalist_app_guidata to set
	 */
	private static void setHerbalist_app_guidata(Herbalist_AppGUIData herbalist_app_guidata) {
		Herbalist_App.herbalist_app_guidata = herbalist_app_guidata;
	}

}
