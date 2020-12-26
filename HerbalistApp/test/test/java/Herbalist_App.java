package test.java;

import java.awt.BorderLayout;
import java.awt.Event;
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
import javax.swing.SwingUtilities;

import capsule.Capsule_Vector_Agac_Bitki;
import capsule.Capsule_Vector_String;
import dert.Hastalik;
import veri_tabani.Kategori;
import veri_tabani.Kategori_veritabani;
import veri_tabani.Veritabani_Listesi;

@SuppressWarnings("deprecation")
public class Herbalist_App {
	private JFrame Herbalist_Application = null; // @jve:decl-index=0:visual-constraint="10,0"
	private JPanel Menu = null;
	private JMenuBar jJMenuBar = null;
	private JMenu fileMenu = null;
	private JMenu editMenu = null;
	private JMenu helpMenu = null;
	private JMenuItem exitMenuItem = null;
	private JMenuItem aboutMenuItem = null;
	private JMenuItem cutMenuItem = null;
	private JMenuItem copyMenuItem = null;
	private JMenuItem pasteMenuItem = null;
	private JMenuItem saveMenuItem = null;
	private JDialog aboutDialog = null;
	private JPanel aboutContentPane = null;
	private JLabel aboutVersionLabel = null;
	private JTabbedPane Kullanici_Menusu = null;
	private JPanel jPanel = null;
	private JPanel jPanel1 = null;
	private JTabbedPane Musteri_Menusu = null;
	private JPanel jPanel2 = null;
	private JPanel Belirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi = null;
	private JPanel Verilen_Bir_Kelimenin_Kategori_agaclarinda_Tutulan_Bitkilerin_ozellikleri_icinden_Aratilmasi_Bulunan_Bitki_isimlerinin_Listelenmesi = null;
	private JPanel urun_Siparisi_Birden_cok_Paket_istenebilir_ve_Alimi = null;
	private JLabel Musteri_Menusu_Basligi = null;
	private JLabel Personel_Menusu_Basligi = null;
	private JTabbedPane Personel_Menusu = null;
	private JPanel jPanel6 = null;
	private JPanel Firmaya_Yeni_Turde_urun_Girisi = null;
	private JPanel Adindan_urun_Arama_ve_Silme = null;
	private JPanel urun_Bilgilerinde_Desisiklik = null;
	private JPanel Yeni_Hastalik_Bilgisi_Girisi = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JPanel Kategori_Listeleme_agac_Derinllisi_ve_Eleman_Sayisini_Yazdirma = null;
	private JPanel Kategori_agaclarini_Dengeleme = null;
	private JPanel Verilen_Bir_Hastalisa_iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan = null;
	private JPanel Belli_Bir_Hastalisa_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gsre_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi = null;
	private JLabel jLabel6 = null;
	private JLabel jLabel7 = null;
	private JLabel jLabel8 = null;
	private JLabel jLabel9 = null;
	private JLabel jLabel10 = null;
	private JTabbedPane jTabbedPane3 = null;
	private JPanel jPanel16 = null;
	private JLabel jLabel61 = null;
	private JLabel jLabel11 = null;
	private JLabel jLabel12 = null;
	private JTabbedPane Kategori_Ekleme_ve_Silme_Menusu = null;
	private JPanel Kategori_Ekleme = null;
	private JPanel Kategori_Silme = null;
	private JLabel jLabel13 = null;
	private JLabel jLabel14 = null;
	private JLabel jLabel15 = null;
	private JLabel jLabel16 = null;
	private JLabel jLabel17 = null;
	private JLabel jLabel18 = null;
	private JTextArea jTextArea = null;
	private JPanel Adindan_urun_Arama_ve_Listeleme = null;
	private JPanel jPanel23 = null;
	private JLabel jLabel21 = null;
	private static JTextField jTextField = null;
	private JTextArea jTextArea1 = null;
	private JButton jButton = null;
	private JTabbedPane jTabbedPane6 = null;
	private JPanel jPanel11 = null;
	private JPanel jPanel24 = null;
	private JPanel jPanel25 = null;
	private JLabel jLabel22 = null;
	private JLabel jLabel23 = null;
	private JLabel jLabel24 = null;
	private JScrollPane jScrollPane1 = null;
	private JTextArea jTextArea3 = null;
	private JLabel jLabel25 = null;
	private JTextField jTextField1 = null;
	private JButton jButton1 = null;
	private JTextArea jTextArea5 = null;
	private JLabel jLabel26 = null;
	private JButton jButton2 = null;
	private JButton jButton3 = null;
	private JButton jButton4 = null;
	private JTextArea jTextArea2 = null;
	private JLabel jLabel28 = null;
	private static JTextField jTextField2 = null;
	private JLabel jLabel29 = null;
	private static JTextField jTextField3 = null;
	private JButton jButton5 = null;
	private JButton jButton6 = null;
	private JLabel jLabel30 = null;
	private JTextArea jTextArea4 = null;
	private JLabel jLabel31 = null;
	private JTextField jTextField4 = null;
	private JButton jButton7 = null;
	private JButton Kategori_Listeleyici = null;
	private JLabel jLabel = null;
	private static JTextField jTextField5 = null;
	private JLabel jLabel1 = null;
	private JTextField jTextField6 = null;
	private JButton jButton8 = null;
	private JButton jButton9 = null;
	private JLabel jLabel32 = null;
	private JButton Kategori_Listeleyici_2 = null;
	private JTextArea jTextArea7 = null;
	private JLabel jLabel19 = null;
	private static JTextField jTextField7 = null;
	private JButton jButton10 = null;
	private JLabel jLabel20 = null;
	private JTextField jTextField8 = null;
	private JButton jButton11 = null;
	private JLabel jLabel33 = null;
	private JButton urun_Bilgisi_Listeleyici = null;
	private static JTextArea jTextArea8 = null;
	private JTextArea gesici_metin_kutusu = null;
	private JTextField jTextField9 = null;
	private JLabel jLabel34 = null;
	private JButton jButton12 = null;
	private JTextArea jTextArea9 = null;
	private JLabel jLabel35 = null;
	private JTextField jTextField10 = null;
	private JLabel jLabel37 = null;
	private JTextField jTextField12 = null;
	private JButton jButton14 = null;
	private JLabel jLabel38 = null;
	private JTextField jTextField13 = null;
	private JButton jButton15 = null;
	private JLabel jLabel39 = null;
	private JTextField jTextField14 = null;
	private JButton jButton16 = null;
	private JLabel jLabel40 = null;
	private JButton jButton17 = null;
	private JTextField jTextField15 = null;
	private JTextArea jTextArea10 = null;
	private JLabel jLabel41 = null;
	private JLabel jLabel42 = null;
	private JTextArea jTextArea11 = null;
	private JLabel jLabel43 = null;
	private JTextArea jTextArea12 = null;
	private JLabel jLabel44 = null;
	private JTextArea jTextArea13 = null;
	private JButton jButton18 = null;
	private JLabel jLabel36 = null;
	private JTextArea jTextArea14 = null;
	private JLabel jLabel45 = null;
	String yanit = ""; // @jve:decl-index=0:
	private JTextArea jTextArea6 = null;
	public Capsule_Vector_String belirtiler = new Capsule_Vector_String(); // @jve:decl-index=0:
	public Capsule_Vector_String nedenler = new Capsule_Vector_String(); // @jve:decl-index=0:
	public Capsule_Vector_String tedaviler = new Capsule_Vector_String(); // @jve:decl-index=0:
	public Capsule_Vector_String bitkiler = new Capsule_Vector_String(); // @jve:decl-index=0:
	private JLabel jLabel46 = null;
	private JLabel jLabel47 = null;
	private JLabel jLabel48 = null;
	private JTextField jTextField11 = null;
	private JTextField jTextField16 = null;
	private JButton jButton13 = null;
	private JTextArea jTextArea15 = null;
	private JTextField jTextField17 = null;
	private JLabel jLabel49 = null;
	private JTextField jTextField18 = null;
	private JLabel jLabel27 = null;
	private JTextField jTextField19 = null;
	private JLabel jLabel50 = null;
	private JTextField jTextField20 = null;
	private JButton jButton19 = null;
	/**
	 * This method initializes Kullanici_Menusu
	 * 
	 * @return javax.swing.JTabbedPane
	 */
	private JTabbedPane getKullanici_Menusu() {
		if (Kullanici_Menusu == null) {
			Kullanici_Menusu = new JTabbedPane();
			Kullanici_Menusu.setBounds(new Rectangle(0, 0, 985, 635));
			Kullanici_Menusu.addTab(null, null, getJPanel(), null);
			Kullanici_Menusu.addTab(null, null, getJPanel1(), null);
		}
		return Kullanici_Menusu;
	}

	/**
	 * This method initializes jPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			Musteri_Menusu_Basligi = new JLabel();
			Musteri_Menusu_Basligi.setBounds(new Rectangle(0, 0, 343, 16));
			Musteri_Menusu_Basligi.setText("Musterilerin Kulanabilecekleri Bslum");
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.add(getMusteri_Menusu(), null);
			jPanel.add(Musteri_Menusu_Basligi, null);
		}
		return jPanel;
	}

	/**
	 * This method initializes jPanel1
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			Personel_Menusu_Basligi = new JLabel();
			Personel_Menusu_Basligi.setBounds(new Rectangle(0, 0, 346, 16));
			Personel_Menusu_Basligi.setText("Sadece Firma Personelinin Kullanabilecesi Bslum");
			jPanel1 = new JPanel();
			jPanel1.setLayout(null);
			jPanel1.add(Personel_Menusu_Basligi, null);
			jPanel1.add(getPersonel_Menusu(), null);
		}
		return jPanel1;
	}

	/**
	 * This method initializes Musteri_Menusu
	 * 
	 * @return javax.swing.JTabbedPane
	 */
	private JTabbedPane getMusteri_Menusu() {
		if (Musteri_Menusu == null) {
			Musteri_Menusu = new JTabbedPane();
			Musteri_Menusu.setBounds(new Rectangle(0, 16, 979, 589));
			Musteri_Menusu.addTab(null, null, getJPanel2(), null);
			Musteri_Menusu.addTab(null, null, getBelirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi(), null);
			Musteri_Menusu.addTab(null, null,
					getVerilen_Bir_Kelimenin_Kategori_agaclarinda_Tutulan_Bitkilerin_ozellikleri_icinden_Aratilmasi_Bulunan_Bitki_isimlerinin_Listelenmesi(),
					null);
			Musteri_Menusu.addTab(null, null, geturun_Siparisi_Birden_sok_Paket_istenebilir_ve_Alimi(), null);
			Musteri_Menusu.addTab(null, null, getKategori_Listeleme_agac_Derinllisi_ve_Eleman_Sayisini_Yazdirma(),
					null);
			Musteri_Menusu.addTab(null, null, getKategori_agaclarini_Dengeleme(), null);
			Musteri_Menusu.addTab(null, null, getVerilen_Bir_Hastalisa_iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan(),
					null);
			Musteri_Menusu.addTab(null, null,
					getBelli_Bir_Hastalisa_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gsre_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi(),
					null);
		}
		return Musteri_Menusu;
	}

	/**
	 * This method initializes jPanel2
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(0, 0, 974, 16));
			jLabel2.setText("Adindan urun Arama ve Bilgilerini Listeleme");
			jPanel2 = new JPanel();
			jPanel2.setLayout(null);
			jPanel2.add(jLabel2, null);
			jPanel2.add(getAdindan_urun_Arama_ve_Listeleme(), null);
		}
		return jPanel2;
	}

	/**
	 * This method initializes
	 * Belirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getBelirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi() {
		if (Belirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi == null) {
			jLabel48 = new JLabel();
			jLabel48.setBounds(new Rectangle(330, 17, 166, 16));
			jLabel48.setText("Maxsimum Fiyati Giriniz");
			jLabel47 = new JLabel();
			jLabel47.setBounds(new Rectangle(-2, 17, 168, 16));
			jLabel47.setText("Minimum Fiyati Giriniz");
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(0, 1, 495, 16));
			jLabel3.setText("Belirli Fiyatlar Arasindaki Tum urunlerin Bulunup Listelenmesi");
			Belirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi = new JPanel();
			Belirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi.setLayout(null);
			Belirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi.add(jLabel3, null);
			Belirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi.add(jLabel47, null);
			Belirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi.add(jLabel48, null);
			Belirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi.add(getJTextField11(), null);
			Belirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi.add(getJTextField16(), null);
			Belirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi.add(getJButton13(), null);
			Belirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi.add(getJTextArea15(), null);
		}
		return Belirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi;
	}

	/**
	 * ThismethodinitializesVerilen_Bir_Kelimenin_Kategori_agaclarinda_Tutulan_Bitkilerin_szellikleri_icinden_Aratilmasi_Bulunan_Bitki_isimlerinin_Listelenmesi
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getVerilen_Bir_Kelimenin_Kategori_agaclarinda_Tutulan_Bitkilerin_ozellikleri_icinden_Aratilmasi_Bulunan_Bitki_isimlerinin_Listelenmesi() {
		if (Verilen_Bir_Kelimenin_Kategori_agaclarinda_Tutulan_Bitkilerin_ozellikleri_icinden_Aratilmasi_Bulunan_Bitki_isimlerinin_Listelenmesi == null) {
			jLabel4 = new JLabel();
			jLabel4.setBounds(new Rectangle(0, 2, 779, 16));
			jLabel4.setText(
					"Verilen Bir Kelimenin Kategori agaclarinda Tutulan Bitkilerin szellikleri icinden Aratilmasi,Bulunan Bitki isimlerinin Listelenmesi");
			Verilen_Bir_Kelimenin_Kategori_agaclarinda_Tutulan_Bitkilerin_ozellikleri_icinden_Aratilmasi_Bulunan_Bitki_isimlerinin_Listelenmesi = new JPanel();
			Verilen_Bir_Kelimenin_Kategori_agaclarinda_Tutulan_Bitkilerin_ozellikleri_icinden_Aratilmasi_Bulunan_Bitki_isimlerinin_Listelenmesi
					.setLayout(null);
			Verilen_Bir_Kelimenin_Kategori_agaclarinda_Tutulan_Bitkilerin_ozellikleri_icinden_Aratilmasi_Bulunan_Bitki_isimlerinin_Listelenmesi
					.add(jLabel4, null);
		}
		return Verilen_Bir_Kelimenin_Kategori_agaclarinda_Tutulan_Bitkilerin_ozellikleri_icinden_Aratilmasi_Bulunan_Bitki_isimlerinin_Listelenmesi;
	}

	/**
	 * This method initializes urun_Siparisi_Birden_sok_Paket_istenebilir_ve_Alimi
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel geturun_Siparisi_Birden_sok_Paket_istenebilir_ve_Alimi() {
		if (urun_Siparisi_Birden_cok_Paket_istenebilir_ve_Alimi == null) {
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(0, 2, 779, 16));
			jLabel5.setText("urun Siparisi (Birden sok Paket istenebilir )ve Alimi");
			urun_Siparisi_Birden_cok_Paket_istenebilir_ve_Alimi = new JPanel();
			urun_Siparisi_Birden_cok_Paket_istenebilir_ve_Alimi.setLayout(null);
			urun_Siparisi_Birden_cok_Paket_istenebilir_ve_Alimi.add(jLabel5, null);
		}
		return urun_Siparisi_Birden_cok_Paket_istenebilir_ve_Alimi;
	}

	/**
	 * This method initializes Personel_Menusu
	 * 
	 * @return javax.swing.JTabbedPane
	 */
	private JTabbedPane getPersonel_Menusu() {
		if (Personel_Menusu == null) {
			Personel_Menusu = new JTabbedPane();
			Personel_Menusu.setBounds(new Rectangle(0, 16, 979, 590));
			Personel_Menusu.addTab(null, null, getJPanel6(), null);
			Personel_Menusu.addTab(null, null, getFirmaya_Yeni_Turde_urun_Girisi(), null);
			Personel_Menusu.addTab(null, null, getAdindan_urun_Arama_ve_Silme(), null);
			Personel_Menusu.addTab(null, null, geturun_Bilgilerinde_Desisiklik(), null);
			Personel_Menusu.addTab(null, null, getYeni_Hastalik_Bilgisi_Girisi(), null);
		}
		return Personel_Menusu;
	}

	/**
	 * This method initializes jPanel6
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel6() {
		if (jPanel6 == null) {
			jLabel12 = new JLabel();
			jLabel12.setBounds(new Rectangle(0, 0, 779, 16));
			jLabel12.setText("Kategori Ekleme ve Kategori Silme");
			jPanel6 = new JPanel();
			jPanel6.setLayout(null);
			jPanel6.add(jLabel12, null);
			jPanel6.add(getKategori_Ekleme_ve_Silme_Menusu(), null);
		}
		return jPanel6;
	}

	/**
	 * This method initializes Firmaya_Yeni_Turde_urun_Girisi
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getFirmaya_Yeni_Turde_urun_Girisi() {
		if (Firmaya_Yeni_Turde_urun_Girisi == null) {
			jLabel49 = new JLabel();
			jLabel49.setBounds(new Rectangle(241, 16, 316, 16));
			jLabel49.setText("Eklenmek istenen urun capsule Kategorilerinde Var Mi?");
			jLabel46 = new JLabel();
			jLabel46.setBounds(new Rectangle(1, 16, 241, 16));
			jLabel46.setText("Eklemek istedisiniz urunun Adini Giriniz");
			jLabel15 = new JLabel();
			jLabel15.setBounds(new Rectangle(0, 0, 778, 16));
			jLabel15.setText("Firmaya Yeni Turde urun Girisi");
			Firmaya_Yeni_Turde_urun_Girisi = new JPanel();
			Firmaya_Yeni_Turde_urun_Girisi.setLayout(null);
			Firmaya_Yeni_Turde_urun_Girisi.add(jLabel15, null);
			Firmaya_Yeni_Turde_urun_Girisi.add(getGesici_metin_kutusu(), null);
			Firmaya_Yeni_Turde_urun_Girisi.add(jLabel46, null);
			Firmaya_Yeni_Turde_urun_Girisi.add(getJTextField17(), null);
			Firmaya_Yeni_Turde_urun_Girisi.add(jLabel49, null);
			Firmaya_Yeni_Turde_urun_Girisi.add(getJTextField18(), null);
			Firmaya_Yeni_Turde_urun_Girisi.add(getJButton19(), null);
		}
		return Firmaya_Yeni_Turde_urun_Girisi;
	}

	/**
	 * This method initializes Adindan_urun_Arama_ve_Silme
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getAdindan_urun_Arama_ve_Silme() {
		if (Adindan_urun_Arama_ve_Silme == null) {
			jLabel33 = new JLabel();
			jLabel33.setBounds(new Rectangle(-1, 72, 112, 16));
			jLabel33.setText("urun Bilgisi");
			jLabel20 = new JLabel();
			jLabel20.setBounds(new Rectangle(300, 16, 300, 16));
			jLabel20.setText("Aranan urun Var Mi?");
			jLabel19 = new JLabel();
			jLabel19.setBounds(new Rectangle(0, 16, 300, 16));
			jLabel19.setText("Aranan urunun Adini Giriniz");
			jLabel16 = new JLabel();
			jLabel16.setBounds(new Rectangle(0, 0, 778, 16));
			jLabel16.setText("Adindan urun Bilgisi Arama ve Silme");
			Adindan_urun_Arama_ve_Silme = new JPanel();
			Adindan_urun_Arama_ve_Silme.setLayout(null);
			Adindan_urun_Arama_ve_Silme.add(jLabel16, null);
			Adindan_urun_Arama_ve_Silme.add(jLabel19, null);
			Adindan_urun_Arama_ve_Silme.add(getJTextField7(), null);
			Adindan_urun_Arama_ve_Silme.add(getJButton10(), null);
			Adindan_urun_Arama_ve_Silme.add(jLabel20, null);
			Adindan_urun_Arama_ve_Silme.add(getJTextField8(), null);
			Adindan_urun_Arama_ve_Silme.add(getJButton11(), null);
			Adindan_urun_Arama_ve_Silme.add(jLabel33, null);
			Adindan_urun_Arama_ve_Silme.add(geturun_Bilgisi_Listeleyici(), null);
			Adindan_urun_Arama_ve_Silme.add(getJTextArea8(), null);
		}
		return Adindan_urun_Arama_ve_Silme;
	}

	/**
	 * This method initializes urun_Bilgilerinde_Desisiklik
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel geturun_Bilgilerinde_Desisiklik() {
		if (urun_Bilgilerinde_Desisiklik == null) {
			jLabel17 = new JLabel();
			jLabel17.setBounds(new Rectangle(0, 0, 775, 16));
			jLabel17.setText("urun Bilgilerinde Desisiklik");
			urun_Bilgilerinde_Desisiklik = new JPanel();
			urun_Bilgilerinde_Desisiklik.setLayout(null);
			urun_Bilgilerinde_Desisiklik.add(jLabel17, null);
			urun_Bilgilerinde_Desisiklik.add(getJTextArea(), null);
		}
		return urun_Bilgilerinde_Desisiklik;
	}

	/**
	 * This method initializes Yeni_Hastalik_Bilgisi_Girisi
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getYeni_Hastalik_Bilgisi_Girisi() {
		if (Yeni_Hastalik_Bilgisi_Girisi == null) {
			jLabel45 = new JLabel();
			jLabel45.setBounds(new Rectangle(4, 448, 220, 23));
			jLabel45.setText("Kaydetme Bilgisi");
			jLabel36 = new JLabel();
			jLabel36.setBounds(new Rectangle(0, 427, 225, 16));
			jLabel36.setText("Bilgileri Kaydetmek istiyor Musunuz?");
			jLabel44 = new JLabel();
			jLabel44.setBounds(new Rectangle(468, 313, 318, 16));
			jLabel44.setText("Tavsiye Edilen Bitkiler");
			jLabel43 = new JLabel();
			jLabel43.setBounds(new Rectangle(1, 213, 224, 16));
			jLabel43.setText("Tedavi Ysntemi");
			jLabel42 = new JLabel();
			jLabel42.setBounds(new Rectangle(470, 163, 314, 16));
			jLabel42.setText("Nedenler");
			jLabel41 = new JLabel();
			jLabel41.setBounds(new Rectangle(471, 17, 314, 16));
			jLabel41.setText("Belirtiler");
			jLabel40 = new JLabel();
			jLabel40.setBounds(new Rectangle(0, 179, 222, 16));
			jLabel40.setText("snerilen Bitkileri Ekleme Yeri");
			jLabel39 = new JLabel();
			jLabel39.setBounds(new Rectangle(-1, 144, 222, 16));
			jLabel39.setText("Tedavileri Ekleme Yeri");
			jLabel38 = new JLabel();
			jLabel38.setBounds(new Rectangle(1, 109, 220, 16));
			jLabel38.setText("Nedenleri Ekleme Yeri");
			jLabel37 = new JLabel();
			jLabel37.setBounds(new Rectangle(1, 72, 222, 16));
			jLabel37.setText("Belirtileri Ekleme Yeri");
			jLabel35 = new JLabel();
			jLabel35.setBounds(new Rectangle(226, 15, 240, 16));
			jLabel35.setText("Hastalik Veri tabaninda Var Mi?");
			jLabel31 = new JLabel();
			jLabel31.setBounds(new Rectangle(0, 16, 227, 16));
			jLabel31.setText("Hastalik Adini Giriniz");
			jLabel18 = new JLabel();
			jLabel18.setBounds(new Rectangle(0, 0, 780, 16));
			jLabel18.setText("Yeni Hastalik Bilgisi Girisi");
			Yeni_Hastalik_Bilgisi_Girisi = new JPanel();
			Yeni_Hastalik_Bilgisi_Girisi.setLayout(null);
			Yeni_Hastalik_Bilgisi_Girisi.add(jLabel18, null);
			Yeni_Hastalik_Bilgisi_Girisi.add(jLabel31, null);
			Yeni_Hastalik_Bilgisi_Girisi.add(getJTextField4(), null);
			Yeni_Hastalik_Bilgisi_Girisi.add(getJButton7(), null);
			Yeni_Hastalik_Bilgisi_Girisi.add(jLabel35, null);
			Yeni_Hastalik_Bilgisi_Girisi.add(getJTextField10(), null);
			Yeni_Hastalik_Bilgisi_Girisi.add(jLabel37, null);
			Yeni_Hastalik_Bilgisi_Girisi.add(getJTextField12(), null);
			Yeni_Hastalik_Bilgisi_Girisi.add(getJButton14(), null);
			Yeni_Hastalik_Bilgisi_Girisi.add(jLabel38, null);
			Yeni_Hastalik_Bilgisi_Girisi.add(getJTextField13(), null);
			Yeni_Hastalik_Bilgisi_Girisi.add(getJButton15(), null);
			Yeni_Hastalik_Bilgisi_Girisi.add(jLabel39, null);
			Yeni_Hastalik_Bilgisi_Girisi.add(getJTextField14(), null);
			Yeni_Hastalik_Bilgisi_Girisi.add(getJButton16(), null);
			Yeni_Hastalik_Bilgisi_Girisi.add(jLabel40, null);
			Yeni_Hastalik_Bilgisi_Girisi.add(getJButton17(), null);
			Yeni_Hastalik_Bilgisi_Girisi.add(getJTextField15(), null);
			Yeni_Hastalik_Bilgisi_Girisi.add(getJTextArea10(), null);
			Yeni_Hastalik_Bilgisi_Girisi.add(jLabel41, null);
			Yeni_Hastalik_Bilgisi_Girisi.add(jLabel42, null);
			Yeni_Hastalik_Bilgisi_Girisi.add(getJTextArea11(), null);
			Yeni_Hastalik_Bilgisi_Girisi.add(jLabel43, null);
			Yeni_Hastalik_Bilgisi_Girisi.add(getJTextArea12(), null);
			Yeni_Hastalik_Bilgisi_Girisi.add(jLabel44, null);
			Yeni_Hastalik_Bilgisi_Girisi.add(getJTextArea13(), null);
			Yeni_Hastalik_Bilgisi_Girisi.add(getJButton18(), null);
			Yeni_Hastalik_Bilgisi_Girisi.add(jLabel36, null);
			Yeni_Hastalik_Bilgisi_Girisi.add(getJTextArea14(), null);
			Yeni_Hastalik_Bilgisi_Girisi.add(jLabel45, null);
		}
		return Yeni_Hastalik_Bilgisi_Girisi;
	}

	/**
	 * This method initializes
	 * Kategori_Listeleme_agac_Derinllisi_ve_Eleman_Sayisini_Yazdirma
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getKategori_Listeleme_agac_Derinllisi_ve_Eleman_Sayisini_Yazdirma() {
		if (Kategori_Listeleme_agac_Derinllisi_ve_Eleman_Sayisini_Yazdirma == null) {
			jLabel10 = new JLabel();
			jLabel10.setBounds(new Rectangle(0, 16, 783, 16));
			jLabel10.setText(" ilgili Asacin Derinlisini ve Eleman Sayisini Yazdirma");
			jLabel6 = new JLabel();
			jLabel6.setBounds(new Rectangle(1, 2, 778, 16));
			jLabel6.setText(
					"Belirtilen Bir Kategorideki Tum urunleri Duzeyleri ile Birlikte Listeleme(inorder,Preorder,Postorder).");
			Kategori_Listeleme_agac_Derinllisi_ve_Eleman_Sayisini_Yazdirma = new JPanel();
			Kategori_Listeleme_agac_Derinllisi_ve_Eleman_Sayisini_Yazdirma.setLayout(null);
			Kategori_Listeleme_agac_Derinllisi_ve_Eleman_Sayisini_Yazdirma.add(jLabel6, null);
			Kategori_Listeleme_agac_Derinllisi_ve_Eleman_Sayisini_Yazdirma.add(jLabel10, null);
			Kategori_Listeleme_agac_Derinllisi_ve_Eleman_Sayisini_Yazdirma.add(getJTabbedPane3(), null);
		}
		return Kategori_Listeleme_agac_Derinllisi_ve_Eleman_Sayisini_Yazdirma;
	}

	/**
	 * This method initializes Kategori_agaclarini_Dengeleme
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getKategori_agaclarini_Dengeleme() {
		if (Kategori_agaclarini_Dengeleme == null) {
			jLabel7 = new JLabel();
			jLabel7.setBounds(new Rectangle(2, 1, 778, 16));
			jLabel7.setText("Kategori agaclarini Dengeleme");
			Kategori_agaclarini_Dengeleme = new JPanel();
			Kategori_agaclarini_Dengeleme.setLayout(null);
			Kategori_agaclarini_Dengeleme.add(jLabel7, null);
		}
		return Kategori_agaclarini_Dengeleme;
	}

	/**
	 * This method initializes
	 * Verilen_Bir_Hastalisa_iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getVerilen_Bir_Hastalisa_iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan() {
		if (Verilen_Bir_Hastalisa_iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan == null) {
			jLabel34 = new JLabel();
			jLabel34.setBounds(new Rectangle(0, 16, 260, 16));
			jLabel34.setText("Aranan Hastalisin Adini Giriniz");
			jLabel8 = new JLabel();
			jLabel8.setBounds(new Rectangle(0, 0, 783, 16));
			jLabel8.setText("Verilen Bir Hastalisa iliskin Bilgilerin Listelenmesi (Hash Table'dan)");
			Verilen_Bir_Hastalisa_iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan = new JPanel();
			Verilen_Bir_Hastalisa_iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan.setLayout(null);
			Verilen_Bir_Hastalisa_iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan.add(jLabel8, null);
			Verilen_Bir_Hastalisa_iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan.add(getJTextField9(), null);
			Verilen_Bir_Hastalisa_iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan.add(jLabel34, null);
			Verilen_Bir_Hastalisa_iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan.add(getJButton12(), null);
			Verilen_Bir_Hastalisa_iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan.add(getJTextArea9(), null);
		}
		return Verilen_Bir_Hastalisa_iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan;
	}

	/**
	 * ThismethodinitializesBelli_Bir_Hastalisa_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gsre_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getBelli_Bir_Hastalisa_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gsre_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi() {
		if (Belli_Bir_Hastalisa_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gsre_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi == null) {
			jLabel11 = new JLabel();
			jLabel11.setBounds(new Rectangle(0, 16, 784, 16));
			jLabel11.setText("En Ucuz N Tanesinden 1'er Paket Satin Alinmasi");
			jLabel9 = new JLabel();
			jLabel9.setBounds(new Rectangle(0, 1, 780, 16));
			jLabel9.setText("Belli Bir Hastalisa iyi Gelebilen Bitkilerin Fiyatlarina Gsre Heap'e Atilmasi");
			Belli_Bir_Hastalisa_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gsre_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi = new JPanel();
			Belli_Bir_Hastalisa_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gsre_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi
					.setLayout(null);
			Belli_Bir_Hastalisa_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gsre_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi
					.add(jLabel9, null);
			Belli_Bir_Hastalisa_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gsre_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi
					.add(jLabel11, null);
		}
		return Belli_Bir_Hastalisa_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gsre_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi;
	}

	/**
	 * This method initializes jTabbedPane3
	 * 
	 * @return javax.swing.JTabbedPane
	 */
	private JTabbedPane getJTabbedPane3() {
		if (jTabbedPane3 == null) {
			jTabbedPane3 = new JTabbedPane();
			jTabbedPane3.setBounds(new Rectangle(-1, 31, 972, 531));
			jTabbedPane3.addTab(null, null, getJPanel16(), null);
		}
		return jTabbedPane3;
	}

	/**
	 * This method initializes jPanel16
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel16() {
		if (jPanel16 == null) {
			jLabel50 = new JLabel();
			jLabel50.setBounds(new Rectangle(819, 37, 144, 16));
			jLabel50.setText("Eleman Sayisi");
			jLabel27 = new JLabel();
			jLabel27.setBounds(new Rectangle(819, 3, 143, 16));
			jLabel27.setText("Asacin Derinlisi");
			jLabel26 = new JLabel();
			jLabel26.setBounds(new Rectangle(405, 32, 410, 16));
			jLabel26.setText("Kategori Var Mi?");
			jLabel25 = new JLabel();
			jLabel25.setBounds(new Rectangle(0, 16, 777, 16));
			jLabel25.setText("Lutfen Listelemek istedisiniz Kategoriyi Belirtiniz");
			jLabel61 = new JLabel();
			jLabel61.setBounds(new Rectangle(1, 1, 776, 16));
			jLabel61.setText(
					"Belirtilen Bir Kategorideki Tum urunleri Duzeyleri ile Birlikte Listeleme(inorder,Preorder,Postorder).");
			jPanel16 = new JPanel();
			jPanel16.setLayout(null);
			jPanel16.add(jLabel61, null);
			jPanel16.add(getJTabbedPane6(), null);
			jPanel16.add(jLabel25, null);
			jPanel16.add(getJTextField1(), null);
			jPanel16.add(getJButton1(), null);
			jPanel16.add(getJTextArea5(), null);
			jPanel16.add(jLabel26, null);
			jPanel16.add(jLabel27, null);
			jPanel16.add(getJTextField19(), null);
			jPanel16.add(jLabel50, null);
			jPanel16.add(getJTextField20(), null);
		}
		return jPanel16;
	}

	/**
	 * This method initializes Kategori_Ekleme_ve_Silme_Menusu
	 * 
	 * @return javax.swing.JTabbedPane
	 */
	private JTabbedPane getKategori_Ekleme_ve_Silme_Menusu() {
		if (Kategori_Ekleme_ve_Silme_Menusu == null) {
			Kategori_Ekleme_ve_Silme_Menusu = new JTabbedPane();
			Kategori_Ekleme_ve_Silme_Menusu.setBounds(new Rectangle(0, 16, 973, 555));
			Kategori_Ekleme_ve_Silme_Menusu.addTab(null, null, getKategori_Ekleme(), null);
			Kategori_Ekleme_ve_Silme_Menusu.addTab(null, null, getKategori_Silme(), null);
		}
		return Kategori_Ekleme_ve_Silme_Menusu;
	}

	/**
	 * This method initializes Kategori_Ekleme
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getKategori_Ekleme() {
		if (Kategori_Ekleme == null) {
			jLabel29 = new JLabel();
			jLabel29.setBounds(new Rectangle(290, 16, 283, 16));
			jLabel29.setText("Kategori Var Mi?");
			jLabel28 = new JLabel();
			jLabel28.setBounds(new Rectangle(0, 16, 291, 16));
			jLabel28.setText("Lutfen Eklemek istedisiniz Kategori ismini Giriniz");
			jLabel13 = new JLabel();
			jLabel13.setBounds(new Rectangle(0, 0, 771, 16));
			jLabel13.setText("Kategori Ekleme");
			Kategori_Ekleme = new JPanel();
			Kategori_Ekleme.setLayout(null);
			Kategori_Ekleme.add(jLabel13, null);
			Kategori_Ekleme.add(jLabel28, null);
			Kategori_Ekleme.add(getJTextField2(), null);
			Kategori_Ekleme.add(jLabel29, null);
			Kategori_Ekleme.add(getJTextField3(), null);
			Kategori_Ekleme.add(getJButton5(), null);
			Kategori_Ekleme.add(getJButton6(), null);
			Kategori_Ekleme.add(getJLabel30(), null);
			Kategori_Ekleme.add(getJTextArea4(), null);
			Kategori_Ekleme.add(getKategori_Listeleyici(), null);
		}
		return Kategori_Ekleme;
	}

	/**
	 * This method initializes Kategori_Silme
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getKategori_Silme() {
		if (Kategori_Silme == null) {
			jLabel32 = new JLabel();
			jLabel32.setBounds(new Rectangle(0, 72, 111, 16));
			jLabel32.setText("Kategori Listesi");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(252, 16, 240, 16));
			jLabel1.setText("Kategori Var Mi?");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(0, 16, 252, 16));
			jLabel.setText("Silmek istedisiniz Kategorinin Adini Giriniz");
			jLabel14 = new JLabel();
			jLabel14.setBounds(new Rectangle(0, 0, 771, 16));
			jLabel14.setText("Kategori Silme");
			Kategori_Silme = new JPanel();
			Kategori_Silme.setLayout(null);
			Kategori_Silme.add(jLabel14, null);
			Kategori_Silme.add(jLabel, null);
			Kategori_Silme.add(getJTextField5(), null);
			Kategori_Silme.add(jLabel1, null);
			Kategori_Silme.add(getJTextField6(), null);
			Kategori_Silme.add(getJButton8(), null);
			Kategori_Silme.add(getJButton9(), null);
			Kategori_Silme.add(jLabel32, null);
			Kategori_Silme.add(getKategori_Listeleyici_2(), null);
			Kategori_Silme.add(getJTextArea7(), null);
		}
		return Kategori_Silme;
	}

	/**
	 * This method initializes jTextArea
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
			jTextArea.setBounds(new Rectangle(0, 16, 776, 181));
			jTextArea.setText(
					"Bitkiye iliskin Bilgiler:\nBitki Adi,\nKategori,\nBitkinin Latince ismi,\nBitkinin szellikleri,\nMiktari,\nFiyati,\nBitki Resminin Diskteki Yeri\nBitki isminin Diskteki Adi,\nsnerilen Hastaliklar\nVectore ekleme yapilacak sekilde ayarlanmali");
		}
		return jTextArea;
	}

	/**
	 * This method initializes Adindan_urun_Arama_ve_Listeleme
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getAdindan_urun_Arama_ve_Listeleme() {
		if (Adindan_urun_Arama_ve_Listeleme == null) {
			Adindan_urun_Arama_ve_Listeleme = new JPanel();
			Adindan_urun_Arama_ve_Listeleme.setLayout(null);
			Adindan_urun_Arama_ve_Listeleme.setBounds(new Rectangle(0, 16, 971, 550));
			Adindan_urun_Arama_ve_Listeleme.add(getJPanel23(), null);
			Adindan_urun_Arama_ve_Listeleme.add(getJTextArea1(), null);
		}
		return Adindan_urun_Arama_ve_Listeleme;
	}

	/**
	 * This method initializes jPanel23
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel23() {
		if (jPanel23 == null) {
			jLabel21 = new JLabel();
			jLabel21.setBounds(new Rectangle(0, 0, 249, 16));
			jLabel21.setText("Aranan urunun Adini Giriniz:");
			jPanel23 = new JPanel();
			jPanel23.setLayout(null);
			jPanel23.setBounds(new Rectangle(0, 0, 251, 64));
			jPanel23.add(jLabel21, null);
			jPanel23.add(getJTextField(), null);
			jPanel23.add(getJButton(), null);
		}
		return jPanel23;
	}

	/**
	 * This method initializes jTextField
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
			jTextField.setBounds(new Rectangle(0, 16, 249, 16));
			jTextField.setText("");
		}
		return jTextField;
	}

	/**
	 * This method initializes jTextArea1
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea1() {
		if (jTextArea1 == null) {
			jTextArea1 = new JTextArea();
			jTextArea1.setBounds(new Rectangle(0, 65, 965, 450));
			jTextArea1.setText("");
		}
		return jTextArea1;
	}



	/**
	 * This method initializes jButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setBounds(new Rectangle(2, 31, 246, 33));
			jButton.setText("Aranan urunun Bilgilerini Listele");
			jButton.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					jTextArea1.setText(SQL.getVeritabani_listesi().aranan_urunun_bilgilerini_listele(jTextField.getText()));
					System.out.println("Aranan urun Bilgileri Listelendi");
					// Auto-generated
					// Event stub
					// mouseClicked()
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
		return jButton;
	}

	/**
	 * This method initializes jTabbedPane6
	 * 
	 * @return javax.swing.JTabbedPane
	 */
	private JTabbedPane getJTabbedPane6() {
		if (jTabbedPane6 == null) {
			jTabbedPane6 = new JTabbedPane();
			jTabbedPane6.setBounds(new Rectangle(0, 71, 963, 432));
			jTabbedPane6.addTab(null, null, getJPanel11(), null);
			jTabbedPane6.addTab(null, null, getJPanel24(), null);
			jTabbedPane6.addTab(null, null, getJPanel25(), null);
		}
		return jTabbedPane6;
	}

	/**
	 * This method initializes jPanel11
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel11() {
		if (jPanel11 == null) {
			jLabel22 = new JLabel();
			jLabel22.setBounds(new Rectangle(0, 0, 59, 16));
			jLabel22.setText("inorder");
			jPanel11 = new JPanel();
			jPanel11.setLayout(null);
			jPanel11.add(jLabel22, null);
			jPanel11.add(getJButton2(), null);
			jPanel11.add(getJTextArea2(), null);
		}
		return jPanel11;
	}

	/**
	 * This method initializes jPanel24
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel24() {
		if (jPanel24 == null) {
			jLabel23 = new JLabel();
			jLabel23.setBounds(new Rectangle(0, 0, 64, 16));
			jLabel23.setText("Preorder");
			jPanel24 = new JPanel();
			jPanel24.setLayout(null);
			jPanel24.add(jLabel23, null);
			jPanel24.add(getJScrollPane1(), null);
			jPanel24.add(getJButton3(), null);
		}
		return jPanel24;
	}

	/**
	 * This method initializes jPanel25
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel25() {
		if (jPanel25 == null) {
			jLabel24 = new JLabel();
			jLabel24.setBounds(new Rectangle(0, 0, 76, 16));
			jLabel24.setText("Postorder");
			jPanel25 = new JPanel();
			jPanel25.setLayout(null);
			jPanel25.add(jLabel24, null);
			jPanel25.add(getJButton4(), null);
			jPanel25.add(getJTextArea6(), null);
		}
		return jPanel25;
	}

	/**
	 * This method initializes jScrollPane1
	 * 
	 * @return javax.swing.JScrollPane
	 */
	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setBounds(new Rectangle(0, 16, 957, 445));
			jScrollPane1.setViewportView(getJTextArea3());
		}
		return jScrollPane1;
	}

	/**
	 * This method initializes jTextArea3
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea3() {
		if (jTextArea3 == null) {
			jTextArea3 = new JTextArea();
			jTextArea3.setText("");
		}
		return jTextArea3;
	}

	/**
	 * This method initializes jTextField1
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setBounds(new Rectangle(0, 32, 400, 20));
			jTextField1.setText("");
		}
		return jTextField1;
	}

	public synchronized String kategori_var_mi(String aranan) {
		String yanit = Veritabani_Listesi.getKategori_veri_tabani().kategoriyi_arastir(aranan);
		return yanit;
	}

	/**
	 * This method initializes jButton1
	 * 
	 * @return javax.swing.JButton
	 */


	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setBounds(new Rectangle(1, 50, 399, 21));
			jButton1.setText("Kategori Var Mi?");
			jButton1.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					yanit = kategori_var_mi(jTextField1.getText());
					jTextArea5.setText(yanit);
					if (yanit.compareTo("Bulunamadi") != 0) {
						int endex = Veritabani_Listesi.getKategori_veri_tabani()
								.getAranan_kategori_kacinci_sirada_bulundu();
						Capsule_Vector_Agac_Bitki.getAgaclar().elementAt(endex);
						jTextField20.setText(
								"" + Capsule_Vector_Agac_Bitki.getAgaclar().elementAt(endex).getAgac_bitki().getNode_sayisi());
					}
					System.out.println("mouseClicked()");
					// Event stub
					// mouseClicked()
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
		return jButton1;
	}

	/**
	 * This method initializes jTextArea5
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea5() {
		if (jTextArea5 == null) {
			jTextArea5 = new JTextArea();
			jTextArea5.setBounds(new Rectangle(407, 51, 408, 18));
			jTextArea5.setText("ilk snce Arama Yapmaniz Gerekmektedir.");
		}
		return jTextArea5;
	}

	/**
	 * This method initializes jButton2
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setBounds(new Rectangle(59, 1, 115, 15));
			jButton2.setText("Listele");
			jButton2.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					jButton2.setText("Tiklandi zaten...");
					if (jTextArea5.getText().compareTo("ilk snce Arama Yapmaniz Gerekmektedir.") != 0
							&& jTextArea5.getText().compareTo("Bsyle Bir Kategori Bulunmamaktadir") != 0) {
						int endex = Veritabani_Listesi.getKategori_veri_tabani()
								.getAranan_kategori_kacinci_sirada_bulundu();
						Capsule_Vector_Agac_Bitki.getAgaclar().elementAt(endex).getAgac_bitki()
								.setInorder(new Capsule_Vector_String());
						Capsule_Vector_Agac_Bitki.inOrder_request(endex, 0);
						jTextArea2.setText(
								Capsule_Vector_Agac_Bitki.getAgaclar().elementAt(endex).getAgac_bitki().inOrder_yazdir());
						// jTextArea2.setText(getAgac_vektoru().getagaclar().elementAt(endex).preOrder_yazdir());
					}
					System.out.println("mouseClicked()");
					// Event stub
					// mouseClicked()
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
		return jButton2;
	}

	/**
	 * This method initializes jButton3
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setBounds(new Rectangle(65, 1, 115, 15));
			jButton3.setText("Listele");
			jButton3.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					jButton3.setText("Tiklandi zaten...");
					if (jTextArea5.getText().compareTo("ilk snce Arama Yapmaniz Gerekmektedir.") != 0
							&& jTextArea5.getText().compareTo("Bsyle Bir Kategori Bulunmamaktadir") != 0) {
						int endex = Veritabani_Listesi.getKategori_veri_tabani()
								.getAranan_kategori_kacinci_sirada_bulundu();
						Capsule_Vector_Agac_Bitki.getAgaclar().elementAt(endex).getAgac_bitki()
								.setPreorder(new Capsule_Vector_String());
						Capsule_Vector_Agac_Bitki.preOrder_request(endex, 0);
						jTextArea3.setText(
								Capsule_Vector_Agac_Bitki.getAgaclar().elementAt(endex).getAgac_bitki().preOrder_yazdir());
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
		return jButton3;
	}

	/**
	 * This method initializes jButton4
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setBounds(new Rectangle(74, 1, 115, 15));
			jButton4.setText("Listele");
			jButton4.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					jButton4.setText("Tiklandi zaten...");
					if (jTextArea5.getText().compareTo("ilk snce Arama Yapmaniz Gerekmektedir.") != 0
							&& jTextArea5.getText().compareTo("Bsyle Bir Kategori Bulunmamaktadir") != 0) {
						int endex = Veritabani_Listesi.getKategori_veri_tabani()
								.getAranan_kategori_kacinci_sirada_bulundu();
						Capsule_Vector_Agac_Bitki.getAgaclar().elementAt(endex).getAgac_bitki()
								.setPostorder(new Capsule_Vector_String());
						Capsule_Vector_Agac_Bitki.postOrder_request(endex, 0);
						jTextArea6.setText(
								Capsule_Vector_Agac_Bitki.getAgaclar().elementAt(endex).getAgac_bitki().postOrder_yazdir());
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
		return jButton4;
	}

	/**
	 * This method initializes jTextArea2
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea2() {
		if (jTextArea2 == null) {
			jTextArea2 = new JTextArea();
			jTextArea2.setBounds(new Rectangle(0, 16, 953, 385));
			jTextArea2.setText("");
		}
		return jTextArea2;
	}

	/**
	 * This method initializes jTextArea6
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea6() {
		if (jTextArea6 == null) {
			jTextArea6 = new JTextArea();
			jTextArea6.setBounds(new Rectangle(0, 16, 953, 385));
			jTextArea6.setText("");
		}
		return jTextArea6;
	}


	/**
	 * This method initializes jTextField2
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setBounds(new Rectangle(0, 32, 291, 20));
			jTextField2.setText("");
		}
		return jTextField2;
	}

	/**
	 * This method initializes jTextField3
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
			jTextField3.setBounds(new Rectangle(290, 32, 284, 20));
			jTextField3.setText("ilk snce Arama Yapmaniz Gerekmektedir.");
		}
		return jTextField3;
	}

	/**
	 * This method initializes jButton5
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton5() {
		if (jButton5 == null) {
			jButton5 = new JButton();
			jButton5.setBounds(new Rectangle(2, 51, 288, 18));
			jButton5.setText("Kategori Var Mi?");
			jButton5.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					yanit = kategori_var_mi(jTextField2.getText());
					jTextField3.setText(yanit);
					System.out.println("mouseClicked()");
					// Event stub
					// mouseClicked()
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
		return jButton5;
	}

	/**
	 * This method initializes jButton6
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton6() {
		if (jButton6 == null) {
			jButton6 = new JButton();
			jButton6.setBounds(new Rectangle(290, 51, 282, 18));
			jButton6.setText("Ekleme Yapmak isin Tiklayiniz");
			jTextField3.setText("ilk snce Arama Yapmaniz Gerekmektedir.");
			jButton6.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (jTextField3.getText().compareTo("Bulundu") != 0
							&& jTextField3.getText().compareTo("ilk snce Arama Yapmaniz Gerekmektedir.") != 0) {
						jTextField3.setText("ilk snce Arama Yapmaniz Gerekmektedir.");
						kategori_ekle();
						jTextField2.setText("Ekleme Yapildi");
					}
					jTextArea4.setText("Yenileniyor Lutfen Bekleyiniz");
					System.out.println("mouseClicked()");
					// Event stub
					// mouseClicked()
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
		return jButton6;
	}


	public synchronized void kategori_ekle() {
		int kategori_no = Veritabani_Listesi.getKategori_veri_tabani().getKategoriler().getKategoriler().size();
		String kategori_adi = jTextField2.getText();
		Kategori kategori = new Kategori(kategori_no, kategori_adi);
		Kategori_veritabani.add_kategori(kategori);
		Veritabani_Listesi.getKategori_veri_tabani().update_file();
		System.out.println(Veritabani_Listesi.getKategori_veri_tabani().getKategoriler().getKategoriler().lastElement().toString());
	}

	/**
	 * This method initializes jLabel30
	 * 
	 * @return javax.swing.JLabel
	 */
	private JLabel getJLabel30() {
		if (jLabel30 == null) {
			jLabel30 = new JLabel();
			jLabel30.setText("Kategori Listesi");
			jLabel30.setBounds(new Rectangle(2, 70, 166, 16));
		}
		return jLabel30;
	}

	/**
	 * This method initializes jTextArea4
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea4() {
		if (jTextArea4 == null) {
			jTextArea4 = new JTextArea();
			jTextArea4.setBounds(new Rectangle(4, 87, 569, 430));
			jTextArea4.setText("");
		}
		return jTextArea4;
	}

	/**
	 * This method initializes jTextField4
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField4() {
		if (jTextField4 == null) {
			jTextField4 = new JTextField();
			jTextField4.setBounds(new Rectangle(0, 32, 226, 20));
			jTextField4.setText("");
		}
		return jTextField4;
	}

	/**
	 * This method initializes jButton7
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton7() {
		if (jButton7 == null) {
			jButton7 = new JButton();
			jButton7.setBounds(new Rectangle(1, 52, 224, 20));
			jButton7.setText("Veri tabaninda Ara");
			jButton7.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					Hastalik aranan;
					aranan = Veritabani_Listesi.getHash_table().getHash_hastalik().get(jTextField4.getText());
					if (aranan == null) {
						jTextField10.setText("Bulunamadi");
						yanit = "";
					} else {
						jTextField10.setText("Bulundu");
						yanit = jTextField4.getText();
					}

					System.out.println("mouseClicked()");
					// Event stub
					// mouseClicked()
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
		return jButton7;
	}

	/**
	 * This method initializes Kategori_Listeleyici
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getKategori_Listeleyici() {
		if (Kategori_Listeleyici == null) {
			Kategori_Listeleyici = new JButton();
			Kategori_Listeleyici.setBounds(new Rectangle(166, 69, 152, 17));
			Kategori_Listeleyici.setText("Kategori Listeleyici");
			Kategori_Listeleyici.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					jTextArea4.setText(Veritabani_Listesi.getKategori_veri_tabani().getKategoriler().toString());
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
		return Kategori_Listeleyici;
	}

	/**
	 * This method initializes jTextField5
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField5() {
		if (jTextField5 == null) {
			jTextField5 = new JTextField();
			jTextField5.setBounds(new Rectangle(0, 32, 251, 20));
			jTextField5.setText("");
		}
		return jTextField5;
	}

	/**
	 * This method initializes jTextField6
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField6() {
		if (jTextField6 == null) {
			jTextField6 = new JTextField();
			jTextField6.setBounds(new Rectangle(250, 32, 243, 20));
			jTextField6.setText("ilk snce Arama Yapmaniz Gerekmektedir.");
		}
		return jTextField6;
	}

	/**
	 * This method initializes jButton8
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton8() {
		if (jButton8 == null) {
			jButton8 = new JButton();
			jButton8.setBounds(new Rectangle(0, 52, 252, 20));
			jButton8.setText("Kategori Var Mi?");
			jButton8.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					yanit = kategori_var_mi(jTextField5.getText());
					jTextField6.setText(yanit);
					System.out.println("mouseClicked()");
					// Event stub
					// mouseClicked()
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
		return jButton8;
	}

	/**
	 * This method initializes jButton9
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton9() {
		if (jButton9 == null) {
			jButton9 = new JButton();
			jButton9.setBounds(new Rectangle(252, 52, 241, 20));
			jButton9.setText("Kategoriyi Silmek isin Tiklayiniz");
			jButton9.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (jTextField6.getText().compareTo("Bulundu") == 0) {
						jTextField6.setText("ilk snce Arama Yapmaniz Gerekmektedir.");
						kategori_sil();
						jTextField5.setText("Kategori Silindi");
					}
					jTextArea7.setText("Yenileniyor Lutfen Bekleyiniz");
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
		return jButton9;
	}

	public synchronized void kategori_sil() {
		Veritabani_Listesi.getKategori_veri_tabani().kategoriyi_sil();
		Veritabani_Listesi.getKategori_veri_tabani().update_file();
	}

	/**
	 * This method initializes Kategori_Listeleyici_2
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getKategori_Listeleyici_2() {
		if (Kategori_Listeleyici_2 == null) {
			Kategori_Listeleyici_2 = new JButton();
			Kategori_Listeleyici_2.setBounds(new Rectangle(109, 73, 143, 16));
			Kategori_Listeleyici_2.setText("Kategori Listeleyici");
			Kategori_Listeleyici_2.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					jTextArea7.setText(Veritabani_Listesi.getKategori_veri_tabani().getKategoriler().toString());
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
		return Kategori_Listeleyici_2;
	}

	/**
	 * This method initializes jTextArea7
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea7() {
		if (jTextArea7 == null) {
			jTextArea7 = new JTextArea();
			jTextArea7.setBounds(new Rectangle(0, 90, 965, 429));
		}
		return jTextArea7;
	}

	/**
	 * This method initializes jTextField7
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField7() {
		if (jTextField7 == null) {
			jTextField7 = new JTextField();
			jTextField7.setBounds(new Rectangle(1, 32, 300, 20));
			jTextField7.setText("");
		}
		return jTextField7;
	}

	/**
	 * This method initializes jButton10
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton10() {
		if (jButton10 == null) {
			jButton10 = new JButton();
			jButton10.setBounds(new Rectangle(0, 51, 299, 21));
			jButton10.setText("urun Var Mi?");
			jButton10.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					// urunu agacta Ara
					yanit = agac_kategorilerinde_ara(jTextField7.getText());
					if (yanit.compareTo("Bulunamadi") != 0) {
						jTextField8.setText("Bulundu");
					} else {
						jTextField8.setText(yanit);
					}
					System.out.println("mouseClicked()");
					// Event stub
					// mouseClicked()
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
		return jButton10;
	}

	public String agac_kategorilerinde_ara(String aranan_urun) {
		String aranan_bitki = "";
		aranan_bitki = Veritabani_Listesi.getAgac_vektoru().search_on_trees(aranan_urun);
		return aranan_bitki;
	}

	/**
	 * This method initializes jTextField8
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField8() {
		if (jTextField8 == null) {
			jTextField8 = new JTextField();
			jTextField8.setBounds(new Rectangle(299, 32, 301, 20));
			jTextField8.setText("ilk snce Arama Yapmaniz Gerekmektedir");
		}
		return jTextField8;
	}

	/**
	 * This method initializes jButton11
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton11() {
		if (jButton11 == null) {
			jButton11 = new JButton();
			jButton11.setBounds(new Rectangle(299, 51, 301, 20));
			jButton11.setText("urunu Silmek isin Tiklayiniz");
			jButton11.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {

					if (jTextField8.getText().compareTo("Bulundu") == 0) {
						jTextArea8.setText("Veri tabani Yenileniyor.Lutfen Bekleyiniz");
						agac_vektorunden_kaldir();
						bitki_veri_tabanindan_kaldir();
						jTextField8.setText("ilk snce Arama Yapmaniz Gerekmektedir");
						jTextField7.setText("Silindi");
						/*
						 * yanit = " "; jTextArea8.setText(" ");// Silinen urun Bilgileri // Ekrandan //
						 * Siliniyor
						 */
					}

					System.out.println("mouseClicked()");
					// Event stub
					// mouseClicked()
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
		return jButton11;
	}

	public synchronized void bitki_veri_tabanindan_kaldir() {
		Veritabani_Listesi.getBitki_veri_tabani().remove(jTextField7.getText());
		Veritabani_Listesi.getBitki_veri_tabani().update_file();
	}

	public synchronized void agac_vektorunden_kaldir() {
		int urunun_bulundusu_kategorinin_nosu;
		urunun_bulundusu_kategorinin_nosu = Veritabani_Listesi.getAgac_vektoru()
				.getAranan_urun_hangi_kategoride_bulundu();
		boolean sonus = Veritabani_Listesi.getAgac_vektoru().agac_remove(urunun_bulundusu_kategorinin_nosu,jTextField7.getText());
		if (sonus == true) {
			jTextArea8.setText("agac_vektorunden urun Silindi");
			System.out.println("agac_vektorunden urun Silindi");
		} else {
			jTextArea8.setText("agac_vektorunde urun Bulunamadi");
			System.out.println("agac_vektorunde urun Bulunamadi");
		}
	}

	/**
	 * This method initializes urun_Bilgisi_Listeleyici
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton geturun_Bilgisi_Listeleyici() {
		if (urun_Bilgisi_Listeleyici == null) {
			urun_Bilgisi_Listeleyici = new JButton();
			urun_Bilgisi_Listeleyici.setBounds(new Rectangle(110, 73, 193, 15));
			urun_Bilgisi_Listeleyici.setText("urun Bilgisi Listeleyici");
			urun_Bilgisi_Listeleyici.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					jTextArea8.setText(yanit);
					System.out.println("Yanit Listelendi");
					// Auto-generated
					// Event
					// stub
					// mouseClicked()
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
		return urun_Bilgisi_Listeleyici;
	}

	/**
	 * This method initializes jTextArea8
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea8() {
		if (jTextArea8 == null) {
			jTextArea8 = new JTextArea();
			jTextArea8.setBounds(new Rectangle(-2, 89, 970, 469));
		}
		return jTextArea8;
	}

	/**
	 * This method initializes gesici_metin_kutusu
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getGesici_metin_kutusu() {
		if (gesici_metin_kutusu == null) {
			gesici_metin_kutusu = new JTextArea();
			gesici_metin_kutusu.setBounds(new Rectangle(604, 58, 238, 150));
			gesici_metin_kutusu.setText(
					"String adi\n, String kategori\n, String latince_adi\n, int miktari\n,float fiyati\n, String diskteki_yeri\n, String diskteki_adi\n,Vector<String> snerilen_hastaliklar\n, Vector<String> szellikleri");
		}
		return gesici_metin_kutusu;
	}

	/**
	 * This method initializes jTextField9
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField9() {
		if (jTextField9 == null) {
			jTextField9 = new JTextField();
			jTextField9.setBounds(new Rectangle(0, 31, 262, 20));
			jTextField9.setText("");
		}
		return jTextField9;
	}

	/**
	 * This method initializes jButton12
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton12() {
		if (jButton12 == null) {
			jButton12 = new JButton();
			jButton12.setBounds(new Rectangle(0, 49, 262, 18));
			jButton12.setText("Aranan Hastalisin Bilgilerini Listele");
			jButton12.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					yanit = Veritabani_Listesi.getHash_table().getHash_hastalik().get(jTextField9.getText()).toString();
					if (yanit != null) {
						jTextArea9.setText(yanit);
					} else {
						jTextArea9.setText("Bulunamadi");
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
		return jButton12;
	}

	/**
	 * This method initializes jTextArea9
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea9() {
		if (jTextArea9 == null) {
			jTextArea9 = new JTextArea();
			jTextArea9.setBounds(new Rectangle(1, 67, 972, 494));
			jTextArea9.setText("");
		}
		return jTextArea9;
	}

	/**
	 * This method initializes jTextField10
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField10() {
		if (jTextField10 == null) {
			jTextField10 = new JTextField();
			jTextField10.setBounds(new Rectangle(223, 31, 244, 20));
			jTextField10.setText("");
		}
		return jTextField10;
	}

	/**
	 * This method initializes jTextField12
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField12() {
		if (jTextField12 == null) {
			jTextField12 = new JTextField();
			jTextField12.setBounds(new Rectangle(1, 89, 465, 20));
			jTextField12.setText("");
		}
		return jTextField12;
	}

	/**
	 * This method initializes jButton14
	 * 
	 * @return javax.swing.JButton
	 */


	private JButton getJButton14() {
		if (jButton14 == null) {
			jButton14 = new JButton();
			jButton14.setBounds(new Rectangle(224, 67, 243, 22));
			jButton14.setText("Belirtiyi Eklemek isin Tiklayiniz");
			jButton14.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (jTextField12.getText().compareTo("Eklendi") != 0)
						belirtiler.add(jTextField12.getText());
					String metin = "";
					for (int i = 0; i < belirtiler.size(); i++) {
						metin += belirtiler.elementAt(i);
					}
					jTextArea10.setText(metin);
					jTextField12.setText("Eklendi");
					System.out.println("mouseClicked()");
					// Event stub
					// mouseClicked()
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
		return jButton14;
	}

	/**
	 * This method initializes jTextField13
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField13() {
		if (jTextField13 == null) {
			jTextField13 = new JTextField();
			jTextField13.setBounds(new Rectangle(1, 125, 463, 20));
			jTextField13.setText("");
		}
		return jTextField13;
	}

	/**
	 * This method initializes jButton15
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton15() {
		if (jButton15 == null) {
			jButton15 = new JButton();
			jButton15.setBounds(new Rectangle(220, 108, 240, 19));
			jButton15.setText("Nedeni Eklemek isin Tiklayiniz");
			jButton15.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (jTextField13.getText().compareTo("Eklendi") != 0) {
						nedenler.add(jTextField13.getText());
						String metin = "";
						for (int i = 0; i < nedenler.size(); i++) {
							metin += nedenler.elementAt(i);
						}
						jTextArea11.setText(metin);
						jTextField13.setText("Eklendi");
					}
					System.out.println("mouseClicked()");
					// Event stub
					// mouseClicked()
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
		return jButton15;
	}

	/**
	 * This method initializes jTextField14
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField14() {
		if (jTextField14 == null) {
			jTextField14 = new JTextField();
			jTextField14.setBounds(new Rectangle(0, 160, 465, 20));
			jTextField14.setText("");
		}
		return jTextField14;
	}

	/**
	 * This method initializes jButton16
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton16() {
		if (jButton16 == null) {
			jButton16 = new JButton();
			jButton16.setBounds(new Rectangle(220, 143, 240, 16));
			jButton16.setText("Tedavi Eklemek isin Tiklayiniz");
			jButton16.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (jTextField14.getText().compareTo("Eklendi") != 0) {
						tedaviler.add(jTextField14.getText());
						String metin = "";
						for (int i = 0; i < tedaviler.size(); i++) {
							metin += tedaviler.elementAt(i);
						}
						jTextArea12.setText(metin);
						jTextField14.setText("Eklendi");
					}
					System.out.println("mouseClicked()");
					// Event stub
					// mouseClicked()
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
		return jButton16;
	}

	/**
	 * This method initializes jButton17
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton17() {
		if (jButton17 == null) {
			jButton17 = new JButton();
			jButton17.setBounds(new Rectangle(222, 180, 241, 14));
			jButton17.setText("Bitkiyi Eklemek isin Tiklayiniz");
			jButton17.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (jTextField15.getText().compareTo("Eklendi") != 0) {
						bitkiler.add(jTextField15.getText());
						String metin = "";
						for (int i = 0; i < bitkiler.size(); i++) {
							metin += bitkiler.elementAt(i);
						}
						jTextArea13.setText(metin);
						jTextField15.setText("Eklendi");
					}
					System.out.println("mouseClicked()");
					// Event stub
					// mouseClicked()
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
		return jButton17;
	}

	/**
	 * This method initializes jTextField15
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField15() {
		if (jTextField15 == null) {
			jTextField15 = new JTextField();
			jTextField15.setBounds(new Rectangle(-1, 194, 464, 20));
			jTextField15.setText("");
		}
		return jTextField15;
	}

	/**
	 * This method initializes jTextArea10
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea10() {
		if (jTextArea10 == null) {
			jTextArea10 = new JTextArea();
			jTextArea10.setBounds(new Rectangle(472, 35, 500, 127));
		}
		return jTextArea10;
	}

	/**
	 * This method initializes jTextArea11
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea11() {
		if (jTextArea11 == null) {
			jTextArea11 = new JTextArea();
			jTextArea11.setBounds(new Rectangle(468, 180, 505, 135));
		}
		return jTextArea11;
	}

	/**
	 * This method initializes jTextArea12
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea12() {
		if (jTextArea12 == null) {
			jTextArea12 = new JTextArea();
			jTextArea12.setBounds(new Rectangle(0, 229, 463, 197));
		}
		return jTextArea12;
	}

	/**
	 * This method initializes jTextArea13
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea13() {
		if (jTextArea13 == null) {
			jTextArea13 = new JTextArea();
			jTextArea13.setBounds(new Rectangle(470, 330, 500, 225));
		}
		return jTextArea13;
	}

	/**
	 * This method initializes jButton18
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton18() {
		if (jButton18 == null) {
			jButton18 = new JButton();
			jButton18.setBounds(new Rectangle(223, 427, 241, 16));
			jButton18.setText("Bilgileri Kaydetmek istiyorum");
			jButton18.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					/* belirtiler nedenler tedaviler bitkiler */
					if (jTextField10.getText().compareTo("Bulunamadi") == 0) {
						jTextArea14.setText("Veriler Kaydediliyor");
						Hastalik yeni = new Hastalik(jTextField4.getText(), belirtiler, nedenler, tedaviler, bitkiler);
						Veritabani_Listesi.getHash_table().getHash_hastalik().put(jTextField4.getText(), yeni);
						Veritabani_Listesi.getHastalik_veri_tabani().getHastaliklar().add(yeni);
						Veritabani_Listesi.getHastalik_veri_tabani().update_file();
						jTextArea14.setText("Veriler Kaydedildi");
					}
					System.out.println("mouseClicked()");
					// Event stub
					// mouseClicked()
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
		return jButton18;
	}

	/**
	 * This method initializes jTextArea14
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea14() {
		if (jTextArea14 == null) {
			jTextArea14 = new JTextArea();
			jTextArea14.setBounds(new Rectangle(3, 474, 459, 80));
			jTextArea14.setText("");
		}
		return jTextArea14;
	}

	/**
	 * This method initializes jTextField11
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField11() {
		if (jTextField11 == null) {
			jTextField11 = new JTextField();
			jTextField11.setBounds(new Rectangle(166, 17, 165, 20));
			jTextField11.setText("0");
		}
		return jTextField11;
	}

	/**
	 * This method initializes jTextField16
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField16() {
		if (jTextField16 == null) {
			jTextField16 = new JTextField();
			jTextField16.setBounds(new Rectangle(494, 16, 167, 20));
			jTextField16.setText("0");
		}
		return jTextField16;
	}

	/**
	 * This method initializes jButton13
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton13() {
		if (jButton13 == null) {
			jButton13 = new JButton();
			jButton13.setBounds(new Rectangle(662, 17, 139, 18));
			jButton13.setText("urunleri Listele");
			jButton13.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					float min, max;
					min = Float.parseFloat(jTextField11.getText());
					max = Float.parseFloat(jTextField16.getText());
					if (min >= 0 && max >= min) {
						jTextArea15.setText(Veritabani_Listesi.getBitki_veri_tabani().urunleri_listele(min, max));
					} else {
						jTextArea15.setText("Dosru Aralikta Sayilar Giriniz");
					}
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
		return jButton13;
	}

	/**
	 * This method initializes jTextArea15
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea15() {
		if (jTextArea15 == null) {
			jTextArea15 = new JTextArea();
			jTextArea15.setBounds(new Rectangle(6, 40, 964, 518));
		}
		return jTextArea15;
	}

	/**
	 * This method initializes jTextField17
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField17() {
		if (jTextField17 == null) {
			jTextField17 = new JTextField();
			jTextField17.setBounds(new Rectangle(0, 33, 238, 20));
			jTextField17.setText("");
		}
		return jTextField17;
	}

	/**
	 * This method initializes jTextField18
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField18() {
		if (jTextField18 == null) {
			jTextField18 = new JTextField();
			jTextField18.setBounds(new Rectangle(238, 33, 320, 20));
			jTextField18.setText("ilk snce Arama Yapmaniz Gerekmektedir.");
		}
		return jTextField18;
	}

	/**
	 * This method initializes jTextField19
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField19() {
		if (jTextField19 == null) {
			jTextField19 = new JTextField();
			jTextField19.setBounds(new Rectangle(818, 19, 145, 20));
		}
		return jTextField19;
	}

	/**
	 * This method initializes jTextField20
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField20() {
		if (jTextField20 == null) {
			jTextField20 = new JTextField();
			jTextField20.setBounds(new Rectangle(820, 52, 143, 20));
		}
		return jTextField20;
	}

	/**
	 * This method initializes jButton19
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton19() {
		if (jButton19 == null) {
			jButton19 = new JButton();
			jButton19.setBounds(new Rectangle(3, 51, 235, 22));
			jButton19.setText("capsule Vektsrunde Var Mi?");
		}
		return jButton19;
	}

	/**
	 * This method initializes Herbalist_Application
	 * 
	 * @return javax.swing.JFrame
	 */
	private JFrame getHerbalist_Application() {
		if (Herbalist_Application == null) {
			Herbalist_Application = new JFrame();
			Herbalist_Application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Herbalist_Application.setJMenuBar(getJJMenuBar());
			Herbalist_Application.setSize(1000, 700);
			Herbalist_Application.setContentPane(getMenu());
			Herbalist_Application.setTitle("Herbalist Application");
		}
		return Herbalist_Application;
	}

	/**
	 * This method initializes Menu
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getMenu() {
		if (Menu == null) {
			Menu = new JPanel();
			Menu.setLayout(null);
			Menu.add(getKullanici_Menusu(), null);
		}
		return Menu;
	}

	/**
	 * This method initializes jJMenuBar
	 * 
	 * @return javax.swing.JMenuBar
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getFileMenu());
			jJMenuBar.add(getEditMenu());
			jJMenuBar.add(getHelpMenu());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes jMenu
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getFileMenu() {
		if (fileMenu == null) {
			fileMenu = new JMenu();
			fileMenu.setText("File");
			fileMenu.add(getSaveMenuItem());
			fileMenu.add(getExitMenuItem());
		}
		return fileMenu;
	}

	/**
	 * This method initializes jMenu
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getEditMenu() {
		if (editMenu == null) {
			editMenu = new JMenu();
			editMenu.setText("Edit");
			editMenu.add(getCutMenuItem());
			editMenu.add(getCopyMenuItem());
			editMenu.add(getPasteMenuItem());
		}
		return editMenu;
	}

	/**
	 * This method initializes jMenu
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getHelpMenu() {
		if (helpMenu == null) {
			helpMenu = new JMenu();
			helpMenu.setText("Help");
			helpMenu.add(getAboutMenuItem());
		}
		return helpMenu;
	}

	/**
	 * This method initializes jMenuitem
	 * 
	 * @return javax.swing.JMenuitem
	 */
	private JMenuItem getExitMenuItem() {
		if (exitMenuItem == null) {
			exitMenuItem = new JMenuItem();
			exitMenuItem.setText("Exit");
			exitMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
		}
		return exitMenuItem;
	}

	/**
	 * This method initializes jMenuitem
	 * 
	 * @return javax.swing.JMenuitem
	 */
	private JMenuItem getAboutMenuItem() {
		if (aboutMenuItem == null) {
			aboutMenuItem = new JMenuItem();
			aboutMenuItem.setText("About");
			aboutMenuItem.addActionListener(new ActionListener() {
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
		return aboutMenuItem;
	}

	/**
	 * This method initializes aboutDialog
	 * 
	 * @return javax.swing.JDialog
	 */
	private JDialog getAboutDialog() {
		if (aboutDialog == null) {
			aboutDialog = new JDialog(getHerbalist_Application(), true);
			aboutDialog.setTitle("About");
			aboutDialog.setContentPane(getAboutContentPane());
		}
		return aboutDialog;
	}

	/**
	 * This method initializes aboutContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getAboutContentPane() {
		if (aboutContentPane == null) {
			aboutContentPane = new JPanel();
			aboutContentPane.setLayout(new BorderLayout());
			aboutContentPane.add(getAboutVersionLabel(), BorderLayout.CENTER);
		}
		return aboutContentPane;
	}

	/**
	 * This method initializes aboutVersionLabel
	 * 
	 * @return javax.swing.JLabel
	 */
	private JLabel getAboutVersionLabel() {
		if (aboutVersionLabel == null) {
			aboutVersionLabel = new JLabel();
			aboutVersionLabel.setText("Version 1.0");
			aboutVersionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return aboutVersionLabel;
	}

	/**
	 * This method initializes jMenuItem
	 * 
	 * @return javax.swing.JMenuitem
	 */
	private JMenuItem getCutMenuItem() {
		if (cutMenuItem == null) {
			cutMenuItem = new JMenuItem();
			cutMenuItem.setText("Cut");
			cutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, Event.CTRL_MASK, true));
		}
		return cutMenuItem;
	}

	/**
	 * This method initializes jMenuItem
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getCopyMenuItem() {
		if (copyMenuItem == null) {
			copyMenuItem = new JMenuItem();
			copyMenuItem.setText("Copy");
			copyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, Event.CTRL_MASK, true));
		}
		return copyMenuItem;
	}

	/**
	 * This method initializes jMenuitem
	 * 
	 * @return javax.swing.JMenuitem
	 */
	private JMenuItem getPasteMenuItem() {
		if (pasteMenuItem == null) {
			pasteMenuItem = new JMenuItem();
			pasteMenuItem.setText("Paste");
			pasteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK, true));
		}
		return pasteMenuItem;
	}

	/**
	 * This method initializes jMenuItem
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getSaveMenuItem() {
		if (saveMenuItem == null) {
			saveMenuItem = new JMenuItem();
			saveMenuItem.setText("Save");
			saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Event.CTRL_MASK, true));
		}
		return saveMenuItem;
	}

	// *************************MAiN********************************************************
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Herbalist_App application = new Herbalist_App();
				application.getHerbalist_Application().setVisible(true);
			}
		});
	}
}
