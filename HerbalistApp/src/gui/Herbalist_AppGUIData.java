package gui;

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

import deva.Capsule_Vector_String;

public class Herbalist_AppGUIData {
	private Herbalist_AppStringData stringdata;
	private Herbalist_AppSwingData swingdata;
	@Override
	public String toString() {
		return "Herbalist_AppGUIData [stringdata=" + stringdata + ", swingdata=" + swingdata + "]";
	}

	/**
	 * @param stringdata
	 * @param swingdata
	 */
	public Herbalist_AppGUIData(Herbalist_AppStringData stringdata, Herbalist_AppSwingData swingdata) {
		super();
		this.stringdata = stringdata;
		this.swingdata = swingdata;
	}


	

	public Herbalist_AppGUIData(Herbalist_AppStringData stringdata, Herbalist_AppSwingData swingdata,
			JFrame herbalist_Application, JPanel menu, JMenuBar jJMenuBar, JMenu fileMenu, JMenu editMenu,
			JMenu helpMenu, JMenuItem exitMenuItem, JMenuItem aboutMenuItem, JMenuItem cutMenuItem,
			JMenuItem copyMenuItem, JMenuItem pasteMenuItem, JMenuItem saveMenuItem, JDialog aboutDialog,
			JPanel aboutContentPane, JLabel aboutVersionLabel, JTabbedPane kullanici_Menusu, JPanel jPanel,
			JPanel jPanel1, JTabbedPane musteri_Menusu, JPanel jPanel2,
			JPanel belirli_Fiyatlar_Arasindaki_Tim_Tirlerin_Bulunup_Listelenmesi,
			JPanel verilen_Bir_Kelimenin_Kategori_Agaclarinda_Tutulan_Bitkilerin_Ozellikleri_Icinden_Aratilmasi_Bulunan_Bitki_isimlerinin_Listelenmesi,
			JPanel Urun_Siparisi_Birden_Cok_Paket_istenebilir_ve_Alimi, JLabel musteri_Menusu_Basligi,
			JLabel personel_Menusu_Basligi, JTabbedPane personel_Menusu, JPanel jPanel6,
			JPanel firmaya_Yeni_Tirde_Urun_Girisi, JPanel adindan_Urun_Arama_ve_Silme,
			JPanel Urun_Bilgilerinde_Degisiklik, JPanel yeni_Hastalik_Bilgisi_Girisi, JLabel jLabel2, JLabel jLabel3,
			JLabel jLabel4, JLabel jLabel5, JPanel kategori_Listeleme_Agac_Derinligi_ve_Eleman_Sayisini_Yazdirma,
			JPanel kategori_Agaclarini_Dengeleme,
			JPanel verilen_Bir_Hastaliga_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan,
			JPanel belli_Bir_Hastaliga_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gire_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi,
			JLabel jLabel6, JLabel jLabel7, JLabel jLabel8, JLabel jLabel9, JLabel jLabel10, JTabbedPane jTabbedPane3,
			JPanel jPanel16, JLabel jLabel61, JLabel jLabel11, JLabel jLabel12,
			JTabbedPane kategori_Ekleme_ve_Silme_Menusu, JPanel kategori_Ekleme, JPanel kategori_Silme, JLabel jLabel13,
			JLabel jLabel14, JLabel jLabel15, JLabel jLabel16, JLabel jLabel17, JLabel jLabel18, JTextArea jTextArea,
			JPanel adindan_Urun_Arama_ve_Listeleme, JPanel jPanel23, JLabel jLabel21, JTextArea jTextArea1,
			JButton jButton, JTabbedPane jTabbedPane6, JPanel jPanel11, JPanel jPanel24, JPanel jPanel25,
			JLabel jLabel22, JLabel jLabel23, JLabel jLabel24, JScrollPane jScrollPane1, JTextArea jTextArea3,
			JLabel jLabel25, JTextField jTextField1, JButton jButton1, JTextArea jTextArea5, JLabel jLabel26,
			JButton jButton2, JButton jButton3, JButton jButton4, JTextArea jTextArea2, String yanit,
			JTextArea jTextArea6, JLabel jLabel28, JLabel jLabel29, JButton jButton5, JButton jButton6, JLabel jLabel30,
			JTextArea jTextArea4, JLabel jLabel31, JTextField jTextField4, JButton jButton7,
			JButton kategori_Listeleyici, JLabel jLabel, JLabel jLabel1, JTextField jTextField6, JButton jButton8,
			JButton jButton9, JLabel jLabel32, JButton kategori_Listeleyici_2, JTextArea jTextArea7, JLabel jLabel19,
			JButton jButton10, JLabel jLabel20, JTextField jTextField8, JButton jButton11, JLabel jLabel33,
			JButton Urun_Bilgisi_Listeleyici, JTextArea gecici_metin_kutusu, JTextField jTextField9, JLabel jLabel34,
			JButton jButton12, JTextArea jTextArea9, JLabel jLabel35, JTextField jTextField10, JLabel jLabel37,
			JTextField jTextField12, JButton jButton14, JLabel jLabel38, JTextField jTextField13, JButton jButton15,
			JLabel jLabel39, JTextField jTextField14, JButton jButton16, JLabel jLabel40, JButton jButton17,
			JTextField jTextField15, JTextArea jTextArea10, JLabel jLabel41, JLabel jLabel42, JTextArea jTextArea11,
			JLabel jLabel43, JTextArea jTextArea12, JLabel jLabel44, JTextArea jTextArea13, JButton jButton18,
			JLabel jLabel36, JTextArea jTextArea14, JLabel jLabel45, Capsule_Vector_String belirtiler, Capsule_Vector_String nedenler,
			Capsule_Vector_String tedaviler, Capsule_Vector_String bitkiler, JLabel jLabel46, JLabel jLabel47, JLabel jLabel48,
			JTextField jTextField11, JTextField jTextField16, JButton jButton13, JTextArea jTextArea15,
			JTextField jTextField17, JLabel jLabel49, JTextField jTextField18, JLabel jLabel27, JTextField jTextField19,
			JLabel jLabel50, JTextField jTextField20, JButton jButton19) {
		this.stringdata = stringdata;
		this.swingdata = swingdata;
		swingdata.getJframedata().setHerbalist_Application(herbalist_Application);
		swingdata.getJpaneldata().setMenu(menu);
		this.swingdata.setjJMenuBar(jJMenuBar);
		this.swingdata.getJmenudata().setFileMenu(fileMenu);
		this.swingdata.getJmenudata().setEditMenu(editMenu);
		this.swingdata.getJmenudata().setHelpMenu(helpMenu);
		this.swingdata.getJmenuitemdata().setExitMenuItem(exitMenuItem);
		this.swingdata.getJmenuitemdata().setAboutMenuItem(aboutMenuItem);
		this.swingdata.getJmenuitemdata().setCutMenuItem(cutMenuItem);
		this.swingdata.getJmenuitemdata().setCopyMenuItem(copyMenuItem);
		this.swingdata.getJmenuitemdata().setPasteMenuItem(pasteMenuItem);
		this.swingdata.getJmenuitemdata().setSaveMenuItem(saveMenuItem);
		this.swingdata.setAboutDialog(aboutDialog);
		this.swingdata.getJpaneldata().setAboutContentPane(aboutContentPane);
		this.swingdata.getJlabeldata().setAboutVersionLabel(aboutVersionLabel);
		swingdata.getJtabbedpanedata().setKullanici_Menusu(kullanici_Menusu);
		this.swingdata.getJpaneldata().setmusteri_bolumu(jPanel);
		this.swingdata.getJpaneldata().setfirma_bolumu(jPanel1);
		swingdata.getJtabbedpanedata().setMusteri_Menusu(musteri_Menusu);
		this.swingdata.getJpaneldata().setAdindan_Urun_Arama_ve_Listeleme_bolumu(jPanel2);
		swingdata.getJpaneldata().setBelirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi(
				belirli_Fiyatlar_Arasindaki_Tim_Tirlerin_Bulunup_Listelenmesi);
		swingdata.getJpaneldata()
				.setVerilen_Bir_Kelimenin_Kategori_Agaclarinda_Tutulan_Bitkilerin_Ozellikleri_Icinden_Aratilmasi_Bulunan_Bitki_Istenebilir_Listelenmesi(
						verilen_Bir_Kelimenin_Kategori_Agaclarinda_Tutulan_Bitkilerin_Ozellikleri_Icinden_Aratilmasi_Bulunan_Bitki_isimlerinin_Listelenmesi);
		swingdata.getJpaneldata().setUrun_Siparisi_Birden_Cok_Paket_Istenebilir_ve_Alimi(
				Urun_Siparisi_Birden_Cok_Paket_istenebilir_ve_Alimi);
		swingdata.getJtabbedpanedata().setPersonel_Menusu(personel_Menusu);
		this.swingdata.getJpaneldata().setjPanel6(jPanel6);
		swingdata.getJpaneldata().setFirmaya_Yeni_Turde_Urun_Girisi(firmaya_Yeni_Tirde_Urun_Girisi);
		swingdata.getJpaneldata().setAdindan_Urun_Arama_ve_Silme(adindan_Urun_Arama_ve_Silme);
		swingdata.getJpaneldata().setUrun_Bilgilerinde_Degisiklik(Urun_Bilgilerinde_Degisiklik);
		swingdata.getJpaneldata().setYeni_Hastalik_Bilgisi_Girisi(yeni_Hastalik_Bilgisi_Girisi);
		this.swingdata.getJlabeldata().setjLabel3(jLabel3);
		this.swingdata.getJlabeldata().setjLabel4(jLabel4);
		this.swingdata.getJlabeldata().setjLabel5(jLabel5);
		swingdata.getJpaneldata().setKategori_Listeleme_Agac_Derinligini_ve_Eleman_Sayisini_Yazdirma(
				kategori_Listeleme_Agac_Derinligi_ve_Eleman_Sayisini_Yazdirma);
		swingdata.getJpaneldata().setKategori_Agaclarini_Dengeleme(kategori_Agaclarini_Dengeleme);
		swingdata.getJpaneldata().setVerilen_Bir_Hastaliga_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan(
				verilen_Bir_Hastaliga_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan);
		swingdata.getJpaneldata()
				.setBelli_Bir_Hastaliga_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gire_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi(
						belli_Bir_Hastaliga_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gire_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi);
		this.swingdata.getJlabeldata().setjLabel6(jLabel6);
		this.swingdata.getJlabeldata().setjLabel7(jLabel7);
		this.swingdata.getJlabeldata().setjLabel9(jLabel9);
		this.swingdata.getJlabeldata().setjLabel10(jLabel10);
		this.swingdata.getJtabbedpanedata().setjTabbedPane3(jTabbedPane3);
		this.swingdata.getJpaneldata().setjPanel16(jPanel16);
		this.swingdata.getJlabeldata().setjLabel61(jLabel61);
		this.swingdata.getJlabeldata().setjLabel11(jLabel11);
		this.swingdata.getJlabeldata().setjLabel12(jLabel12);
		swingdata.getJtabbedpanedata().setKategori_Ekleme_ve_Silme_Menusu(kategori_Ekleme_ve_Silme_Menusu);
		swingdata.getJpaneldata().setKategori_Ekleme(kategori_Ekleme);
		swingdata.getJpaneldata().setKategori_Silme(kategori_Silme);
		this.swingdata.getJlabeldata().setjLabel13(jLabel13);
		this.swingdata.getJlabeldata().setjLabel14(jLabel14);
		this.swingdata.getJlabeldata().setjLabel15(jLabel15);
		this.swingdata.getJlabeldata().setjLabel16(jLabel16);
		this.swingdata.getJlabeldata().setjLabel17(jLabel17);
		this.swingdata.getJlabeldata().setjLabel18(jLabel18);
		this.swingdata.getJtextareadata().setjTextArea(jTextArea);
		swingdata.getJpaneldata().setAdindan_Urun_Arama_ve_Listeleme(adindan_Urun_Arama_ve_Listeleme);
		this.swingdata.getJpaneldata().setjPanel23(jPanel23);
		this.swingdata.getJlabeldata().setjLabel21(jLabel21);
		this.swingdata.getJtextareadata().setjTextArea1(jTextArea1);
		this.swingdata.getJbuttondata().setjButton(jButton);
		this.swingdata.getJtabbedpanedata().setjTabbedPane6(jTabbedPane6);
		this.swingdata.getJpaneldata().setjPanel11(jPanel11);
		this.swingdata.getJpaneldata().setjPanel24(jPanel24);
		this.swingdata.getJpaneldata().setjPanel25(jPanel25);
		this.swingdata.getJlabeldata().setjLabel22(jLabel22);
		this.swingdata.getJlabeldata().setjLabel23(jLabel23);
		this.swingdata.getJlabeldata().setjLabel24(jLabel24);
		this.swingdata.setjScrollPane1(jScrollPane1);
		this.swingdata.getJtextareadata().setjTextArea3(jTextArea3);
		this.swingdata.getJlabeldata().setjLabel25(jLabel25);
		this.swingdata.getJtextfielddata().setjTextField1(jTextField1);
		this.swingdata.getJpaneldata().setjButton1(jButton1);
		this.swingdata.getJtextareadata().setjTextArea5(jTextArea5);
		this.swingdata.getJlabeldata().setjLabel26(jLabel26);
		this.swingdata.getJbuttondata().setjButton2(jButton2);
		this.swingdata.getJbuttondata().setjButton3(jButton3);
		this.swingdata.getJbuttondata().setjButton4(jButton4);
		this.swingdata.getJtextareadata().setjTextArea2(jTextArea2);
		this.stringdata.setYanit(yanit);
		this.swingdata.getJtextareadata().setjTextArea6(jTextArea6);
		this.swingdata.getJlabeldata().setjLabel28(jLabel28);
		this.swingdata.getJlabeldata().setjLabel29(jLabel29);
		this.swingdata.getJbuttondata().setjButton5(jButton5);
		this.swingdata.getJbuttondata().setjButton6(jButton6);
		this.swingdata.getJlabeldata().setjLabel30(jLabel30);
		this.swingdata.getJtextareadata().setjTextArea4(jTextArea4);
		this.swingdata.getJlabeldata().setjLabel31(jLabel31);
		this.swingdata.getJtextfielddata().setjTextField4(jTextField4);
		this.swingdata.getJbuttondata().setjButton7(jButton7);
		swingdata.getJbuttondata().setKategori_Listeleyici(kategori_Listeleyici);
		this.swingdata.getJlabeldata().setjLabel(jLabel);
		this.swingdata.getJlabeldata().setjLabel1(jLabel1);
		this.swingdata.getJtextfielddata().setjTextField6(jTextField6);
		this.swingdata.getJbuttondata().setjButton8(jButton8);
		this.swingdata.getJbuttondata().setjButton9(jButton9);
		this.swingdata.getJlabeldata().setjLabel32(jLabel32);
		swingdata.getJbuttondata().setKategori_Listeleyici_2(kategori_Listeleyici_2);
		this.swingdata.getJtextareadata().setjTextArea7(jTextArea7);
		this.swingdata.getJlabeldata().setjLabel19(jLabel19);
		this.swingdata.getJbuttondata().setjButton10(jButton10);
		this.swingdata.getJlabeldata().setjLabel20(jLabel20);
		this.swingdata.getJtextfielddata().setjTextField8(jTextField8);
		this.swingdata.getJbuttondata().setjButton11(jButton11);
		this.swingdata.getJlabeldata().setjLabel33(jLabel33);
		swingdata.getJbuttondata().setUrun_Bilgisi_Listeleyici(Urun_Bilgisi_Listeleyici);
		this.swingdata.getJtextareadata().setGecici_metin_kutusu(gecici_metin_kutusu);
		this.swingdata.getJtextfielddata().setjTextField9(jTextField9);
		this.swingdata.getJlabeldata().setjLabel34(jLabel34);
		this.swingdata.getJbuttondata().setjButton12(jButton12);
		this.swingdata.getJtextareadata().setjTextArea9(jTextArea9);
		this.swingdata.getJlabeldata().setjLabel35(jLabel35);
		this.swingdata.getJtextfielddata().setjTextField10(jTextField10);
		this.swingdata.getJlabeldata().setjLabel37(jLabel37);
		this.swingdata.getJtextfielddata().setjTextField12(jTextField12);
		this.swingdata.getJbuttondata().setjButton14(jButton14);
		this.swingdata.getJlabeldata().setjLabel38(jLabel38);
		this.swingdata.getJtextfielddata().setjTextField13(jTextField13);
		this.swingdata.getJbuttondata().setjButton15(jButton15);
		this.swingdata.getJlabeldata().setjLabel39(jLabel39);
		this.swingdata.getJtextfielddata().setjTextField14(jTextField14);
		this.swingdata.getJbuttondata().setjButton16(jButton16);
		this.swingdata.getJlabeldata().setjLabel40(jLabel40);
		this.swingdata.getJbuttondata().setjButton17(jButton17);
		this.swingdata.getJtextfielddata().setjTextField15(jTextField15);
		this.swingdata.getJtextareadata().setjTextArea10(jTextArea10);
		this.swingdata.getJlabeldata().setjLabel41(jLabel41);
		this.swingdata.getJlabeldata().setjLabel42(jLabel42);
		this.swingdata.getJtextareadata().setjTextArea11(jTextArea11);
		this.swingdata.getJlabeldata().setjLabel43(jLabel43);
		this.swingdata.getJtextareadata().setjTextArea12(jTextArea12);
		this.swingdata.getJlabeldata().setjLabel44(jLabel44);
		this.swingdata.getJtextareadata().setjTextArea13(jTextArea13);
		this.swingdata.getJbuttondata().setjButton18(jButton18);
		this.swingdata.getJlabeldata().setjLabel36(jLabel36);
		this.swingdata.getJtextareadata().setjTextArea14(jTextArea14);
		this.swingdata.getJlabeldata().setjLabel45(jLabel45);
		this.stringdata.setBelirtiler(belirtiler);
		this.stringdata.setNedenler(nedenler);
		this.stringdata.setTedaviler(tedaviler);
		this.stringdata.setBitkiler(bitkiler);
		this.swingdata.getJlabeldata().setjLabel46(jLabel46);
		this.swingdata.getJlabeldata().setjLabel47(jLabel47);
		this.swingdata.getJlabeldata().setjLabel48(jLabel48);
		this.swingdata.getJtextfielddata().setjTextField11(jTextField11);
		this.swingdata.getJtextfielddata().setjTextField16(jTextField16);
		this.swingdata.getJbuttondata().setjButton13(jButton13);
		this.swingdata.getJtextareadata().setjTextArea15(jTextArea15);
		this.swingdata.getJtextfielddata().setjTextField17(jTextField17);
		this.swingdata.getJlabeldata().setjLabel49(jLabel49);
		this.swingdata.getJtextfielddata().setjTextField18(jTextField18);
		this.swingdata.getJlabeldata().setjLabel27(jLabel27);
		this.swingdata.getJtextfielddata().setjTextField19(jTextField19);
		this.swingdata.getJlabeldata().setjLabel50(jLabel50);
		this.swingdata.getJtextfielddata().setjTextField20(jTextField20);
		this.swingdata.getJbuttondata().setjButton19(jButton19);
	}

	/**
	 * @return the stringdata
	 */
	public Herbalist_AppStringData getStringdata() {
		return stringdata;
	}

	/**
	 * @param stringdata the stringdata to set
	 */
	public void setStringdata(Herbalist_AppStringData stringdata) {
		this.stringdata = stringdata;
	}

	/**
	 * @return the swingdata
	 */
	public Herbalist_AppSwingData getSwingdata() {
		return swingdata;
	}

	/**
	 * @param swingdata the swingdata to set
	 */
	public void setSwingdata(Herbalist_AppSwingData swingdata) {
		this.swingdata = swingdata;
	}

	public JFrame getHerbalist_Application() {
		return swingdata.getJframedata().getHerbalist_Application();
	}

	public void setHerbalist_Application(JFrame herbalist_Application) {
		swingdata.getJframedata().setHerbalist_Application(herbalist_Application);
	}

	public JPanel getMenu() {
		return swingdata.getJpaneldata().getMenu();
	}

	public void setMenu(JPanel menu) {
		swingdata.getJpaneldata().setMenu(menu);
	}

	public JMenuBar getjJMenuBar() {
		return swingdata.getjJMenuBar();
	}

	public void setjJMenuBar(JMenuBar jJMenuBar) {
		this.swingdata.setjJMenuBar(jJMenuBar);
	}

	public JMenu getFileMenu() {
		return swingdata.getJmenudata().getFileMenu();
	}

	public void setFileMenu(JMenu fileMenu) {
		this.swingdata.getJmenudata().setFileMenu(fileMenu);
	}

	public JMenu getEditMenu() {
		return swingdata.getJmenudata().getEditMenu();
	}

	public void setEditMenu(JMenu editMenu) {
		this.swingdata.getJmenudata().setEditMenu(editMenu);
	}

	public JMenu getHelpMenu() {
		return swingdata.getJmenudata().getHelpMenu();
	}

	public void setHelpMenu(JMenu helpMenu) {
		this.swingdata.getJmenudata().setHelpMenu(helpMenu);
	}

	public JMenuItem getExitMenuItem() {
		return swingdata.getJmenuitemdata().getExitMenuItem();
	}

	public void setExitMenuItem(JMenuItem exitMenuItem) {
		this.swingdata.getJmenuitemdata().setExitMenuItem(exitMenuItem);
	}

	public JMenuItem getAboutMenuItem() {
		return swingdata.getJmenuitemdata().getAboutMenuItem();
	}

	public void setAboutMenuItem(JMenuItem aboutMenuItem) {
		this.swingdata.getJmenuitemdata().setAboutMenuItem(aboutMenuItem);
	}

	public JMenuItem getCutMenuItem() {
		return swingdata.getJmenuitemdata().getCutMenuItem();
	}

	public void setCutMenuItem(JMenuItem cutMenuItem) {
		this.swingdata.getJmenuitemdata().setCutMenuItem(cutMenuItem);
	}

	public JMenuItem getCopyMenuItem() {
		return swingdata.getJmenuitemdata().getCopyMenuItem();
	}

	public void setCopyMenuItem(JMenuItem copyMenuItem) {
		this.swingdata.getJmenuitemdata().setCopyMenuItem(copyMenuItem);
	}

	public JMenuItem getPasteMenuItem() {
		return swingdata.getJmenuitemdata().getPasteMenuItem();
	}

	public void setPasteMenuItem(JMenuItem pasteMenuItem) {
		this.swingdata.getJmenuitemdata().setPasteMenuItem(pasteMenuItem);
	}

	public JMenuItem getSaveMenuItem() {
		return swingdata.getJmenuitemdata().getSaveMenuItem();
	}

	public void setSaveMenuItem(JMenuItem saveMenuItem) {
		this.swingdata.getJmenuitemdata().setSaveMenuItem(saveMenuItem);
	}

	public JDialog getAboutDialog() {
		return swingdata.getAboutDialog();
	}

	public void setAboutDialog(JDialog aboutDialog) {
		this.swingdata.setAboutDialog(aboutDialog);
	}

	public JPanel getAboutContentPane() {
		return swingdata.getJpaneldata().getAboutContentPane();
	}

	public void setAboutContentPane(JPanel aboutContentPane) {
		this.swingdata.getJpaneldata().setAboutContentPane(aboutContentPane);
	}

	public JLabel getAboutVersionLabel() {
		return swingdata.getJlabeldata().getAboutVersionLabel();
	}

	public void setAboutVersionLabel(JLabel aboutVersionLabel) {
		this.swingdata.getJlabeldata().setAboutVersionLabel(aboutVersionLabel);
	}

	public JTabbedPane getKullanici_Menusu() {
		return swingdata.getJtabbedpanedata().getKullanici_Menusu();
	}

	public void setKullanici_Menusu(JTabbedPane kullanici_Menusu) {
		swingdata.getJtabbedpanedata().setKullanici_Menusu(kullanici_Menusu);
	}

	public JPanel getmusteri_bolumu() {
		return swingdata.getJpaneldata().getmusteri_bolumu();
	}

	public void setmusteri_bolumu(JPanel jPanel) {
		this.swingdata.getJpaneldata().setmusteri_bolumu(jPanel);
	}

	public JPanel getfirma_bolumu() {
		return swingdata.getJpaneldata().getfirma_bolumu();
	}

	public void setfirma_bolumu(JPanel jPanel1) {
		this.swingdata.getJpaneldata().setfirma_bolumu(jPanel1);
	}

	public JTabbedPane getMusteri_Menusu() {
		return swingdata.getJtabbedpanedata().getMusteri_Menusu();
	}

	public void setMusteri_Menusu(JTabbedPane miiteri_Menusu) {
		swingdata.getJtabbedpanedata().setMusteri_Menusu(miiteri_Menusu);
	}

	public JPanel getAdindan_Urun_Arama_ve_Listeleme_bolumu() {
		return swingdata.getJpaneldata().getAdindan_Urun_Arama_ve_Listeleme_bolumu();
	}

	public void setjPanel2(JPanel jPanel2) {
		this.swingdata.getJpaneldata().setAdindan_Urun_Arama_ve_Listeleme_bolumu(jPanel2);
	}

	public JPanel getBelirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi() {
		return swingdata.getJpaneldata().getBelirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi();
	}

	public void setBelirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi(
			JPanel belirli_Fiyatlar_Arasindaki_Tim_Tirlerin_Bulunup_Listelenmesi) {
		swingdata.getJpaneldata().setBelirli_Fiyatlar_Arasindaki_Tum_Turlerin_Bulunup_Listelenmesi(
				belirli_Fiyatlar_Arasindaki_Tim_Tirlerin_Bulunup_Listelenmesi);
	}

	public JPanel getVerilen_Bir_Kelimenin_Kategori_Agaclarinda_Tutulan_Bitkilerin_Ozellikleri_Icinden_Aratilmasi_Bulunan_Bitki_Isimlerinin_Listelenmesi() {
		return swingdata.getJpaneldata()
				.getVerilen_Bir_Kelimenin_Kategori_Agaclarinda_Tutulan_Bitkilerin_Ozellikleri_Icinden_Aratilmasi_Bulunan_Bitki_Istenebilir_Listelenmesi();
	}

	public void setVerilen_Bir_Kelimenin_Kategori_Agaclarinda_Tutulan_Bitkilerin_Ozellikleri_Icinden_Aratilmasi_Bulunan_Bitki_isimlerinin_Listelenmesi(
			JPanel verilen_Bir_Kelimenin_Kategori_Agaclarinda_Tutulan_Bitkilerin_Ozellikleri_Icinden_Aratilmasi_Bulunan_Bitki_isimlerinin_Listelenmesi) {
		swingdata.getJpaneldata()
				.setVerilen_Bir_Kelimenin_Kategori_Agaclarinda_Tutulan_Bitkilerin_Ozellikleri_Icinden_Aratilmasi_Bulunan_Bitki_Istenebilir_Listelenmesi(
						verilen_Bir_Kelimenin_Kategori_Agaclarinda_Tutulan_Bitkilerin_Ozellikleri_Icinden_Aratilmasi_Bulunan_Bitki_isimlerinin_Listelenmesi);
	}

	public JPanel getUrun_Siparisi_Birden_Cok_Paket_Istenebilir_ve_Alimi() {
		return swingdata.getJpaneldata().getUrun_Siparisi_Birden_Cok_Paket_Istenebilir_ve_Alimi();
	}

	public void setUrun_Siparisi_Birden_Cok_Paket_istenebilir_ve_Alimi(
			JPanel Urun_Siparisi_Birden_Cok_Paket_istenebilir_ve_Alimi) {
		swingdata.getJpaneldata().setUrun_Siparisi_Birden_Cok_Paket_Istenebilir_ve_Alimi(
				Urun_Siparisi_Birden_Cok_Paket_istenebilir_ve_Alimi);
	}

	public JTabbedPane getPersonel_Menusu() {
		return swingdata.getJtabbedpanedata().getPersonel_Menusu();
	}

	public void setPersonel_Menusu(JTabbedPane personel_Menusu) {
		swingdata.getJtabbedpanedata().setPersonel_Menusu(personel_Menusu);
	}

	public JPanel getjPanel6() {
		return swingdata.getJpaneldata().getjPanel6();
	}

	public void setjPanel6(JPanel jPanel6) {
		this.swingdata.getJpaneldata().setjPanel6(jPanel6);
	}

	public JPanel getFirmaya_Yeni_Turde_Urun_Girisi() {
		return swingdata.getJpaneldata().getFirmaya_Yeni_Turde_Urun_Girisi();
	}

	public void setFirmaya_Yeni_Tirde_Urun_Girisi(JPanel firmaya_Yeni_Tirde_Urun_Girisi) {
		swingdata.getJpaneldata().setFirmaya_Yeni_Turde_Urun_Girisi(firmaya_Yeni_Tirde_Urun_Girisi);
	}

	public JPanel getAdindan_Urun_Arama_ve_Silme() {
		return swingdata.getJpaneldata().getAdindan_Urun_Arama_ve_Silme();
	}

	public void setAdindan_Urun_Arama_ve_Silme(JPanel adindan_Urun_Arama_ve_Silme) {
		swingdata.getJpaneldata().setAdindan_Urun_Arama_ve_Silme(adindan_Urun_Arama_ve_Silme);
	}

	public JPanel getUrun_Bilgilerinde_Degisiklik() {
		return swingdata.getJpaneldata().getUrun_Bilgilerinde_Degisiklik();
	}

	public void setUrun_Bilgilerinde_Degisiklik(JPanel Urun_Bilgilerinde_Degisiklik) {
		swingdata.getJpaneldata().setUrun_Bilgilerinde_Degisiklik(Urun_Bilgilerinde_Degisiklik);
	}

	public JPanel getYeni_Hastalik_Bilgisi_Girisi() {
		return swingdata.getJpaneldata().getYeni_Hastalik_Bilgisi_Girisi();
	}

	public void setYeni_Hastalik_Bilgisi_Girisi(JPanel yeni_Hastalik_Bilgisi_Girisi) {
		swingdata.getJpaneldata().setYeni_Hastalik_Bilgisi_Girisi(yeni_Hastalik_Bilgisi_Girisi);
	}

	public JLabel getjLabel3() {
		return swingdata.getJlabeldata().getjLabel3();
	}

	public void setjLabel3(JLabel jLabel3) {
		this.swingdata.getJlabeldata().setjLabel3(jLabel3);
	}

	public JLabel getjLabel4() {
		return swingdata.getJlabeldata().getjLabel4();
	}

	public void setjLabel4(JLabel jLabel4) {
		this.swingdata.getJlabeldata().setjLabel4(jLabel4);
	}

	public JLabel getjLabel5() {
		return swingdata.getJlabeldata().getjLabel5();
	}

	public void setjLabel5(JLabel jLabel5) {
		this.swingdata.getJlabeldata().setjLabel5(jLabel5);
	}

	public JPanel getKategori_Listeleme_Agac_Derinligi_ve_Eleman_Sayisini_Yazdirma() {
		return swingdata.getJpaneldata().getKategori_Listeleme_Agac_Derinligini_ve_Eleman_Sayisini_Yazdirma();
	}

	public void setKategori_Listeleme_Agac_Derinligi_ve_Eleman_Sayisini_Yazdirma(
			JPanel kategori_Listeleme_Agac_Derinligi_ve_Eleman_Sayisini_Yazdirma) {
		swingdata.getJpaneldata().setKategori_Listeleme_Agac_Derinligini_ve_Eleman_Sayisini_Yazdirma(
				kategori_Listeleme_Agac_Derinligi_ve_Eleman_Sayisini_Yazdirma);
	}

	public JPanel getKategori_Agaclarini_Dengeleme() {
		return swingdata.getJpaneldata().getKategori_Agaclarini_Dengeleme();
	}

	public void setKategori_Agaclarini_Dengeleme(JPanel kategori_Agaclarini_Dengeleme) {
		swingdata.getJpaneldata().setKategori_Agaclarini_Dengeleme(kategori_Agaclarini_Dengeleme);
	}

	public JPanel getVerilen_Bir_Hastaliga_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan() {
		return swingdata.getJpaneldata().getVerilen_Bir_Hastaliga_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan();
	}

	public void setVerilen_Bir_Hastaliga_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan(
			JPanel verilen_Bir_Hastaliga_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan) {
		swingdata.getJpaneldata().setVerilen_Bir_Hastaliga_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan(
				verilen_Bir_Hastaliga_Iliskin_Bilgilerin_Listelenmesi_Hash_Table_Dan);
	}

	public JPanel getBelli_Bir_Hastaliga_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gire_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi() {
		return swingdata.getJpaneldata()
				.getBelli_Bir_Hastaliga_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gire_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi();
	}

	public void setBelli_Bir_Hastaliga_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gire_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi(
			JPanel belli_Bir_Hastaliga_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gire_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi) {
		swingdata.getJpaneldata()
				.setBelli_Bir_Hastaliga_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gire_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi(
						belli_Bir_Hastaliga_iyi_Gelebilen_Bitkilerin_Fiyatlarina_Gire_Heap_e_Atilmasi_ve_N_Tanesinden_Birer_Paket_Satin_Alinmasi);
	}

	public JLabel getjLabel6() {
		return swingdata.getJlabeldata().getjLabel6();
	}

	public void setjLabel6(JLabel jLabel6) {
		this.swingdata.getJlabeldata().setjLabel6(jLabel6);
	}

	public JLabel getjLabel7() {
		return swingdata.getJlabeldata().getjLabel7();
	}

	public void setjLabel7(JLabel jLabel7) {
		this.swingdata.getJlabeldata().setjLabel7(jLabel7);
	}

	public JLabel getjLabel9() {
		return swingdata.getJlabeldata().getjLabel9();
	}

	public void setjLabel9(JLabel jLabel9) {
		this.swingdata.getJlabeldata().setjLabel9(jLabel9);
	}

	public JLabel getjLabel10() {
		return swingdata.getJlabeldata().getjLabel10();
	}

	public void setjLabel10(JLabel jLabel10) {
		this.swingdata.getJlabeldata().setjLabel10(jLabel10);
	}

	public JTabbedPane getjTabbedPane3() {
		return swingdata.getJtabbedpanedata().getjTabbedPane3();
	}

	public void setjTabbedPane3(JTabbedPane jTabbedPane3) {
		this.swingdata.getJtabbedpanedata().setjTabbedPane3(jTabbedPane3);
	}

	public JPanel getjPanel16() {
		return swingdata.getJpaneldata().getjPanel16();
	}

	public void setjPanel16(JPanel jPanel16) {
		this.swingdata.getJpaneldata().setjPanel16(jPanel16);
	}

	public JLabel getjLabel61() {
		return swingdata.getJlabeldata().getjLabel61();
	}

	public void setjLabel61(JLabel jLabel61) {
		this.swingdata.getJlabeldata().setjLabel61(jLabel61);
	}

	public JLabel getjLabel11() {
		return swingdata.getJlabeldata().getjLabel11();
	}

	public void setjLabel11(JLabel jLabel11) {
		this.swingdata.getJlabeldata().setjLabel11(jLabel11);
	}

	public JLabel getjLabel12() {
		return swingdata.getJlabeldata().getjLabel12();
	}

	public void setjLabel12(JLabel jLabel12) {
		this.swingdata.getJlabeldata().setjLabel12(jLabel12);
	}

	public JTabbedPane getKategori_Ekleme_ve_Silme_Menusu() {
		return swingdata.getJtabbedpanedata().getKategori_Ekleme_ve_Silme_Menusu();
	}

	public void setKategori_Ekleme_ve_Silme_Menusu(JTabbedPane Kategori_Ekleme_ve_Silme_Menusu) {
		swingdata.getJtabbedpanedata().setKategori_Ekleme_ve_Silme_Menusu(Kategori_Ekleme_ve_Silme_Menusu);
	}

	public JPanel getKategori_Ekleme() {
		return swingdata.getJpaneldata().getKategori_Ekleme();
	}

	public void setKategori_Ekleme(JPanel kategori_Ekleme) {
		swingdata.getJpaneldata().setKategori_Ekleme(kategori_Ekleme);
	}

	public JPanel getKategori_Silme() {
		return swingdata.getJpaneldata().getKategori_Silme();
	}

	public void setKategori_Silme(JPanel kategori_Silme) {
		swingdata.getJpaneldata().setKategori_Silme(kategori_Silme);
	}

	public JLabel getjLabel13() {
		return swingdata.getJlabeldata().getjLabel13();
	}

	public void setjLabel13(JLabel jLabel13) {
		this.swingdata.getJlabeldata().setjLabel13(jLabel13);
	}

	public JLabel getjLabel14() {
		return swingdata.getJlabeldata().getjLabel14();
	}

	public void setjLabel14(JLabel jLabel14) {
		this.swingdata.getJlabeldata().setjLabel14(jLabel14);
	}

	public JLabel getjLabel15() {
		return swingdata.getJlabeldata().getjLabel15();
	}

	public void setjLabel15(JLabel jLabel15) {
		this.swingdata.getJlabeldata().setjLabel15(jLabel15);
	}

	public JLabel getjLabel16() {
		return swingdata.getJlabeldata().getjLabel16();
	}

	public void setjLabel16(JLabel jLabel16) {
		this.swingdata.getJlabeldata().setjLabel16(jLabel16);
	}

	public JLabel getjLabel17() {
		return swingdata.getJlabeldata().getjLabel17();
	}

	public void setjLabel17(JLabel jLabel17) {
		this.swingdata.getJlabeldata().setjLabel17(jLabel17);
	}

	public JLabel getjLabel18() {
		return swingdata.getJlabeldata().getjLabel18();
	}

	public void setjLabel18(JLabel jLabel18) {
		this.swingdata.getJlabeldata().setjLabel18(jLabel18);
	}

	public JTextArea getjTextArea() {
		return swingdata.getJtextareadata().getjTextArea();
	}

	public void setjTextArea(JTextArea jTextArea) {
		this.swingdata.getJtextareadata().setjTextArea(jTextArea);
	}

	public JPanel getAdindan_Urun_Arama_ve_Listeleme() {
		return swingdata.getJpaneldata().getAdindan_Urun_Arama_ve_Listeleme();
	}

	public void setAdindan_Urun_Arama_ve_Listeleme(JPanel Adindan_Urun_Arama_ve_Listeleme) {
		swingdata.getJpaneldata().setAdindan_Urun_Arama_ve_Listeleme(Adindan_Urun_Arama_ve_Listeleme);
	}

	public JPanel getjPanel23() {
		return swingdata.getJpaneldata().getjPanel23();
	}

	public void setjPanel23(JPanel jPanel23) {
		this.swingdata.getJpaneldata().setjPanel23(jPanel23);
	}

	public JLabel getjLabel21() {
		return swingdata.getJlabeldata().getjLabel21();
	}

	public void setjLabel21(JLabel jLabel21) {
		this.swingdata.getJlabeldata().setjLabel21(jLabel21);
	}

	public JTextArea getjTextArea1() {
		return swingdata.getJtextareadata().getjTextArea1();
	}

	public void setjTextArea1(JTextArea jTextArea1) {
		this.swingdata.getJtextareadata().setjTextArea1(jTextArea1);
	}

	public JButton getjButton() {
		return swingdata.getJbuttondata().getjButton();
	}

	public void setjButton(JButton jButton) {
		this.swingdata.getJbuttondata().setjButton(jButton);
	}

	public JTabbedPane getjTabbedPane6() {
		return swingdata.getJtabbedpanedata().getjTabbedPane6();
	}

	public void setjTabbedPane6(JTabbedPane jTabbedPane6) {
		this.swingdata.getJtabbedpanedata().setjTabbedPane6(jTabbedPane6);
	}

	public JPanel getjPanel11() {
		return swingdata.getJpaneldata().getjPanel11();
	}

	public void setjPanel11(JPanel jPanel11) {
		this.swingdata.getJpaneldata().setjPanel11(jPanel11);
	}

	public JPanel getjPanel24() {
		return swingdata.getJpaneldata().getjPanel24();
	}

	public void setjPanel24(JPanel jPanel24) {
		this.swingdata.getJpaneldata().setjPanel24(jPanel24);
	}

	public JPanel getjPanel25() {
		return swingdata.getJpaneldata().getjPanel25();
	}

	public void setjPanel25(JPanel jPanel25) {
		this.swingdata.getJpaneldata().setjPanel25(jPanel25);
	}

	public JLabel getjLabel22() {
		return swingdata.getJlabeldata().getjLabel22();
	}

	public void setjLabel22(JLabel jLabel22) {
		this.swingdata.getJlabeldata().setjLabel22(jLabel22);
	}

	public JLabel getjLabel23() {
		return swingdata.getJlabeldata().getjLabel23();
	}

	public void setjLabel23(JLabel jLabel23) {
		this.swingdata.getJlabeldata().setjLabel23(jLabel23);
	}

	public JLabel getjLabel24() {
		return swingdata.getJlabeldata().getjLabel24();
	}

	public void setjLabel24(JLabel jLabel24) {
		this.swingdata.getJlabeldata().setjLabel24(jLabel24);
	}

	public JScrollPane getjScrollPane1() {
		return swingdata.getjScrollPane1();
	}

	public void setjScrollPane1(JScrollPane jScrollPane1) {
		this.swingdata.setjScrollPane1(jScrollPane1);
	}

	public JTextArea getjTextArea3() {
		return swingdata.getJtextareadata().getjTextArea3();
	}

	public void setjTextArea3(JTextArea jTextArea3) {
		this.swingdata.getJtextareadata().setjTextArea3(jTextArea3);
	}

	public JLabel getjLabel25() {
		return swingdata.getJlabeldata().getjLabel25();
	}

	public void setjLabel25(JLabel jLabel25) {
		this.swingdata.getJlabeldata().setjLabel25(jLabel25);
	}

	public JTextField getjTextField1() {
		return swingdata.getJtextfielddata().getjTextField1();
	}

	public void setjTextField1(JTextField jTextField1) {
		this.swingdata.getJtextfielddata().setjTextField1(jTextField1);
	}

	public JButton getjButton1() {
		return swingdata.getJpaneldata().getjButton1();
	}

	public void setjButton1(JButton jButton1) {
		this.swingdata.getJpaneldata().setjButton1(jButton1);
	}

	public JTextArea getjTextArea5() {
		return swingdata.getJtextareadata().getjTextArea5();
	}

	public void setjTextArea5(JTextArea jTextArea5) {
		this.swingdata.getJtextareadata().setjTextArea5(jTextArea5);
	}

	public JLabel getjLabel26() {
		return swingdata.getJlabeldata().getjLabel26();
	}

	public void setjLabel26(JLabel jLabel26) {
		this.swingdata.getJlabeldata().setjLabel26(jLabel26);
	}

	public JButton getjButton2() {
		return swingdata.getJbuttondata().getjButton2();
	}

	public void setjButton2(JButton jButton2) {
		this.swingdata.getJbuttondata().setjButton2(jButton2);
	}

	public JButton getjButton3() {
		return swingdata.getJbuttondata().getjButton3();
	}

	public void setjButton3(JButton jButton3) {
		this.swingdata.getJbuttondata().setjButton3(jButton3);
	}

	public JButton getjButton4() {
		return swingdata.getJbuttondata().getjButton4();
	}

	public void setjButton4(JButton jButton4) {
		this.swingdata.getJbuttondata().setjButton4(jButton4);
	}

	public JTextArea getjTextArea2() {
		return swingdata.getJtextareadata().getjTextArea2();
	}

	public void setjTextArea2(JTextArea jTextArea2) {
		this.swingdata.getJtextareadata().setjTextArea2(jTextArea2);
	}

	public String getYanit() {
		return stringdata.getYanit();
	}

	public void setYanit(String yanit) {
		this.stringdata.setYanit(yanit);
	}

	public JTextArea getjTextArea6() {
		return swingdata.getJtextareadata().getjTextArea6();
	}

	public void setjTextArea6(JTextArea jTextArea6) {
		this.swingdata.getJtextareadata().setjTextArea6(jTextArea6);
	}

	public JLabel getjLabel28() {
		return swingdata.getJlabeldata().getjLabel28();
	}

	public void setjLabel28(JLabel jLabel28) {
		this.swingdata.getJlabeldata().setjLabel28(jLabel28);
	}

	public JLabel getjLabel29() {
		return swingdata.getJlabeldata().getjLabel29();
	}

	public void setjLabel29(JLabel jLabel29) {
		this.swingdata.getJlabeldata().setjLabel29(jLabel29);
	}

	public JButton getjButton5() {
		return swingdata.getJbuttondata().getjButton5();
	}

	public void setjButton5(JButton jButton5) {
		this.swingdata.getJbuttondata().setjButton5(jButton5);
	}

	public JButton getjButton6() {
		return swingdata.getJbuttondata().getjButton6();
	}

	public void setjButton6(JButton jButton6) {
		this.swingdata.getJbuttondata().setjButton6(jButton6);
	}

	public JLabel getjLabel30() {
		return swingdata.getJlabeldata().getjLabel30();
	}

	public void setjLabel30(JLabel jLabel30) {
		this.swingdata.getJlabeldata().setjLabel30(jLabel30);
	}

	public JTextArea getjTextArea4() {
		return swingdata.getJtextareadata().getjTextArea4();
	}

	public void setjTextArea4(JTextArea jTextArea4) {
		this.swingdata.getJtextareadata().setjTextArea4(jTextArea4);
	}

	public JLabel getjLabel31() {
		return swingdata.getJlabeldata().getjLabel31();
	}

	public void setjLabel31(JLabel jLabel31) {
		this.swingdata.getJlabeldata().setjLabel31(jLabel31);
	}

	public JTextField getjTextField4() {
		return swingdata.getJtextfielddata().getjTextField4();
	}

	public void setjTextField4(JTextField jTextField4) {
		this.swingdata.getJtextfielddata().setjTextField4(jTextField4);
	}

	public JButton getjButton7() {
		return swingdata.getJbuttondata().getjButton7();
	}

	public void setjButton7(JButton jButton7) {
		this.swingdata.getJbuttondata().setjButton7(jButton7);
	}

	public JButton getKategori_Listeleyici() {
		return swingdata.getJbuttondata().getKategori_Listeleyici();
	}

	public void setKategori_Listeleyici(JButton kategori_Listeleyici) {
		swingdata.getJbuttondata().setKategori_Listeleyici(kategori_Listeleyici);
	}

	public JLabel getjLabel() {
		return swingdata.getJlabeldata().getjLabel();
	}

	public void setjLabel(JLabel jLabel) {
		this.swingdata.getJlabeldata().setjLabel(jLabel);
	}

	public JLabel getjLabel1() {
		return swingdata.getJlabeldata().getjLabel1();
	}

	public void setjLabel1(JLabel jLabel1) {
		this.swingdata.getJlabeldata().setjLabel1(jLabel1);
	}

	public JTextField getjTextField6() {
		return swingdata.getJtextfielddata().getjTextField6();
	}

	public void setjTextField6(JTextField jTextField6) {
		this.swingdata.getJtextfielddata().setjTextField6(jTextField6);
	}

	public JButton getjButton8() {
		return swingdata.getJbuttondata().getjButton8();
	}

	public void setjButton8(JButton jButton8) {
		this.swingdata.getJbuttondata().setjButton8(jButton8);
	}

	public JButton getjButton9() {
		return swingdata.getJbuttondata().getjButton9();
	}

	public void setjButton9(JButton jButton9) {
		this.swingdata.getJbuttondata().setjButton9(jButton9);
	}

	public JLabel getjLabel32() {
		return swingdata.getJlabeldata().getjLabel32();
	}

	public void setjLabel32(JLabel jLabel32) {
		this.swingdata.getJlabeldata().setjLabel32(jLabel32);
	}

	public JButton getKategori_Listeleyici_2() {
		return swingdata.getJbuttondata().getKategori_Listeleyici_2();
	}

	public void setKategori_Listeleyici_2(JButton kategori_Listeleyici_2) {
		swingdata.getJbuttondata().setKategori_Listeleyici_2(kategori_Listeleyici_2);
	}

	public JTextArea getjTextArea7() {
		return swingdata.getJtextareadata().getjTextArea7();
	}

	public void setjTextArea7(JTextArea jTextArea7) {
		this.swingdata.getJtextareadata().setjTextArea7(jTextArea7);
	}

	public JLabel getjLabel19() {
		return swingdata.getJlabeldata().getjLabel19();
	}

	public void setjLabel19(JLabel jLabel19) {
		this.swingdata.getJlabeldata().setjLabel19(jLabel19);
	}

	public JButton getjButton10() {
		return swingdata.getJbuttondata().getjButton10();
	}

	public void setjButton10(JButton jButton10) {
		this.swingdata.getJbuttondata().setjButton10(jButton10);
	}

	public JLabel getjLabel20() {
		return swingdata.getJlabeldata().getjLabel20();
	}

	public void setjLabel20(JLabel jLabel20) {
		this.swingdata.getJlabeldata().setjLabel20(jLabel20);
	}

	public JTextField getjTextField8() {
		return swingdata.getJtextfielddata().getjTextField8();
	}

	public void setjTextField8(JTextField jTextField8) {
		this.swingdata.getJtextfielddata().setjTextField8(jTextField8);
	}

	public JButton getjButton11() {
		return swingdata.getJbuttondata().getjButton11();
	}

	public void setjButton11(JButton jButton11) {
		this.swingdata.getJbuttondata().setjButton11(jButton11);
	}

	public JLabel getjLabel33() {
		return swingdata.getJlabeldata().getjLabel33();
	}

	public void setjLabel33(JLabel jLabel33) {
		this.swingdata.getJlabeldata().setjLabel33(jLabel33);
	}

	public JButton getUrun_Bilgisi_Listeleyici() {
		return swingdata.getJbuttondata().getUrun_Bilgisi_Listeleyici();
	}

	public void setUrun_Bilgisi_Listeleyici(JButton Urun_Bilgisi_Listeleyici) {
		swingdata.getJbuttondata().setUrun_Bilgisi_Listeleyici(Urun_Bilgisi_Listeleyici);
	}

	public JTextArea getGecici_metin_kutusu() {
		return swingdata.getJtextareadata().getGecici_metin_kutusu();
	}

	public void setGecici_metin_kutusu(JTextArea gecici_metin_kutusu) {
		this.swingdata.getJtextareadata().setGecici_metin_kutusu(gecici_metin_kutusu);
	}

	public JTextField getjTextField9() {
		return swingdata.getJtextfielddata().getjTextField9();
	}

	public void setjTextField9(JTextField jTextField9) {
		this.swingdata.getJtextfielddata().setjTextField9(jTextField9);
	}

	public JLabel getjLabel34() {
		return swingdata.getJlabeldata().getjLabel34();
	}

	public void setjLabel34(JLabel jLabel34) {
		this.swingdata.getJlabeldata().setjLabel34(jLabel34);
	}

	public JButton getjButton12() {
		return swingdata.getJbuttondata().getjButton12();
	}

	public void setjButton12(JButton jButton12) {
		this.swingdata.getJbuttondata().setjButton12(jButton12);
	}

	public JTextArea getjTextArea9() {
		return swingdata.getJtextareadata().getjTextArea9();
	}

	public void setjTextArea9(JTextArea jTextArea9) {
		this.swingdata.getJtextareadata().setjTextArea9(jTextArea9);
	}

	public JLabel getjLabel35() {
		return swingdata.getJlabeldata().getjLabel35();
	}

	public void setjLabel35(JLabel jLabel35) {
		this.swingdata.getJlabeldata().setjLabel35(jLabel35);
	}

	public JTextField getjTextField10() {
		return swingdata.getJtextfielddata().getjTextField10();
	}

	public void setjTextField10(JTextField jTextField10) {
		this.swingdata.getJtextfielddata().setjTextField10(jTextField10);
	}

	public JLabel getjLabel37() {
		return swingdata.getJlabeldata().getjLabel37();
	}

	public void setjLabel37(JLabel jLabel37) {
		this.swingdata.getJlabeldata().setjLabel37(jLabel37);
	}

	public JTextField getjTextField12() {
		return swingdata.getJtextfielddata().getjTextField12();
	}

	public void setjTextField12(JTextField jTextField12) {
		this.swingdata.getJtextfielddata().setjTextField12(jTextField12);
	}

	public JButton getjButton14() {
		return swingdata.getJbuttondata().getjButton14();
	}

	public void setjButton14(JButton jButton14) {
		this.swingdata.getJbuttondata().setjButton14(jButton14);
	}

	public JLabel getjLabel38() {
		return swingdata.getJlabeldata().getjLabel38();
	}

	public void setjLabel38(JLabel jLabel38) {
		this.swingdata.getJlabeldata().setjLabel38(jLabel38);
	}

	public JTextField getjTextField13() {
		return swingdata.getJtextfielddata().getjTextField13();
	}

	public void setjTextField13(JTextField jTextField13) {
		this.swingdata.getJtextfielddata().setjTextField13(jTextField13);
	}

	public JButton getjButton15() {
		return swingdata.getJbuttondata().getjButton15();
	}

	public void setjButton15(JButton jButton15) {
		this.swingdata.getJbuttondata().setjButton15(jButton15);
	}

	public JLabel getjLabel39() {
		return swingdata.getJlabeldata().getjLabel39();
	}

	public void setjLabel39(JLabel jLabel39) {
		this.swingdata.getJlabeldata().setjLabel39(jLabel39);
	}

	public JTextField getjTextField14() {
		return swingdata.getJtextfielddata().getjTextField14();
	}

	public void setjTextField14(JTextField jTextField14) {
		this.swingdata.getJtextfielddata().setjTextField14(jTextField14);
	}

	public JButton getjButton16() {
		return swingdata.getJbuttondata().getjButton16();
	}

	public void setjButton16(JButton jButton16) {
		this.swingdata.getJbuttondata().setjButton16(jButton16);
	}

	public JLabel getjLabel40() {
		return swingdata.getJlabeldata().getjLabel40();
	}

	public void setjLabel40(JLabel jLabel40) {
		this.swingdata.getJlabeldata().setjLabel40(jLabel40);
	}

	public JButton getjButton17() {
		return swingdata.getJbuttondata().getjButton17();
	}

	public void setjButton17(JButton jButton17) {
		this.swingdata.getJbuttondata().setjButton17(jButton17);
	}

	public JTextField getjTextField15() {
		return swingdata.getJtextfielddata().getjTextField15();
	}

	public void setjTextField15(JTextField jTextField15) {
		this.swingdata.getJtextfielddata().setjTextField15(jTextField15);
	}

	public JTextArea getjTextArea10() {
		return swingdata.getJtextareadata().getjTextArea10();
	}

	public void setjTextArea10(JTextArea jTextArea10) {
		this.swingdata.getJtextareadata().setjTextArea10(jTextArea10);
	}

	public JLabel getjLabel41() {
		return swingdata.getJlabeldata().getjLabel41();
	}

	public void setjLabel41(JLabel jLabel41) {
		this.swingdata.getJlabeldata().setjLabel41(jLabel41);
	}

	public JLabel getjLabel42() {
		return swingdata.getJlabeldata().getjLabel42();
	}

	public void setjLabel42(JLabel jLabel42) {
		this.swingdata.getJlabeldata().setjLabel42(jLabel42);
	}

	public JTextArea getjTextArea11() {
		return swingdata.getJtextareadata().getjTextArea11();
	}

	public void setjTextArea11(JTextArea jTextArea11) {
		this.swingdata.getJtextareadata().setjTextArea11(jTextArea11);
	}

	public JLabel getjLabel43() {
		return swingdata.getJlabeldata().getjLabel43();
	}

	public void setjLabel43(JLabel jLabel43) {
		this.swingdata.getJlabeldata().setjLabel43(jLabel43);
	}

	public JTextArea getjTextArea12() {
		return swingdata.getJtextareadata().getjTextArea12();
	}

	public void setjTextArea12(JTextArea jTextArea12) {
		this.swingdata.getJtextareadata().setjTextArea12(jTextArea12);
	}

	public JLabel getjLabel44() {
		return swingdata.getJlabeldata().getjLabel44();
	}

	public void setjLabel44(JLabel jLabel44) {
		this.swingdata.getJlabeldata().setjLabel44(jLabel44);
	}

	public JTextArea getjTextArea13() {
		return swingdata.getJtextareadata().getjTextArea13();
	}

	public void setjTextArea13(JTextArea jTextArea13) {
		this.swingdata.getJtextareadata().setjTextArea13(jTextArea13);
	}

	public JButton getjButton18() {
		return swingdata.getJbuttondata().getjButton18();
	}

	public void setjButton18(JButton jButton18) {
		this.swingdata.getJbuttondata().setjButton18(jButton18);
	}

	public JLabel getjLabel36() {
		return swingdata.getJlabeldata().getjLabel36();
	}

	public void setjLabel36(JLabel jLabel36) {
		this.swingdata.getJlabeldata().setjLabel36(jLabel36);
	}

	public JTextArea getjTextArea14() {
		return swingdata.getJtextareadata().getjTextArea14();
	}

	public void setjTextArea14(JTextArea jTextArea14) {
		this.swingdata.getJtextareadata().setjTextArea14(jTextArea14);
	}

	public JLabel getjLabel45() {
		return swingdata.getJlabeldata().getjLabel45();
	}

	public void setjLabel45(JLabel jLabel45) {
		this.swingdata.getJlabeldata().setjLabel45(jLabel45);
	}

	public Capsule_Vector_String getBelirtiler() {
		return stringdata.getBelirtiler();
	}

	public void setBelirtiler(Capsule_Vector_String belirtiler) {
		this.stringdata.setBelirtiler(belirtiler);
	}

	public Capsule_Vector_String getNedenler() {
		return stringdata.getNedenler();
	}

	public void setNedenler(Capsule_Vector_String nedenler) {
		this.stringdata.setNedenler(nedenler);
	}

	public Capsule_Vector_String getTedaviler() {
		return stringdata.getTedaviler();
	}

	public void setTedaviler(Capsule_Vector_String tedaviler) {
		this.stringdata.setTedaviler(tedaviler);
	}

	public Capsule_Vector_String getBitkiler() {
		return stringdata.getBitkiler();
	}

	public void setBitkiler(Capsule_Vector_String bitkiler) {
		this.stringdata.setBitkiler(bitkiler);
	}

	public JLabel getjLabel46() {
		return swingdata.getJlabeldata().getjLabel46();
	}

	public void setjLabel46(JLabel jLabel46) {
		this.swingdata.getJlabeldata().setjLabel46(jLabel46);
	}

	public JLabel getjLabel47() {
		return swingdata.getJlabeldata().getjLabel47();
	}

	public void setjLabel47(JLabel jLabel47) {
		this.swingdata.getJlabeldata().setjLabel47(jLabel47);
	}

	public JLabel getjLabel48() {
		return swingdata.getJlabeldata().getjLabel48();
	}

	public void setjLabel48(JLabel jLabel48) {
		this.swingdata.getJlabeldata().setjLabel48(jLabel48);
	}

	public JTextField getjTextField11() {
		return swingdata.getJtextfielddata().getjTextField11();
	}

	public void setjTextField11(JTextField jTextField11) {
		this.swingdata.getJtextfielddata().setjTextField11(jTextField11);
	}

	public JTextField getjTextField16() {
		return swingdata.getJtextfielddata().getjTextField16();
	}

	public void setjTextField16(JTextField jTextField16) {
		this.swingdata.getJtextfielddata().setjTextField16(jTextField16);
	}

	public JButton getjButton13() {
		return swingdata.getJbuttondata().getjButton13();
	}

	public void setjButton13(JButton jButton13) {
		this.swingdata.getJbuttondata().setjButton13(jButton13);
	}

	public JTextArea getjTextArea15() {
		return swingdata.getJtextareadata().getjTextArea15();
	}

	public void setjTextArea15(JTextArea jTextArea15) {
		this.swingdata.getJtextareadata().setjTextArea15(jTextArea15);
	}

	public JTextField getjTextField17() {
		return swingdata.getJtextfielddata().getjTextField17();
	}

	public void setjTextField17(JTextField jTextField17) {
		this.swingdata.getJtextfielddata().setjTextField17(jTextField17);
	}

	public JLabel getjLabel49() {
		return swingdata.getJlabeldata().getjLabel49();
	}

	public void setjLabel49(JLabel jLabel49) {
		this.swingdata.getJlabeldata().setjLabel49(jLabel49);
	}

	public JTextField getjTextField18() {
		return swingdata.getJtextfielddata().getjTextField18();
	}

	public void setjTextField18(JTextField jTextField18) {
		this.swingdata.getJtextfielddata().setjTextField18(jTextField18);
	}

	public JLabel getjLabel27() {
		return swingdata.getJlabeldata().getjLabel27();
	}

	public void setjLabel27(JLabel jLabel27) {
		this.swingdata.getJlabeldata().setjLabel27(jLabel27);
	}

	public JTextField getjTextField19() {
		return swingdata.getJtextfielddata().getjTextField19();
	}

	public void setjTextField19(JTextField jTextField19) {
		this.swingdata.getJtextfielddata().setjTextField19(jTextField19);
	}

	public JLabel getjLabel50() {
		return swingdata.getJlabeldata().getjLabel50();
	}

	public void setjLabel50(JLabel jLabel50) {
		this.swingdata.getJlabeldata().setjLabel50(jLabel50);
	}

	public JTextField getjTextField20() {
		return swingdata.getJtextfielddata().getjTextField20();
	}

	public void setjTextField20(JTextField jTextField20) {
		this.swingdata.getJtextfielddata().setjTextField20(jTextField20);
	}

	public JButton getjButton19() {
		return swingdata.getJbuttondata().getjButton19();
	}

	public void setjButton19(JButton jButton19) {
		this.swingdata.getJbuttondata().setjButton19(jButton19);
	}

	public void agac_vectorunden_urun_silindi_mi(boolean sonuc) {
		if (sonuc == true) {
			this.getSwingdata().getjTextArea8().setText("agac_vektorunden Urun Silindi");
			System.out.println("agac_vektorunden Urun Silindi");
		} else {
			this.getSwingdata().getjTextArea8().setText("agac_vektorunde Urun Bulunamadi");
			System.out.println("agac_vektorunde Urun Bulunamadi");
		}
	}

	public JTextField getJTextField2() {
		return swingdata.getJTextField2();
	}
	public void setjTextField2(JTextField jTextField2) {
		swingdata.setjTextField2(jTextField2);
	}

	/**
	 * This method initializes jTextField3
	 * 
	 * @return javax.swing.JTextField
	 */
	public JTextField getJTextField3() {
		return this.swingdata.getJTextField3();
	}

	public void setjTextField3(JTextField jTextField3) {
		this.swingdata.setjTextField3(jTextField3);
	}

	/**
	 * This method initializes jTextField5
	 * 
	 * @return javax.swing.JTextField
	 */
	public JTextField getJTextField5() {
		return this.swingdata.getJTextField5();
	}

	public void setjTextField5(JTextField jTextField5) {
		this.swingdata.setjTextField5(jTextField5);
	}

	/**
	 * This method initializes jTextField7
	 * 
	 * @return javax.swing.JTextField
	 */
	public JTextField getJTextField7() {
		return this.swingdata.getJTextField7();
	}

	public void setjTextField7(JTextField jTextField7) {
		this.swingdata.setjTextField7(jTextField7);
	}
}