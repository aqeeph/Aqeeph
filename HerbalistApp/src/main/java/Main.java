/**
 * 
 */
package main.java;

import herbalist.Form;
import veri_tabani.Veritabani_Listesi;

/**
 * @author MehmetAkif-PC
 *
 */
public class Main {
	/**
	 * 
	 */
	private static Form form1;

	public static void main(String[] args) {
		Veritabani_Listesi.veri_tabanlarini_olustur();
		Veritabani_Listesi.veri_tabanlarini_veri_yapilarina_kopyala();
		setForm1(new Form());
		form1.herbalist_appgui();
	}

	/**
	 * 
	 */
	public Main() {
		super();
	}

	/**
	 * @return the form1
	 */
	public static Form getForm1() {
		return form1;
	}

	/**
	 * @param form1 the form1 to set
	 */
	public static void setForm1(Form form1) {
		Main.form1 = form1;
	}

}